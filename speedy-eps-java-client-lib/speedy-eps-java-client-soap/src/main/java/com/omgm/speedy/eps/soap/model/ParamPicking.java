
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
 *         &lt;element name="packId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="packing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="palletized" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="parcels" type="{http://ver01.eps.speedy.sirma.com/}paramParcelInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="parcelsCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="payCodToThirdParty" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="payerRefId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="payerRefInsuranceId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="payerType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="payerTypeInsurance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="pendingParcelsDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pendingShipmentDescription" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="receiver" type="{http://ver01.eps.speedy.sirma.com/}paramClientData" minOccurs="0"/>
 *         &lt;element name="ref1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ref2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="retMoneyTransferReqAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="retToClientId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="sender" type="{http://ver01.eps.speedy.sirma.com/}paramClientData" minOccurs="0"/>
 *         &lt;element name="serviceTypeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="size" type="{http://ver01.eps.speedy.sirma.com/}size" minOccurs="0"/>
 *         &lt;element name="skipAutomaticParcelsCreation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "packId",
    "packing",
    "palletized",
    "parcels",
    "parcelsCount",
    "payCodToThirdParty",
    "payerRefId",
    "payerRefInsuranceId",
    "payerType",
    "payerTypeInsurance",
    "pendingParcelsDescription",
    "pendingShipmentDescription",
    "receiver",
    "ref1",
    "ref2",
    "retMoneyTransferReqAmount",
    "retToClientId",
    "sender",
    "serviceTypeId",
    "size",
    "skipAutomaticParcelsCreation",
    "takingDate",
    "weightDeclared",
    "willBringToOffice",
    "willBringToOfficeId"
})
public class ParamPicking {

    protected Double amountCodBase;
    protected Double amountInsuranceBase;
    protected boolean backDocumentsRequest;
    protected boolean backReceiptRequest;
    protected Long billOfLading;
    protected Long clientSystemId;
    protected String contents;
    protected Integer deferredDeliveryWorkDays;
    protected FixedDiscountCardId discCalc;
    protected boolean documents;
    protected Short fixedTimeDelivery;
    protected boolean fragile;
    protected String noteClient;
    protected Long officeToBeCalledId;
    protected Long packId;
    protected String packing;
    protected boolean palletized;
    @XmlElement(nillable = true)
    protected List<ParamParcelInfo> parcels;
    protected int parcelsCount;
    protected Boolean payCodToThirdParty;
    protected Long payerRefId;
    protected Long payerRefInsuranceId;
    protected int payerType;
    protected Integer payerTypeInsurance;
    protected Boolean pendingParcelsDescription;
    protected Boolean pendingShipmentDescription;
    protected ParamClientData receiver;
    protected String ref1;
    protected String ref2;
    protected Double retMoneyTransferReqAmount;
    protected Long retToClientId;
    protected ParamClientData sender;
    protected long serviceTypeId;
    protected Size size;
    protected Boolean skipAutomaticParcelsCreation;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar takingDate;
    protected double weightDeclared;
    protected boolean willBringToOffice;
    protected Long willBringToOfficeId;

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
     * Gets the value of the backDocumentsRequest property.
     * 
     */
    public boolean isBackDocumentsRequest() {
        return backDocumentsRequest;
    }

    /**
     * Sets the value of the backDocumentsRequest property.
     * 
     */
    public void setBackDocumentsRequest(boolean value) {
        this.backDocumentsRequest = value;
    }

    /**
     * Gets the value of the backReceiptRequest property.
     * 
     */
    public boolean isBackReceiptRequest() {
        return backReceiptRequest;
    }

    /**
     * Sets the value of the backReceiptRequest property.
     * 
     */
    public void setBackReceiptRequest(boolean value) {
        this.backReceiptRequest = value;
    }

    /**
     * Gets the value of the billOfLading property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBillOfLading() {
        return billOfLading;
    }

    /**
     * Sets the value of the billOfLading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBillOfLading(Long value) {
        this.billOfLading = value;
    }

    /**
     * Gets the value of the clientSystemId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getClientSystemId() {
        return clientSystemId;
    }

    /**
     * Sets the value of the clientSystemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setClientSystemId(Long value) {
        this.clientSystemId = value;
    }

    /**
     * Gets the value of the contents property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContents() {
        return contents;
    }

    /**
     * Sets the value of the contents property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContents(String value) {
        this.contents = value;
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
     * Gets the value of the discCalc property.
     * 
     * @return
     *     possible object is
     *     {@link FixedDiscountCardId }
     *     
     */
    public FixedDiscountCardId getDiscCalc() {
        return discCalc;
    }

    /**
     * Sets the value of the discCalc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FixedDiscountCardId }
     *     
     */
    public void setDiscCalc(FixedDiscountCardId value) {
        this.discCalc = value;
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
     * Gets the value of the noteClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteClient() {
        return noteClient;
    }

    /**
     * Sets the value of the noteClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteClient(String value) {
        this.noteClient = value;
    }

    /**
     * Gets the value of the officeToBeCalledId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOfficeToBeCalledId() {
        return officeToBeCalledId;
    }

    /**
     * Sets the value of the officeToBeCalledId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOfficeToBeCalledId(Long value) {
        this.officeToBeCalledId = value;
    }

    /**
     * Gets the value of the packId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPackId() {
        return packId;
    }

    /**
     * Sets the value of the packId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPackId(Long value) {
        this.packId = value;
    }

    /**
     * Gets the value of the packing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacking() {
        return packing;
    }

    /**
     * Sets the value of the packing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacking(String value) {
        this.packing = value;
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
     * Gets the value of the pendingParcelsDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPendingParcelsDescription() {
        return pendingParcelsDescription;
    }

    /**
     * Sets the value of the pendingParcelsDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPendingParcelsDescription(Boolean value) {
        this.pendingParcelsDescription = value;
    }

    /**
     * Gets the value of the pendingShipmentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPendingShipmentDescription() {
        return pendingShipmentDescription;
    }

    /**
     * Sets the value of the pendingShipmentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPendingShipmentDescription(Boolean value) {
        this.pendingShipmentDescription = value;
    }

    /**
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link ParamClientData }
     *     
     */
    public ParamClientData getReceiver() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamClientData }
     *     
     */
    public void setReceiver(ParamClientData value) {
        this.receiver = value;
    }

    /**
     * Gets the value of the ref1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef1() {
        return ref1;
    }

    /**
     * Sets the value of the ref1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef1(String value) {
        this.ref1 = value;
    }

    /**
     * Gets the value of the ref2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef2() {
        return ref2;
    }

    /**
     * Sets the value of the ref2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef2(String value) {
        this.ref2 = value;
    }

    /**
     * Gets the value of the retMoneyTransferReqAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRetMoneyTransferReqAmount() {
        return retMoneyTransferReqAmount;
    }

    /**
     * Sets the value of the retMoneyTransferReqAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRetMoneyTransferReqAmount(Double value) {
        this.retMoneyTransferReqAmount = value;
    }

    /**
     * Gets the value of the retToClientId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRetToClientId() {
        return retToClientId;
    }

    /**
     * Sets the value of the retToClientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRetToClientId(Long value) {
        this.retToClientId = value;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link ParamClientData }
     *     
     */
    public ParamClientData getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamClientData }
     *     
     */
    public void setSender(ParamClientData value) {
        this.sender = value;
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
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link Size }
     *     
     */
    public Size getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link Size }
     *     
     */
    public void setSize(Size value) {
        this.size = value;
    }

    /**
     * Gets the value of the skipAutomaticParcelsCreation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSkipAutomaticParcelsCreation() {
        return skipAutomaticParcelsCreation;
    }

    /**
     * Sets the value of the skipAutomaticParcelsCreation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkipAutomaticParcelsCreation(Boolean value) {
        this.skipAutomaticParcelsCreation = value;
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

    /**
     * Gets the value of the willBringToOffice property.
     * 
     */
    public boolean isWillBringToOffice() {
        return willBringToOffice;
    }

    /**
     * Sets the value of the willBringToOffice property.
     * 
     */
    public void setWillBringToOffice(boolean value) {
        this.willBringToOffice = value;
    }

    /**
     * Gets the value of the willBringToOfficeId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWillBringToOfficeId() {
        return willBringToOfficeId;
    }

    /**
     * Sets the value of the willBringToOfficeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWillBringToOfficeId(Long value) {
        this.willBringToOfficeId = value;
    }

}
