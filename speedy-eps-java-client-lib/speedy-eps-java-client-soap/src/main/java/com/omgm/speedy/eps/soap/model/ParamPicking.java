
package com.omgm.speedy.eps.soap.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;



/**
 * <p>Java class for paramPicking complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paramPicking">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amountCodBase" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="amountInsuranceBase" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="backDocumentsRequest" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="backReceiptRequest" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="billOfLading" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="clientSystemId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="contents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deferredDeliveryWorkDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="discCalc" type="{http://ver01.eps.speedy.sirma.com/}fixedDiscountCardId" minOccurs="0"/>
 *         &lt;element name="documents" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="fixedTimeDelivery" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="fragile" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="noteClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="officeToBeCalledId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="optionsBeforePayment" type="{http://ver01.eps.speedy.sirma.com/}paramOptionsBeforePayment" minOccurs="0"/>         
 *         &lt;element name="packId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="packing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="packings" type="{http://ver01.eps.speedy.sirma.com/}paramPackings" maxOccurs="unbounded" minOccurs="0"/>         
 *         &lt;element name="palletized" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="parcels" type="{http://ver01.eps.speedy.sirma.com/}paramParcelInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="parcelsCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="payCodToThirdParty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="payerRefId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="payerRefInsuranceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="payerRefPackingsId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>         
 *         &lt;element name="payerType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="payerTypeInsurance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="payerTypePackings" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>         
 *         &lt;element name="pendingParcelsDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pendingShipmentDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="receiver" type="{http://ver01.eps.speedy.sirma.com/}paramClientData" minOccurs="0"/>
 *         &lt;element name="ref1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ref2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="retMoneyTransferReqAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="retServicesRequest" type="{http://ver01.eps.speedy.sirma.com/}paramReturnServiceRequest"  minOccurs="0"/>
 *         &lt;element name="retShipmentRequest" type="{http://ver01.eps.speedy.sirma.com/}paramReturnShipmentRequest" minOccurs="0"/>
 *         &lt;element name="retThirdPartyPayer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>         
 *         &lt;element name="retToClientId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sender" type="{http://ver01.eps.speedy.sirma.com/}paramClientData" minOccurs="0"/>
 *         &lt;element name="serviceTypeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="size" type="{http://ver01.eps.speedy.sirma.com/}size" minOccurs="0"/>
 *         &lt;element name="skipAutomaticParcelsCreation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="specialDeliveryId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="takingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="weightDeclared" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="willBringToOffice" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="willBringToOfficeId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * <p>Instances of this class are passed as a parameter of Speedy web service calls for calculation and registration
 * 
 * @since 1.0.0
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramPicking", propOrder = {
    "amountCodBase",
    "amountInsuranceBase",
    "backDocumentsRequest",
    "backReceiptRequest",
    "billOfLading",
    "clientSystemId",
    "contents",
    "deferredDeliveryWorkDays",
    "discCalc",
    "documents",
    "fixedTimeDelivery",
    "fragile",
    "noteClient",
    "officeToBeCalledId",
    "optionsBeforePayment",
    "packId",
    "packing",
    "packings",
    "palletized",
    "parcels",
    "parcelsCount",
    "payCodToThirdParty",
    "payerRefId",
    "payerRefInsuranceId",
    "payerRefPackingsId",
    "payerType",
    "payerTypeInsurance",
    "payerTypePackings",
    "pendingParcelsDescription",
    "pendingShipmentDescription",
    "receiver",
    "ref1",
    "ref2",
    "retMoneyTransferReqAmount",
    "retServicesRequest",
    "retShipmentRequest",
    "retThirdPartyPayer",
    "retToClientId",
    "sender",
    "serviceTypeId",
    "size",
    "skipAutomaticParcelsCreation",
    "specialDeliveryId",
    "takingDate",
    "weightDeclared",
    "willBringToOffice",
    "willBringToOfficeId"
})
public class ParamPicking {

	/**
     * Cash-on-Delivery (COD) amount.
     * The value is limited depending on user's permissions and Speedy's current policy
     * MANDATORY: NO
     */
    protected Double amountCodBase;
    
    /**
     * Shipment insurance value (if the shipment is insured).
     * The value is limited depending on user's permissions and Speedy's current policy
     * MANDATORY: NO
     */
    protected Double amountInsuranceBase;
    
    /**
     * Specifies if the shipment has a "request for return documents"
     * MANDATORY: YES
     */
    protected boolean backDocumentsRequest;
    
    /**
     * Specifies if the shipment has a "request for return receipt"
     * MANDATORY: YES
     */
    protected boolean backReceiptRequest;
    
    /**
     * BOL number
     * MANDATORY: Only for updateBillOfLading. Null otherwise
     */
    protected Long billOfLading;
    
    /**
     * An optional value used to identify user's client software.
     * Please verify the allowed values with Speedy's IT Department.
     * MANDATORY: NO
     */
    protected Long clientSystemId;
    
    /**
     * Contents. Max text size - 50 symbols
     * MANDATORY: YES
     */
    protected String contents;
    
    /**
     * In some rare cases users might prefer the delivery to be deferred by a day or two.
     * This parameter allows users to specify by how many (working) days they would like to postpone the shipment delivery.
     * Max 2 days
     * MANDATORY: No
     */
    protected Integer deferredDeliveryWorkDays;
    
    /**
     * Card/Coupon/Voucher number for fixed discount
     * MANDATORY: NO
     */
    protected FixedDiscountCardId discCalc;
    
    /**
     * Specifies whether the shipment consists of documents
     * MANDATORY: YES
     */
    protected boolean documents;
    
    /**
     * Fixed time for delivery ("HHmm" format, i.e., the number "1315" means "13:15", "830" means "8:30" etc.)
     * MANDATORY: Depending on the courier service, this property could be required, allowed or banned
     */
    protected Short fixedTimeDelivery;
    
    /**
     * Specifies whether the shipment is fragile - necessary when the price of insurance is being calculated
     * MANDATORY: YES
     */
    protected boolean fragile;
    
    /**
     * Client's note
     * MANDATORY: NO
     */
    protected String noteClient;
    
    /**
     * ID of an office "to be called"
     * MANDATORY: Only for "to be called" pickings
     */
    protected Long officeToBeCalledId;
    
    /**
     * Options before payment
     * MANDATORY: NO
     * @since 2.3.0
     */
    protected ParamOptionsBeforePayment optionsBeforePayment;
    
    /**
     * Packing ID (number)
     * MANDATORY: NO
     */
    protected Long packId;
    
    /**
     * Packing
     * MANDATORY: YES
     */
    protected String packing;
    
    /**
     * Data for packings. For internal use only
     * MANDATORY: NO
     * @since 2.3.0
     */
    @XmlElement(nillable = true)
    protected List<ParamPackings> packings;
    
    /**
     * Specifies whether the shipment is palletized
     * MANDATORY: YES
     */
    protected boolean palletized;
    
    /**
     * Data for parcels with explicit/fixed IDs (from the second one onward)
     * The list has maximum length 998
     * MANDATORY: NO
     */
    @XmlElement(nillable = true)
    protected List<ParamParcelInfo> parcels;
    
    /**
     * Parcels count. Maximum value is 999.
     * MANDATORY: YES
     */
    protected int parcelsCount;
    
    /**
     * Specifies if the COD value is to be paid to a third party. Allowed only if the shipment has payerType = 2 (third party).
     * MANDATORY: NO
     */
    protected Boolean payCodToThirdParty;
    
    /**
     * Payer ID.
     * MANDATORY: Must be set <=> payer is "third party".
     */
    protected Long payerRefId;
    
    /**
     * Insurance payer ID
     * MANDATORY: Must be set <=> shipment has insurance (i.e. amountInsuranceBase > 0) and it is payed by a "third party".
     */
    protected Long payerRefInsuranceId;
    
    /**
     * Packings payer ID
     * MANDATORY: Must be set <=> payerTypePackings is "third party".
     * @since 2.3.0
     */
    protected Long payerRefPackingsId;

    /**
     * Payer type (0=sender, 1=receiver or 2=third party)
     * MANDATORY: YES
     */
    protected int payerType;
    
    /**
     * Insurance payer type (0=sender, 1=reciever or 2=third party)
     * MANDATORY: Must be set <=> shipment is insured (i.e. amountInsuranceBase > 0).
     */
    protected Integer payerTypeInsurance;
    
    /**
     * Packings payer type (0=sender, 1=reciever or 2=third party)
     * MANDATORY: No.If not set, the payer of the packings' surcharge will be the same as the one indicated by payerType.
     * @since 2.3.0
     */
    protected Integer payerTypePackings;
    
    /**
     * Specifies if the service/system should allow parcels to be added to the shipment at a later stage.
     * MANDATORY: NO
     */
    protected Boolean pendingParcelsDescription;
    
    /**
     * Specifies if the service/system should allow BOL's modification at a later stage.
     * MANDATORY: NO
     */
    protected Boolean pendingShipmentDescription;
    
    /**
     * Data for the receiver
     * MANDATORY: YES
     */
    protected ParamClientData receiver;
    
    /**
     * An optional reference code.
     * Maximum 30 symbols
     * MANDATORY: NO
     */
    protected String ref1;
    
    /**
     * An optional reference code.
     * Maximum 30 symbols
     * MANDATORY: NO
     */
    protected String ref2;

    /**
     * Return money-transfer request amount
     * The value is limited depending on user's permissions and Speedy's current policy
     * MANDATORY: NO
     */
    protected Double retMoneyTransferReqAmount;
    
    /**
     * Return services request
     * MANDATORY: NO
     * @since 2.5.0
     */
    @XmlElement(nillable = true)
    protected List<ParamReturnServiceRequest> retServicesRequest;
    
    /**
     * Return shipment request
     * MANDATORY: NO
     * @since 2.5.0
     */
    protected ParamReturnShipmentRequest retShipmentRequest;
    
    /**
     * Return third party payer flag
     * MANDATORY: NO
     * @since 2.3.0
     */
    protected Boolean retThirdPartyPayer;
    
    /**
     * ID of the client who is to receive the return receipt and/or the return documents.
     * If payer is "third party" then this client has to be payer's contract member.
     * Otherwise the client has to be sender's contract member.
     * MANDATORY: NO
     */
    protected Long retToClientId;
    
    /**
     * Data for the sender
     * MANDATORY: YES
     */
    protected ParamClientData sender;
    
    /**
     * Courier service type ID
     * MANDATORY: YES
     */
    protected long serviceTypeId;
    
    /**
     * Size of shipment
     * MANDATORY: NO
     */
    protected Size size;
    
    /**
     * When parcelsCount > 1 and no explicit data has been set in the parcels property during the creation,
     * then parcels will be created automatically by default.
     * This parameter allows users to control this behaviour.
     * MANDATORY: NO
     */
    protected Boolean skipAutomaticParcelsCreation;
    
    /**
     * The date for shipment pick-up (the "time" component is ignored). Default value is "today".
     * MANDATORY: NO
     */
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar takingDate;
    
    /**
     * Declared weight (the greater of "volume" and "real" weight values).
     * Maximum value is 100.00
     * MANDATORY: YES
     */
    protected double weightDeclared;

    /**
     * Specifies if the sender intends to deliver the shipment to a Speedy office by him/herself instead of ordering a visit by courier
     * MANDATORY: YES
     */
    protected boolean willBringToOffice;
    
    /**
     * Specifies the specific Speedy office, where the sender intends to deliver the shipment by him/herself. 
     * If willBringToOfficeId is provided, willBringToOffice flag is considered "true", regardless the value provided. 
     * If willBringToOfficeId is not provied (0 or null) and willBringToOffice flag is "true", 
     * willBringToOfficeId is automatically set with default value configured for caller user profile. 
     * The default willBringToOfficeId value could be managed using profile configuration page in client's Speedy web site. 
     * MANDATORY: NO
     * @since 1.3.0
     */
    protected Long willBringToOfficeId;

    /**
     * Special delivery id
     * MANDATORY: NO
     * @since 2.3.0
     */
    protected Integer specialDeliveryId;
    
    /**
     * Gets the Cash-on-Delivery (COD) amount
     * @return Cash-on-Delivery (COD) amount
     */
    public Double getAmountCodBase() {
        return amountCodBase;
    }

    /**
     * Sets the Cash-on-Delivery (COD) amount.
     * The value is limited depending on user's permissions and Speedy's current policy
     * @param amountCodBase Cash-on-Delivery (COD) amount
     */
    public void setAmountCodBase(Double amountCodBase) {
        this.amountCodBase = amountCodBase;
    }

    /**
     * Gets shipment insurance value
     * @return Shipment insurance value
     */
    public Double getAmountInsuranceBase() {
        return amountInsuranceBase;
    }

    /**
     * Sets the shipment insurance value (if the shipment is insured).
     * The value is limited depending on user's permissions and Speedy's current policy
     * @param amountInsuranceBase Shipment insurance value
     */
    public void setAmountInsuranceBase(Double amountInsuranceBase) {
        this.amountInsuranceBase = amountInsuranceBase;
    }

    /**
     * Gets the flag whether the shipment has a "request for return documents"
     * @return The flag whether shipment has a "request for return documents"
     */
    public boolean isBackDocumentsRequest() {
        return backDocumentsRequest;
    }

    /**
     * Sets the flag whether the shipment has a "request for return documents"
     * @param backDocumentsRequest The flag whether shipment has a "request for return documents"
     */
    public void setBackDocumentsRequest(boolean backDocumentsRequest) {
        this.backDocumentsRequest = backDocumentsRequest;
    }

    /**
     * Gets the flag whether the shipment has a "request for return receipt"
     * @return The flag whether the shipment has a "request for return receipt"
     */
    public boolean isBackReceiptRequest() {
        return backReceiptRequest;
    }

    /**
     * Sets the flag whether the shipment has a "request for return receipt"
     * @param backReceiptRequest The flag whether the shipment has a "request for return receipt"
     */
    public void setBackReceiptRequest(boolean backReceiptRequest) {
        this.backReceiptRequest = backReceiptRequest;
    }

    /**
     * Gets BOL number
     * @return BOL number
     */
    public Long getBillOfLading() {
        return billOfLading;
    }

    /**
     * Sets BOL number
     * @param billOfLading BOL number
     */
    public void setBillOfLading(Long billOfLading) {
        this.billOfLading = billOfLading;
    }

    /**
     * Gets client system id - An optional value used to identify user's client software.
     * @return Client system id
     */
    public Long getClientSystemId() {
        return clientSystemId;
    }

    /**
     * Sets client system id.
     * An optional value used to identify user's client software.
     * Please verify the allowed values with Speedy's IT Department.
     * @param clientSystemId Client system id
     */
    public void setClientSystemId(Long clientSystemId) {
        this.clientSystemId = clientSystemId;
    }

    /**
     * Gets the contents
     * @return Contents
     */
    public String getContents() {
        return contents;
    }

    /**
     * Sets the contents.
     * Max text size - 50 symbols
     * @param contents Contents
     */
    public void setContents(String contents) {
        this.contents = contents;
    }

    /**
     * Gets the deferred delivery work days.
     * @return Deferred delivery work days
     */
    public Integer getDeferredDeliveryWorkDays() {
        return deferredDeliveryWorkDays;
    }

    /**
     * Sets the deferred delivery work days.
     * In some rare cases users might prefer the delivery to be deferred by a day or two.
     * This parameter allows users to specify by how many (working) days they would like to postpone the shipment delivery.
     * Max 2 days
     * @param deferredDeliveryWorkDays Deferred delivery work days
     */
    public void setDeferredDeliveryWorkDays(Integer deferredDeliveryWorkDays) {
        this.deferredDeliveryWorkDays = deferredDeliveryWorkDays;
    }

    /**
     * Gets card/coupon/voucher number for fixed discount
     * @return Card/Coupon/Voucher number for fixed discount
     */
    public FixedDiscountCardId getDiscCalc() {
        return discCalc;
    }

    /**
     * Sets the card/coupon/voucher number for fixed discount
     * @param discCalc Card/Coupon/Voucher number for fixed discount
     */
    public void setDiscCalc(FixedDiscountCardId discCalc) {
        this.discCalc = discCalc;
    }

    /**
     * Gets documents flag value - whether the shipment consists of documents
     * @return documents flag
     */
    public boolean isDocuments() {
        return documents;
    }

    /**
     * Sets the documents flag value.
     * Specifies whether the shipment consists of documents
     * @param documents documents flag value
     */
    public void setDocuments(boolean documents) {
        this.documents = documents;
    }

    /**
     * Gets the fixed time for delivery ("HHmm" format, i.e., the number "1315" means "13:15", "830" means "8:30" etc.)
     * @return Fixed time for delivery
     */
    public Short getFixedTimeDelivery() {
        return fixedTimeDelivery;
    }

    /**
     * Sets the fixed time for delivery ("HHmm" format, i.e., the number "1315" means "13:15", "830" means "8:30" etc.)
     * Depending on the courier service, this property could be required, allowed or banned.
     * @param fixedTimeDelivery Fixed time for delivery
     */
    public void setFixedTimeDelivery(Short fixedTimeDelivery) {
        this.fixedTimeDelivery = fixedTimeDelivery;
    }

    /**
     * Gets fragile flag value - whether the shipment is fragile
     * @return Fragile flag value
     */
    public boolean isFragile() {
        return fragile;
    }

    /**
     * Sets fragile flag value.
     * Specifies whether the shipment is fragile - necessary when the price of insurance is being calculated.
     * @param fragile Fragile flag value
     */
    public void setFragile(boolean fragile) {
        this.fragile = fragile;
    }

    /**
     * Gets client's note.
     * @return Client's note
     */
    public String getNoteClient() {
        return noteClient;
    }

    /**
     * Sets the client's note
     * @param noteClient Client's note
     */
    public void setNoteClient(String noteClient) {
        this.noteClient = noteClient;
    }

    /**
     * Gets the id of an office, where receiver is about to take the shipment from
     * @return Office-to-be-called id (office, where receiver is about to take the shipment)
     */
    public Long getOfficeToBeCalledId() {
        return officeToBeCalledId;
    }

    /**
     * Sets the id of an office, where receiver is about to take the shipment from
     * (Office-to-be-called id)
     * @param officeToBeCalledId Office-to-be-called id (office, where receiver is about to take the shipment)
     */
    public void setOfficeToBeCalledId(Long officeToBeCalledId) {
        this.officeToBeCalledId = officeToBeCalledId;
    }
    
    /**
     * Gets the value of the optionsBeforePayment property.
     * @return Options before payment
     * @since 2.3.0
     */
    public ParamOptionsBeforePayment getOptionsBeforePayment() {
        return optionsBeforePayment;
    }

    /**
     * Sets the value of the optionsBeforePayment property.
     * @param paramOptionsBeforePayment Options before payment
     *  @since 2.3.0
     */
    public void setOptionsBeforePayment(ParamOptionsBeforePayment paramOptionsBeforePayment) {
        this.optionsBeforePayment = paramOptionsBeforePayment;
    }



    /**
     * Gets packing ID (number)
     * @return Packing ID (number)
     */
    public Long getPackId() {
        return packId;
    }

    /**
     * Sets the packing ID (number)
     * @param packId Packing ID (number)
     */
    public void setPackId(Long packId) {
        this.packId = packId;
    }

    /**
     * Gets the packing
     * @return Packing
     */
    public String getPacking() {
        return packing;
    }

    /**
     * Sets the packing
     * @param packing Packing
     */
    public void setPacking(String packing) {
        this.packing = packing;
    }

    /**
     * Gets the list of packings.
     * For internal use only.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParamPackings }
     * 
     * @since 2.3.0
     */
    public List<ParamPackings> getPackings() {
        if (packings == null) {
            packings = new ArrayList<ParamPackings>();
        }
        return this.packings;
    }

    /**
     * Gets the palletized flag value
     * @return palletized flag value
     */
    public boolean isPalletized() {
        return palletized;
    }

    /**
     * Sets the palletized flag value.
     * Specifies whether the shipment is palletized
     * @param palletized The palletized flag value
     */
    public void setPalletized(boolean palletized) {
        this.palletized = palletized;
    }

    /**
     * Gets the list of parcels.
     * Data for parcels with explicit/fixed IDs (from the second one onward)
     * The list has maximum lenght 998.
     * Total parcels are 999 including bill of lading as parcel with sequence number 1
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parcels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParcels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParamParcelInfo }
     * 
     * 
     */
    public List<ParamParcelInfo> getParcels() {
        if (parcels == null) {
            parcels = new ArrayList<ParamParcelInfo>();
        }
        return this.parcels;
    }

    /**
     * Gets parcels count
     * @return Parcels count
     */
    public int getParcelsCount() {
        return parcelsCount;
    }

    /**
     * Sets the parcels count.
     * Maximum value is 999.
     * @param Parcels count
     */
    public void setParcelsCount(int value) {
        this.parcelsCount = value;
    }

    /**
     * Gets the flag value whether the COD is to be paid to a third party
     * @return The flag value whether the COD is to be paid to a third party
     */
    public Boolean isPayCodToThirdParty() {
        return payCodToThirdParty;
    }

    /**
     * Sets the flag value whether the COD is to be paid to a third party.
     * Allowed only if the shipment has payerType = 2 (third party).
     * @param payCodToThirdParty The flag value whether the COD is to be paid to a third party
     */
    public void setPayCodToThirdParty(Boolean payCodToThirdParty) {
        this.payCodToThirdParty = payCodToThirdParty;
    }

    /**
     * Gets payer id
     * @return Payer id
     */
    public Long getPayerRefId() {
        return payerRefId;
    }

    /**
     * Sets the payer id.
     * Must be set when payer is "third party". 
     * @param payerRefId Payer id
     */
    public void setPayerRefId(Long payerRefId) {
        this.payerRefId = payerRefId;
    }

    /**
     * Gets insurance payer id
     * @return Insurance payer id
     */
    public Long getPayerRefInsuranceId() {
        return payerRefInsuranceId;
    }

    /**
     * Sets the insurance payer id.
     * Must be set when shipment has insurance (i.e. amountInsuranceBase > 0) and it is payed by a "third party".
     * @param payerRefInsuranceId Insurance payer id
     */
    public void setPayerRefInsuranceId(Long payerRefInsuranceId) {
        this.payerRefInsuranceId = payerRefInsuranceId;
    }
    
    /**
     * Gets the packings payer id
     * @return Packings payer id
     * @since 2.3.0
     */
    public Long getPayerRefPackingsId() {
        return payerRefPackingsId;
    }

    /**
     * Sets the packings payer id
     * @param payerRefPackingsId Packings payer id
     * @since 2.3.0
     */
    public void setPayerRefPackingsId(Long payerRefPackingsId) {
        this.payerRefPackingsId = payerRefPackingsId;
    }

    /**
     * Gets payer type.
     * @return Payer type
     */
    public int getPayerType() {
        return payerType;
    }

    /**
     * Sets the payer type (0=sender, 1=receiver or 2=third party)
     * @param payerType Payer type
     */
    public void setPayerType(int payerType) {
        this.payerType = payerType;
    }

    /**
     * Gets insurance payer type (0=sender, 1=reciever or 2=third party)
     * @return Insurance payer type
     */
    public Integer getPayerTypeInsurance() {
        return payerTypeInsurance;
    }

    /**
     * Sets the insurance payer type (0=sender, 1=reciever or 2=third party)
     * Must be set when shipment is insured (i.e. amountInsuranceBase > 0).
     * @param payerTypeInsurance Insurance payer type
     */
    public void setPayerTypeInsurance(Integer payerTypeInsurance) {
        this.payerTypeInsurance = payerTypeInsurance;
    }
    
    /**
     * Gets the packings payer type (0=sender, 1=reciever or 2=third party).
     * Null means the same as courier service payer type
     * @return Packings payer type
     * @since 2.3.0
     */
    public Integer getPayerTypePackings() {
        return payerTypePackings;
    }

    /**
     * Sets the packings payer type (0=sender, 1=reciever or 2=third party).
     * Null means the same as courier service payer type
     * @param payerTypePackings Packings payer type
     * @since 2.3.0
     */
    public void setPayerTypePackings(Integer payerTypePackings) {
        this.payerTypePackings = payerTypePackings;
    }

    /**
     * Gets pending parcels description flag value.
     * @return Pending parcels description flag value
     */
    public Boolean isPendingParcelsDescription() {
        return pendingParcelsDescription;
    }

    /**
     * Sets the pending parcels description flag value.
     * Specifies if the service/system should allow parcels to be added to the shipment at a later stage.
     * <p>
     * When BOL is created with this parameter set to true then users are allowed to add more parcels to the BOL 
     * (via the addParcel method) until the BOL creation is finalized 
     * (using the finalizeBillOfLadingCreation method).
     * If BOL is partially open, the result of createBillOfLading will have zeroes in all amount fields. 
     * This is because at that stage the price is not final yet. 
     * The real (final) price will be returned when finalizeBillOfLadingCreation is called 
     * (except for the special case when the BOL has also been created with pendingShipmentDescription = true 
     * and it is still not updated via the updateBillOfLading method).
     * When PDF for partial BOL is being created, some fields are left blank since the corresponding values 
     * might be still unknown or not final (parcels count, weight, price).
     * Partial Bills of Lading cannot be ordered until their creating is finalized. 
     * @param pendingParcelsDescription Pending parcels description flag value.
     */
    public void setPendingParcelsDescription(Boolean pendingParcelsDescription) {
        this.pendingParcelsDescription = pendingParcelsDescription;
    }

    /**
     * Gets the pending shipment description flag value
     * @return The pending shipment description flag value
     */
    public Boolean isPendingShipmentDescription() {
        return pendingShipmentDescription;
    }

    /**
     * Sets the pending shipment description flag value.
     * Specifies if the service/system should allow BOL's modification at a later stage.
     * <p>
     * In some special cases the client might be unable to provide a complete description of their shipments 
     * at the time of BOL creation. By setting this flag to true users can create a BOL which is only 
     * partially described. Only the most important data (regarding logistics) is required: 
     * sender's data, receiver's site, courier service etc. 
     * This information makes it possible for Speedy to deliver the shipment to its destination-office. 
     * After the user provides the rest of the data about the shipment 
     * (via the updateBillOfLading method), the shipment will become ready for delivery.
     * <p>
     * The fields which are not considered as 'required' at the creation stage still follow the standard 
     * validation rules. By 'not required' we mean that their value can be modified later. 
     * For example if the user wants to fill in the field 'contents' at a later stage, 
     * he/she can set the initial value to 'STILL UNKNOWN', 'WILL BE SET LATER' or something like that.
     * Only the following fields are required when creating a BOL:
     * <ul> 
     *   <li>takingDate</li>
     *   <li>serviceTypeId</li>
     *   <li>parcelsCount</li>
     *   <li>weightDeclared</li>
     *   <li>documents</li>
     *   <li>deferredDeliveryWorkDays</li>
     *   <li>sender</li>
     *   <li>receiver(only siteId); if officeToBeCalledId is set, then siteId must be null/0</li>
     * </ul>
     * After the creation of the BOL these fields are considered immutable.
     * The value of officeToBeCalledId cannot be changed during the update, except for the case when the old value was null/0 and the new value is of an office which is located in the same receiver site.
     * The payerType must be 0 (sender) or 2 (third party).
     * The result of createBillOfLading has zeroes in all amount fields. 
     * @param pendingShipmentDescription The pending shipment description flag value
     */
    public void setPendingShipmentDescription(Boolean pendingShipmentDescription) {
        this.pendingShipmentDescription = pendingShipmentDescription;
    }

    /**
     * Gets receiver details
     * @return Receiver details
     */
    public ParamClientData getReceiver() {
        return receiver;
    }

    /**
     * Sets receiver details
     * @param receiver Receiver details
     */
    public void setReceiver(ParamClientData receiver) {
        this.receiver = receiver;
    }

    /**
     * Gets the ref1 value - an optional reference code.
     * @return ref1 value
     */
    public String getRef1() {
        return ref1;
    }

    /**
     * Sets the ref1 value - an optional reference code.
     * Maximum 30 symbols.
     * @param ref1 ref1 value
     */
    public void setRef1(String ref1) {
        this.ref1 = ref1;
    }

    /**
     * Gets the ref2 value - an optional reference code.
     * @return ref2 value     
     */
    public String getRef2() {
        return ref2;
    }

    /**
     * Sets the ref2 value - an optional reference code.
     * Maximum 30 symbols.
     * @param ref2 ref2 value    
     */
    public void setRef2(String ref2) {
        this.ref2 = ref2;
    }

    /**
     * Gets the value of money transfer request amount to return
     * @return Money transfer request amount to return
     */
    public Double getRetMoneyTransferReqAmount() {
        return retMoneyTransferReqAmount;
    }

    /**
     * Sets the money-transfer request amount to return
     * The value is limited depending on user's permissions and Speedy's current policy
     * @param retMoneyTransferReqAmount Money transfer request amount to return
     */
    public void setRetMoneyTransferReqAmount(Double retMoneyTransferReqAmount) {
        this.retMoneyTransferReqAmount = retMoneyTransferReqAmount;
    }
    
    /**
     * Gets the value of the retServicesRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retServicesRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetServicesRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParamReturnServiceRequest }
     * 
     * @since 2.5.0
     */
    public List<ParamReturnServiceRequest> getRetServicesRequest() {
        if (retServicesRequest == null) {
            retServicesRequest = new ArrayList<ParamReturnServiceRequest>();
        }
        return this.retServicesRequest;
    }
    
    /**
     * Get return shipment request
     * @return Return shipment request
     * @since 2.5.0
     */
    public ParamReturnShipmentRequest getRetShipmentRequest() {
    	return retShipmentRequest;
    }
    
    /**
     * Set return shipment request
     * @param retShipmentRequest Return shipment request
     * @since 2.5.0
     */
    public void setRetShipmentRequest(ParamReturnShipmentRequest retShipmentRequest) {
    	this.retShipmentRequest = retShipmentRequest;
    }
    
    /**
     * Gets return picking third party payer flag 
     * @return Return picking third party payer flag
     * @since 2.3.0
     */
    public Boolean isRetThirdPartyPayer() {
        return retThirdPartyPayer;
    }

    /**
     * Sets return picking third party payer flag 
     * @param retThirdPartyPayer Return picking third party payer flag
     * @since 2.3.0
     */
    public void setRetThirdPartyPayer(Boolean retThirdPartyPayer) {
        this.retThirdPartyPayer = retThirdPartyPayer;
    }

    /**
     * Gets the id of the client who is to receive the return receipt and/or the return documents.
     * @return Id of the client who is to receive the return receipt and/or the return documents.
     */
    public Long getRetToClientId() {
        return retToClientId;
    }

    /**
     * Sets the id of the client who is to receive the return receipt and/or the return documents.
     * If payer is "third party" then this client has to be payer's contract member.
     * Otherwise the client has to be sender's contract member.
     * @param retToClientId Id of the client who is to receive the return receipt and/or the return documents.
     */
    public void setRetToClientId(Long retToClientId) {
        this.retToClientId = retToClientId;
    }

    /**
     * Gets the sender details
     * @return Sender details
     */
    public ParamClientData getSender() {
        return sender;
    }

    /**
     * Sets the sender details
     * @param sender Sender details
     */
    public void setSender(ParamClientData sender) {
        this.sender = sender;
    }

    /**
     * Gets courier service type id
     * @return Courier service type id 
     */
    public long getServiceTypeId() {
        return serviceTypeId;
    }

    /**
     * Sets the courier service type is
     * @param serviceTypeId Courier service type id
     */
    public void setServiceTypeId(long serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    /**
     * Gets the size of shipment
     * @return Size of shipment
     */
    public Size getSize() {
        return size;
    }

    /**
     * Sets the size of shipment
     * @param size Size of shipment
     */
    public void setSize(Size size) {
        this.size = size;
    }

    /**
     * Gets the skip automatic parcels creation flag value
     * @return The skip automatic parcels creation flag value
     */
    public Boolean isSkipAutomaticParcelsCreation() {
        return skipAutomaticParcelsCreation;
    }

    /**
     * Sets the skip automatic parcels creation flag value.
     * When parcelsCount > 1 and no explicit data has been set in the parcels property during the creation,
     * then parcels will be created automatically by default.
     * This parameter allows users to control this behaviour.
     * @param skipAutomaticParcelsCreation The skip automatic parcels creation flag value
     */
    public void setSkipAutomaticParcelsCreation(Boolean skipAutomaticParcelsCreation) {
        this.skipAutomaticParcelsCreation = skipAutomaticParcelsCreation;
    }

    /**
     * Gets the date for shipment pick-up (the "time" component is ignored)
     * @return The date for shipment pick-up
     */
    public XMLGregorianCalendar getTakingDate() {
        return takingDate;
    }

    /**
     * Sets the date for shipment pick-up (the "time" component is ignored).
     * Default value is "today".
     * @param takingDate The date for shipment pick-up
     */
    public void setTakingDate(XMLGregorianCalendar takingDate) {
        this.takingDate = takingDate;
    }

    /**
     * Gets the declared weight in kg
     * @return Declared weight in kg
     */
    public double getWeightDeclared() {
        return weightDeclared;
    }

    /**
     * Sets the declared weight in kg (the greater of "volume" and "real" weight values).
     * Maximum value is 100.00
     * @param Declared weight in kg
     */
    public void setWeightDeclared(double value) {
        this.weightDeclared = value;
    }

    /**
     * Gets the will-bring-to-office flag value - indicates whether the sender intends to deliver 
     * the shipment to a Speedy office by him/herself instead of ordering a visit by courier
     * @return The will-bring-to-office flag value.
     */
    public boolean isWillBringToOffice() {
        return willBringToOffice;
    }

    /**
     * Sets the will-bring-to-office flag value.
     * Specifies if the sender intends to deliver the shipment to a Speedy office by him/herself 
     * instead of ordering a visit by courier
     * @param willBringToOffice The will-bring-to-office flag value.
     */
    public void setWillBringToOffice(boolean willBringToOffice) {
        this.willBringToOffice = willBringToOffice;
    }

    /**
     * Gets the specific Speedy office, where the sender intends to deliver the shipment by him/herself. 
     * @return The will-bring-to-office office id
     * @since 1.3.0
     */
    public Long getWillBringToOfficeId() {
        return willBringToOfficeId;
    }

    /**
     * Sets the specific Speedy office, where the sender intends to deliver the shipment by him/herself. 
     * If willBringToOfficeId is provided, willBringToOffice flag is considered "true", regardless the value provided. 
     * If willBringToOfficeId is not provied (0 or null) and willBringToOffice flag is "true", 
     * willBringToOfficeId is automatically set with default value configured for caller user profile. 
     * The default willBringToOfficeId value could be managed using profile configuration page in client's Speedy web site.
     * @param willBringToOfficeId The will-bring-to-office office id
     * @since 1.3.0
     */
    public void setWillBringToOfficeId(Long willBringToOfficeId) {
        this.willBringToOfficeId = willBringToOfficeId;
    }

    /**
     * Gets the special delivery id
     * @return Special delivery id
     */
    public Integer getSpecialDeliveryId() {
        return specialDeliveryId;
    }

    /**
     * Sets the Sets the special delivery id
     * @param specialDeliveryId Special delivery id
     */
    public void setSpecialDeliveryId(Integer specialDeliveryId) {
        this.specialDeliveryId = specialDeliveryId;
    }
}
