# Introduction #

This library is a Speedy's web service (EPS) PHP client library for easy integration with client applications (eMerchants and third party software). This Library is developed and tested with PHP version 5.4.3 on a 64 bit Windows machine.

Folder **`"<distribution_name>/speedy-eps-lib"`** in distribution archive contains library classes to be included and used by client php applications.

Folder **`"<distribution_name>/examples"`** contains sample usages of php library.

The library works with EPS web service published at:
https://www.speedy.bg/eps/main01.wsdl

The full documentation of can be found here: https://www.speedy.bg/eps/docs/index.html


# Installation #

Download latest release archive.

Unzip distribution in your php workspace and include php sources in **`"<distribution_name>/speedy-eps-lib"`** directory.

# Examples #
This section include some useful code snippets that demonstrates common functionality of Speedy EPS.

See samples in **`"<distribution_name>/examples"`** directory of distribution archive for for further reference

## Establish session with EPS and get client data of authenticated user. ##
User needs to establish a session to access EPS services. Each call to EPS service contains a session Id assigned to established session. The library encapsulates session management and makes this process transparent to the end user.

```
    // Configure client EPS facade class instance to web services
    $eps = new EPSFacade(new EPSSOAPInterfaceImpl(), "<your_user_name>",  "<your_user_password>");

    // Get authenticated user client data
    $senderClientData = $eps->getClientById($eps->getResultLogin()->getClientId());

    // Get current session data in ResultLogin class instance.
    // User can use this method if session details are needed. 
    $resultLogin = $eps->getResultLogin(false);
    if (isset($resultLogin)) {
    	// ... session is active and its data is accessible from ResultLogin methods
    }
```

## Determine courier taking date ##
Taking date is used to determine available services depending on sender site and is also a factor in courier service price calculation. Therefore the same picking could have different price for different taking dates.

```
    $serviceTypeID   = 3;      // Example service type from Speedy nomenclature
    $bringToOfficeId = null;   // The picking will not be brought to office, hence this ID is null. Otherwise it should be ID of valid Speedy office
    $fromMoment      = time(); // Current time. We are interested for available taking days from current moment
    
    // Get sender site ID
    // In this example sender is authenticated client
    $senderClientData = $eps->getClientById($eps->getResultLogin()->getClientId());
    $senderSiteId = $senderClientData->getAddress()->getSiteId();
    
    $arrTakingDates = $eps->getAllowedDaysForTaking(
        $serviceTypeID, is_null($bringToOfficeId) ? $senderSiteId : null, $bringToOfficeId, $fromMoment
    );

    if (count($arrTakingDates) == 0) {
        throw new ClientException('There are no dates available for taking');
    } else if (count($arrTakingDates) == 1) {
        // There is only one date available for taking
        $takingDate = $arrTakingDates[0];
    } else {
        // There are several dates available. We take first one, but user is free to select taking date from all of them
        $takingDate = $arrTakingDates[0];
    }
```

## Calculate ##
Calculate the price of a picking (before picking registration)

```
    // Init current date
    $todayDate = date("Y-m-d"); 

    $calculationData = new StdClass();
    $calculationData->weightDeclared   = 5.25;  // Decalred weight
    $calculationData->bringToOfficeId  = null;  // Id of the office that sender should bring the parcel(s). Courier will visit sender address if this value is null
    $calculationData->takeFromOfficeId = null;  // Id of the office that recipient should take the parcel(s) from. Courier will visit recipient address if this value is null
    $calculationData->parcelsCount     = 1;     // Parcels count
    $calculationData->documents        = false; // Flag for documents
    $calculationData->palletized       = false; // Flag for pallets
    $calculationData->fragile          = false; // flag for fragile content
    $calculationData->payerType        = ParamCalculation::PAYER_TYPE_RECEIVER; // Determine the payer
    $calculationData->amountCODBase    = 25;      // Collecton on Delivery amount
    $calculationData->serviceTypeID    = 3;       // Service type 3 from Speedy nomenclature
    $calculationData->takingDate       = strtotime(date("Y-m-d", strtotime($todayDate)) . " +1 day"); // We need taking date to be tomorrow
    
    // Get sender client data
    // In this example sender is authenticated client
    $senderClientData = $eps->getClientById($eps->getResultLogin()->getClientId());
 
    // In this example receiver address is in city of Sofia
    // Lookup for example receiver city of Sofia in Speedy address nomenclature
    // We are sure we have results therefore array is not verified for null or empty values.
    $arrSites = $eps->listSites('гр', 'СОФИЯ');
    $receiverSiteId = $arrSites[0]->getId();
    
    $paramCalculation = new ParamCalculation();
    $paramCalculation->setBroughtToOffice(!is_null($calculationData->bringToOfficeId));
    $paramCalculation->setToBeCalled(!is_null($calculationData->takeFromOfficeId));
    $paramCalculation->setParcelsCount($calculationData->parcelsCount );
    $paramCalculation->setWeightDeclared($calculationData->weightDeclared);
    $paramCalculation->setDocuments($calculationData->documents);
    $paramCalculation->setPalletized($calculationData->palletized);
    $paramCalculation->setFragile($calculationData->fragile);
    $paramCalculation->setSenderId($senderClientData->getClientId());
    $paramCalculation->setReceiverSiteId($receiverSiteId);
    $paramCalculation->setPayerType($calculationData->payerType);
    $paramCalculation->setAmountCodBase($calculationData->amountCODBase);
    $paramCalculation->setTakingDate($calculationData->takingDate);
    $paramCalculation->setServiceTypeId($calculationData->serviceTypeID);
    $resultCalculation = $eps->calculate($paramCalculation);
```

## Create Bill Of Lading ##
This example registers Bill Of Lading, but to trigger the process of taking and delivery, the client needs to order a courier.

```
    // Init example picking structure with data
    $pickingData = new StdClass();
    $pickingData->weightDeclared   = 5.25;  // Decalred weight
    $pickingData->bringToOfficeId  = null;  // Id of the office that sender should bring the parcel(s). Courier will visit sender address if this value is null
    $pickingData->takeFromOfficeId = null;  // Id of the office that recipient should take the parcel(s) from. Courier will visit recipient address if this value is null
    $pickingData->parcelsCount     = 1;     // Parcels count
    $pickingData->documents        = false; // Flag for documents
    $pickingData->palletized       = false; // Flag for pallets
    $pickingData->fragile          = false; // flag for fragile content
    $pickingData->payerType        = ParamCalculation::PAYER_TYPE_RECEIVER; // Determine the payer
    $pickingData->amountCODBase    = 25;      // Collecton on Delivery amount
    $pickingData->backDocumentReq  = true;    // Back dcoument request flag
    $pickingData->backReceiptReq   = false;   // Back receipt request flag
    $pickingData->contents         = 'Дрехи'; // Content description
    $pickingData->packing          = 'ПАКЕТ'; // Type of packing
    $pickingData->serviceTypeID    = 3;       // Service type 3 from Speedy nomenclature
    $pickingData->takingDate       = time();  // Taking date is today

    // In this example sender is authenticated client. 
    // Therefore we fill Bill Of Lading sender client data with authenticated client data
    $senderClientData = $eps->getClientById($eps->getResultLogin()->getClientId());
    $sender = new ParamClientData();
    $sender->setClientId($senderClientData->getClientId());
    $sender->setContactName('TEST TEST TEST');
    $senderPhoneNumber = new ParamPhoneNumber();
    $senderPhoneNumber->setNumber("7001 7001");
    $sender->setPhones(array(0 => $senderPhoneNumber));

    // In this example receiver address is "СОФИЯ, к-с ЛЮЛИН 7, бл.702 вх.1, ет.54, ап.1229"
    // Lookup for example receiver city of Sofia in Speedy address nomenclature
    // We are sure we have results therefore array is not verified for null or empty values.
    $arrSites = $eps->listSites('гр', 'СОФИЯ');
    $receiverSiteId = $arrSites[0]->getId();

    // Lookup example receiver address quarter "Liulin 7" in city of Sofia in Speedy address nomenclature
    // We are sure we have results therefore array is not verified for null or empty values.
    // EPS supports similar methods for streets also
    $arrQuarters = $eps->listQuarters('ЛЮЛИН 7', $receiverSiteId);
    $receiverResultQuarter = $arrQuarters[0];

    // Finally set receiver address fields
    $receiverAddress = new ParamAddress();
    $receiverAddress->setSiteId($receiverSiteId);
    $receiverAddress->setQuarterType($receiverResultQuarter->getType());
    $receiverAddress->setQuarterName($receiverResultQuarter->getName());
    $receiverAddress->setQuarterId($receiverResultQuarter->getId());
    $receiverAddress->setBlockNo('702');
    $receiverAddress->setEntranceNo('1');
    $receiverAddress->setFloorNo('54');
    $receiverAddress->setApartmentNo('1229');

    // Note that if you cannot determine address fields from input address text (f.e. you cannot structurally parse the input address)
    // clients could use method setAddressNote. In that case setting an address will look like:
    //
    // $receiverAddress = new ParamAddress();
    // $receiverAddress->setSiteId($receiverSiteId);
    // $receiverAddress->setAddressNote('к-с ЛЮЛИН 7, бл.702 вх.1, ет.54, ап.1229');
    //
    // NOTE: Site name should not be placed in addressNote field, because site Id is passed separately and cannot be omitted

    // Set receiver client data
    $receiver = new ParamClientData();
    $receiver->setAddress($receiverAddress);
    $receiver->setPartnerName('RECEIVER PARTNER NAME');
    $paramPhoneNumber = new ParamPhoneNumber();
    $paramPhoneNumber->setNumber("7001 7001");
    $receiver->setPhones(array(0 => $paramPhoneNumber));
	$receiver->setContactName("TEST TEST TEST");

    $picking = new ParamPicking();
    $picking->setServiceTypeId($pickingData->serviceTypeID);
    $picking->setBackDocumentsRequest($pickingData->backDocumentReq);
    $picking->setBackReceiptRequest($pickingData->backReceiptReq);
    $picking->setWillBringToOffice(!is_null($pickingData->bringToOfficeId));
    $picking->setOfficeToBeCalledId($pickingData->takeFromOfficeId);
    $picking->setParcelsCount($pickingData->parcelsCount);
    $picking->setWeightDeclared($pickingData->weightDeclared);
    $picking->setContents($pickingData->contents);
    $picking->setPacking($pickingData->packing);
    $picking->setDocuments($pickingData->documents);
    $picking->setPalletized($pickingData->palletized);
    $picking->setFragile($pickingData->fragile);
    $picking->setSender($sender);
    $picking->setReceiver($receiver);
    $picking->setPayerType($pickingData->payerType);
    $picking->setTakingDate($pickingData->takingDate);
    $picking->setAmountCodBase($pickingData->amountCODBase);
    $resultBOL = $eps->createBillOfLading($picking);
    
    // $resultBOL contains response in a ResultBOL class instance
```

## Print Bill Of Lading in a PDF file ##
This example demonstrates usage of method to create Bill of Ladding PDF

```
    $pickingId = 299000129; // Example ID of created picking
    $paramPDF = new ParamPDF();
    $paramPDF->setIds(array(0=>$pickingId));
    $paramPDF->setType(ParamPDF::PARAM_PDF_TYPE_BOL);
    $paramPDF->setIncludeAutoPrintJS(true);
    
    // Save pdf in a file
    $fileNameOnly = $eps->getUsername().'_picking_'.$pickingId.'_'.time().'.pdf';
    $fileName = $outputPDFFolder.$fileNameOnly;
    file_put_contents($fileName, $eps->createPDF($paramPDF), FILE_APPEND | LOCK_EX);
```

## Print Bill Of Lading Labels in PDF ##
This example demonstrates usage of method to print Bill of Ladding Labels in PDF

```
    $pickingId = 299000129; // Example ID of created picking
    $paramPDF = new ParamPDF();
    $paramPDF->setIds(array(0=>$pickingId));
    $paramPDF->setType(ParamPDF::PARAM_PDF_TYPE_LBL);
    $paramPDF->setIncludeAutoPrintJS(true);
    
    // Save pdf in a file
    $fileNameOnly = $eps->getUsername().'_lbl_'.$pickingId.'_'.time().'.pdf';
    $fileName = $outputPDFFolder.$fileNameOnly;
    file_put_contents($fileName, $eps->createPDF($paramPDF), FILE_APPEND | LOCK_EX);
```

## Create Order ##
Order triggers the process of taking and delivery. Orders are usually submitted at the end of working day (preferably but not mandatory - one order per day). The order includes all Bill Of Ladings created for current day.

```
    $pickingId = 299000129;  // Example Id of a created picking
    $pickingId2 = 299000130; // Example Id of a created picking
    
    $order = new ParamOrder();
    $order->setBillOfLadingsList(array(0 => $pickingId, 1 => $pickingId2));             
    $order->setBillOfLadingsToIncludeType(ParamOrder::ORDER_BOL_INCLUDE_TYPE_EXPLICIT); 
    $order->setReadinessTime(1730);              // 17:30                                         
    $order->setContactName("CONTACT NAME");                          
    $paramPhoneNumber = new ParamPhoneNumber();
    $paramPhoneNumber->setNumber("7001 7002");
    $order->setPhoneNumber($paramPhoneNumber);                                          
    $order->setWorkingEndTime(1800); // 18:00                                                    
    $arrResultOrderPickingInfo = $eps->createOrder($order);
```