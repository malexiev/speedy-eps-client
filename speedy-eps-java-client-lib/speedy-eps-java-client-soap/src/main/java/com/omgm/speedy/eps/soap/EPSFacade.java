package com.omgm.speedy.eps.soap;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import com.omgm.speedy.eps.soap.model.AddrNomen;
import com.omgm.speedy.eps.soap.model.EPSProvider;
import com.omgm.speedy.eps.soap.model.ParamAddressSearch;
import com.omgm.speedy.eps.soap.model.ParamCalculation;
import com.omgm.speedy.eps.soap.model.ParamClientSearch;
import com.omgm.speedy.eps.soap.model.ParamFilterSite;
import com.omgm.speedy.eps.soap.model.ParamLanguage;
import com.omgm.speedy.eps.soap.model.ParamOrder;
import com.omgm.speedy.eps.soap.model.ParamPDF;
import com.omgm.speedy.eps.soap.model.ParamParcel;
import com.omgm.speedy.eps.soap.model.ParamPicking;
import com.omgm.speedy.eps.soap.model.ParamSearchByRefNum;
import com.omgm.speedy.eps.soap.model.ResultAddressSearch;
import com.omgm.speedy.eps.soap.model.ResultBOL;
import com.omgm.speedy.eps.soap.model.ResultCalculation;
import com.omgm.speedy.eps.soap.model.ResultCalculationMS;
import com.omgm.speedy.eps.soap.model.ResultClientData;
import com.omgm.speedy.eps.soap.model.ResultCommonObject;
import com.omgm.speedy.eps.soap.model.ResultCourierService;
import com.omgm.speedy.eps.soap.model.ResultCourierServiceExt;
import com.omgm.speedy.eps.soap.model.ResultLogin;
import com.omgm.speedy.eps.soap.model.ResultMinMaxReal;
import com.omgm.speedy.eps.soap.model.ResultOffice;
import com.omgm.speedy.eps.soap.model.ResultOrderPickingInfo;
import com.omgm.speedy.eps.soap.model.ResultParcelInfo;
import com.omgm.speedy.eps.soap.model.ResultQuarter;
import com.omgm.speedy.eps.soap.model.ResultSite;
import com.omgm.speedy.eps.soap.model.ResultSiteEx;
import com.omgm.speedy.eps.soap.model.ResultStreet;
import com.omgm.speedy.eps.soap.model.ResultTrackPicking;
import com.omgm.speedy.eps.soap.model.ResultTrackPickingEx;

/**
 * Speedy EPS Service
 * @since 2.0
 */
public class EPSFacade {
	
	/**
	 * EPS provider
	 */
	private EPSProvider m_eps;
	
	/**
	 * User name
	 */
	private String m_sUserName;
	
	/**
	 * User password
	 */
	private String m_sUserPassword;
	
	/**
	 * Result of login Speedy web service method call
	 */
	private ResultLogin m_resultLogin;
	
	/**
	 * Constructs new instance of EPS Facade
	 * @param eps EPS provider
	 * @param sUserName User name
	 * @param sUserPassword User password
	 */
	public EPSFacade(EPSProvider eps, String sUserName, String sUserPassword) {
		setEPSInterfaceImpl(eps);
		m_sUserName     = sUserName;
		m_sUserPassword = sUserPassword;
	}
	
	/**
	 * Set EPS provider
	 * @param eps EPS provider
	 */
	public void setEPSInterfaceImpl(EPSProvider eps) {
		if (eps == null) {
			throw new IllegalArgumentException("EPS provider is null.");
		}
		m_eps = eps;
	}
	
	/**
	 * Get EPS provider interface implementation
	 * @return EPS provider
	 */
	public EPSProvider getEPSInterfaceImpl() {
		return m_eps;
	}
	
	/**
	 * Set user name
	 * @param sUserName User name
	 */
	public void setUserName(String sUserName) {
		m_sUserName = sUserName;
	}
	
	/**
	 * Get user name
	 * @return User name
	 */
	public String getUserName() {
		return m_sUserName;
	}
	
	/**
	 * Set user password
	 * @param sUserPassword User password
	 */
	public void setPassword(String sUserPassword) {
		m_sUserPassword = sUserPassword;
	}
	
	/**
	 * Get user password
	 * @return User password
	 */
	public String getPassword() {
		return m_sUserPassword;
	}
	
	/**
	 * Return result login. Tries to open new session in case it is not active
	 * @throws ServerException Thrown in case communication with server has failed
	 * @return ResultLogin
	 */
	public ResultLogin getResultLogin() 
	throws ServerException {
		return getResultLogin(true);
	}
	
	/**
	 * Return result login.
	 * Optionally tries to open new session in case it is not active
	 * @param flagOpenNewIfActive Whether to try to open new connection
	 * @throws ServerException Thrown in case communication with server has failed
	 * @return ResultLogin
	 */
	public ResultLogin getResultLogin(boolean flagOpenNewIfActive) 
	throws ServerException {
		if (flagOpenNewIfActive && !isSessionActive(true)) {
			m_resultLogin = login();
		}
		return m_resultLogin;
	}
	
	/**
	 * Login web service method
	 * @throws ServerException Thrown in case communication with server has failed
	 * @return Result of login 
	 */
	public ResultLogin login() 
	throws ServerException {
		try {
			m_resultLogin = m_eps.login(m_sUserName, m_sUserPassword);
		} catch (Exception ex) {
			throw new ServerException(ex);
		}
		return m_resultLogin;
	}
	
	/**
	 * Returns flag whether the session is active
	 * @param flagRefreshSession In case the session is active, this parameter specifies if the session should be automatically refreshed
	 * @throws ServerException Thrown in case communication with server has failed 
	 * @return Session active flag
	 */
	public boolean isSessionActive(boolean flagRefreshSession) 
	throws ServerException {
		if (m_resultLogin != null) {
			return m_eps.isSessionActive(m_resultLogin.getSessionId(), flagRefreshSession);
		} else {
			return false;
		}
	}
	
	/**
	 * Returns the list of courier services valid on this date
	 * @param dtDate Date
	 * @throws ServerException Thrown in case communication with server has failed
	 * @return List of ResultCourierService instances
	 */
	public List<ResultCourierService> listServices(Date dtDate) 
	throws ServerException {
		try {
			return m_eps.listServices(getResultLogin(true).getSessionId(), Util.toXMLGregorianCalendar(dtDate));
		} catch (Exception ex) {
			throw new ServerException(ex);
		}
	}
	
	/**
	 * Returns a list of sites matching the search criteria.
	 * The result is limited to 10 records
	 * @param sType Type of site
	 * @param sName Site name or part of it
	 * @throws ServerException Thrown in case communication with server has failed
	 * @return List of ResultSite instances
	 */
	public List<ResultSite> listSites(String sType, String sName) 
	throws ServerException {
		try {
			return m_eps.listSites(getResultLogin(true).getSessionId(), sType, sName);
		} catch (Exception ex) {
			throw new ServerException(ex);
		}
	}
	
	/**
	 * Returns a list of sites. The method aims to find the closest matches.
	 * The result is limited to 10 records
	 * @param ParamFilterSite Parameters to filter site request
	 * @throws ServerException Thrown in case communication with server has failed
	 * @return List of ResultSite instances
	 */
	public List<ResultSiteEx> listSitesEx(ParamFilterSite paramFilterSite) 
	throws ServerException {
		try {
			return m_eps.listSitesEx(getResultLogin(true).getSessionId(), paramFilterSite);
		} catch (Exception ex) {
			throw new ServerException(ex);
		}
	}
	
	/**
	 * Returns the list of courier services valid on this date and sites.
	 * @param dtDate Date 
	 * @param lSenderSiteId Signed 64-bit integer sender's site ID;
	 * @param lReceiverSiteId Signed 64-bit integer receiver's site ID;
	 * @throws ServerException Thrown in case communication with server has failed
	 * @return List of ResultCourierServiceExt instances
	 */
	public List<ResultCourierServiceExt> listServicesForSites(Date dtDate, long lSenderSiteId, long lReceiverSiteId) 
	throws ServerException {
		try {
			return m_eps.listServicesForSites(getResultLogin(true).getSessionId(), Util.toXMLGregorianCalendar(dtDate), lSenderSiteId, lReceiverSiteId);
		} catch (Exception ex) {
			throw new ServerException(ex);
		}
	}
	
	/**
	 * Returns the min/max weight allowed for the given shipment parameters
	 * @param lServiceTypeId Signed 64-bit ID of the courier service
	 * @param lSenderSiteId Signed 64-bit Sender's site ID
	 * @param lReceiverSiteId Signed 64-bit Receiver's site ID
	 * @param dtDate Date
	 * @param flagDocuments Specifies if the shipment consists of documents
	 * @throws ServerException Thrown in case communication with server has failed
	 * @return ResultMinMaxReal
	 */
	public ResultMinMaxReal getWeightInterval(long lServiceTypeId, long lSenderSiteId, long lReceiverSiteId, Date dtDate, boolean flagDocuments) 
	throws ServerException {
		try {
			return m_eps.getWeightInterval(
					getResultLogin(true).getSessionId(), lServiceTypeId, lSenderSiteId, lReceiverSiteId, Util.toXMLGregorianCalendar(dtDate), flagDocuments
			);
		} catch (Exception ex) {
			throw new ServerException(ex);
		}
	}
	
	/**
	 * Returns CSV-formatted data (depending on the nomenType value).
	 * Column numbers can change in the future so it's recommended to address the data using the column names in the header row.
	 * The data for some nomenTypes requires a payed license (additional licensing contract) and permissions (access rights).
	 * To obtain such license please contact our IT department or your Speedy key account manager.
	 * Type 100 - returns a list of all sites.
	 * Type 300 - returns a list of all streets (requires a license).
	 * Type 400 - returns a list of all quarters (requires a license).
	 * Type 500 - returns a list of all common objects (requires a license).
	 * Type 700 - returns a list of all block names (requires a license).
	 * @param nNomenType Signed 32-bit The type of address nomenclature
	 * @throws ServerException Thrown in case communication with server has failed
	 * @return CSV formatted string
	 */
	public String getAddressNomenclature(int nNomenType) 
	throws ServerException {
		try {
			return m_eps.getAddressNomenclature(getResultLogin(true).getSessionId(), nNomenType);
		} catch (Exception ex) {
			throw new ServerException(ex);
		}
	}
	
	/**
	 * Returns a list of all sites.
	 * Note: This method is relatively slow (because of the size of its response). You shouldn't call it more than several times a day.
	 * The methods is designed to provide data which should be locally stored/cached by client apps.
	 * The address-related nomenclature data is updated only several times a year.
	 * @throws ServerException Thrown in case communication with server has failed
	 * @return List of ResultSite instances
	 */
	public List<ResultSite> listAllSites() 
	throws ServerException {
		try {
			return m_eps.listAllSites(getResultLogin(true).getSessionId());
		} catch (Exception ex) {
			throw new ServerException(ex);
		}
	}
	
	/**
	 * Returns a site by ID
	 * @param lSiteId Signed 64-bit Site ID
	 * @throws ServerException Thrown in case communication with server has failed
	 * @return ResultSite
	 */
	public ResultSite getSiteById(long lSiteId) 
	throws ServerException {
		try {
			return m_eps.getSiteById(getResultLogin(true).getSessionId(), lSiteId);
		} catch (Exception ex) {
			throw new ServerException(ex);
		}
	}
	
	/**
	 * Returns sites having either full or partial address nomenclature (streets, quarters etc.).
	 * @param addrNomen Only values FULL and PARTIAL are allowed
	 * @throws ServerException Thrown in case communication with server has failed
	 * @return List of ResultSite
	 */
	public List<ResultSite> getSitesByAddrNomenType(AddrNomen addrNomen) 
	throws ServerException {
		try {
			return m_eps.getSitesByAddrNomenType(getResultLogin(true).getSessionId(), addrNomen);
		} catch (Exception ex) {
			throw new ServerException(ex);
		}
	}
	
	/**
	 * Returns a list of the most common types of streets.
	 * @throws ServerException Thrown in case communication with server has failed
	 * @return List of the most common types of streets
	 */
	public List<String> listStreetTypes() 
	throws ServerException {
		try {
			return m_eps.listStreetTypes(getResultLogin(true).getSessionId());
		} catch (Exception ex) {
			throw new ServerException(ex);
		}
	}
	
	/**
	 * Returns a list of the most common types of quarters (districts).
	 * @throws ServerException Thrown in case communication with server has failed
	 * @return List of the most common types of quarters (districts).
	*/
	public List<String> listQuarterTypes() 
	throws ServerException {
		try {
			return m_eps.listQuarterTypes(getResultLogin(true).getSessionId());
		} catch (Exception ex) {
			throw new ServerException(ex);
		}
	}
	
	/**
	 * Returns a list of streets matching the search criteria
	 * The list is limited to 10 records.
	 * @param sName Street name (or part of it)
	 * @param lSiteId Signed 64-bit Site ID
	 * @throws ServerException Thrown in case communication with server has failed
	 * @return ResultStreet List of streets
	 */
	public List<ResultStreet> listStreets(String sName, long lSiteId)
	throws ServerException {
		try {
			return m_eps.listStreets(getResultLogin(true).getSessionId(), sName, lSiteId);
		} catch (Exception ex) {
			throw new ServerException(ex);
		}
	}
	
	/**
	 * Returns a list of quarters matching the search criteria
	 * The list is limited to 10 records.
	 * @param sName Quarter name (or part of it)
	 * @param lSiteId Signed 64-bit Site ID
	 * @throws ServerException Thrown in case communication with server has failed
	 * @return List of ResultQuarter
	 */
	public List<ResultQuarter> listQuarters(String sName, long lSiteId) 
	throws ServerException {
		try {
			return m_eps.listQuarters(getResultLogin(true).getSessionId(), sName, lSiteId);
		} catch (Exception ex) {
			throw new ServerException(ex);
		}
	}
	
	/**
	 * Returns a list of common objects matching the search criteria.
	 * The list is limited to 10 records.
	 * @param sName Common object name (or part of it)
	 * @param lSiteId Signed 64-bit Site ID
	 * @throws ServerException Thrown in case communication with server has failed
	 * @return List of ResultCommonObject
	 */
	public List<ResultCommonObject> listCommonObjects(String sName, long lSiteId) 
	throws ServerException {
		try {
			return m_eps.listCommonObjects(getResultLogin(true).getSessionId(), sName, lSiteId);
		} catch (Exception ex) {
			throw new ServerException(ex);
		}
	}
	
	/**
	 * Returns a list of blocks matching the search criteria.
	 * The list is limited to 10 records.
	 * @param sName Block name (or part of it)
	 * @param lSiteId Signed 64-bit Site ID
	 * @throws ServerException Thrown in case communication with server has failed
	 * @return List of blocks
	*/
	public List<String> listBlocks(String sName, long lSiteId) 
	throws ServerException {
		try {
			return m_eps.listBlocks(getResultLogin(true).getSessionId(), sName, lSiteId);
		} catch (Exception ex) {
			throw new ServerException(ex);
		}
	}
	
	/**
	 * Returns a list of Speedy offices matching the search criteria
	 * The list is limited to 10 records.
	 * @param sName Office name (or part of it);
	 * @param lSiteId Signed 64-bit Site ID
	 * @throws ServerException Thrown in case communication with server has failed
	 * @return List of ResultOffice
	 */
	public List<ResultOffice> listOffices(String sName, long lSiteId) 
	throws ServerException {
		try {
			return m_eps.listOffices(getResultLogin(true).getSessionId(), sName, lSiteId);
		} catch (Exception ex) {
			throw new ServerException(ex);
		}
	}
	
	/**
	 * Returns data for client by ID.
	 * Allowed values for clientId are only the ones of members of the user's contract and the predefined partners
	 * in the WebClients application.
	 * @param lClientId Signed 64-bit integer – Client/Partner ID
	 * @throws ServerException Thrown in case communication with server has failed
	 * @return ResultClientData
	 */
	public ResultClientData getClientById(long lClientId) 
	throws ServerException {
		try {
			return m_eps.getClientById(getResultLogin(true).getSessionId(), lClientId);
		} catch (Exception ex) {
			throw new ServerException(ex);
		}
	}
	
	/**
	 * Returns the dates when the shipment can be ordered for pick-up.
	 * The "time" component represents the deadline for creating an order 
	 * (or the deadline for delivering the shipment to a Speedy office when senderOfficeId is set).
	 * (This method could be used for the "takingDate" property of ParamPicking or ParamCalculation.) 
	 * Note: Either senderSiteId or senderOfficeId should be set, or neither of them. Both parameters having "not null" values is not allowed.
	 * @param nServiceTypeId Service type ID
	 * @param lSenderSiteId Signed 64-bit – Sender's site ID
	 * @param senderOfficeId Signed 64-bit – If the sender intends to deliver the shipment to a Speedy office, the office ID could be set as a filter
	 * @param dtMinDate When the "time" component is set then this date is to be included in the result list only if the time is not after the working time of Speedy;
	 * @throws ServerException Thrown in case communication with server has failed
	 * @return List of dates
	 */
	public List<Date> getAllowedDaysForTaking(long lServiceTypeId, Long senderSiteId, Long senderOfficeId, Date dtMinDate) 
	throws ServerException {
		List<XMLGregorianCalendar> listXMLGregorianCalendars;
		List<Date> listDates;
		try {
			listXMLGregorianCalendars = m_eps.getAllowedDaysForTaking(
					getResultLogin(true).getSessionId(), lServiceTypeId, senderSiteId, senderOfficeId, Util.toXMLGregorianCalendar(dtMinDate)
			);
		} catch (Exception ex) {
			throw new ServerException(ex);
		}
		listDates = new ArrayList<Date>(listXMLGregorianCalendars.size());
		for(XMLGregorianCalendar xmlGregorianCalendar : listXMLGregorianCalendars) {
			listDates.add(Util.fromXMLGregorianCalendar(xmlGregorianCalendar));
		}
		return listDates;
	}
	
	/**
	 * Returns a list of addresses matching the search criteria.
	 * @param paramAddressSearch Search criteria (filter)
	 * @throws ServerException Thrown in case communication with server has failed
	 * @return List of ResultAddressSearch
	 */
	public List<ResultAddressSearch> addressSearch(ParamAddressSearch paramAddressSearch) 
	throws ServerException {
		try {
			return m_eps.addressSearch(	getResultLogin(true).getSessionId(), paramAddressSearch);
		} catch (Exception ex) {
			throw new ServerException(ex);
		}
	}
	
	/**
	 * Calculate method
	 * @param paramCalculation Calculation parameters
	 * @throws ServerException Thrown in case communication with server has failed
	 * @return ResultCalculation
	 */
	public ResultCalculation calculate(ParamCalculation paramCalculation) 
	throws ServerException {
		try {
			return m_eps.calculate(getResultLogin(true).getSessionId(), paramCalculation);
		} catch (Exception ex) {
			throw new ServerException(ex);
		}
	}
	
	/**
	 * This method could be used for preliminary check-up of shipment's price for a range of courier services.
	 * @param paramCalculation Data needed to perform the calculation
	 * @param lsitServiceTypeIds List<signed 64-bit integer> – A list of courier service IDs for which price needs to be calculated
	 * @throws ServerException Thrown in case communication with server has failed
	 * @return List of ResultCalculationMS
	 */
	public List<ResultCalculationMS> calculateMultipleServices(ParamCalculation paramCalculation, List<Long> lsitServiceTypeIds) 
	throws ServerException {
		try {
			return m_eps.calculateMultipleServices(getResultLogin(true).getSessionId(), paramCalculation, lsitServiceTypeIds);
		} catch (Exception ex) {
			throw new ServerException(ex);
		}
	}
	
	/**
	 * This is an alternative method for shipment price calculation where the parameter is of type ParamPicking.
	 * Clients are encouraged to use the method that best fits their needs.
	 * @param paramPicking Picking parameters
	 * @throws ServerException Thrown in case communication with server has failed
	 * @return ResultCalculation
	 */
	public ResultCalculation calculatePicking(ParamPicking paramPicking) 
	throws ServerException {
		try {
			return m_eps.calculatePicking(getResultLogin(true).getSessionId(), paramPicking);
		} catch (Exception ex) {
			throw new ServerException(ex);
		}
	}
	
	/**
	 * The method used to create BOL.
	 * @param paramPicking Picking parameters
	 * @throws ServerException Thrown in case communication with server has failed
	 * @return ResultBOL
	 */
	public ResultBOL createBillOfLading(ParamPicking paramPicking) 
	throws ServerException {
		try {
			return m_eps.createBillOfLading(getResultLogin(true).getSessionId(), paramPicking);
		} catch (Exception ex) {
			throw new ServerException(ex);
		}
	}
	
	/**
	 * Used for creating PDF documents to be printed (BOLs, labels etc.)
	 * Examples:
	 * •Bill of Lading;
	 * •Bill of Lading with "cash on delivery";
	 * •Custom travel label (type 20);
	 * •Custom travel label (type 20) with "cash on delivery".
	 * @param paramPDF PDF parameters
	 * @throws ServerException Thrown in case communication with server has failed
	 * @return array of bytes
	 */
	public byte[] createPDF(ParamPDF paramPDF) 
	throws ServerException {
		try {
			return m_eps.createPDF(getResultLogin(true).getSessionId(), paramPDF);
		} catch (Exception ex) {
			throw new ServerException(ex);
		}
	}
	
	/**
	 * Creates PDF document for BOL.
	 * The method is deprecated, "createPDF" should be used instead.
	 * @deprecated The method is deprecated, "createPDF" should be used instead.
	 * @param lBillOfLading Signed 64-bit
	 * @param flagIncludeAutoPrintJS Specifies if embedded JavaScript code for direct printing to be generated
	 * @throws ServerException Thrown in case communication with server has failed
	 * @return array of bytes
	 */
	public byte[] createBillOfLadingPDF(long lBillOfLading, boolean flagIncludeAutoPrintJS) 
	throws ServerException {
		try {
			return m_eps.createBillOfLadingPDF(getResultLogin(true).getSessionId(), lBillOfLading, flagIncludeAutoPrintJS);
		} catch (Exception ex) {
			throw new ServerException(ex);
		}
	}
	
	/**
	 * Creates PDF document of "type I". The method is deprecated, "createPDF" should be used instead.
	 * @deprecated The method is deprecated, "createPDF" should be used instead.
	 * @param lParcelId Signed 64-bit Parcel ID
	 * @throws ServerException Thrown in case communication with server has failed
	 * @return array of bytes
	*/
	public byte[] createCustomTravelLabelPDFType1(long lParcelId) 
	throws ServerException {
		try {
			return m_eps.createCustomTravelLabelPDFType1(getResultLogin(true).getSessionId(), lParcelId);
		} catch (Exception ex) {
			throw new ServerException(ex);
		}
	}
	
	/**
	 * Used to cancel BOL.
	 * Only allowed when the shipment is neither ordered nor picked up by Speedy.
	 * @param lBillOfLading Signed 64-bit
	 * @throws ServerException Thrown in case communication with server has failed
	 */
	public void invalidatePicking(long lBillOfLading) 
	throws ServerException {
		try {
			m_eps.invalidatePicking(getResultLogin(true).getSessionId(), lBillOfLading);
		} catch (Exception ex) {
			throw new ServerException(ex);
		}
	}
	
	/**
	 * This method is used to update BOL.
	 * Only allowed if BOL was created with pendingShipmentDescription = true.
	 * @param paramPicking Data for the shipment (BOL)
	 * @throws ServerException Thrown in case communication with server has failed
	 * @return ResultBOL
	 */
	public ResultBOL updateBillOfLading(ParamPicking paramPicking) 
	throws ServerException {
		try {
			return m_eps.updateBillOfLading(getResultLogin(true).getSessionId(), paramPicking);
		} catch (Exception ex) {
			throw new ServerException(ex);
		}
	}
	
	/**
	 * This method is used to add parcel to an existing BOL
	 * (only allowed if BOL was created with pendingParcelsDescription = true).
	 * @param paramParcel Parcel data
	 * @throws ServerException Thrown in case communication with server has failed
	 * @return Signed 64-bit parcel's ID
	 */
	public long addParcel(ParamParcel paramParcel) 
	throws ServerException {
		try {
			return m_eps.addParcel(getResultLogin(true).getSessionId(), paramParcel);
		} catch (Exception ex) {
			throw new ServerException(ex);
		}
	}
	
	/**
	 * Makes BOL "fully created".
	 * Only applies to BOLs created with pendingParcelsDescription = true.
	 * @param lBillOfLading Signed 64-bit
	 * @throws ServerException Thrown in case communication with server has failed
	 * @return ResultBOL
	 */
	public ResultBOL finalizeBillOfLadingCreation(long lBillOfLading) 
	throws ServerException {
		try {
			return m_eps.finalizeBillOfLadingCreation(getResultLogin(true).getSessionId(), lBillOfLading);
		} catch (Exception ex) {
			throw new ServerException(ex);
		}
	}
	
	/**
	 * Creates an order for shipments pick-up (i.e. a visit by courier of Speedy).
	 * The returned list contains objects corresponding to each BOL (one object per BOL).
	 * When the validation errors list of at least one of the objects is not empty, that means the order has not been created.
	 * @param paramOrder Order details
	 * @throws ServerException Thrown in case communication with server has failed
	 * @return List of ResultOrderPickingInfo
	 */
	public List<ResultOrderPickingInfo> createOrder(ParamOrder paramOrder) 
	throws ServerException {
		try {
			return m_eps.createOrder(getResultLogin(true).getSessionId(), paramOrder);
		} catch (Exception ex) {
			throw new ServerException(ex);
		}
	}
	
	/**
	 * Returns a list with all parcels of a shipment.
	 * @param lBillOfLading Lading Signed 64-bit
	 * @throws ServerException Thrown in case communication with server has failed
	 * @return List of ResultParcelInfo
	 */
	public List<ResultParcelInfo> getPickingParcels(long lBillOfLading) 
	throws ServerException {
		try {
			return m_eps.getPickingParcels(getResultLogin(true).getSessionId(), lBillOfLading);
		} catch (Exception ex) {
			throw new ServerException(ex);
		}
	}
	
	/**
	 * This method can be used to track the state/history of a shipment.
	 * @deprecated Use trackPickingEx instead
	 * @param lBillOfLading Signed 64-bit
	 * @throws ServerException Thrown in case communication with server has failed
	 * @return List of ResultTrackPicking
	 */
	public List<ResultTrackPicking> trackPicking(long lBillOfLading) 
	throws ServerException {
		try {
			return m_eps.trackPicking(getResultLogin(true).getSessionId(), lBillOfLading);
		} catch (Exception ex) {
			throw new ServerException(ex);
		}
	}
	
	/**
	 * This method can be used to track the state/history of a shipment.
	 * @since 1.2
	 * @param lBillOfLading Signed 64-bit
	 * @param paramLanguage Language
	 * @throws ServerException Thrown in case communication with server has failed
	 * @return List of ResultTrackPickingEx
	 */
	public List<ResultTrackPickingEx> trackPickingEx(long lBillOfLading, ParamLanguage paramLanguage) 
	throws ServerException {
		try {
			return m_eps.trackPickingEx(getResultLogin(true).getSessionId(), lBillOfLading, paramLanguage);
		} catch (Exception ex) {
			throw new ServerException(ex);
		}
	}
	
	/**
     * This method can be used to track the state/history of a shipment parcel.
     * @since 1.4
     * @param lParcelId Signed 64-bit
     * @param paramLanguage Language
     * @throws ServerException Thrown in case communication with server has failed
     * @return List of ResultTrackPickingEx
     */
    public List<ResultTrackPickingEx> trackParcel(long lParcelId, ParamLanguage paramLanguage) 
    throws ServerException {
        try {
			return m_eps.trackParcel(getResultLogin(true).getSessionId(), lParcelId, paramLanguage);
		} catch (Exception ex) {
			throw new ServerException(ex);
		}
    }
	
	/**
	 * Search BOLs by reference codes (ref1 and/or ref2).
	 * @param paramSearchByRefNum Search filter
	 * @throws ServerException Thrown in case communication with server has failed
	 * @return List of BOLs found (signed 64-bit integers)
	 */
	public List<Long> searchPickingsByRefNumber(ParamSearchByRefNum paramSearchByRefNum) 
	throws ServerException {
		try {
			return m_eps.searchPickingsByRefNumber(getResultLogin(true).getSessionId(), paramSearchByRefNum);
		} catch (Exception ex) {
			throw new ServerException(ex);
		}
	}
	
	/**
	  * Get micro-region id for provided GPS coordinates
	  * @since 1.5
	  * @param coordX Signed 64-bit real
	  * @param coordY Signed 64-bit real
	  * @throws ServerException Thrown in case communication with server has failed
	  * @return Micro-region id (signed 64-bit integer)
	  */
    public long getMicroregionId(double coordX, double coordY) 
    throws ServerException {
        try {
			return m_eps.getMicroregionId(getResultLogin(true).getSessionId(), coordX, coordY);
		} catch (Exception ex) {
			throw new ServerException(ex);
		}
    }
    
    /**
     * Returns data for clients by specified client ID or other search criteria.
     * If client ID is specified the behaviour of this method is the same as getClientById.
     * Otherwise, the search returns results that satisfy search criteria
     * @since 1.6
     * @param clientQuery Search criteria
     * @throws ServerException Thrown in case communication with server has failed
     * @return array List of ResultClientData
     */
    public List<ResultClientData> searchClients(ParamClientSearch clientQuery) 
    throws ServerException {
        try {
			return m_eps.searchClients(getResultLogin(true).getSessionId(), clientQuery);
		} catch (Exception ex) {
			throw new ServerException(ex);
		}
    }
}
