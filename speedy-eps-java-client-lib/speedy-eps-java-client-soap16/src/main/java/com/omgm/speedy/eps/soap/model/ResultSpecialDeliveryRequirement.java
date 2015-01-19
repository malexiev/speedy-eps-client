
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultSpecialDeliveryRequirement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultSpecialDeliveryRequirement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="specialDeliveryId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="specialDeliveryPrice" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="specialDeliveryText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultSpecialDeliveryRequirement", propOrder = {
    "specialDeliveryId",
    "specialDeliveryPrice",
    "specialDeliveryText"
})
public class ResultSpecialDeliveryRequirement {

    protected int specialDeliveryId;
    protected Double specialDeliveryPrice;
    protected String specialDeliveryText;

    /**
     * Gets the value of the specialDeliveryId property.
     * 
     */
    public int getSpecialDeliveryId() {
        return specialDeliveryId;
    }

    /**
     * Sets the value of the specialDeliveryId property.
     * 
     */
    public void setSpecialDeliveryId(int value) {
        this.specialDeliveryId = value;
    }

    /**
     * Gets the value of the specialDeliveryPrice property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSpecialDeliveryPrice() {
        return specialDeliveryPrice;
    }

    /**
     * Sets the value of the specialDeliveryPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSpecialDeliveryPrice(Double value) {
        this.specialDeliveryPrice = value;
    }

    /**
     * Gets the value of the specialDeliveryText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialDeliveryText() {
        return specialDeliveryText;
    }

    /**
     * Sets the value of the specialDeliveryText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialDeliveryText(String value) {
        this.specialDeliveryText = value;
    }

}
