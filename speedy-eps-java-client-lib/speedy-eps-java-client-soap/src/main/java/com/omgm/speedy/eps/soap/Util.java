package com.omgm.speedy.eps.soap;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.omgm.speedy.eps.soap.model.EPSProvider;
import com.omgm.speedy.eps.soap.model.EPSProviderService;
import com.omgm.speedy.eps.soap.model.ParamAddress;
import com.omgm.speedy.eps.soap.model.ParamClientData;
import com.omgm.speedy.eps.soap.model.ParamPhoneNumber;
import com.omgm.speedy.eps.soap.model.ResultAddress;
import com.omgm.speedy.eps.soap.model.ResultAmounts;
import com.omgm.speedy.eps.soap.model.ResultCalculation;
import com.omgm.speedy.eps.soap.model.ResultCalculationMS;
import com.omgm.speedy.eps.soap.model.ResultClientData;
import com.omgm.speedy.eps.soap.model.ResultCourierServiceExt;
import com.omgm.speedy.eps.soap.model.ResultMinMaxReal;
import com.omgm.speedy.eps.soap.model.ResultPhoneNumber;

/**
 * Class for utility methods
 */
public class Util {

	
	/**
	 * Payer type: sender
	*/
	public final static int PAYER_TYPE_SENDER = 0;
	
	/**
	 * Payer type: receiver
	*/
	public final static int  PAYER_TYPE_RECEIVER = 1;
	
	/**
	 * Payer type: third party
	*/
	public final static int  PAYER_TYPE_THIRD_PARTY = 2;
	
	/**
	 * Service type ID to set when this structire is used for multiple service calculations
	*/
	public final static long CALCULATE_MULTUPLE_SERVICES_SERVICE_TYPE_ID = 0;
	
	/**
	 * BOL type
	*/
	public final static int PARAM_PDF_TYPE_BOL = 10;
	
	/**
	 * Labels type
	 */
	public final static int PARAM_PDF_TYPE_LBL = 20;
	
	/**
	 * labels with additional barcode type
	 */
	public final static int PARAM_PDF_TYPE_LBL_WITH_ADDTNL_BARCODE = 25;
	
	/**
	 * Additional barcode format CODE128
	 */
	public final static String PARAM_PDF_ADDIRIONAL_BARCODE_FMT_CODE128 = "CODE128";
	
	/**
	 * Additional barcode format EAN13
	 */
	public final static String PARAM_PDF_ADDIRIONAL_BARCODE_FMT_EAN13 = "EAN13";
	
	/**
	 * Additional barcode format EAN8
	 */
	public final static String PARAM_PDF_ADDIRIONAL_BARCODE_FMT_EAN8 = "EAN8";
	
	/**
	 * Additional barcode format UPC-A
	 */
	public final static String PARAM_PDF_ADDIRIONAL_BARCODE_FMT_UPC_A = "UPC-A";
	
	/**
	 * Additional barcode format UPC-E
	 */
	public final static String PARAM_PDF_ADDIRIONAL_BARCODE_FMT_UPC_E = "UPC-E";
	
	/**
	 * Include in order list all explicitly provided numbers with setBillOfLadingsList method
	 */
	public final static int ORDER_BOL_INCLUDE_TYPE_EXPLICIT = 10;
	
	/**
	 * Include in order list all not-ordered-yet BOLs created by the logged client
	 */
	public final static int ORDER_BOL_INCLUDE_TYPE_OWN_PENDING = 20;
	
	/**
	 * Include in order list all not-ordered-yet BOLs created by the logged client or members of his/her contract. 
	 * (taking into account user's permissions)
	 */
	public final static int ORDER_BOL_INCLUDE_TYPE_CONTARCT_PENDIND = 30;
	
	/**
	 * Speedy time zone
	 */
	public final static TimeZone SPEEDY_TIME_ZONE = TimeZone.getTimeZone("Europe/Sofia");
	
	/**
	 * Get EPS provider to default Speedy EPS server
	 * @return EPS provider
	 */
	public static EPSProvider getEPSProvider() {
		return new EPSProviderService().getEPSProviderPort();
	}
	
	/**
	 * Get EPS provider to provided URL
	 * @param wsdlURL EPS wsdl location URL
	 * @return EPS provider
	 */
	public static EPSProvider getEPSProvider(URL wsdlURL) { 
		return new EPSProviderService(wsdlURL).getEPSProviderPort();
	}
	
	/**
	 * Sace file
	 * @param file File
	 * @param aBytes Bytes to save
	 * @throws IOException 
	 */
	public static void saveFile(File file, byte[] aBytes) 
	throws IOException {
		FileOutputStream fos;
		fos = new FileOutputStream(file);
		try {
			int n = 0;
			while (n < aBytes.length) {
				int len = 1024;
				if (n + 1024 >= aBytes.length) {
					len = aBytes.length - n;
				}
				fos.write(aBytes, n, len);
				n += len;
			}
			fos.flush();
		} finally {
			try {fos.close();} catch (IOException ex) {}
		}
	}
	
	/**
	 * Converts java.util.Date to XMLGregorianCalendar
	 * @param dtDate Date to convert
	 * @return XMLGregorianCalendar initialized with date
	 */
	public static XMLGregorianCalendar toXMLGregorianCalendar(Date dtDate) {
	    if (dtDate == null) {
	        return null;
	    }
		GregorianCalendar gregorianCalendar = new GregorianCalendar(Util.SPEEDY_TIME_ZONE);
		gregorianCalendar.setTime(dtDate);

		XMLGregorianCalendar xmlGregorianCalendar;
		try {
			xmlGregorianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
		} catch (DatatypeConfigurationException ex) {
			throw new RuntimeException(ex);
		}
		return xmlGregorianCalendar;
	}
	
	/**
	 * Converts XMLGregorianCalendar to java.util.Date 
	 * @param xmlGregorianCalendar XMLGregorianCalendar date to convert
	 * @return Date
	 */
	public static Date fromXMLGregorianCalendar(XMLGregorianCalendar xmlGregorianCalendar) {
	    if (xmlGregorianCalendar == null) {
	        return null;
	    }
		return xmlGregorianCalendar.toGregorianCalendar().getTime();
	}
	
	/**
	 * Return intersection of two services list
	 * @param listResultCourierServiceExt List of ResultCourierServiceExt instances for available services 
	 * @param alEnabledServices Array of enabled client services Ids
	 * @return List of service type Ids - intersection
	 */
	public static List<Long> serviceIntersection(List<ResultCourierServiceExt> listResultCourierServiceExt, long[] alEnabledServices) {
		List<Long> list = new ArrayList<Long>();
		if (alEnabledServices != null && listResultCourierServiceExt != null) {
			for(int i = 0; i < alEnabledServices.length; ++i) {
				for(int j = 0; j < listResultCourierServiceExt.size(); ++j) {
					if (alEnabledServices[i] == listResultCourierServiceExt.get(j).getTypeId()) {
						list.add(Long.valueOf(alEnabledServices[i]));
						break;
					}
				}
			}
		}
		return list;
	}
	
	/**
	 * Returns filtered list of services which may process pickings with provided declared weight
	 * @param listSelectedServices Selected list service identifiers - integers 
	 * @param double dblWeightDeclared Declared weight of picking
	 * @param eps EPS client instance
	 * @param lSenderSiteId Sender site ID
	 * @param lReceiverSiteId Receiver site Id
	 * @param dtDate Date
	 * @param flagDocuments Document flag
	 * @return List of filtered service Ids
	 * @throws ServerException Thrown in case communication with server has failed 
	 */
	public static List<Long> filterServicesByWeightIntervals(
			List<Long> listSelectedServices, double dblWeightDeclared, EPSFacade eps, long lSenderSiteId, long lReceiverSiteId, 
			Date dtDate, boolean flagDocuments
	) throws ServerException {
		List<Long> list = new ArrayList<Long>();
		if (listSelectedServices != null) {
			for (int i = 0; i < listSelectedServices.size(); ++i) {
				ResultMinMaxReal weightInterval = eps.getWeightInterval(
						listSelectedServices.get(i), lSenderSiteId, lReceiverSiteId, dtDate, flagDocuments
				);
	    		if (weightInterval.getMinValue() <= dblWeightDeclared && dblWeightDeclared <= weightInterval.getMaxValue()) {
		    		list.add(listSelectedServices.get(i));
		    	}
		    }
		}
		return list;
	}
	
	/**
	 * Dump method to print well-formatted address
	 * @param resultAddress Address
	 * @return Well-formatted string to print
	 */
	public static String toString(ResultAddress resultAddress) {
		return toString("", resultAddress);
	}
	
	/**
	 * Dump method to print well-formatted address
	 * @param sIndent  Indentation in new line
	 * @param resultAddress Address
	 * @return Well-formatted string to print
	 */
	public static String toString(String sIndent, ResultAddress resultAddress) {
		StringBuilder sb = new StringBuilder("[ResultAddress] {");
		sb.append("\n").append(sIndent).append("  municipalityName : ").append(resultAddress.getMunicipalityName());
		sb.append("\n").append(sIndent).append("  regionName       : ").append(resultAddress.getRegionName());
		sb.append("\n").append(sIndent).append("  siteId           : ").append(resultAddress.getSiteId());
		sb.append("\n").append(sIndent).append("  siteType         :  ").append(resultAddress.getSiteType());
		sb.append("\n").append(sIndent).append("  siteName         : ").append(resultAddress.getSiteName());
		sb.append("\n").append(sIndent).append("  quarterId        : ").append(resultAddress.getQuarterId());
		sb.append("\n").append(sIndent).append("  quarterType      : ").append(resultAddress.getQuarterType());
		sb.append("\n").append(sIndent).append("  quarterName      : ").append(resultAddress.getQuarterName());
		sb.append("\n").append(sIndent).append("  blockNo          : ").append(resultAddress.getBlockNo());
		sb.append("\n").append(sIndent).append("  streetId         : ").append(resultAddress.getStreetId());
		sb.append("\n").append(sIndent).append("  streetType       : ").append(resultAddress.getStreetType());
		sb.append("\n").append(sIndent).append("  streetName       : ").append(resultAddress.getStreetName());
		sb.append("\n").append(sIndent).append("  streetNo         : ").append(resultAddress.getStreetNo());
		sb.append("\n").append(sIndent).append("  entranceNo       : ").append(resultAddress.getEntranceNo());
		sb.append("\n").append(sIndent).append("  floorNo          : ").append(resultAddress.getFloorNo());
		sb.append("\n").append(sIndent).append("  apartmentNo      : ").append(resultAddress.getApartmentNo());
		sb.append("\n").append(sIndent).append("  commonObjectId   : ").append(resultAddress.getCommonObjectId());
		sb.append("\n").append(sIndent).append("  commonObjectName : ").append(resultAddress.getCommonObjectName());
		sb.append("\n").append(sIndent).append("  postCode         : ").append(resultAddress.getPostCode());
		sb.append("\n").append(sIndent).append("  addressNote      : ").append(resultAddress.getAddressNote());
		return sb.append("\n").append(sIndent).append("}").toString();
	}
	
	/**
	 * Dump method to print well-formatted phone number
	 * @param resultPhoneNumber Phone number
	 * @return Well-formatted phone number string
	 */
	public static String toString(ResultPhoneNumber resultPhoneNumber) {
		return toString("", resultPhoneNumber);
	}
	
	/**
	 * Dump method to print well-formatted phone number
	 * @param sIndent Indentation in new lines
	 * @param resultPhoneNumber Phone number
	 * @return Well-formatted phone number string
	 */
	public static String toString(String sIndent, ResultPhoneNumber resultPhoneNumber) {
		StringBuilder sb = new StringBuilder(sIndent).append("[ResultPhoneNumber] {");
		sb.append("\n").append(sIndent).append("  internal : ").append(resultPhoneNumber.getInternal());
		sb.append("\n").append(sIndent).append("  number   : ").append(resultPhoneNumber.getNumber());
		return sb.append("\n").append(sIndent).append("}").toString();
	}
	
	/**
	 * Dump method to print well-formatted client data
	 * @param resultClientData Client data
	 * @return Well-formatted client data string
	 */
	public static String toString(ResultClientData resultClientData) {
		return toString("", resultClientData);
	}
	
	/**
	 * Dump method to print well-formatted client data
	 * @param sIndent Indentation in new lines
	 * @param resultClientData Client data
	 * @return Well-formatted client data string
	 */
	private static String toString(String sIndent, ResultClientData resultClientData) {
		StringBuilder sb = new StringBuilder(sIndent).append("[ResultClientData] {");
		sb.append("\n").append(sIndent).append("  clientId    : ").append(resultClientData.getClientId());
		sb.append("\n").append(sIndent).append("  address     : ").append(toString(sIndent.concat("  "), resultClientData.getAddress()));
		sb.append("\n").append(sIndent).append("  contactName : ").append(resultClientData.getContactName());
		sb.append("\n").append(sIndent).append("  objectName  : ").append(resultClientData.getObjectName());
		sb.append("\n").append(sIndent).append("  partnerName : ").append(resultClientData.getPartnerName());
		sb.append("\n").append(sIndent).append("  phones      : List(");
		List<ResultPhoneNumber> phones = resultClientData.getPhones();
		sb.append(phones.size()).append(")");
		String sListIdent = new StringBuilder(sIndent).append("  ").toString();
		String sListItemIdent = sListIdent.concat("      ");
		for (int i = 0; i < phones.size(); ++i) {
			ResultPhoneNumber resultPhoneNumber = phones.get(i);
			sb.append("\n").append(sListIdent).append(i).append(":\n").append(toString(sListItemIdent, resultPhoneNumber));
		}
		return sb.append("\n").append(sIndent).append("}").toString();
	}
	
	/**
	 * Dump method to print result of calculation of multiple services
	 * @param resultCalculationMS Calculation of multiple services result
	 * @return Well-formatted calculation result
	 */
	public static String toString(ResultCalculationMS resultCalculationMS) {
		return toString("", resultCalculationMS);
	}
	
	/**
	 * Dump method to print result of calculation of multiple services
	 * @param sIndent Indentation in new lines
	 * @param resultCalculationMS Calculation of multiple services result
	 * @return Well-formatted calculation result
	 */
	public static String toString(String sIndent, ResultCalculationMS resultCalculationMS) {
		StringBuilder sb = new StringBuilder(sIndent).append("[ResultCalculationMS] {");
		if (resultCalculationMS == null) {
			sb.append("null");
		} else {
			sb.append("\n").append(sIndent).append("  resultInfo       : ").append(toString(sIndent.concat("  "), resultCalculationMS.getResultInfo()));
			sb.append("\n").append(sIndent).append("  errorDescription : ").append(resultCalculationMS.getErrorDescription());
			sb.append("\n").append(sIndent).append("  serviceTypeId    : ").append(resultCalculationMS.getServiceTypeId());
		}
		return sb.append("\n").append(sIndent).append("}").toString();
	}
	
	/**
	 * Dump method to print result of calculation
	 * @param resultCalculation Result of calculation
	 * @return Well-formatted calculation result
	 */
	public static String toString(ResultCalculation resultCalculation) {
		return toString("", resultCalculation);
	}
	
	/**
	 * Dump method to print result of calculation
	 * @param sIndent Indentation in new lines
	 * @param resultCalculation Result of calculation
	 * @return Well-formatted calculation result
	 */
	private static String toString(String sIndent, ResultCalculation resultCalculation) {
		StringBuilder sb = new StringBuilder(sIndent).append("[ResultCalculation] {");
		if (resultCalculation == null) {
			sb.append("null");
		} else {
			sb.append("\n").append(sIndent).append("  amounts          : ").append(toString(sIndent.concat("  "), resultCalculation.getAmounts()));
			sb.append("\n").append(sIndent).append("  deadlineDelivery : ").append(resultCalculation.getDeadlineDelivery());
			sb.append("\n").append(sIndent).append("  takingDate       : ").append(resultCalculation.getTakingDate());
		}
		return sb.append("\n").append(sIndent).append("}").toString();
	}
	
	/**
	 * Dump method to print amounts
	 * @param sIndent Indentation in new lines
	 * @param resultAmounts Amounts
	 * @return Well-formatted amounts 
	 */
	private static String toString(String sIndent, ResultAmounts resultAmounts) {
		StringBuilder sb = new StringBuilder(sIndent).append("[ResultAmounts] {");
		sb.append("\n").append(sIndent).append("  codBase            : ").append(resultAmounts.getCodBase());
		sb.append("\n").append(sIndent).append("  codPremium         : ").append(resultAmounts.getCodPremium());
		sb.append("\n").append(sIndent).append("  discountAdditional : ").append(resultAmounts.getDiscountAdditional());
		sb.append("\n").append(sIndent).append("  discountFixed      : ").append(resultAmounts.getDiscountFixed());
		sb.append("\n").append(sIndent).append("  discountToBeCalled : ").append(resultAmounts.getDiscountToBeCalled());
		sb.append("\n").append(sIndent).append("  discountToOffice   : ").append(resultAmounts.getDiscountToOffice());
		sb.append("\n").append(sIndent).append("  discPcntAdditional : ").append(resultAmounts.getDiscPcntAdditional());
		sb.append("\n").append(sIndent).append("  discPcntFixed      : ").append(resultAmounts.getDiscPcntFixed());
		sb.append("\n").append(sIndent).append("  discPcntToBeCalled : ").append(resultAmounts.getDiscPcntToBeCalled());
		sb.append("\n").append(sIndent).append("  discPcntToOffice   : ").append(resultAmounts.getDiscPcntToOffice());
		sb.append("\n").append(sIndent).append("  fixedTimeDelivery  : ").append(resultAmounts.getFixedTimeDelivery());
		sb.append("\n").append(sIndent).append("  fuelSurcharge      : ").append(resultAmounts.getFuelSurcharge());
		sb.append("\n").append(sIndent).append("  insuranceBase      : ").append(resultAmounts.getInsuranceBase());
		sb.append("\n").append(sIndent).append("  insurancePremium   : ").append(resultAmounts.getInsurancePremium());
		sb.append("\n").append(sIndent).append("  islandSurcharge    : ").append(resultAmounts.getIslandSurcharge());
		sb.append("\n").append(sIndent).append("  net                : ").append(resultAmounts.getNet());
		sb.append("\n").append(sIndent).append("  packings           : ").append(resultAmounts.getPackings());
		sb.append("\n").append(sIndent).append("  pcntFuelSurcharge  : ").append(resultAmounts.getPcntFuelSurcharge());
		sb.append("\n").append(sIndent).append("  total              : ").append(resultAmounts.getTotal());
		sb.append("\n").append(sIndent).append("  tro                : ").append(resultAmounts.getTro());
		sb.append("\n").append(sIndent).append("  vat                : ").append(resultAmounts.getVat());
		return sb.append("\n").append(sIndent).append("}").toString();
	}
	
	/**
	 * Dump method to print address
	 * @param paramAddress Address
	 * @return Well-formatted address in string
	 */
	public static String toString(ParamAddress paramAddress) {
		return toString("", paramAddress);
	}
	
	/**
	 * Dump method to print address
	 * @param sIndent Indentation in new lines
	 * @param paramAddress Address
	 * @return Well-formatted address in string
	 */
	private static String toString(String sIndent, ParamAddress paramAddress) {
		StringBuilder sb = new StringBuilder(sIndent).append("[ParamAddress] {");
		sb.append("\n").append(sIndent).append("  addressNote    : ").append(paramAddress.getAddressNote());
		sb.append("\n").append(sIndent).append("  apartmentNo    : ").append(paramAddress.getApartmentNo());
		sb.append("\n").append(sIndent).append("  blockNo        : ").append(paramAddress.getBlockNo());
		sb.append("\n").append(sIndent).append("  entranceNo     : ").append(paramAddress.getEntranceNo());
		sb.append("\n").append(sIndent).append("  floorNo        : ").append(paramAddress.getFloorNo());
		sb.append("\n").append(sIndent).append("  quarterName    : ").append(paramAddress.getQuarterName());
		sb.append("\n").append(sIndent).append("  quarterType    : ").append(paramAddress.getQuarterType());
		sb.append("\n").append(sIndent).append("  siteId         : ").append(paramAddress.getSiteId());
		sb.append("\n").append(sIndent).append("  streetName     : ").append(paramAddress.getStreetName());
		sb.append("\n").append(sIndent).append("  streetNo       : ").append(paramAddress.getStreetNo());
		sb.append("\n").append(sIndent).append("  streetType     : ").append(paramAddress.getStreetType());
		sb.append("\n").append(sIndent).append("  commonObjectId : ").append(paramAddress.getCommonObjectId());
		sb.append("\n").append(sIndent).append("  coordX         : ").append(paramAddress.getCoordX());
		sb.append("\n").append(sIndent).append("  coordY         : ").append(paramAddress.getCoordY());
		sb.append("\n").append(sIndent).append("  quarterId      : ").append(paramAddress.getQuarterId());
		sb.append("\n").append(sIndent).append("  streetId       : ").append(paramAddress.getStreetId());
		return sb.append("\n").append(sIndent).append("}").toString();
	}
	
	/**
	 * Dump method to print client data
	 * @param paramClientData Client data
	 * @return Well-formatted client data
	 */
	public static String toString(ParamClientData paramClientData) {
		return toString("", paramClientData);
	}
	
	/**
	 * Dump method to print client data
	 * @param sIndent Indentation in new lines
	 * @param paramClientData Client data
	 * @return Well-formatted client data
	 */
	private static String toString(String sIndent, ParamClientData paramClientData) {
		StringBuilder sb = new StringBuilder(sIndent).append("[ParamClientData] {");
		sb.append("\n").append(sIndent).append("  contactName : ").append(paramClientData.getContactName());
		sb.append("\n").append(sIndent).append("  objectName  : ").append(paramClientData.getObjectName());
		sb.append("\n").append(sIndent).append("  partnerName : ").append(paramClientData.getPartnerName());
		sb.append("\n").append(sIndent).append("  clientId    : ").append(paramClientData.getClientId());
		sb.append("\n").append(sIndent).append("  address     : ").append(
				paramClientData.getAddress() != null ? toString(sIndent.concat("  "), paramClientData.getAddress()) : null
		);
		List<ParamPhoneNumber> phones = paramClientData.getPhones();
		sb.append(phones.size()).append(")");
		String sListIdent = new StringBuilder(sIndent).append("  ").toString();
		String sListItemIdent = sListIdent.concat("      ");
		for (int i = 0; i < phones.size(); ++i) {
			ParamPhoneNumber paramPhoneNumber = phones.get(i);
			sb.append("\n").append(sListIdent).append(i).append(":\n").append(toString(sListItemIdent, paramPhoneNumber));
		}
		return sb.append("\n").append(sIndent).append("}").toString();
	}

	/**
	 * Dump method to print phone number
	 * @param sIndent Indentation in new lines
	 * @param paramPhoneNumber Phone number
	 * @return Well-formatted phone number
	 */
	public static String toString(String sIndent, ParamPhoneNumber paramPhoneNumber) {
		StringBuilder sb = new StringBuilder(sIndent).append("[ResultPhoneNumber] {");
		sb.append("\n").append(sIndent).append("  internal : ").append(paramPhoneNumber.getInternal());
		sb.append("\n").append(sIndent).append("  number   : ").append(paramPhoneNumber.getNumber());
		return sb.append("\n").append(sIndent).append("}").toString();
	}
	
	/**
	 * Get current time according to speedy time zone
	 * @return Current speedy time 
	 */
	public static Date getCurrentSpeedyDateTime() {
	    Calendar cal = Calendar.getInstance(SPEEDY_TIME_ZONE);
	    return cal.getTime();
	}
	
	/**
     * Get current time according to speedy time zone
     * @return Current speedy date without time component 
     */
    public static Date getCurrentSpeedyDate() {
        Calendar cal = Calendar.getInstance(SPEEDY_TIME_ZONE);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }
}
