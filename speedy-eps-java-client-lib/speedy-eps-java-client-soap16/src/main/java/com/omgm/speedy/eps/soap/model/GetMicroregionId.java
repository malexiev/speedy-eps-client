
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getMicroregionId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMicroregionId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coordX" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="coordY" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMicroregionId", propOrder = {
    "sessionId",
    "coordX",
    "coordY"
})
public class GetMicroregionId {

    protected String sessionId;
    protected double coordX;
    protected double coordY;

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the coordX property.
     * 
     */
    public double getCoordX() {
        return coordX;
    }

    /**
     * Sets the value of the coordX property.
     * 
     */
    public void setCoordX(double value) {
        this.coordX = value;
    }

    /**
     * Gets the value of the coordY property.
     * 
     */
    public double getCoordY() {
        return coordY;
    }

    /**
     * Sets the value of the coordY property.
     * 
     */
    public void setCoordY(double value) {
        this.coordY = value;
    }

}
