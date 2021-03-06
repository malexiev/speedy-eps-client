
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
 * 
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

    protected Double amountCodBase;
    protected Double amountInsuranceBase;
    protected Boolean autoAdjustTakingDate;
    protected boolean broughtToOffice;
    protected Integer deferredDeliveryWorkDays;
    protected boolean documents;
    protected Short fixedTimeDelivery;
    protected boolean fragile;
    protected boolean palletized;
    @XmlElement(nillable = true)
    protected List<ParamParcelInfo> parcels;
    protected int parcelsCount;
    protected Boolean payCodToThirdParty;
    protected Long payerRefId;
    protected Long payerRefInsuranceId;
    protected Long payerRefPackingsId;
    protected int payerType;
    protected Integer payerTypeInsurance;
    protected Integer payerTypePackings;
    protected Long receiverCountryId;
    protected Long receiverId;
    protected String receiverPostCode;
    protected Long receiverSiteId;
    protected Long senderCountryId;
    protected Long senderId;
    protected String senderPostCode;
    protected Long senderSiteId;
    protected long serviceTypeId;
    protected Integer specialDeliveryId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar takingDate;
    protected boolean toBeCalled;
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
     * 
     */
    public List<ParamParcelInfo> getParcels() {
        if (parcels == null) {
            parcels = new ArrayList<ParamParcelInfo>();
        }
        return this.parcels;
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
     * Gets the value of the payerRefPackingsId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPayerRefPackingsId() {
        return payerRefPackingsId;
    }

    /**
     * Sets the value of the payerRefPackingsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPayerRefPackingsId(Long value) {
        this.payerRefPackingsId = value;
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
     * Gets the value of the payerTypePackings property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPayerTypePackings() {
        return payerTypePackings;
    }

    /**
     * Sets the value of the payerTypePackings property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPayerTypePackings(Integer value) {
        this.payerTypePackings = value;
    }

    /**
     * Gets the value of the receiverCountryId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getReceiverCountryId() {
        return receiverCountryId;
    }

    /**
     * Sets the value of the receiverCountryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setReceiverCountryId(Long value) {
        this.receiverCountryId = value;
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
     * Gets the value of the receiverPostCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverPostCode() {
        return receiverPostCode;
    }

    /**
     * Sets the value of the receiverPostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverPostCode(String value) {
        this.receiverPostCode = value;
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
     * Gets the value of the senderCountryId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSenderCountryId() {
        return senderCountryId;
    }

    /**
     * Sets the value of the senderCountryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSenderCountryId(Long value) {
        this.senderCountryId = value;
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
     * Gets the value of the senderPostCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderPostCode() {
        return senderPostCode;
    }

    /**
     * Sets the value of the senderPostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderPostCode(String value) {
        this.senderPostCode = value;
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
     * Gets the value of the specialDeliveryId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSpecialDeliveryId() {
        return specialDeliveryId;
    }

    /**
     * Sets the value of the specialDeliveryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSpecialDeliveryId(Integer value) {
        this.specialDeliveryId = value;
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
