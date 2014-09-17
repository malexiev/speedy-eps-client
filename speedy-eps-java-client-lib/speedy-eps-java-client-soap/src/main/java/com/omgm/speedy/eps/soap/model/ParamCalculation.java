
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
 * <p>Java class for paramCalculation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paramCalculation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amountCodBase" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="amountInsuranceBase" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="autoAdjustTakingDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="broughtToOffice" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="deferredDeliveryWorkDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="documents" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="fixedTimeDelivery" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="fragile" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
 *         &lt;element name="receiverCountryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="receiverId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="receiverPostCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiverSiteId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="senderCountryId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="senderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="senderPostCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senderSiteId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="serviceTypeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="specialDeliveryId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="takingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="toBeCalled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="weightDeclared" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * @since 1.0.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramCalculation", propOrder = {
    "amountCodBase",
    "amountInsuranceBase",
    "autoAdjustTakingDate",
    "broughtToOffice",
    "deferredDeliveryWorkDays",
    "documents",
    "fixedTimeDelivery",
    "fragile",
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
    "receiverCountryId",
    "receiverId",
    "receiverPostCode",
    "receiverSiteId",
    "senderCountryId",
    "senderId",
    "senderPostCode",
    "senderSiteId",
    "serviceTypeId",
    "specialDeliveryId",
    "takingDate",
    "toBeCalled",
    "weightDeclared"
})
public class ParamCalculation {

	/**
     * Cash-on-Delivery (COD) amount
     * The limit of this value depends on user's permissions and Speedy's current policy.
     * MANDATORY: NO
     */
    protected Double amountCodBase;
    
    /**
     * Shipment insurance value (if the shipment is insured).
     * The limit of this value depends on user's permissions and Speedy's current policy.
     * MANDATORY: NO
     */
    protected Double amountInsuranceBase;
    
    /**
     * If set to true, the "takingDate" field is not just to be validated, but the first allowed (following)
     * date will be used instead (in compliance with the pick-up schedule etc.).
     * MANDATORY: NO
     */
    protected Boolean autoAdjustTakingDate;
    
    /**
     * Specifies if the sender intends to deliver the shipment to a Speedy office by him/herself instead of ordering a visit by courier
     * MANDATORY: YES
     */
    protected boolean broughtToOffice;
    
    /**
     * In some rare cases users might prefer the delivery to be deferred by a day or two.
     * This parameter allows users to specify by how many (working) days they would like to postpone the shipment delivery.
     * Max value is 2.
     * MANDATORY: NO
     */
    protected Integer deferredDeliveryWorkDays;
    
    /**
     * Specifies whether the shipment consists of documents
     * MANDATORY: YES
     */
    protected boolean documents;
    
    /**
     * Fixed time for delivery ("HHmm" format, i.e., the number "1315" means "13:15", "830" means "8:30" etc.).
     * Depending on the courier service, this property could be required, allowed or banned
     * MANDATORY: NO
     */
    protected Short fixedTimeDelivery;
    
    /**
     * Specifies whether the shipment is fragile - necessary when the price of insurance is being calculated
     * MANDATORY: YES
     */
    protected boolean fragile;
    
    /**
     * Specifies whether the shipment is palletized
     * MANDATORY: YES
     */
    protected boolean palletized;
    
    /**
     * Parcels count.
     * Max 999.
     * MANDATORY: YES
     */
    protected int parcelsCount;
    
    /**
     * Specifies if the COD value is to be paid to a third party. Allowed only if the shipment has payerType = 2 (third party).
     * MANDATORY: NO
     */
    protected Boolean payCodToThirdParty;
    
    /**
     * Payer ID. Must be set <=> payer is "third party".
     * MANDATORY: NO
     */
    protected Long payerRefId;
    
    /**
     * Insurance payer ID. Must be set <=> shipment has insurance (i.e. amountInsuranceBase > 0) and it is payed by a "third party".
     * MANDATORY: NO
     */
    protected Long payerRefInsuranceId;
    
    /**
     * Packings payer id
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
     * Insurance payer type (0=sender, 1=reciever or 2=third party).
     * Must be set <=> shipment is insured (i.e. amountInsuranceBase > 0).
     * MANDATORY: NO
     */
    protected Integer payerTypeInsurance;
    
    /**
     * Packings payer type (0=sender, 1=reciever or 2=third party)
     * MANDATORY: NO. If not set, the payer of the packings' surcharge will be the same as the one indicated by payerType.
     * @since 2.3.0
     */
    protected Integer payerTypePackings;
    
    /**
     * Receiver country id
     * MANDATORY: NO
     * @since 2.5.0
     */
    protected Long receiverCountryId;
    
    /**
     * Receiver's ID.
     * Either receiverId or receiverSiteId must be set
     * MANDATORY: NO
     */
    protected Long receiverId;
    
    /**
     * Receiver post code
     * MANDATORY: NO
     * @since 2.5.0
     */
    protected String receiverPostCode;
    
    /**
     * Receiver's site ID
     * Either receiverId or receiverSiteId must be set
     * MANDATORY: NO
     */
    protected Long receiverSiteId;
    
    /**
     * Sender country id
     * MANDATORY: NO
     * @since 2.5.0
     */
    protected Long senderCountryId;
    
    /**
     * Sender's ID.
     * Either senderId or senderSiteId must be set
     * MANDATORY: NO
     */
    protected Long senderId;
    
    /**
     * Sender post code
     * MANDATORY: NO
     * @since 2.5.0
     */
    protected String senderPostCode;
    
    /**
     * Sender's site ID.
     * Either senderId or senderSiteId must be set
     * MANDATORY: NO
     */
    protected Long senderSiteId;
    
    /**
     * Courier service type ID
     * MANDATORY: YES
     */
    protected long serviceTypeId;
    
    /**
     * The date for shipment pick-up (the "time" component is ignored). Default value is "today".
     * MANDATORY: NO
     */
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar takingDate;
    
    /**
     * Specifies if the shipment is "to be called"
     * MANDATORY: YES
     */
    protected boolean toBeCalled;
    
    /**
     * Declared weight (the greater of "volume" and "real" weight values).
     * Max 100.00
     * MANDATORY: YES
     */
    protected double weightDeclared;
    
    /**
     * Parcels
     * @since 2.3.0
     */
    @XmlElement(nillable = true)
    protected List<ParamParcelInfo> parcels;
    
    /**
     * Special delivery id
     * MANDATORY: NO
     * @since 2.3.0
     */
    protected Integer specialDeliveryId;

    /**
     * Gets the Cash-on-Delivery amount
     * @return Cash-on-Delivery amount
     */
    public Double getAmountCodBase() {
        return amountCodBase;
    }

    /**
     * Sets the Cash-On-Delivery amount.
     * The limit of this value depends on user's permissions and Speedy's current policy. 
     * @param amountCodBase Cash-On-Delivery amount
     */
    public void setAmountCodBase(Double amountCodBase) {
        this.amountCodBase = amountCodBase;
    }

    /**
     * Gets the shipment insurance amount (if the shipment is insured).
     * @return Shipment insurance amount
     */
    public Double getAmountInsuranceBase() {
        return amountInsuranceBase;
    }

    /**
     * Sets the shipment insurance amount (if the shipment is insured).
     * The limit of this value depends on user's permissions and Speedy's current policy.
     * @param amountInsuranceBase Shipment insurance amount
     */
    public void setAmountInsuranceBase(Double amountInsuranceBase) {
        this.amountInsuranceBase = amountInsuranceBase;
    }

    /**
     * Gets the auto-adjust taking date flag value
     * @return Auto-adjust taking date flag value
     */
    public Boolean isAutoAdjustTakingDate() {
        return autoAdjustTakingDate;
    }

    /**
     * Sets the auto-adjust taking date flag value.
     * If set to true, the "takingDate" field is not just to be validated, but the first allowed (following)
     * date will be used instead (in compliance with the pick-up schedule etc.).
     * @param autoAdjustTakingDate Auto-adjust taking date flag value
     */
    public void setAutoAdjustTakingDate(Boolean autoAdjustTakingDate) {
        this.autoAdjustTakingDate = autoAdjustTakingDate;
    }

    /**
     * Gets the brought-to-office flag
     * @return Brought-to-office flag
     */
    public boolean isBroughtToOffice() {
        return broughtToOffice;
    }

    /**
     * Sets the brought-to-office flag
     * Specifies if the sender intends to deliver the shipment to a Speedy office by 
     * him/herself instead of ordering a visit by courier.
     * @param broughtToOffice Brought to office flag
     */
    public void setBroughtToOffice(boolean broughtToOffice) {
        this.broughtToOffice = broughtToOffice;
    }

    /**
     * Gets the deferred delivery work days
     * @return Deferred delivery work days
     */
    public Integer getDeferredDeliveryWorkDays() {
        return deferredDeliveryWorkDays;
    }

    /**
     * Sets the deferred delivery work days.
     * In some rare cases users might prefer the delivery to be deferred by a day or two.
     * This parameter allows users to specify by how many (working) days they would like to postpone 
     * the shipment delivery. Max value is 2 
     * @param deferredDeliveryWorkDays Deferred delivery work days
     */
    public void setDeferredDeliveryWorkDays(Integer deferredDeliveryWorkDays) {
        this.deferredDeliveryWorkDays = deferredDeliveryWorkDays;
    }

    /**
     * Gets the documents flag value
     * @return Documents flag value
     */
    public boolean isDocuments() {
        return documents;
    }

    /**
     * Sets the documents flag value.
     * Specifies whether the shipment consists of documents
     * @param documents Documents flag value
     */
    public void setDocuments(boolean documents) {
        this.documents = documents;
    }

    /**
     * Gets the fixed time for delivery.
     * Fixed time for delivery has "HHmm" format, i.e., the number "1315" means "13:15", "830" means "8:30" etc
     * @return The fixed time the shipment should be delivered
     */
    public Short getFixedTimeDelivery() {
        return fixedTimeDelivery;
    }

    /**
     * Sets the fixed time for delivery ("HHmm" format, i.e., the number "1315" means "13:15", "830" means "8:30" etc.).
     * Depending on the courier service, this property could be required, allowed or banned
     * @param fixedTimeDelivery The fixed time the shipment shpuld be delivered
     */
    public void setFixedTimeDelivery(Short fixedTimeDelivery) {
        this.fixedTimeDelivery = fixedTimeDelivery;
    }

    /**
     * Gets the fragile flag value.
     * @return Fragile flag value
     */
    public boolean isFragile() {
        return fragile;
    }

    /**
     * Sets the fragile flag value.
     * Specifies whether the shipment is fragile - necessary when the price of insurance is being calculated
     * Fragile shipments requre insrance
     * @param fragile Fragile flag value
     */
    public void setFragile(boolean fragile) {
        this.fragile = fragile;
    }

    /**
     * Gets the palletized flag value
     * @return palletized flag value
     */
    public boolean isPalletized() {
        return palletized;
    }

    /**
     * Sets the value of the palletized property.
     * Specifies whether the shipment is palletized
     * @param palletized Palettized flag value
     */
    public void setPalletized(boolean palletized) {
        this.palletized = palletized;
    }

    /**
     * Gets the parcels count
     * @return parcels count
     */
    public int getParcelsCount() {
        return parcelsCount;
    }

    /**
     * Sets the parcels count. Max 999.
     * Bill of ladings (bol) by default have one parcel which has identifier equal to bol identifier
     * @param parcelsCount Parcels count
     */
    public void setParcelsCount(int parcelsCount) {
        this.parcelsCount = parcelsCount;
    }

    /**
     * Gets the flag value whether the Collection-On-Develiry amount is paid to third party
     * @return The flag value whether the Collection-On-Develiry amount is paid to third party
     */
    public Boolean isPayCodToThirdParty() {
        return payCodToThirdParty;
    }

    /**
     * Sets the the flag value whether the Collection-On-Develiry amount is paid to third party.
     * Allowed only if the shipment has payerType = 2 (third party).
     * @param payCodToThirdParty The flag value whether the Collection-On-Develiry amount is paid to third party
     */
    public void setPayCodToThirdParty(Boolean payCodToThirdParty) {
        this.payCodToThirdParty = payCodToThirdParty;
    }

    /**
     * Gets the payer id
     * @return Payer id
     */
    public Long getPayerRefId() {
        return payerRefId;
    }

    /**
     * Sets the payer id. Must be set when payer is "third party"
     * @param payerRefId Payer id
     */
    public void setPayerRefId(Long payerRefId) {
        this.payerRefId = payerRefId;
    }

    /**
     * Gets the insuarance payer id
     * @return Insurance payer id
     */
    public Long getPayerRefInsuranceId() {
        return payerRefInsuranceId;
    }

    /**
     * Sets the insurance payer ID must be set when shipment has insurance (i.e. amountInsuranceBase > 0) 
     * and it is payed by a "third party".
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
     * Gets the payer type
     * @return Payer type (0=sender, 1=receiver or 2=third party)
     */
    public int getPayerType() {
        return payerType;
    }

    /**
     * Sets the payer type.
     * @param payerType Payer type (0=sender, 1=receiver or 2=third party) 
     */
    public void setPayerType(int payerType) {
        this.payerType = payerType;
    }

    /**
     * Gets the insurance payer type 
     * @return Insurance payer type
     */
    public Integer getPayerTypeInsurance() {
        return payerTypeInsurance;
    }

    /**
     * Sets the insurance payer type (0=sender, 1=reciever or 2=third party).
     * Must be set when shipment is insured (i.e. amountInsuranceBase > 0)
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
     * Set receiver country id
     * @param receiverCountryId Receiver country id
     * @since 2.5.0
     */
    public void setReceiverCountryId(Long receiverCountryId) {
    	this.receiverCountryId = receiverCountryId;
    }
    
    /**
     * Get receiver country id
     * @return Receiver country id
     * @since 2.5.0
     */
    public Long getReceiverCountryId() {
    	return receiverCountryId;
    }

    /**
     * Gets the receiver id
     * @return Receiver id
     */
    public Long getReceiverId() {
        return receiverId;
    }

    /**
     * Sets the receiver's id.
     * Either receiverId or receiverSiteId must be set
     * @param receiverId Receiver's id
     */
    public void setReceiverId(Long receiverId) {
        this.receiverId = receiverId;
    }
    
    /**
     * Get receiver post code
     * @return Receiver post code
     * @since 2.5.0
     */
    public String getReceiverPostCode() {
    	return receiverPostCode;
    }
    
    /**
     * Set receiver post code
     * @param receiverPostCode Receiver post code
     * @since 2.5.0
     */
    public void setReceiverPostCode(String receiverPostCode) {
    	this.receiverPostCode = receiverPostCode;
    }

    /**
     * Gets the receiver's site id
     * @return Receiver's site id
     */
    public Long getReceiverSiteId() {
        return receiverSiteId;
    }

    /**
     * Sets the receiver's site id.
     * Either receiverId or receiverSiteId must be set
     * @param receiverSiteId Receiver's site ID
     */
    public void setReceiverSiteId(Long receiverSiteId) {
        this.receiverSiteId = receiverSiteId;
    }

    /**
     * Set sender country id
     * @param senderCountryId Sender country id
     * @since 2.5.0
     */
    public void setSenderCountryId(Long senderCountryId) {
    	this.senderCountryId = senderCountryId;
    }
    
    /**
     * Get sender country id
     * @return Sender country id
     * @since 2.5.0
     */
    public Long getSenderCountryId() {
    	return senderCountryId;
    }
    
    /**
     * Gets the sender's id.
     * @return Sneder's id
     */
    public Long getSenderId() {
        return senderId;
    }

    /**
     * Sets the sender's id.
     * Either senderId or senderSiteId must be set
     * @param senderId Sender's ID.
     */
    public void setSenderId(Long senderId) {
        this.senderId = senderId;
    }

    /**
     * Gets the sender's site id.
     * @return Semder's site id
     */
    public Long getSenderSiteId() {
        return senderSiteId;
    }
    
    /**
     * Get sender post code
     * @return Sender post code
     * @since 2.5.0
     */
    public String getSenderPostCode() {
    	return senderPostCode;
    }
    
    /**
     * Set sender post code
     * @param senderPostCode Sender post code
     * @since 2.5.0
     */
    public void setSenderPostCode(String senderPostCode) {
    	this.senderPostCode = senderPostCode;
    }

    /**
     * Sets the sender's site id.
     * Either senderId or senderSiteId must be set
     * @param senderSiteId Sender's site ID.
     */
    public void setSenderSiteId(Long senderSiteId) {
        this.senderSiteId = senderSiteId;
    }

    /**
     * Gets the courier service type id
     * @return Courier service type ID
     */
    public long getServiceTypeId() {
        return serviceTypeId;
    }

    /**
     * Sets the courier service type id
     * @param serviceTypeId Courier service type ID
     */
    public void setServiceTypeId(long value) {
        this.serviceTypeId = value;
    }

    /**
     * Gets the taking date.
     * @return The date for shipment pick-up
     */
    public XMLGregorianCalendar getTakingDate() {
        return takingDate;
    }

    /**
     * Sets the taking date.
     * The date for shipment pick-up (the "time" component is ignored). Default value is "today".
     * @param takingDate The date for shipment pick-up 
     */
    public void setTakingDate(XMLGregorianCalendar takingDate) {
        this.takingDate = takingDate;
    }

    /**
     * Gets the to-be-called flag value - whether the shipment is about to be taken from office by receiver
     * @return To-be-called flag value
     */
    public boolean isToBeCalled() {
        return toBeCalled;
    }

    /**
     * Sets the to-be-valled flag value.
     * Specifies if the shipment is about to be taken from office by receiver
     * @param toBeCalled To-be-called flag value
     */
    public void setToBeCalled(boolean toBeCalled) {
        this.toBeCalled = toBeCalled;
    }

    /**
     * Gets the declared weight 
     * @return Declared weight
     */
    public double getWeightDeclared() {
        return weightDeclared;
    }

    /**
     * Sets the declared weight (the greater of "volume" and "real" weight values).
     * Max 100.00
     * @param weightDeclared Declared weight
     */
    public void setWeightDeclared(double weightDeclared) {
        this.weightDeclared = weightDeclared;
    }

    /**
     * Gets the declared weight 
     * @return Declared weight
     */
    public Integer getSpecialDeliveryId() {
        return specialDeliveryId;
    }

    /**
     * Sets the declared weight (the greater of "volume" and "real" weight values).
     * Max 100.00
     * @param specialDeliveryId Special delivery id
     */
    public void setSpecialDeliveryId(Integer specialDeliveryId) {
        this.specialDeliveryId = specialDeliveryId;
    }
    
    /**
     * Gets the value of the parcels property.
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
     */
    public List<ParamParcelInfo> getParcels() {
        if (parcels == null) {
            parcels = new ArrayList<ParamParcelInfo>();
        }
        return this.parcels;
    }
}
