# Introduction #
This library is a Speedy's web service (EPS) Java client library for easy integration with client applications (eMerchants and third party software)

Package "examples" in distributed source code contains sample usages of client library in Bulgarian and English language

The library works with EPS web service published at:
https://www.speedy.bg/eps/main01.wsdl

The full documentation of can be found here:
https://www.speedy.bg/eps/docs/index.html


# Installation #
## Non-maven users ##
Download latest distribution jar and add it in your classpath.

## Maven users ##
Add the following dependency in pom.xml:

```
<dependency>
	<groupId>com.omg-m.speedy.eps</groupId>
	<artifactId>speedy-eps-java-client-soap</artifactId>
	<version>@@VERSION</version>
</dependency>
```


# Examples #

This section include some useful code snippets that demonstrates common functionality of Speedy EPS.

See samples in examples package of source jar distribution for further reference.

## Establish session with EPS and get client data of authenticated user. ##
User needs to establish a session to access EPS services. Each call to EPS service contains a session Id assigned to established session. The library encapsulates session management and makes this process transparent to the end user.

```
    // Configure client EPS facade class instance to web services
    EPSFacade eps = new EPSFacade(new EPSProviderService().getEPSProviderPort(),  "<your_user_name>",  "<your_user_password>");

    // Get authenticated user client data
    ResultClientData senderClientData = eps.getClientById(eps.getResultLogin().getClientId());

    // Get current session data in ResultLogin class instance.
    // User can use this method if session details are needed. 
    ResultLogin resultLogin = eps.getResultLogin();
    if (resultLogin != null) {
    	// ... session is active and its data is accessible from ResultLogin methods
    }
```
## Determine courier taking date ##
Taking date is used to determine available services depending on sender site and is also a factor in courier service price calculation. Therefore the same picking could have different price for different taking dates.
```

    long lServiceTypeID   = 3;    // Example service type from Speedy nomenclature
    Long bringToOfficeId = null;  // The picking will not be brought to office, hence this ID is null. Otherwise it should be ID of valid Speedy office
    Date fromMoment = new Date(); // Current time. We are interested for available taking days from current moment
    
    // Get sender site ID
    // In this example sender is authenticated client
    ResultClientData senderClientData = eps.getClientById(eps.getResultLogin().getClientId());
    long lSenderSiteId = senderClientData.getAddress().getSiteId();
    
    List listAllowedDaysForTaking = eps.getAllowedDaysForTaking(
        lServiceTypeID,
        bringToOfficeId == null ? lSenderSiteId : null,
        bringToOfficeId,
        fromMoment
    );
    Date takingDate;
    if (listAllowedDaysForTaking == null || listAllowedDaysForTaking.size() == 0) {
        throw new ClientException("There are no dates available for taking.");
    } else if (listAllowedDaysForTaking.size()== 1) {
        // There is only one date available for taking
        takingDate = listAllowedDaysForTaking.get(0);
    } else {
        // There are several dates available. We take first one, but user is free to select taking date from all of them
        takingDate = listAllowedDaysForTaking.get(0);
     }
```
## Calculate ##
Calculate the price of a picking (before picking registration)

```
    // Get authenticated user client data
    ResultClientData senderClientData = eps.getClientById(eps.getResultLogin().getClientId());
        
    // In this example receiver address is in city of Sofia
    // Lookup for example receiver city of Sofia in Speedy address nomenclature
    // We are sure we have results therefore list is not verified for null or empty values.
    List listSites = eps.listSites("гр", "СОФИЯ");
    long lReceiverSiteId = listSites.get(0).getId();
    
    // We want taking date to be tomorrow
    Calendar cal = Calendar.getInstance();
    cal.add(Calendar.HOUR, 24);
    Date takingDate = cal.getTime(); 
         
    ParamCalculation paramCalculation = new ParamCalculation();
    paramCalculation.setWeightDeclared(5.25);    // Decalred weight
    paramCalculation.setBroughtToOffice(false);  // Parcels will not be brought to office, courier will take them from specified sender address
    paramCalculation.setToBeCalled(false);       // Parcels will not be taken from recipient office, courier will deliver them to specified recipient address 
    paramCalculation.setParcelsCount(1);         // Single parcel
    paramCalculation.setDocuments(false);        // No documents
    paramCalculation.setPalletized(false);       // No pallets 
    paramCalculation.setSenderId(senderClientData.getClientId()); // Client Id of the sender
    paramCalculation.setReceiverSiteId(lReceiverSiteId); // Site Id of the recipient according to Speedy address nomenclature
    paramCalculation.setPayerType(Util.PAYER_TYPE_RECEIVER); // Payer is recipient
    paramCalculation.setAmountCodBase(25D);                   // Collection on delivery amount
    paramCalculation.setTakingDate(Util.toXMLGregorianCalendar(takingDate); // Taking date is tomorrow
    paramCalculation.setServiceTypeId(3); // Service type 3 from Speedy nomenclature
    
    ResultCalculation resultCalculation = eps.calculate(paramCalculation);
```
## Create Bill Of Lading ##
This example registers Bill Of Lading, but to trigger the process of taking and delivery, the client needs to order a courier.
```

    // Get authenticated user client data
    ResultClientData senderClientData = eps.getClientById(eps.getResultLogin().getClientId());
	    
    // In this example sender is authenticated client. 
    // Therefore we fill Bill Of Lading sender client data with authenticated client data
    ParamClientData sender = new ParamClientData();
    sender.setClientId(senderClientData.getClientId());
    sender.setContactName("SENDER CONTACT NAME");
    ParamPhoneNumber senderPhoneNumber = new ParamPhoneNumber();
    senderPhoneNumber.setNumber("7001 7002");
    sender.getPhones().add(senderPhoneNumber);   
	    
    // In this example receiver address is "СОФИЯ, к-с ЛЮЛИН 7, бл.702 вх.1, ет.54, ап.1229"
    // Lookup for example receiver city of Sofia in Speedy address nomenclature
    // We are sure we have results therefore array is not verified for null or empty values.
    List listSites = eps.listSites("гр", "СОФИЯ");
    long lReceiverSiteId = listSites.get(0).getId();

    // Lookup example receiver address quarter "Liulin 7" in city of Sofia in Speedy address nomenclature
    // We are sure we have results therefore array is not verified for null or empty values.
    // EPS supports similar methods for streets also
    List listResultQuarters = eps.listQuarters("ЛЮЛИН 7", lReceiverSiteId);
    ResultQuarter receiverResultQuarter = listResultQuarters.get(0);

    // Finally set receiver address fields
    ParamAddress receiverAddress = new ParamAddress();
    receiverAddress.setSiteId(lReceiverSiteId);
    receiverAddress.setQuarterType(receiverResultQuarter.getType());
    receiverAddress.setQuarterName(receiverResultQuarter. getName());
    receiverAddress.setQuarterId(receiverResultQuarter.getId());
    receiverAddress.setBlockNo("702");
    receiverAddress.setEntranceNo("1");
    receiverAddress.setFloorNo("54");
    receiverAddress.setApartmentNo("1229");

    // Note that if you cannot determine address fields from input address text (f.e. you cannot structurally parse the input address)
    // clients could use method setAddressNote. In that case setting an address will look like:
    //
    // ParamAddress receiverAddress = new ParamAddress();
    // receiverAddress.setSiteId(lReceiverSiteId);
    // receiverAddress.setAddressNote("к-с ЛЮЛИН 7, бл.702 вх.1, ет.54, ап.1229");
    //
    // NOTE: Site name should not be placed in addressNote field, because site Id is passed separately and cannot be omitted

    // Set receiver client data
    ParamClientData receiver = new ParamClientData();
    receiver.setAddress(receiverAddress);
    receiver.setPartnerName("RECEIVER PARTNER NAME");
    ParamPhoneNumber paramPhoneNumber = new ParamPhoneNumber();
    paramPhoneNumber.setNumber("7001 7001");
    receiver.getPhones().add(paramPhoneNumber);
	    
    ParamPicking picking = new ParamPicking();
    picking.setServiceTypeId(3);  // Service type 3 from Speedy nomenclature
    picking.setBackDocumentsRequest(true);  // We want back documents
    picking.setBackReceiptRequest(false); // No need for back receipt
    picking.setWillBringToOffice(false); // Courier will visit sender address if this value is null
    picking.setParcelsCount(1); // Parcels count
    picking.setWeightDeclared(5.25D); // Decalred weight
    picking.setContents("Дрехи"); // Content description
    picking.setPacking("ПАКЕТ"); // Type of packing
    picking.setDocuments(false); // No documents
    picking.setPalletized(false); // No pallets
    picking.setSender(sender);
    picking.setReceiver(receiver);
    picking.setPayerType(Util.PAYER_TYPE_RECEIVER); // Payer is recipient
    picking.setTakingDate(Util.toXMLGregorianCalendar(new Date())); // Taking date is today
    ResultBOL resultBOL = eps.createBillOfLading(picking);
    
    // resultBOL contains response in a ResultBOL class instance
```
## Print Bill Of Lading in a PDF file ##
This example demonstrates usage of method to create Bill of Ladding PDF
```

    long lPickingId = 299000129; // Example ID of created picking
    ParamPDF paramPDF = new ParamPDF();
    paramPDF.getIds().add(Long.valueOf(lPickingId));
    paramPDF.setType(Util.PARAM_PDF_TYPE_BOL);
    paramPDF.setIncludeAutoPrintJS(true);

    // Save pdf in a file
    String sFileNameOnly = eps.getUserName() + "_picking_" + lPickingId + "_"+ System.currentTimeMillis() + ".pdf";
    File pdfFile = new File(".", sFileNameOnly);
    Util.saveFile(pdfFile, eps.createPDF(paramPDF));
```
## Print Bill Of Lading Labels in PDF ##
This example demonstrates usage of method to print Bill of Ladding Labels in PDF

```
    long lPickingId = 299000129; // Example ID of created picking

    ParamPDF paramPDF = new ParamPDF();
    paramPDF.getIds().add(Long.valueOf(lPickingId));
    paramPDF.setType(Util.PARAM_PDF_TYPE_LBL);
    paramPDF.setIncludeAutoPrintJS(true);

    // Save pdf in a file
    String sFileNameOnly = eps.getUserName() + "_lbl_" + lPickingId + "_"+ System.currentTimeMillis() + ".pdf";
    File pdfFileLbl = new File(".", sFileNameOnly);
    Util.saveFile(pdfFileLbl, eps.createPDF(paramPDF));
```
## Create Order ##
Order triggers the process of taking and delivery. Orders are usually submitted at the end of working day (preferably but not mandatory - one order per day). The order includes all Bill Of Ladings created for current day.
```

    long lPickingId = 299000129;  // Example Id of a created picking
    long lPickingId2 = 299000130; // Example Id of a created picking
    
    ParamOrder order = new ParamOrder();
    order.getBillOfLadingsList().add(Long.valueOf(lPickingId));
    order.getBillOfLadingsList().add(Long.valueOf(lPickingId2)); // List of Bill Of Ladings to order
    order.setBillOfLadingsToIncludeType(Util.ORDER_BOL_INCLUDE_TYPE_EXPLICIT); // Order is for specified list of Bill Of Ladings
    order.setReadinessTime((short) 1750); // Packages are ready for taking after 17:30
    order.setContactName("CONTACT NAME"); // Contact name
    paramPhoneNumber = new ParamPhoneNumber();
    paramPhoneNumber.setNumber("7001 7002"); // Contact phone number
    order.setPhoneNumber(paramPhoneNumber); 
    order.setWorkingEndTime((short) 1800); // Sender's end of working time - 18:00
    List listResultOrderPickingInfo = eps.createOrder(order);
```