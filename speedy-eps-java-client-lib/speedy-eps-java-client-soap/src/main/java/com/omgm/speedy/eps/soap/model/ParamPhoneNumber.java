
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paramPhoneNumber complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paramPhoneNumber">
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
 * <p>Instances of this class are used as a parameter for client phone numbers in web service calls
 * 
 * @since 1.0.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramPhoneNumber", propOrder = {
    "internal",
    "number"
})
public class ParamPhoneNumber {

	/**
     * An extension number.
     * Max size is 10 symbols.
     * MANDATORY: NO
     */
    protected String internal;
    
    /**
     * Phone number (example: "0888123456", "+35932261020" etc.).
     * Max size is 20 symbols.
     * MANDATORY: YES
     */
    protected String number;

    /**
     * Gets the extension number
     * @return The extension number
     */
    public String getInternal() {
        return internal;
    }

    /**
     * Sets the extension number.
     * Max size is 10 symbols.
     * @param internal The extension number
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
     * Sets the phone number (example: "0888123456", "+35932261020" etc.).
     * Max size is 20 symbols.
     * @param value Phone number
     */
    public void setNumber(String value) {
        this.number = value;
    }

}
