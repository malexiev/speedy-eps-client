
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultCourierService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultCourierService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allowanceBackDocumentsRequest" type="{http://ver01.eps.speedy.sirma.com/}complementaryServiceAllowance" minOccurs="0"/>
 *         &lt;element name="allowanceBackReceiptRequest" type="{http://ver01.eps.speedy.sirma.com/}complementaryServiceAllowance" minOccurs="0"/>
 *         &lt;element name="allowanceCashOnDelivery" type="{http://ver01.eps.speedy.sirma.com/}complementaryServiceAllowance" minOccurs="0"/>
 *         &lt;element name="allowanceFixedTimeDelivery" type="{http://ver01.eps.speedy.sirma.com/}complementaryServiceAllowance" minOccurs="0"/>
 *         &lt;element name="allowanceInsurance" type="{http://ver01.eps.speedy.sirma.com/}complementaryServiceAllowance" minOccurs="0"/>
 *         &lt;element name="allowanceToBeCalled" type="{http://ver01.eps.speedy.sirma.com/}complementaryServiceAllowance" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultCourierService", propOrder = {
    "allowanceBackDocumentsRequest",
    "allowanceBackReceiptRequest",
    "allowanceCashOnDelivery",
    "allowanceFixedTimeDelivery",
    "allowanceInsurance",
    "allowanceToBeCalled",
    "name",
    "typeId"
})
@XmlSeeAlso({
    ResultCourierServiceExt.class
})
public class ResultCourierService {

    protected ComplementaryServiceAllowance allowanceBackDocumentsRequest;
    protected ComplementaryServiceAllowance allowanceBackReceiptRequest;
    protected ComplementaryServiceAllowance allowanceCashOnDelivery;
    protected ComplementaryServiceAllowance allowanceFixedTimeDelivery;
    protected ComplementaryServiceAllowance allowanceInsurance;
    protected ComplementaryServiceAllowance allowanceToBeCalled;
    protected String name;
    protected long typeId;

    /**
     * Gets the value of the allowanceBackDocumentsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ComplementaryServiceAllowance }
     *     
     */
    public ComplementaryServiceAllowance getAllowanceBackDocumentsRequest() {
        return allowanceBackDocumentsRequest;
    }

    /**
     * Sets the value of the allowanceBackDocumentsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplementaryServiceAllowance }
     *     
     */
    public void setAllowanceBackDocumentsRequest(ComplementaryServiceAllowance value) {
        this.allowanceBackDocumentsRequest = value;
    }

    /**
     * Gets the value of the allowanceBackReceiptRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ComplementaryServiceAllowance }
     *     
     */
    public ComplementaryServiceAllowance getAllowanceBackReceiptRequest() {
        return allowanceBackReceiptRequest;
    }

    /**
     * Sets the value of the allowanceBackReceiptRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplementaryServiceAllowance }
     *     
     */
    public void setAllowanceBackReceiptRequest(ComplementaryServiceAllowance value) {
        this.allowanceBackReceiptRequest = value;
    }

    /**
     * Gets the value of the allowanceCashOnDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link ComplementaryServiceAllowance }
     *     
     */
    public ComplementaryServiceAllowance getAllowanceCashOnDelivery() {
        return allowanceCashOnDelivery;
    }

    /**
     * Sets the value of the allowanceCashOnDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplementaryServiceAllowance }
     *     
     */
    public void setAllowanceCashOnDelivery(ComplementaryServiceAllowance value) {
        this.allowanceCashOnDelivery = value;
    }

    /**
     * Gets the value of the allowanceFixedTimeDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link ComplementaryServiceAllowance }
     *     
     */
    public ComplementaryServiceAllowance getAllowanceFixedTimeDelivery() {
        return allowanceFixedTimeDelivery;
    }

    /**
     * Sets the value of the allowanceFixedTimeDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplementaryServiceAllowance }
     *     
     */
    public void setAllowanceFixedTimeDelivery(ComplementaryServiceAllowance value) {
        this.allowanceFixedTimeDelivery = value;
    }

    /**
     * Gets the value of the allowanceInsurance property.
     * 
     * @return
     *     possible object is
     *     {@link ComplementaryServiceAllowance }
     *     
     */
    public ComplementaryServiceAllowance getAllowanceInsurance() {
        return allowanceInsurance;
    }

    /**
     * Sets the value of the allowanceInsurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplementaryServiceAllowance }
     *     
     */
    public void setAllowanceInsurance(ComplementaryServiceAllowance value) {
        this.allowanceInsurance = value;
    }

    /**
     * Gets the value of the allowanceToBeCalled property.
     * 
     * @return
     *     possible object is
     *     {@link ComplementaryServiceAllowance }
     *     
     */
    public ComplementaryServiceAllowance getAllowanceToBeCalled() {
        return allowanceToBeCalled;
    }

    /**
     * Sets the value of the allowanceToBeCalled property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplementaryServiceAllowance }
     *     
     */
    public void setAllowanceToBeCalled(ComplementaryServiceAllowance value) {
        this.allowanceToBeCalled = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the typeId property.
     * 
     */
    public long getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     */
    public void setTypeId(long value) {
        this.typeId = value;
    }

}
