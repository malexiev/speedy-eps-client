
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="parcelsCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="payCodToThirdParty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="payerRefId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="payerRefInsuranceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="payerType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="payerTypeInsurance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="receiverId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="receiverSiteId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="senderId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="senderSiteId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="serviceTypeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="takingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="toBeCalled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="weightDeclared" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * <p>This class is used to pass parameters for calculation
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
    "parcelsCount",
    "payCodToThirdParty",
    "payerRefId",
    "payerRefInsuranceId",
    "payerType",
    "payerTypeInsurance",
    "receiverId",
    "receiverSiteId",
    "senderId",
    "senderSiteId",
    "serviceTypeId",
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
     * Receiver's ID.
     * Either receiverId or receiverSiteId must be set
     * MANDATORY: NO
     */
    protected Long receiverId;
    
    /**
     * Receiver's site ID
     * Either receiverId or receiverSiteId must be set
     * MANDATORY: NO
     */
    protected Long receiverSiteId;
    
    /**
     * Sender's ID.
     * Either senderId or senderSiteId must be set
     * MANDATORY: NO
     */
    protected Long senderId;
    
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
     * Gets the value of the amountCodBase property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmountCodBase() {
        return amountCodBase;
    }

    /**
     * Sets the value of the amountCodBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmountCodBase(Double value) {
        this.amountCodBase = value;
    }

    /**
     * Gets the value of the amountInsuranceBase property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAmountInsuranceBase() {
        return amountInsuranceBase;
    }

    /**
     * Sets the value of the amountInsuranceBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAmountInsuranceBase(Double value) {
        this.amountInsuranceBase = value;
    }

    /**
     * Gets the value of the autoAdjustTakingDate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoAdjustTakingDate() {
        return autoAdjustTakingDate;
    }

    /**
     * Sets the value of the autoAdjustTakingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoAdjustTakingDate(Boolean value) {
        this.autoAdjustTakingDate = value;
    }

    /**
     * Gets the value of the broughtToOffice property.
     * 
     */
    public boolean isBroughtToOffice() {
        return broughtToOffice;
    }

    /**
     * Sets the value of the broughtToOffice property.
     * 
     */
    public void setBroughtToOffice(boolean value) {
        this.broughtToOffice = value;
    }

    /**
     * Gets the value of the deferredDeliveryWorkDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDeferredDeliveryWorkDays() {
        return deferredDeliveryWorkDays;
    }

    /**
     * Sets the value of the deferredDeliveryWorkDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDeferredDeliveryWorkDays(Integer value) {
        this.deferredDeliveryWorkDays = value;
    }

    /**
     * Gets the value of the documents property.
     * 
     */
    public boolean isDocuments() {
        return documents;
    }

    /**
     * Sets the value of the documents property.
     * 
     */
    public void setDocuments(boolean value) {
        this.documents = value;
    }

    /**
     * Gets the value of the fixedTimeDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getFixedTimeDelivery() {
        return fixedTimeDelivery;
    }

    /**
     * Sets the value of the fixedTimeDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setFixedTimeDelivery(Short value) {
        this.fixedTimeDelivery = value;
    }

    /**
     * Gets the value of the fragile property.
     * 
     */
    public boolean isFragile() {
        return fragile;
    }

    /**
     * Sets the value of the fragile property.
     * 
     */
    public void setFragile(boolean value) {
        this.fragile = value;
    }

    /**
     * Gets the value of the palletized property.
     * 
     */
    public boolean isPalletized() {
        return palletized;
    }

    /**
     * Sets the value of the palletized property.
     * 
     */
    public void setPalletized(boolean value) {
        this.palletized = value;
    }

    /**
     * Gets the value of the parcelsCount property.
     * 
     */
    public int getParcelsCount() {
        return parcelsCount;
    }

    /**
     * Sets the value of the parcelsCount property.
     * 
     */
    public void setParcelsCount(int value) {
        this.parcelsCount = value;
    }

    /**
     * Gets the value of the payCodToThirdParty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPayCodToThirdParty() {
        return payCodToThirdParty;
    }

    /**
     * Sets the value of the payCodToThirdParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPayCodToThirdParty(Boolean value) {
        this.payCodToThirdParty = value;
    }

    /**
     * Gets the value of the payerRefId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPayerRefId() {
        return payerRefId;
    }

    /**
     * Sets the value of the payerRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPayerRefId(Long value) {
        this.payerRefId = value;
    }

    /**
     * Gets the value of the payerRefInsuranceId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPayerRefInsuranceId() {
        return payerRefInsuranceId;
    }

    /**
     * Sets the value of the payerRefInsuranceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPayerRefInsuranceId(Long value) {
        this.payerRefInsuranceId = value;
    }

    /**
     * Gets the value of the payerType property.
     * 
     */
    public int getPayerType() {
        return payerType;
    }

    /**
     * Sets the value of the payerType property.
     * 
     */
    public void setPayerType(int value) {
        this.payerType = value;
    }

    /**
     * Gets the value of the payerTypeInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPayerTypeInsurance() {
        return payerTypeInsurance;
    }

    /**
     * Sets the value of the payerTypeInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPayerTypeInsurance(Integer value) {
        this.payerTypeInsurance = value;
    }

    /**
     * Gets the value of the receiverId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReceiverId() {
        return receiverId;
    }

    /**
     * Sets the value of the receiverId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReceiverId(Long value) {
        this.receiverId = value;
    }

    /**
     * Gets the value of the receiverSiteId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReceiverSiteId() {
        return receiverSiteId;
    }

    /**
     * Sets the value of the receiverSiteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReceiverSiteId(Long value) {
        this.receiverSiteId = value;
    }

    /**
     * Gets the value of the senderId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSenderId() {
        return senderId;
    }

    /**
     * Sets the value of the senderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSenderId(Long value) {
        this.senderId = value;
    }

    /**
     * Gets the value of the senderSiteId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSenderSiteId() {
        return senderSiteId;
    }

    /**
     * Sets the value of the senderSiteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSenderSiteId(Long value) {
        this.senderSiteId = value;
    }

    /**
     * Gets the value of the serviceTypeId property.
     * 
     */
    public long getServiceTypeId() {
        return serviceTypeId;
    }

    /**
     * Sets the value of the serviceTypeId property.
     * 
     */
    public void setServiceTypeId(long value) {
        this.serviceTypeId = value;
    }

    /**
     * Gets the value of the takingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTakingDate() {
        return takingDate;
    }

    /**
     * Sets the value of the takingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTakingDate(XMLGregorianCalendar value) {
        this.takingDate = value;
    }

    /**
     * Gets the value of the toBeCalled property.
     * 
     */
    public boolean isToBeCalled() {
        return toBeCalled;
    }

    /**
     * Sets the value of the toBeCalled property.
     * 
     */
    public void setToBeCalled(boolean value) {
        this.toBeCalled = value;
    }

    /**
     * Gets the value of the weightDeclared property.
     * 
     */
    public double getWeightDeclared() {
        return weightDeclared;
    }

    /**
     * Sets the value of the weightDeclared property.
     * 
     */
    public void setWeightDeclared(double value) {
        this.weightDeclared = value;
    }

}
