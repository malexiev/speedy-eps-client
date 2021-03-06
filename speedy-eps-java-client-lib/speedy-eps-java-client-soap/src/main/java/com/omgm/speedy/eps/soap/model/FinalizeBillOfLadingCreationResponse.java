
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for finalizeBillOfLadingCreationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="finalizeBillOfLadingCreationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ver01.eps.speedy.sirma.com/}resultBOL" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "finalizeBillOfLadingCreationResponse", propOrder = {
    "_return"
})
public class FinalizeBillOfLadingCreationResponse {

    @XmlElement(name = "return")
    protected ResultBOL _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ResultBOL }
     *     
     */
    public ResultBOL getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultBOL }
     *     
     */
    public void setReturn(ResultBOL value) {
        this._return = value;
    }

}
