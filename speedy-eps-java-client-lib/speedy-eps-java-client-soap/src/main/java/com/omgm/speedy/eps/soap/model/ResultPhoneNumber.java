
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultPhoneNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultPhoneNumber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="internal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * <p>Instances of this class are returned as part of client data in Speedy web service method calls
 * 
 * @since 1.0.0
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultPhoneNumber", propOrder = {
    "internal",
    "number"
})
public class ResultPhoneNumber {

	/**
     * An extension number
     */
    protected String internal;
    
    /**
     * Phone number (example: "0888123456", "+35932261020" etc.)
     */
    protected String number;

    /**
     * Gets the extension number
     * @return Extension number
     */
    public String getInternal() {
        return internal;
    }

    /**
     * Sets the extension number
     * @param internal Extension number
     */
    public void setInternal(String internal) {
        this.internal = internal;
    }

    /**
     * Gets the phone number
     * @return Phone number
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the phone number
     * @param number Phone number
     */
    public void setNumber(String number) {
        this.number = number;
    }

}
