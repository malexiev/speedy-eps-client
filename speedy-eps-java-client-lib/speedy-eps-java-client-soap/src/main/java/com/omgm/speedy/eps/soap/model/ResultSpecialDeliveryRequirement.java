
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
 * <p>Instances of this class are returned as a result of services for special delivery requirements
 * 
 * @since 2.1.0 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultSpecialDeliveryRequirement", propOrder = {
    "specialDeliveryId",
    "specialDeliveryPrice",
    "specialDeliveryText"
})
public class ResultSpecialDeliveryRequirement {

	/**
     * A special delivery ID
     * @var integer 64-bit
     */
    protected int specialDeliveryId;
    
    /**
     * A special delivery price
     */
    protected Double specialDeliveryPrice;
    
    /**
     * A special delivery description
     */
    protected String specialDeliveryText;

    /**
     * Gets the special delivery id
     * @return Special delivery id
     */
    public int getSpecialDeliveryId() {
        return specialDeliveryId;
    }

    /**
     * Sets the special delivery id
     * @param specialDeliveryId Special delivery id
     */
    public void setSpecialDeliveryId(int specialDeliveryId) {
        this.specialDeliveryId = specialDeliveryId;
    }

    /**
     * Gets the special delivery price
     * @return Special delivery price
     */
    public Double getSpecialDeliveryPrice() {
        return specialDeliveryPrice;
    }

    /**
     * Sets the special delivery price
     * @param value Special delivery price
     */
    public void setSpecialDeliveryPrice(Double value) {
        this.specialDeliveryPrice = value;
    }

    /**
     * Gets the special delivery text
     * @return Special delivery text
     */
    public String getSpecialDeliveryText() {
        return specialDeliveryText;
    }

    /**
     * Sets the special delivery text
     * 
     * @param specialDeliveryText Special delivery text
     */
    public void setSpecialDeliveryText(String specialDeliveryText) {
        this.specialDeliveryText = specialDeliveryText;
    }

}
