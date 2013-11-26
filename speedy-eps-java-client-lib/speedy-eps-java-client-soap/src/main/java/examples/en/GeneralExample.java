/**
 * Examples with comments in English language
 */
package examples.en;

import java.io.File;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.omgm.speedy.eps.soap.EPSFacade;
import com.omgm.speedy.eps.soap.Util;
import com.omgm.speedy.eps.soap.model.EPSProviderService;
import com.omgm.speedy.eps.soap.model.ParamAddress;
import com.omgm.speedy.eps.soap.model.ParamCalculation;
import com.omgm.speedy.eps.soap.model.ParamClientData;
import com.omgm.speedy.eps.soap.model.ParamFilterSite;
import com.omgm.speedy.eps.soap.model.ParamPDF;
import com.omgm.speedy.eps.soap.model.ParamPhoneNumber;
import com.omgm.speedy.eps.soap.model.ParamPicking;
import com.omgm.speedy.eps.soap.model.ResultBOL;
import com.omgm.speedy.eps.soap.model.ResultCalculation;
import com.omgm.speedy.eps.soap.model.ResultCalculationMS;
import com.omgm.speedy.eps.soap.model.ResultClientData;
import com.omgm.speedy.eps.soap.model.ResultCourierServiceExt;
import com.omgm.speedy.eps.soap.model.ResultLogin;
import com.omgm.speedy.eps.soap.model.ResultQuarter;
import com.omgm.speedy.eps.soap.model.ResultSite;
import com.omgm.speedy.eps.soap.model.ResultSiteEx;
import com.omgm.speedy.eps.soap.model.ResultStreet;

/**
 * In this example we assume that the "sender" is the client with user profile registration which we use to authenticate.
 * The "sender" address is loaded from client profile registration in speedy data base
 * If "sender" is not the client that authenticates and creates bill of lading then the "sender" details are determined
 * the same way as we determine "receiver" details in this example 
 */
public class GeneralExample {
    
    public final static SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ZZZ");

    // Helper class for client configuration 
    static class ClientConfiguration {
        public String sUserName = "XXXXXXXXXXXX"; // Configure your speedy account user name
        public String sUserPassword = "YYYYYYYYYYYY"; // Configure your speedy account password
        public long[] alEnabledServices = new long[] { 3, 113 }; // Configure a short list of services (from speedy nomenclature), that client will use
        public String sContactName = "TEST TEST TEST"; // Configure contact name for opening bills of lading
        public String sContactPhone = "7001 7001"; // Configure contact name for opening bills of lading and ordering couriers
    }

    // Receiver details (helper structure used in this example)
    static class ReceiverData {
        class ReceiverDataAddress {
            public String sSiteType = "гр";       // Receiver's address site type
            public String sSiteName = "БУРГАС";   // Receiver's address site name
            public String sQuarter = "СЛАВЕЙКОВ"; // Receiver's address quarter name
            public String sBlockNo = "62";        // Receiver's address block number
            public String sStreet = null;         // Receiver's address street name
            public String sStreetNo = null;       // Receiver's address street number
            public String sEntranceNo = "2";      // Receiver's address entrance
            public String sFloorNo = "4";         // Receiver's address floor
            public String sApartmentNo = "12";    // Receiver's address apartment number
        }

        public ReceiverDataAddress address = new ReceiverDataAddress(); // Init receiver address instance
        public String sPartnerName = "ИВАНОВИ ООД";                     // Receiver partner (company) name
        public String sContactName = "ИВАН ИВАНОВ";                     // Receiver contact name
        public String sContactPhone = "0888 888 888";                   // Receiver contact phone
    };

    // Picking details (helper structure with example data)
    static class PickingData {
        public double dblWeightDeclared = 5.25; // Declared weight
        public Long bringToOfficeId = null; // Office, where sender will bring the parcels. If it is null, courier will collect the parcels from sender address
        public Long takeFromOfficeId = 119L; // Office, where receiver will take the parcels. If it is null, courier will deliver the parcels to receiver address
        public int nParcelsCount = 1; // Number of parcles
        public boolean flagDocuments = false; // This flag indicates that the picking contains only documents
        public boolean flagPalletized = false; // This flag indicates that the picking is palletized
        public int nPayerType = Util.PAYER_TYPE_RECEIVER; // The payer
        public Double amountCODBase = 25D; // Collection on delvery amount (25 BGN)
        public boolean flagBackDocumentReq = true; // Back document request flag
        public boolean flagBackReceiptReq = false; // Back receipt request flag
        public String sContents = "Дрехи"; // Picking content
        public String sPacking = "ПАКЕТ"; // Description of packaging
        public Date takingDate; // Date when the parcels will be collected
        public boolean autoAdjust = true; // Auto-adjust flag - used to automatically determine taking date in case it is not fixed in advance
    }

    // Output directory to save printed bill of lading and labels
    private final static String S_OUTPUT_FOLDER = ".";

    /**
     * Main method
     * @param args Command line arguments
     * @throws Exception
     */
    public static void main(String args[]) throws Exception {

        long lSenderSiteId;
        long lReceiverSiteId;
        long lServiceTypeId;

        ClientConfiguration clientConfiguration = new ClientConfiguration();
        ReceiverData receiverData = new ReceiverData();
        PickingData pickingData = new PickingData();

        // -------------------------------------------------------------------------------------------------------------------
        // EPS INTRFACE INITIALIZATION AND CALCULATION
        // -------------------------------------------------------------------------------------------------------------------
        System.out.println("=========================================================================================================\nSTART");
        System.out.println("=========================================================================================================");
        String sManifestVersion = EPSFacade.class.getPackage().getImplementationVersion();
        if (sManifestVersion != null) {
            System.out.println("\n(Java EPS Client version: ".concat(sManifestVersion).concat(")"));
        } 

        try {
            // Initialization of EPS interface with SOAP implementation
            EPSFacade eps;
            if (args != null && args.length > 2) {
                eps = new EPSFacade(Util.getEPSProvider(new URL(args[0])), args[1], args[2]);
            } else {
                eps = new EPSFacade(new EPSProviderService().getEPSProviderPort(), clientConfiguration.sUserName, clientConfiguration.sUserPassword);
            }
            
            // Establish EPS session
            System.out.println("Establish session [login]");
            ResultLogin resultLogin = eps.getResultLogin();
            System.out.println("--------------------------------------------------------------------------------------------------------");
            System.out.println(
                    new StringBuilder().
                        append("TIMESTAMP: ").append(SDF.format(Util.getCurrentSpeedyDateTime())).
                        append("  CLIENTID: ").append(resultLogin.getClientId()).
                        append("  SESSIONID: ").append(resultLogin.getSessionId()).toString()
            );
            System.out.println("--------------------------------------------------------------------------------------------------------");
            
            // Get registered EPS user details (in this example this is "sender")
            System.out.println("\n\n");
            System.out.println("------------------------------------------------------------------------------------------------");
            System.out.println("Get sender details (EPS user) from registered profile in Speedy [getClientById]");
            System.out.println("------------------------------------------------------------------------------------------------");
            System.out.println("Parameters:");
            System.out.println("    {clientId}: ".concat(String.valueOf(resultLogin.getClientId())));
            ResultClientData senderClientData = eps.getClientById(eps.getResultLogin().getClientId());
            System.out.println("\n\nSender details: ");
            System.out.println("--------------------------------------------------------------------");
            System.out.println(Util.toString(senderClientData));
            System.out.println("-----------------------------------------------------------------------");

            // Sender site id
            lSenderSiteId = senderClientData.getAddress().getSiteId();
            System.out.println("\n\nSender site id (From Speedy address nomenclature): " + lSenderSiteId);

            // Determine sender site
            System.out.println("\n\n");
            System.out.println("--------------------------------------------------------------------------------------------------");
            System.out.println("Get sites by site type and name from Speedy address nomenclature [listSitesEx]");
            System.out.println("--------------------------------------------------------------------------------------------------");
            ParamFilterSite paramFilterSite = new ParamFilterSite();
            paramFilterSite.setType(receiverData.address.sSiteType);
            paramFilterSite.setName(receiverData.address.sSiteName);
            System.out.println("Parameters:");
            System.out.println("    {siteType}: " + receiverData.address.sSiteType);
            System.out.println("    {siteName}: " + receiverData.address.sSiteName);
            List<ResultSiteEx> listSitesEx = eps.listSitesEx(paramFilterSite);
            ResultSiteEx resultSiteEx;
            
            if (listSitesEx == null || listSitesEx.size() == 0) {
                // Receiver site not found
                throw new RuntimeException("Receiver site not found.");
            } else if (listSitesEx.size() == 1) {
                // Receiver site is found and is unique
                System.out.println("\n\nJust one receiver site is found with search criteria.");
                resultSiteEx = listSitesEx.get(0);
            } else {
                // Multiple sites are found with search criteria. User should select receiver site from the list of possible sites
                System.out.println("\n\nMultiple sites are found with search criteria. User should select receiver site from the list of possible sites."); 
                System.out.println("For the purpose of this example, the first site from the list is selected.");
                resultSiteEx = listSitesEx.get(0);
            }

            ResultSite resultSite = resultSiteEx.getSite();
            lReceiverSiteId = resultSite.getId();
            System.out.println("\n\nReceiver site identifier (from Speedy address nomenclature): " + lReceiverSiteId);

            // Set taking date (date for collection)
            // The datetime arguments should be passed in Speedy Time Zone (Europe/Sofia Standard Time). 
            // Usually datetimes are passed as argument without the time components (hour, minutes, seconds and milliseconds equal to 0), 
            // but user could choose to pass the time component in order to denote the time the parcels are ready for collection.
            // User should take into an account that taking date is used for methods to determine available services and price calculations.
            // Therefore the same service could have different calculation price depending on taking date.
            pickingData.takingDate = Util.getCurrentSpeedyDate(); // To simplify the example, we use current date in Speedy time zone

            // Taking date is determined with usage of method getAllowedDaysForTaking for a service as it is demonstrated 
            // in commented code below. Usually clients have own schedule for parcel collection, but it should be in sync with 
            // Speedy's schedule for collection.
            // The method getAllowedDaysForTaking returns ordered list of possible taking dates, starting from the recent moment
            // and limited to next 10 working days for Speedy.
            // The result list could be filtered additionally passing datetime in minDate argument.
            // If minDate equals to null or minDate is in the past comparing to current time, Speedy assumes that 
            // the taking dates should be determined starting from the very recent moment and no additional filtering is applied.
            // If minDate is in the future, the list of determined available taking dates is filtered to remove dates that are in the
            // past comparing to minDate argument.
            // Note that minDate could have time component and if the denoted time is out of the Speedy working time for
            // that day then this date is also removed from the list.
            // The time component is determined based on Speedy Time zone (FLE Standard Time)
            // The example code follows in commented section below:

            // ---------------------------------------------------------------------------------------
            // Determine the taking date if we know the selected service in advance
            // ---------------------------------------------------------------------------------------
//            long lServiceTypeIdForTaking = 3; // For example, let's determine taking date for service with id equal to 3
//            System.out.println("\n\n");
//            System.out.println("Determine taking date starting from current moment [getAllowedDaysForTaking]:");
//            System.out.println("--------------------------------------------------------------------------------------");
//            System.out.println("Parameters:");
//            System.out.println("    {serviceTypeID} : " + lServiceTypeIdForTaking);
//            System.out.println("    {senderSiteId}  : " + (pickingData.bringToOfficeId == null ? lSenderSiteId : null));
//            System.out.println("    {senderOfficeId}: " + pickingData.bringToOfficeId);
//            System.out.println("    {minDate}       : null");
//            List<Date> listAllowedDaysForTaking = eps.getAllowedDaysForTaking(
//                 lServiceTypeIdForTaking,
//                 pickingData.bringToOfficeId == null ? lSenderSiteId : null,
//                 pickingData.bringToOfficeId,
//                 null
//            );
//            if (listAllowedDaysForTaking == null || listAllowedDaysForTaking.size() == 0) {
//                throw new RuntimeException("No available taking dates.");
//            } else if (listAllowedDaysForTaking.size()== 1) {
//                // There is just one possible taking date
//                pickingData.takingDate = listAllowedDaysForTaking.get(0);
//            } else {
//                // There are multiple possible taking dates
//		          // User selects one of possible options (for example first possible date)
//                pickingData.takingDate = listAllowedDaysForTaking.get(0);
//            }
//
//            System.out.println("\n\nTaking date:");
//            System.out.println(SDF.format(pickingData.takingDate));

            // Get available services for the route and filtering with pre-defined services client list
            System.out.println("\n\n");
            System.out.println("-------------------------------------------------------------------------------------------------------");
            System.out.println("Get list of available services [listServicesForSites]");
            System.out.println("-------------------------------------------------------------------------------------------------------");
            System.out.println("Parameters:");
            System.out.println("    {date}          : " + (pickingData.takingDate == null ? null : SDF.format(pickingData.takingDate)));
            System.out.println("    {senderSiteId}  : " + lSenderSiteId);
            System.out.println("    {receiverSiteId}: " + lReceiverSiteId);
            List<ResultCourierServiceExt> listResultCourierServiceExt = eps.listServicesForSites(pickingData.takingDate, lSenderSiteId, lReceiverSiteId);
            System.out.println("\n\n");
            System.out.println("Result:");
            System.out.println("--------");
            if (listResultCourierServiceExt != null) {
                if (listResultCourierServiceExt.size() == 0 ) { 
                    System.out.println("No available services.");
                } else if (listResultCourierServiceExt.size() == 1 ) {
                    System.out.println("Only one service is availbale.");
                } else {
                    System.out.println(listResultCourierServiceExt.size() + " services are available.");
                }
                
            } else {
                System.out.println("null");
            }
            
            // Determine intersection of available Speedy services and pre-defined client list of desired services
            System.out.println("\n\n");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("Filter available Speedy services with the list of pre-defined client ones");
            System.out.println("-----------------------------------------------------------------------------------");
            List<Long> listSelectedServices = Util.serviceIntersection(listResultCourierServiceExt, clientConfiguration.alEnabledServices);
            System.out.println("\n\n");
            System.out.println("Result:");
            System.out.println("--------");
            if (listSelectedServices != null) {
                if (listSelectedServices.size() == 0 ) { 
                    System.out.println("There are no available services.");
                } else if (listSelectedServices.size() == 1 ) {
                    System.out.println("There is only one service available.");
                } else {
                    System.out.println(listSelectedServices.size() + " services are available.");
                }
                
            } else {
                System.out.println("null");
            }
            
            // Filter available service list according to weight requirements

            System.out.println("\n\n");
            System.out.println("---------------------------------------------------------------------------------------------------");
            System.out.println("Filter available service list with weight requirements [getWeightInterval]");
            System.out.println("---------------------------------------------------------------------------------------------------");
            System.out.println("Parameters:");
            System.out.println("    {weightDeclared}: " + pickingData.dblWeightDeclared);
            System.out.println("    {senderSiteId}  : " + lSenderSiteId);
            System.out.println("    {receiverSiteId}: " + lReceiverSiteId);
            System.out.println("    {date}          : " + (pickingData.takingDate == null ? "null" : SDF.format(pickingData.takingDate)));
            System.out.println("    {documents}     : " + pickingData.flagDocuments);
            List<Long> listFinalServices = Util.filterServicesByWeightIntervals(
                    listSelectedServices, pickingData.dblWeightDeclared, eps, lSenderSiteId, lReceiverSiteId, 
                    pickingData.takingDate, pickingData.flagDocuments
            );
            if (listFinalServices == null || listFinalServices.size() == 0) {
                // No available service for this picking
                throw new RuntimeException("No available service.");
            }

            // Calculation parameters
            ParamCalculation paramCalculation = new ParamCalculation();
            paramCalculation.setBroughtToOffice(pickingData.bringToOfficeId != null);
            paramCalculation.setToBeCalled(pickingData.takeFromOfficeId != null);
            paramCalculation.setParcelsCount(pickingData.nParcelsCount);
            paramCalculation.setWeightDeclared(pickingData.dblWeightDeclared);
            paramCalculation.setDocuments(pickingData.flagDocuments);
            paramCalculation.setPalletized(pickingData.flagPalletized);
            
            // When senderSiteId is set instead of senderId, the contract preferences are not considered on price calculation
            //paramCalculation.setSenderSiteId(lSenderSiteId);  
            paramCalculation.setSenderId(senderClientData.getClientId()); // Use contract preferences
            
            paramCalculation.setReceiverSiteId(lReceiverSiteId);
            paramCalculation.setPayerType(pickingData.nPayerType);
            paramCalculation.setAmountCodBase(pickingData.amountCODBase);
            paramCalculation.setTakingDate(Util.toXMLGregorianCalendar(pickingData.takingDate));
            paramCalculation.setAutoAdjustTakingDate(pickingData.autoAdjust); // Adjust to first allowed taking date
            
            if (listFinalServices.size() == 1) {

                // We have just one available service
                lServiceTypeId = listFinalServices.get(0);

                // Set service in calculation parameters structure
                paramCalculation.setServiceTypeId(lServiceTypeId);

                // Calculate. The result contains total price and price components, together with deadlines for taking and delivery
                System.out.println("\n\n");
                System.out.println("----------------------");
                System.out.println("Calculation [calculate]");
                System.out.println("----------------------");
                ResultCalculation resultCalculation = eps.calculate(paramCalculation);
                System.out.println("\n\nResult: ");
                System.out.println("--------------------------------------------------------------------");
                System.out.println(Util.toString(resultCalculation));
                System.out.println("--------------------------------------------------------------------");

                // If paramCalculation.autoAdjustTakingDate is set to true, we can get from the result taking date
                if (pickingData.autoAdjust) {
                    pickingData.takingDate = Util.fromXMLGregorianCalendar(resultCalculation.getTakingDate());
                }

            } else {

            	// We have several available services. The user should select one of them
                // We could make calculation for all of them and user could select the service comparing the prices and deadlines
                System.out.println("\n\n");
                System.out.println("---------------------------------------------------------------------");
                System.out.println("Multiple services calulcation [calculateMultipleServices]");
                System.out.println("---------------------------------------------------------------------");
                List<ResultCalculationMS> listResultCalculationMS = eps.calculateMultipleServices(paramCalculation, listFinalServices);

               
                if (listResultCalculationMS != null && listResultCalculationMS.size() > 0) {
                    System.out.println("\n\nResult: ");
                    System.out.println("--------------------------------------------------------------------");
                    System.out.println("List(" + listResultCalculationMS.size() + ")");
                    for (int i = 0; i < listResultCalculationMS.size(); ++i) {
                        System.out.println(i + ":");
                        System.out.println(Util.toString("  ", listResultCalculationMS.get(0)));
                    }
                    System.out.println("--------------------------------------------------------------------");
                    
                    // User makes a choice, comparing the results (prices and delivery deadlines)
                    System.out.println("\n");
                    System.out.println("User should make a choice, comparing the results.");
                    System.out.println("For the purpose of this example we select first available service.");
                    ResultCalculationMS resultCalculationMS = listResultCalculationMS.get(0);
                    lServiceTypeId = resultCalculationMS.getServiceTypeId();
                    
                 // If paramCalculation.autoAdjustTakingDate is set to true, we can get from the result taking date
                    if (pickingData.autoAdjust) {
                        pickingData.takingDate = Util.fromXMLGregorianCalendar(resultCalculationMS.getResultInfo().getTakingDate());
                    }
                } else {
                    throw new RuntimeException("No result from calculateMultipleServices.");
                }
            }

            System.out.println("\n\n");
            System.out.println("The service and taking date are selected:");
            System.out.println("--------------------------------");
            System.out.println("    service id : " + lServiceTypeId);
            System.out.println("    taking date: " + (pickingData.takingDate == null ? null : SDF.format(pickingData.takingDate)));


            // -------------------------------------------------------------------------------------------------------------------

            // -------------------------------------------------------------------------------------------------------------------
            // DETERMINE RECEIVER ADDRESS
            // -------------------------------------------------------------------------------------------------------------------

            // Example receiver address: гр.БУРГАС, жк. СЛАВЕЙКОВ, бл.62, вх.2, ет.4, ап.12, МЕТАЛНАТА РЕШЕТКА СРЕЩУ АСАНСЬОРА

            // Set receiver address
            ParamAddress receiverAddress = new ParamAddress();
            receiverAddress.setSiteId(lReceiverSiteId);

            // If address is normalized, we determine each address component according to Speedy address nomenclature
            // If address is not normalized, you can set the whole address in addressNote field:
            // receiverAddress.addressNote = "к-с СЛАВЕЙКОВ, бл.62, вх.2, ет.4, ап.12, МЕТАЛНАТА РЕШЕТКА СРЕЩУ АСАНСЬОРА";
            // The address note field contains address in the area of already determined receiver site
            // So, user should not include site name in address note.
            // This method for setting receiver address is not recommended, because the uniqueness of the address 
            // is not guaranteed, which may lead to delays in delivery

            // Determine quarter
            if (receiverData.address.sQuarter != null) {
                System.out.println("\n\n");
                System.out.println("Get quarters [listQuarters]:");
                System.out.println("-------------------------------------");
                System.out.println("Parameters:");
                System.out.println("    {name}  : " + receiverData.address.sQuarter);
                System.out.println("    {siteId}: " + lReceiverSiteId);
                List<ResultQuarter> listResultQuarter = eps.listQuarters(receiverData.address.sQuarter, lReceiverSiteId);
                if (listResultQuarter == null || listResultQuarter.size() == 0) {
                    // Quarter is not found
                	throw new RuntimeException("There is no quarter with that searh criteria.");
                } else if (listResultQuarter.size() == 1) {
                	// There is just one quarter with search criteria
                    System.out.println("\n");
                    System.out.println("There is just one quarter with search criteria.");
                    receiverAddress.setQuarterId(listResultQuarter.get(0).getId());
                } else {
                    // There are more than one quarters with that search criteria. User should select from available options
                    System.out.println("\n");
                    System.out.println("There are more than one quarters with that search criteria. User should select from available options.");
                    System.out.println("For the purpose of this example, the first quarter is selected.");
                    receiverAddress.setQuarterId(listResultQuarter.get(0).getId());
                }
            }
            // Determine street (we don't have street in our example address)
            if (receiverData.address.sStreet != null) {
                System.out.println("\n\n");
                System.out.println("Get streets [listStreets]:");
                System.out.println("---------------------------------");
                System.out.println("Parameters:");
                System.out.println("    {name}  : " + receiverData.address.sStreet);
                System.out.println("    {siteId}: " + lReceiverSiteId);
                List<ResultStreet> listResultStreet = eps.listStreets(receiverData.address.sStreet, lReceiverSiteId);
                if (listResultStreet == null || listResultStreet.size() == 0) {
                	//There are no streets with that search criteria
                    throw new RuntimeException("There are no streets with that search criteria");
                } else if (listResultStreet.size() == 1) {
                    // There is just one street with that search criteria
                    System.out.println("\n");
                    System.out.println("There is just one street with that search criteria.");
                    receiverAddress.setStreetId(listResultStreet.get(0).getId());
                } else {
                    // There are more than one streets with that search criteria. User should select one of the options
                    System.out.println("\n");
                    System.out.println("There are more than one streets with that search criteria. User should select one of the options.");
                    System.out.println("For the purpose of this example, the first street is selected.");
                    receiverAddress.setStreetId(listResultStreet.get(0).getId());
                }
            }
            receiverAddress.setBlockNo(receiverData.address.sBlockNo);
            receiverAddress.setStreetNo(receiverData.address.sStreetNo);
            receiverAddress.setEntranceNo(receiverData.address.sEntranceNo);
            receiverAddress.setFloorNo(receiverData.address.sFloorNo);
            receiverAddress.setApartmentNo(receiverData.address.sApartmentNo);
            // receiverAddress.setAddressNote("к-с СЛАВЕЙКОВ, бл.62, вх.2, ет.4, ап.12, МЕТАЛНАТА РЕШЕТКА СРЕЩУ АСАНСЬОРА");

            System.out.println("\n\nReceiver address:");
            System.out.println("--------------------------------------------------------------------");
            System.out.println(Util.toString(receiverAddress));
            System.out.println("--------------------------------------------------------------------");

            // -------------------------------------------------------------------------------------------------------------------

            // -------------------------------------------------------------------------------------------------------------------

            // -------------------------------------------------------------------------------------------------------------------
            // DETERMINE SENDER AND RECEIVER DETAILS AND OPEN BILL OF LADING
            // SENDER: EPS Client
            // RECEIVER: TEST COMPANY LTD, contact person: TEST TEST TEST, phone. 7001 7001
            // -------------------------------------------------------------------------------------------------------------------

            // Sender details
            ParamClientData sender = new ParamClientData();
            sender.setClientId(senderClientData.getClientId());
            sender.setContactName(clientConfiguration.sContactName);
            ParamPhoneNumber senderPhoneNumber = new ParamPhoneNumber();
            senderPhoneNumber.setNumber(clientConfiguration.sContactPhone);
            sender.getPhones().add(senderPhoneNumber);

            System.out.println("\nSender details: ");
            System.out.println("--------------------------------------------------------------------");
            System.out.println(Util.toString(sender));
            System.out.println("--------------------------------------------------------------------");

            // Receiver details
            ParamClientData receiver = new ParamClientData();
            // We'll set the picking to be taken from office
            // In that case we don't need to set receiver address, because office address will be set as receiver address
            // Therefore the next line is commented
            //receiver.setAddress(receiverAddress);
            receiver.setPartnerName(receiverData.sPartnerName);
            ParamPhoneNumber paramPhoneNumber = new ParamPhoneNumber();
            paramPhoneNumber.setNumber(receiverData.sContactPhone);
            receiver.getPhones().add(paramPhoneNumber);
            receiver.setContactName(receiverData.sContactName);

            System.out.println("\n\nReceiver details: ");
            System.out.println("--------------------------------------------------------------------");
            System.out.println(Util.toString(receiver));
            System.out.println("--------------------------------------------------------------------");

            // ----------------------------------------------------------------------------------------------
            // Commented section below demonstrates opening of a bill of lading and printing it to pdf files
            // ----------------------------------------------------------------------------------------------
/*
            // Bill of lading details
            System.out.println("\n\n");
            System.out.println("Open bill of lading for picking 1 [createBillOfLading]...");
            System.out.println("--------------------------------------------------------------");
            ParamPicking picking = new ParamPicking();
            picking.setServiceTypeId(lServiceTypeId);
            picking.setBackDocumentsRequest(pickingData.flagBackDocumentReq);
            picking.setBackReceiptRequest(pickingData.flagBackReceiptReq);
            //picking.setWillBringToOffice(pickingData.bringToOfficeId != null);
            picking.setWillBringToOfficeId(pickingData.bringToOfficeId);
            picking.setParcelsCount(pickingData.nParcelsCount);
            picking.setWeightDeclared(pickingData.dblWeightDeclared);
            picking.setContents(pickingData.sContents);
            picking.setPacking(pickingData.sPacking);
            picking.setDocuments(pickingData.flagDocuments);
            picking.setPalletized(pickingData.flagPalletized);
            picking.setSender(sender);
            picking.setReceiver(receiver);
            picking.setPayerType(pickingData.nPayerType);
            picking.setAmountCodBase(pickingData.amountCODBase);
            picking.setOfficeToBeCalledId(pickingData.takeFromOfficeId);
            picking.setTakingDate(Util.toXMLGregorianCalendar(pickingData.takingDate));
            

            // Open bill of lading
            ResultBOL resultBOL = eps.createBillOfLading(picking);

            // Bill of lading id is the first parcel id
            long lPickingId = resultBOL.getGeneratedParcels().get(0).getParcelId();

            System.out.println("\nBill of lading for picking 1 is open with id: " + lPickingId);

            // Print bill of lading
            System.out.println("\n\nPrint bill of lading with id:" + lPickingId + " for picking 1 [createPDF]...");
            ParamPDF paramPDF = new ParamPDF();
            paramPDF.getIds().add(Long.valueOf(lPickingId));
            paramPDF.setType(Util.PARAM_PDF_TYPE_BOL);
            paramPDF.setIncludeAutoPrintJS(true);

            // Save bill of lading pdf to file
            String sFileNameOnly = eps.getUserName() + "_picking_" + lPickingId + "_" + System.currentTimeMillis() + ".pdf";
            File pdfFile = new File(S_OUTPUT_FOLDER, sFileNameOnly);
            Util.saveFile(pdfFile, eps.createPDF(paramPDF));

            System.out.println("\nBill of lading with id:" + lPickingId + " for picking 1 is saved in file: " + pdfFile.getAbsolutePath());
*/
            // ------------------------------------------------------------------------------------------------------
            //  Commented code below, could be used for label printing instead of bill of lading printing
            // ------------------------------------------------------------------------------------------------------
             // Print label
//            System.out.println("\n\nPrint label for bill of lading id:" + lPickingId + " [createPDF]...");
//            ParamPDF paramLblPDF = new ParamPDF();
//            paramLblPDF.getIds().add(Long.valueOf(lPickingId));
//            paramLblPDF.setType(Util.PARAM_PDF_TYPE_LBL);
//            paramLblPDF.setIncludeAutoPrintJS(true);
//
//            // Save label pdf in file
//            String sPcikingFileNameOnly = eps.getUserName() + "_lbl_" + lPickingId + "_"+ System.currentTimeMillis() + ".pdf";
//            File pdfFileLbl = new File(S_OUTPUT_FOLDER, sPcikingFileNameOnly);
//            Util.saveFile(pdfFileLbl, eps.createPDF(paramLblPDF));
//
//            System.out.println("\nLabel for bill of lading id: "+ lPickingId + " is saved in file: " + pdfFileLbl.getAbsolutePath());
            // -------------------------------------------------------------------------------------------------------------------

            // -------------------------------------------------------------------------------------------------------------------
            // OPEN SECOND BILL OF LADING (MORE COMPLEX SCENARIO - THREE PARCELS WITH INSURANCE)
            // -------------------------------------------------------------------------------------------------------------------
            // We'll remove takeFromOffice flag and courier should deliver the picking to receiver address
            // Therefore we need to set that address
//            receiver.setAddress(receiverAddress);
            
//            // Picking details
//            System.out.println("\n\n");
//            System.out.println("Open second bill of lading 2 [createBillOfLading]...");
//            System.out.println("--------------------------------------------------------------");
//            ParamPicking picking2 = new ParamPicking();
//            picking2.setServiceTypeId(lServiceTypeId);
//            picking2.setBackDocumentsRequest(pickingData.flagBackDocumentReq);
//            picking2.setBackReceiptRequest(pickingData.flagBackReceiptReq);
//            picking2.setWillBringToOffice(pickingData.bringToOfficeId != null);
//
//            picking2.setWeightDeclared(pickingData.dblWeightDeclared);
//            picking2.setContents(pickingData.sContents);
//            picking2.setPacking(pickingData.sPacking);
//            picking2.setDocuments(pickingData.flagDocuments);
//            picking2.setPalletized(pickingData.flagPalletized);
//            picking2.setSender(sender);
//            picking2.setReceiver(receiver);
//            picking2.setPayerType(pickingData.nPayerType);
//            picking2.setTakingDate(Util.toXMLGregorianCalendar(pickingData.takingDate));
//            picking2.setAmountInsuranceBase(20.0);
//            picking2.setPayerTypeInsurance(Util.PAYER_TYPE_SENDER);
//            picking2.setFragile(true);
//            picking2.setParcelsCount(3); // Picking with 3 parcels
//
//            // Open bill of lading
//            ResultBOL resultBOL2 = eps.createBillOfLading(picking2);
//
//            // Bill of lading id is first parcel id
//            long lPickingId2 = resultBOL2.getGeneratedParcels().get(0).getParcelId();
//
//            long lPickingId2Parcel1Id = lPickingId2; // The same as  resultBOL2.generatedParcels[0].parcelId
//            long lPickingId2Parcel2Id = resultBOL2.getGeneratedParcels().get(1).getParcelId();
//            long lPickingId2Parcel3Id = resultBOL2.getGeneratedParcels().get(2).getParcelId();
//
//            System.out.println("\nBill of lading with id:" + lPickingId2 + " is open.");
            // -------------------------------------------------------------------------------------------------------------------

            // ------------------------------------------------------------------------------------------------------
            // Commented section below could be used for bill of lading and/or label printing
            // ------------------------------------------------------------------------------------------------------
//            System.out.println("\nPrint bill of lading with id:" + lPickingId2 + " [createPDF]...");
//            ParamPDF paramPDF2 = new ParamPDF();
//            paramPDF2.getIds().add(Long.valueOf(lPickingId2));
//            paramPDF2.setType(Util.PARAM_PDF_TYPE_BOL);
//            paramPDF2.setIncludeAutoPrintJS(true);
//
//            // ave bill of lading pdf to file
//            String sPciking2FileNameOnly = eps.getUserName() + "_picking_" + lPickingId2 + "_" + System.currentTimeMillis() + ".pdf";
//            File pdfPicking2File = new File(S_OUTPUT_FOLDER, sPciking2FileNameOnly);
//            Util.saveFile(pdfPicking2File, eps.createPDF(paramPDF2));
//
//            System.out.println("\nBill of lading with id:"+ lPickingId2 + " is saved in file: " + pdfPicking2File.getAbsolutePath());
            // -------------------------------------------------------------------------------------------------------

            // ------------------------------------------------------------------------------------------------------
            // Group label printing for multi-parcel bill of lading
            // ------------------------------------------------------------------------------------------------------
//            System.out.println("\n\nGroup label printing for bill of lading id:" + lPickingId2 + " [createPDF]...");
//            ParamPDF paramLblPDF2 = new ParamPDF();
//            paramLblPDF2.getIds().add(Long.valueOf(lPickingId2Parcel1Id));
//            paramLblPDF2.getIds().add(Long.valueOf(lPickingId2Parcel2Id));
//            paramLblPDF2.getIds().add(Long.valueOf(lPickingId2Parcel3Id));
//            paramLblPDF2.setType(Util.PARAM_PDF_TYPE_LBL);
//            paramLblPDF2.setIncludeAutoPrintJS(true);
//
//            // Save labels pdf in file
//            String sLblFileNameOnly2 = eps.getUserName() + "_lbl_" + lPickingId2 + "_"+ System.currentTimeMillis() + ".pdf";
//            File pdfFileLbl2 = new File(S_OUTPUT_FOLDER, sLblFileNameOnly2);
//            Util.saveFile(pdfFileLbl2, eps.createPDF(paramLblPDF2));
//
//            System.out.println("\nLabels for bill of lading id: " + lPickingId2 + " are saved in file: " + pdfFileLbl2.getAbsolutePath());

            // -----------------------------------------------------------------------------------------------------

            // -------------------------------------------------------------------------------------------------------------------
            // ORDER
            // After order is created a courier is about to visit the office for collection
            // The order is done at the end of working day (preferably once a day) and includes all pickings ready for collection
            // for that day
            // -------------------------------------------------------------------------------------------------------------------
//            // Order details
//            // ReadinessTime could not be a time before the time of requesting order
//            System.out.println("\n\n");
//            System.out.println("Create order for the two bills of lading [createOrder]...");
//            System.out.println("----------------------------------------------------------------");
//            ParamOrder order = new ParamOrder();
//            order.getBillOfLadingsList().add(Long.valueOf(lPickingId));
//            order.getBillOfLadingsList().add(Long.valueOf(lPickingId2));
//            order.setBillOfLadingsToIncludeType(Util.ORDER_BOL_INCLUDE_TYPE_EXPLICIT); // Order for the list of pickings
//            order.setPickupDate(Util.toXMLGregorianCalendar(pickingData.takingDate));
//            order.setReadinessTime((short) 1750); // Parcels are ready for collection after 17:50
//            order.setContactName(clientConfiguration.sContactName);
//            paramPhoneNumber = new ParamPhoneNumber();
//            paramPhoneNumber.setNumber(clientConfiguration.sContactPhone);
//            order.setPhoneNumber(paramPhoneNumber); 
//            order.setWorkingEndTime((short) 1800); // Sender work time end is 18:00
//
//            // Request order
//            List<ResultOrderPickingInfo> listResultOrderPickingInfo = eps.createOrder(order);
//
//            System.out.println("\nCreate order.");
//
//            // Verify response
//            // If there is at least one error in response list, the order is not created
//            boolean orderIsCreated = true;
//            for (int i = 0; i < listResultOrderPickingInfo.size(); ++i) {
//                ResultOrderPickingInfo resultOrderPickingInfo = listResultOrderPickingInfo.get(i);
//                List<String> listErrorDescriptions = resultOrderPickingInfo.getErrorDescriptions();
//                if (listErrorDescriptions.size() > 0) {
//                    // Unsuccessful order. We have errors in result array
//                    System.out.println("\n  Errors for bill of lading " + resultOrderPickingInfo.getBillOfLading() + ".");
//                    for (int j = 0; j < listErrorDescriptions.size(); ++j) {
//                        System.out.println("\n    Error " + (j + 1) + ": " + listErrorDescriptions.get(j));
//                    }
//                    System.out.println("");
//			          orderIsCreated = false;
//                } else {
//                    // Good order
//                    System.out.println("\nBill of lading  " + resultOrderPickingInfo.getBillOfLading() + " has no errors.");
//                }
//            }
//            
//            if (orderIsCreated) {
//                System.out.println("\n\nOrder is successfully created.");
//            } else {
//                System.out.println("\n\nOrder is not created.");
//            }
            // -------------------------------------------------------------------------------------------------------------------

            System.out.println("\n\n=========================================================================================================\nEND");
            System.out.println("\n=========================================================================================================");

        } catch (Exception ex) {
            // Error handling
            System.out.println("\n\n=========================================================================================================");
            ex.printStackTrace();
            System.out.println("\n>=========================================================================================================");
            throw ex;
        }
    }

}
