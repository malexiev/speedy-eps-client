/**
 * Примери с коментари на български език
 */
package examples.bg;

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
 * В този пример приемаме, че подателят е този клиент на EPS, който съотвества на профила за автентикация предоставен от Speedy. 
 * Данните необходими за подател (адрес) ще извличаме от конфигурацията на потребителя в системата на Speedy.
 * Ако е необходимо да се използва различен подател, то данните за него се определят по начина, 
 * по който се извличат данните за получателя
 */
public class GeneralExample {
    
    public final static SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ZZZ");

    // Клиентска конфигурация.
    static class ClientConfiguration {
        public String sUserName = "XXXXXXXXXXXX"; // Конфигурирайте името на потребителя преодставен за вас от Speedy
        public String sUserPassword = "YYYYYYYYYYYY"; // Конфигурирайте паролата за потребителя преодставен за вас от Speedy
        public long[] alEnabledServices = new long[] { 3, 113 }; // Конфигурирайте ограничен списък от услуги на Speedy, с които клиентът ще работи
        public String sContactName = "TEST TEST TEST"; // Конфигурирайте име за контакт на подателя при откриване на товарителници и заявки за куриер
        public String sContactPhone = "7001 7001"; // Конфигурирайте телефон за контакт на подателя при откриване на товарителници и заявки за куриер
    }

    // Данни за получателя - помощна структура с примерни данни
    static class ReceiverData {
        class ReceiverDataAddress {
            public String sSiteType = "гр";
            public String sSiteName = "БУРГАС";
            public String sQuarter = "СЛАВЕЙКОВ";
            public String sBlockNo = "62";
            public String sStreet = null;
            public String sStreetNo = null;
            public String sEntranceNo = "2";
            public String sFloorNo = "4";
            public String sApartmentNo = "12";
        }

        public ReceiverDataAddress address = new ReceiverDataAddress();
        public String sPartnerName = "ИВАНОВИ ООД";
        public String sContactName = "ИВАН ИВАНОВ";
        public String sContactPhone = "0888 888 888";
    };

    // Данни за пратката - помощна структура с примерни данни
    static class PickingData {
        public double dblWeightDeclared = 5.25; // Декларирано тегло (например 5.25 кг)
        public Long bringToOfficeId = null; // Офис, в който подателя ще достави пратката. Ако е null, куриер ще я вземе от адреса на подателя
        public Long takeFromOfficeId = 119L; // Офис, от който получателя ще вземе пратката. Ако е null, куриер ще я достави до адреса на получателя
        public int nParcelsCount = 1; // Брой пакети
        public boolean flagDocuments = false; // Флаг дали пратката се състои от документи
        public boolean flagPalletized = false; // Флаг дали пратката се състои от палети
        public int nPayerType = Util.PAYER_TYPE_RECEIVER; // Платецът е получателят
        public Double amountCODBase = 25D; // Наложен платеж 25 лв.
        public boolean flagBackDocumentReq = true; // Заявка за обратни документи
        public boolean flagBackReceiptReq = false; // Заявка за обратни разписка
        public String sContents = "Дрехи"; // Съдържание на пратката
        public String sPacking = "ПАКЕТ"; // Опаковка на пратката
        public Date takingDate; // Дата на вземане
        public boolean autoAdjust = true; //Auto-adjust флаг при определяне на датата на вземане
    }

    // Директория, където се записват pdf файловете с товарителници и етикети за печат
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
        // ИНИЦИАЛИЗАЦИЯ И ПРЕДВАРИТЕЛНА КАЛКУЛАЦИЯ НА ЦЕНА
        // -------------------------------------------------------------------------------------------------------------------
        System.out.println("=========================================================================================================\nНАЧАЛО");
        System.out.println("=========================================================================================================");
        String sManifestVersion = EPSFacade.class.getPackage().getImplementationVersion();
        if (sManifestVersion != null) {
            System.out.println("\n(Java EPS Client version: ".concat(sManifestVersion).concat(")"));
        } 

        try {
            // Инициализация на интерфейса към EPS на Спиди със SOAP имплементация
            EPSFacade eps;
            if (args != null && args.length > 2) {
                eps = new EPSFacade(Util.getEPSProvider(new URL(args[0])), args[1], args[2]);
            } else {
                eps = new EPSFacade(new EPSProviderService().getEPSProviderPort(), clientConfiguration.sUserName, clientConfiguration.sUserPassword);
            }
            
            // Установяване на сесия
            System.out.println("Установяване на сесия [login]");
            ResultLogin resultLogin = eps.getResultLogin();
            System.out.println("--------------------------------------------------------------------------------------------------------");
            System.out.println(
                    new StringBuilder().
                        append("TIMESTAMP: ").append(SDF.format(Util.getCurrentSpeedyDateTime())).
                        append("  CLIENTID: ").append(resultLogin.getClientId()).
                        append("  SESSIONID: ").append(resultLogin.getSessionId()).toString()
            );
            System.out.println("--------------------------------------------------------------------------------------------------------");
            
            // Извличане данните на регистрирания потребител на EPS (в този пример - ПОДАТЕЛЯ)
            System.out.println("\n\n");
            System.out.println("------------------------------------------------------------------------------------------------");
            System.out.println("Извличане на данни за подателя (клиента на EPS) от профила в системата на Speedy [getClientById]");
            System.out.println("------------------------------------------------------------------------------------------------");
            System.out.println("Параметри:");
            System.out.println("    {clientId}: ".concat(String.valueOf(resultLogin.getClientId())));
            ResultClientData senderClientData = eps.getClientById(eps.getResultLogin().getClientId());
            System.out.println("\n\nДанни за подателя (клиенът на EPS) от профила в системата на Speedy: ");
            System.out.println("--------------------------------------------------------------------");
            System.out.println(Util.toString(senderClientData));
            System.out.println("-----------------------------------------------------------------------");

            // Идентификатор на населеното място на подателя
            lSenderSiteId = senderClientData.getAddress().getSiteId();
            System.out.println("\n\nИдентификатор на населено място на подателя (от номенклатурата на Speedy): " + lSenderSiteId);

            // Определяме населеното място на получателя
            System.out.println("\n\n");
            System.out.println("--------------------------------------------------------------------------------------------------");
            System.out.println("Извличане на населени места на получателя по тип и име (от номенклатурата на Speedy) [listSitesEx]");
            System.out.println("--------------------------------------------------------------------------------------------------");
            ParamFilterSite paramFilterSite = new ParamFilterSite();
            paramFilterSite.setType(receiverData.address.sSiteType);
            paramFilterSite.setName(receiverData.address.sSiteName);
            System.out.println("Параметри:");
            System.out.println("    {siteType}: " + receiverData.address.sSiteType);
            System.out.println("    {siteName}: " + receiverData.address.sSiteName);
            List<ResultSiteEx> listSitesEx = eps.listSitesEx(paramFilterSite);
            ResultSiteEx resultSiteEx;
            
            if (listSitesEx == null || listSitesEx.size() == 0) {
                // Населеното място на получателя не е намерено
                throw new RuntimeException("Населеното място на получателя не е намерено.");
            } else if (listSitesEx.size() == 1) {
                // Населеното място на получателя е намерено и еднозначно определено
                System.out.println("\n\nНамерено е точно едно възможно населено място на получателя с посочения критерий.");
                resultSiteEx = listSitesEx.get(0);
            } else {
                // Намерени са няколко населени места с това име. Необходимо е потребителя да избере от списъка
                System.out.println("\n\nНамерени са няколко възможни населени места на получателя с посочения критерий. Необходимо е да се избере една от възможностите"); 
                System.out.println("За целите на този пример е избрано първото населено място от резултатния списък.");
                resultSiteEx = listSitesEx.get(0);
            }

            ResultSite resultSite = resultSiteEx.getSite();
            lReceiverSiteId = resultSite.getId();
            System.out.println("\n\nИдентификатор на населено място на получателя (от номенклатурата на Speedy): " + lReceiverSiteId);

            // Задаване на дата/време на вземане на пратката от куриер.
            // Обикновено се използва дата (без времеви компонент във времевата зона на Спиди), но е възможно да се зададе и времеви компонент,
            // като в този случай, това обикновено е времето когато пратката ще бъде окомплектована и готова за вземане.
            // Трябва да се има в предвид, че датата на вземане се използва в методите за определяне на наличните услуги за населените места,
            // и влияе на стойността на калкулацията и на куриерската услуга. С други думи, една и съща пратка може да има различна цена
            // на куриерската услуга в зависимост от деня на нейното вземане от куриер
            pickingData.takingDate = Util.getCurrentSpeedyDate(); // За простота използваме настоящия ден (без времеви компонент във времевата зона на Спиди)

            // Датата на вземане може да се определи с използване на метод getAllowedDaysForTaking за определена услуга, както е показано
            // в коментирания код по-долу. Клиентът обикновено използва свой собствен график за вземане на пратките , но той трябва да бъде
            // синхронизиран с този на Speedy.
            // Методът връща нареден списък от възможни времена считано от настоящия момент на запитването в рамките на следващите 5 работни дни,
            // като този списък може да бъде допълнително филтриран, чрез подаване на стойност в параметъра minDate.
            // При minDate=null, се приема че запитването е за възможни дати за вземане от момента на запитването
            // Ако minDate е инициализиран с време преди времето на настоящия момент отново се счита, 
            // че запитването е за възможни дати за вземане от момента на запитването
            // Ако minDate е инициализиран с време, съотвестващо на бъдещ момент спрямо момента на запитването, то списъка се филтирира допълнително, 
            // като отпадат тези дати, които са предишни календарни дати спрямо minDate. При наличие на времеви компонент в minDate, 
            // допълнително се определя дали подадения час на вземане е в рамките на работното време на Спиди за този ден и 
            // съответно денят може да отпадне от възможните дни за вземане при негативен резултат.
            // Необходимо е да се отбележи, че наличието на времеви компонент (ненулева стойност за час, минута, секунда или милисекунда) се определя
            // спрямо часовата зона на Спиди.
//            long lServiceTypeIdForTaking = 3; // Целим да определим дата на вземане за услуга 3 от номенклатурата на Спиди
//            System.out.println("\n\n");
//            System.out.println("Определяне на времето за вземане считано от настоящия момент [getAllowedDaysForTaking]:");
//            System.out.println("--------------------------------------------------------------------------------------");
//            System.out.println("Параметри:");
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
//                throw new RuntimeException("Не са налични дати за вземане на пратката.");
//            } else if (listAllowedDaysForTaking.size()== 1) {
//                // Датата за вземане е една и е единствено възможна
//                pickingData.takingDate = listAllowedDaysForTaking.get(0);
//            } else {
//                // Възможни са няколко дати за вземане. Потребителят избира една от възможните дати (например първата от тях)
//                pickingData.takingDate = listAllowedDaysForTaking.get(0);
//            }
//
//            System.out.println("\n\nДата на вземане:");
//            System.out.println(SDF.format(pickingData.takingDate));

            // Извличане на списъка от възможните услуги за избрания маршрут и определяне на сечението им с избраните от клиента
            System.out.println("\n\n");
            System.out.println("-------------------------------------------------------------------------------------------------------");
            System.out.println("Извличане на списъка от възможните услуги за избрания маршрут и време на вземане [listServicesForSites]");
            System.out.println("-------------------------------------------------------------------------------------------------------");
            System.out.println("Параметри:");
            System.out.println("    {date}          : " + (pickingData.takingDate == null ? null : SDF.format(pickingData.takingDate)));
            System.out.println("    {senderSiteId}  : " + lSenderSiteId);
            System.out.println("    {receiverSiteId}: " + lReceiverSiteId);
            List<ResultCourierServiceExt> listResultCourierServiceExt = eps.listServicesForSites(pickingData.takingDate, lSenderSiteId, lReceiverSiteId);
            System.out.println("\n\n");
            System.out.println("Резултат:");
            System.out.println("--------");
            if (listResultCourierServiceExt != null) {
                if (listResultCourierServiceExt.size() == 0 ) { 
                    System.out.println("Няма налични услуги.");
                } else if (listResultCourierServiceExt.size() == 1 ) {
                    System.out.println("1 услуга е налична.");
                } else {
                    System.out.println(listResultCourierServiceExt.size() + " услуги са налични.");
                }
                
            } else {
                System.out.println("null");
            }
            
            // Определеляне на сечението между възможните услуги и конфигурираните за клиента услуги (списъка с услуги, с които клиента работи)
            System.out.println("\n\n");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("Филтриране на списъка от възможните услуги според конфигурираните за клиента услуги");
            System.out.println("-----------------------------------------------------------------------------------");
            List<Long> listSelectedServices = Util.serviceIntersection(listResultCourierServiceExt, clientConfiguration.alEnabledServices);
            System.out.println("\n\n");
            System.out.println("Резултат:");
            System.out.println("--------");
            if (listSelectedServices != null) {
                if (listSelectedServices.size() == 0 ) { 
                    System.out.println("Няма възможни за избор услуги.");
                } else if (listSelectedServices.size() == 1 ) {
                    System.out.println("1 услуга е възможна за избор.");
                } else {
                    System.out.println(listSelectedServices.size() + " услуги са възможни за избор.");
                }
                
            } else {
                System.out.println("null");
            }
            
            // Филтриране на списъка от възможни услуги според възможните стойности за тегло

            System.out.println("\n\n");
            System.out.println("---------------------------------------------------------------------------------------------------");
            System.out.println("Филтриране на списъка от възможните услуги според възможните стойности за тегло [getWeightInterval]");
            System.out.println("---------------------------------------------------------------------------------------------------");
            System.out.println("Параметри:");
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
                // Нямаме услуга за тази пратка и тя не може да бъде изпълнена
                throw new RuntimeException("Не е налична услуга за тази пратка.");
            }

            // Параметри за калкулация
            ParamCalculation paramCalculation = new ParamCalculation();
            paramCalculation.setBroughtToOffice(pickingData.bringToOfficeId != null);
            paramCalculation.setToBeCalled(pickingData.takeFromOfficeId != null);
            paramCalculation.setParcelsCount(pickingData.nParcelsCount);
            paramCalculation.setWeightDeclared(pickingData.dblWeightDeclared);
            paramCalculation.setDocuments(pickingData.flagDocuments);
            paramCalculation.setPalletized(pickingData.flagPalletized);
            
            //При изпозване на paramCalculation.setSenderSiteId(lSenderSiteId) вместо paramCalculation.setSenderId(senderClientData.getClientId())
            //не се използват преференциите на подателя по договор
            //paramCalculation.setSenderSiteId(lSenderSiteId);  
            paramCalculation.setSenderId(senderClientData.getClientId());
            
            paramCalculation.setReceiverSiteId(lReceiverSiteId);
            paramCalculation.setPayerType(pickingData.nPayerType);
            paramCalculation.setAmountCodBase(pickingData.amountCODBase);
            paramCalculation.setTakingDate(Util.toXMLGregorianCalendar(pickingData.takingDate));
            paramCalculation.setAutoAdjustTakingDate(pickingData.autoAdjust); // Adjust to first allowed taking date
            
            if (listFinalServices.size() == 1) {

                // Имаме точно една налична услуга
                lServiceTypeId = listFinalServices.get(0);

                // Задаване на услугата в параметрите за калкулация
                paramCalculation.setServiceTypeId(lServiceTypeId);

                // Калкулация. Резултатът съдържа цена и компоненти на ценоообразуването, както и срокове за вземане и доставка.
                System.out.println("\n\n");
                System.out.println("----------------------");
                System.out.println("Калкулация [calculate]");
                System.out.println("----------------------");
                System.out.println("Параметри на калкулацията:");
                ResultCalculation resultCalculation = eps.calculate(paramCalculation);
                System.out.println("\n\nРезултат от калкулация: ");
                System.out.println("--------------------------------------------------------------------");
                System.out.println(Util.toString(resultCalculation));
                System.out.println("--------------------------------------------------------------------");

                // От резултата можем да извлечем първата възможна дата определена от Спиди (само ако сме задали в заявката paramCalculation.setAutoAdjustTakingDate(true) )
                if (pickingData.autoAdjust) {
                    pickingData.takingDate = Util.fromXMLGregorianCalendar(resultCalculation.getTakingDate());
                }

            } else {

                // Имаме няколко възможни услуги. Потребителят трябва да избере една от наличните услуги.
                // Можем да направим калкулация на всички възможни услуги и потребителя да избере като сравнява цени и крайна дата на доставка
                System.out.println("\n\n");
                System.out.println("---------------------------------------------------------------------");
                System.out.println("Едновременна калкулация на няколко услуги [calculateMultipleServices]");
                System.out.println("---------------------------------------------------------------------");
                System.out.println("Параметри на калкулацията:");
                List<ResultCalculationMS> listResultCalculationMS = eps.calculateMultipleServices(paramCalculation, listFinalServices);

               
                if (listResultCalculationMS != null && listResultCalculationMS.size() > 0) {
                    System.out.println("\n\nРезултат от калкулация: ");
                    System.out.println("--------------------------------------------------------------------");
                    System.out.println("List(" + listResultCalculationMS.size() + ")");
                    for (int i = 0; i < listResultCalculationMS.size(); ++i) {
                        System.out.println(i + ":");
                        System.out.println(Util.toString("  ", listResultCalculationMS.get(0)));
                    }
                    System.out.println("--------------------------------------------------------------------");
                    
                    // Потребителят прави избор според резултатите от калкулацията (цена, време на доставка и т.н.)
                    System.out.println("\n");
                    System.out.println("След сравнение на калкулациите е необходимо да се избере куриерската услуга.");
                    System.out.println("За целите на този пример е избрана първата услуга от списъка с възможности.");
                    ResultCalculationMS resultCalculationMS = listResultCalculationMS.get(0);
                    lServiceTypeId = resultCalculationMS.getServiceTypeId();
                    
                 // От резултата можем да извлечем първата възможна дата определена от Спиди (само ако сме задали в заявката paramCalculation.setAutoAdjustTakingDate(true) )
                    if (pickingData.autoAdjust) {
                        pickingData.takingDate = Util.fromXMLGregorianCalendar(resultCalculationMS.getResultInfo().getTakingDate());
                    }
                } else {
                    throw new RuntimeException("Липса на резултат от паралелна калкулация за множество услуги.");
                }
            }

            System.out.println("\n\n");
            System.out.println("Избрана услуга и дата на вземане:");
            System.out.println("--------------------------------");
            System.out.println("    Идентификатор на услуга: " + lServiceTypeId);
            System.out.println("    Дата на вземане        : " + (pickingData.takingDate == null ? null : SDF.format(pickingData.takingDate)));


            // -------------------------------------------------------------------------------------------------------------------

            // -------------------------------------------------------------------------------------------------------------------
            // ОПРЕДЕЛЯНЕ АДРЕС НА ПОЛУЧАТЕЛ
            // -------------------------------------------------------------------------------------------------------------------

            // Примерен адрес на получател: гр.БУРГАС, жк. СЛАВЕЙКОВ, бл.62, вх.2, ет.4, ап.12

            // Задаване на адрес на получател
            ParamAddress receiverAddress = new ParamAddress();
            receiverAddress.setSiteId(lReceiverSiteId);

            // При разбит адрес определяме компонентите на адреса
            // Ако адресът не е разбит на компоненти е позволено подаването на целия адрес в полето addressNote
            // receiverAddress.setAddressNote("к-с СЛАВЕЙКОВ, бл.62, вх.2, ет.4, ап.12, МЕТАЛНАТА РЕШЕТКА СРЕЩУ АСАНСЬОРА");
            // В addressNote се попълва само адреса в рамките на населеното място (т.е. без самото наименование на населеното място)
            // Използването на този метод на работа не се препоръчва, защото при послдващата обработка на пратката може да се получи
            // нееднозначност на адреса, която от своя страна може да доведе до евентуално забавяне на доставката

            // Определяне на квартал
            if (receiverData.address.sQuarter != null) {
                System.out.println("\n\n");
                System.out.println("Извличане на квартали [listQuarters]:");
                System.out.println("-------------------------------------");
                System.out.println("Параметри:");
                System.out.println("    {name}  : " + receiverData.address.sQuarter);
                System.out.println("    {siteId}: " + lReceiverSiteId);
                List<ResultQuarter> listResultQuarter = eps.listQuarters(receiverData.address.sQuarter, lReceiverSiteId);
                if (listResultQuarter == null || listResultQuarter.size() == 0) {
                    throw new RuntimeException("Не е намерен квартал/комплекс");
                } else if (listResultQuarter.size() == 1) {
                    // Комплексът/кварталът е еднозначно определен
                    System.out.println("\n");
                    System.out.println("Намерен e точно един квартал с посочения критерий.");
                    receiverAddress.setQuarterId(listResultQuarter.get(0).getId());
                } else {
                    // Комплексът/кварталът не е еднозначно определен и потребителят е необходимо да избере от възможностите
                    System.out.println("\n");
                    System.out.println("Намерени са няколко квартала с посочения критерий. Необходимо е да се избере една от възможностите.");
                    System.out.println("За целите на този пример е избран първия квартал от резултатния списък.");
                    receiverAddress.setQuarterId(listResultQuarter.get(0).getId());
                }
            }
            // Определяне на улица (в нашия пример нямаме улица)
            if (receiverData.address.sStreet != null) {
                System.out.println("\n\n");
                System.out.println("Извличане на улици [listStreets]:");
                System.out.println("---------------------------------");
                System.out.println("Параметри:");
                System.out.println("    {name}  : " + receiverData.address.sStreet);
                System.out.println("    {siteId}: " + lReceiverSiteId);
                List<ResultStreet> listResultStreet = eps.listStreets(receiverData.address.sStreet, lReceiverSiteId);
                if (listResultStreet == null || listResultStreet.size() == 0) {
                    throw new RuntimeException("Не е намерена улица");
                } else if (listResultStreet.size() == 1) {
                    // Улицата е еднозначно определена
                    System.out.println("\n");
                    System.out.println("Намеренa e точно една улица с посочения критерий.");
                    receiverAddress.setStreetId(listResultStreet.get(0).getId());
                } else {
                    // Улицата не е еднозначно определена и потребителят е необходимо да избере от възможностите
                    System.out.println("\n");
                    System.out.println("Намерени са няколко улици с посочения критерий. Необходимо е да се избере една от възможностите.");
                    System.out.println("За целите на този пример е избрана първата улица от резултатния списък.");
                    receiverAddress.setStreetId(listResultStreet.get(0).getId());
                }
            }
            receiverAddress.setBlockNo(receiverData.address.sBlockNo);
            receiverAddress.setStreetNo(receiverData.address.sStreetNo);
            receiverAddress.setEntranceNo(receiverData.address.sEntranceNo);
            receiverAddress.setFloorNo(receiverData.address.sFloorNo);
            receiverAddress.setApartmentNo(receiverData.address.sApartmentNo);
            // receiverAddress.setAddressNote("к-с СЛАВЕЙКОВ, бл.62, вх.2, ет.4, ап.12, МЕТАЛНАТА РЕШЕТКА СРЕЩУ АСАНСЬОРА");

            System.out.println("\n\nАдрес на получател:");
            System.out.println("--------------------------------------------------------------------");
            System.out.println(Util.toString(receiverAddress));
            System.out.println("--------------------------------------------------------------------");

            // -------------------------------------------------------------------------------------------------------------------

            // -------------------------------------------------------------------------------------------------------------------

            // -------------------------------------------------------------------------------------------------------------------
            // ОПРЕДЕЛЯНЕ НА ДАННИ ЗА ПОДАТЕЛ И ПОЛУЧАТЕЛ И ОТКРИВАНЕ НА ТОВАРИТЕЛНИЦА
            // ПОДАТЕЛ: Клиент на EPS
            // ПОЛУЧАТЕЛ: ИВАНОВИ ООД, с лице за контакт ИВАН ИВАНОВ, тел. 0888 888 888
            // -------------------------------------------------------------------------------------------------------------------

            // Данни за подател
            ParamClientData sender = new ParamClientData();
            sender.setClientId(senderClientData.getClientId());
            sender.setContactName(clientConfiguration.sContactName);
            ParamPhoneNumber senderPhoneNumber = new ParamPhoneNumber();
            senderPhoneNumber.setNumber(clientConfiguration.sContactPhone);
            sender.getPhones().add(senderPhoneNumber);

            System.out.println("\nДанни за подател: ");
            System.out.println("--------------------------------------------------------------------");
            System.out.println(Util.toString(sender));
            System.out.println("--------------------------------------------------------------------");

            // Данни за получател
            ParamClientData receiver = new ParamClientData();
            //Предвиждаме пратката да е до поискване, в този случай не подаваме адрес на получател,
            //защото адреса на получателя е адреса на офиса до пискване
            //receiver.setAddress(receiverAddress);
            receiver.setPartnerName(receiverData.sPartnerName);
            ParamPhoneNumber paramPhoneNumber = new ParamPhoneNumber();
            paramPhoneNumber.setNumber(receiverData.sContactPhone);
            receiver.getPhones().add(paramPhoneNumber);
            receiver.setContactName(receiverData.sContactName);

            System.out.println("\n\nДанните за получател: ");
            System.out.println("--------------------------------------------------------------------");
            System.out.println(Util.toString(receiver));
            System.out.println("--------------------------------------------------------------------");

            // Данни за товарителница
/*            
            System.out.println("\n\n");
            System.out.println("Откриване на товарителница за пратка 1 [createBillOfLading]...");
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
            

            // Откриване на товарителница. Откриването е правилно да се прави след окомплектоване на пратката, а не при поръчка (в онлайн магазина)
            ResultBOL resultBOL = eps.createBillOfLading(picking);

            // Идентификатор на откритата товарителница
            long lPickingId = resultBOL.getGeneratedParcels().get(0).getParcelId();

            System.out.println("\nТоварителницата за пратка 1 е открита с No." + lPickingId);

            // Печат на товарителница
            System.out.println("\n\nПечат на товарителница No." + lPickingId + " за пратка 1 [createPDF]...");
            ParamPDF paramPDF = new ParamPDF();
            paramPDF.getIds().add(Long.valueOf(lPickingId));
            paramPDF.setType(Util.PARAM_PDF_TYPE_BOL);
            paramPDF.setIncludeAutoPrintJS(true);

            // Запис на pdf-а на товарителницата във файл
            String sFileNameOnly = eps.getUserName() + "_picking_" + lPickingId + "_" + System.currentTimeMillis() + ".pdf";
            File pdfFile = new File(S_OUTPUT_FOLDER, sFileNameOnly);
            Util.saveFile(pdfFile, eps.createPDF(paramPDF));

            System.out.println("\nTоварителница No." + lPickingId + " за пратка 1 е съхранена във файл: " + pdfFile.getAbsolutePath());
*/
            // ------------------------------------------------------------------------------------------------------
            // Коментираният в секцията по-долу код може да се ползва за печат на етикет за пратка 1,
            // вместо печат на товарителница
            // ------------------------------------------------------------------------------------------------------
             // Печат на етикет
//            System.out.println("\n\nПечат на етикет за пратка 1 с товарителница No." + lPickingId + " [createPDF]...");
//            ParamPDF paramLblPDF = new ParamPDF();
//            paramLblPDF.getIds().add(Long.valueOf(lPickingId));
//            paramLblPDF.setType(Util.PARAM_PDF_TYPE_LBL);
//            paramLblPDF.setIncludeAutoPrintJS(true);
//
//            // Запис на pdf-а на етикет във файл
//            String sPcikingFileNameOnly = eps.getUserName() + "_lbl_" + lPickingId + "_"+ System.currentTimeMillis() + ".pdf";
//            File pdfFileLbl = new File(S_OUTPUT_FOLDER, sPcikingFileNameOnly);
//            Util.saveFile(pdfFileLbl, eps.createPDF(paramLblPDF));
//
//            System.out.println("\nЕтикет за пратка 1 с товарителница No."+ lPickingId + " е съхранен във файл: " + pdfFileLbl.getAbsolutePath());
            // -------------------------------------------------------------------------------------------------------------------

            // -------------------------------------------------------------------------------------------------------------------
            // ОТКРИВАНЕ НА ВТОРА ТОВАРИТЕЛНИЦА (ПО-КОМПЛЕКСЕН ВАРИАНТ - ТРИПАКЕТНА СЪС ЗАСТРАХОВКА)
            // -------------------------------------------------------------------------------------------------------------------
            //Предвиждаме пратката да е до адрес на получателя, в този случай е адрес на получател е необхдим.
//            receiver.setAddress(receiverAddress);
            
//            // Данни за товарителница
//            System.out.println("\n\n");
//            System.out.println("Откриване на товарителница за пратка 2 [createBillOfLading]...");
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
//            picking2.setParcelsCount(3); // Пратка с 3 пакета
//
//            // Откриване на товарителница. Откриването се прави след окомплектоване на пратката, а не при поръчка (в онлайн магазина)
//            ResultBOL resultBOL2 = eps.createBillOfLading(picking2);
//
//            // Идентификатор на откритата товарителница. Идентификаторът на откритата товарителница е и идентификатор на първия пакет
//            long lPickingId2 = resultBOL2.getGeneratedParcels().get(0).getParcelId();
//
//            long lPickingId2Parcel1Id = lPickingId2; // Същото като resultBOL2.getGeneratedParcels().get(0).getParcelId();
//            long lPickingId2Parcel2Id = resultBOL2.getGeneratedParcels().get(1).getParcelId();
//            long lPickingId2Parcel3Id = resultBOL2.getGeneratedParcels().get(2).getParcelId();
//
//            System.out.println("\nТоварителницата за пратка 2 е открита с No." + lPickingId2);
            // -------------------------------------------------------------------------------------------------------------------

            // ------------------------------------------------------------------------------------------------------
            // Коментираният в секцията по-долу код може да се ползва за печат на окритата товарителница за пратка 2
            // ------------------------------------------------------------------------------------------------------
//            System.out.println("\nПечат на товарителница No." + lPickingId2 + " [createPDF]...");
//            ParamPDF paramPDF2 = new ParamPDF();
//            paramPDF2.getIds().add(Long.valueOf(lPickingId2));
//            paramPDF2.setType(Util.PARAM_PDF_TYPE_BOL);
//            paramPDF2.setIncludeAutoPrintJS(true);
//
//            // Запис на pdf-а на етикет във файл
//            String sPciking2FileNameOnly = eps.getUserName() + "_picking_" + lPickingId2 + "_" + System.currentTimeMillis() + ".pdf";
//            File pdfPicking2File = new File(S_OUTPUT_FOLDER, sPciking2FileNameOnly);
//            Util.saveFile(pdfPicking2File, eps.createPDF(paramPDF2));
//
//            System.out.println("\nTоварителница No."+ lPickingId2 + " за пратка 2 е съхранена във файл: " + pdfPicking2File.getAbsolutePath());
            // -------------------------------------------------------------------------------------------------------

            // ------------------------------------------------------------------------------------------------------
            // Групов печат на етикети за всеки пакет по окритата товарителница за пратка 2.
            // (Етикетите могат да се печат и последователно един по един, по същия начин,
            // с подаване на списък с един идентификатор на сътоветния пакет в аргументите на метода за печат)
            // ------------------------------------------------------------------------------------------------------
//            System.out.println("\n\nГрупов печат на етикети за пратка 2 с товарителница No." + lPickingId2 + " [createPDF]...");
//            ParamPDF paramLblPDF2 = new ParamPDF();
//            paramLblPDF2.getIds().add(Long.valueOf(lPickingId2Parcel1Id));
//            paramLblPDF2.getIds().add(Long.valueOf(lPickingId2Parcel2Id));
//            paramLblPDF2.getIds().add(Long.valueOf(lPickingId2Parcel3Id));
//            paramLblPDF2.setType(Util.PARAM_PDF_TYPE_LBL);
//            paramLblPDF2.setIncludeAutoPrintJS(true);
//
//            // Запис на pdf-а на етикетите във файл
//            String sLblFileNameOnly2 = eps.getUserName() + "_lbl_" + lPickingId2 + "_"+ System.currentTimeMillis() + ".pdf";
//            File pdfFileLbl2 = new File(S_OUTPUT_FOLDER, sLblFileNameOnly2);
//            Util.saveFile(pdfFileLbl2, eps.createPDF(paramLblPDF2));
//
//            System.out.println("\nЕтикетите за пратка 2 с товарителница No." + lPickingId2 + " са съхранени във файл: " + pdfFileLbl2.getAbsolutePath());

            // -----------------------------------------------------------------------------------------------------

            // -------------------------------------------------------------------------------------------------------------------
            // ЗАЯВКА ЗА КУРИЕР
            // Заявката се прави в края на работния ден - за предпочитане веднъж дневно, като включва всички окомплектовани пратки за деня
            // За целта се подава списък от всички пратки, които са за този ден.
            // -------------------------------------------------------------------------------------------------------------------
//            // Данни за заявка за куриер
//            // ReadinessTime не може да бъде време преди текущото време на генериране на заявката
//            System.out.println("\n\n");
//            System.out.println("Заявка за куриер за двете окомплектовани пратки [createOrder]...");
//            System.out.println("----------------------------------------------------------------");
//            ParamOrder order = new ParamOrder();
//            order.getBillOfLadingsList().add(Long.valueOf(lPickingId));
//            order.getBillOfLadingsList().add(Long.valueOf(lPickingId2)); // Списък от товарителници
//            order.setBillOfLadingsToIncludeType(Util.ORDER_BOL_INCLUDE_TYPE_EXPLICIT); // Заявка за куриер за списъка
//            order.setPickupDate(Util.toXMLGregorianCalendar(pickingData.takingDate)); // Дата на вземане на пратката от куриер
//            order.setReadinessTime((short) 1750); // Пакетите са готови за вземане след 17:30
//            order.setContactName(clientConfiguration.sContactName); // Име за контакт
//            paramPhoneNumber = new ParamPhoneNumber();
//            paramPhoneNumber.setNumber(clientConfiguration.sContactPhone);
//            order.setPhoneNumber(paramPhoneNumber); // Тел. номер за контакт
//            order.setWorkingEndTime((short) 1800); // Край на работното време на подателя - 18:00
//
//            // Създаване на заявка
//            List<ResultOrderPickingInfo> listResultOrderPickingInfo = eps.createOrder(order);
//
//            System.out.println("\nЗаявката за куриер е направена.");
//
//            // Проверка за успешна заявка
//            boolean orderIsCreated = true;
//            for (int i = 0; i < listResultOrderPickingInfo.size(); ++i) {
//                ResultOrderPickingInfo resultOrderPickingInfo = listResultOrderPickingInfo.get(i);
//                List<String> listErrorDescriptions = resultOrderPickingInfo.getErrorDescriptions();
//                if (listErrorDescriptions.size() > 0) {
//                    // Неуспешна заявка. Грешките се съдържат в масива. Обработка на грешките
//                    System.out.println("\n  Грешки при заявка за куриер за пратка с товарителница " + resultOrderPickingInfo.getBillOfLading() + ".");
//                    for (int j = 0; j < listErrorDescriptions.size(); ++j) {
//                        System.out.println("\n    Грешкa " + (j + 1) + ": " + listErrorDescriptions.get(j));
//                    }
//                    System.out.println("");
//			          orderIsCreated = false;
//                } else {
//                    // Успешна заявка за куриер
//                    System.out.println("\nТоварителница " + resultOrderPickingInfo.getBillOfLading() + " е успешно заявена.");
//                }
//            }
//            if (orderIsCreated) {
//                System.out.println("\n\nOrder is successfully created.");
//            } else {
//                System.out.println("\n\nOrder is not created.");
//            }            
            // -------------------------------------------------------------------------------------------------------------------

            System.out.println("\n\n=========================================================================================================\nКРАЙ");
            System.out.println("\n=========================================================================================================");

        } catch (Exception ex) {
            // Обработка на грешка
            System.out.println("\n\n=========================================================================================================");
            ex.printStackTrace();
            System.out.println("\n>=========================================================================================================");
            throw ex;
        }
    }

}
