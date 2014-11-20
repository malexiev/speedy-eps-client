
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultAddressSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultAddressSearch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actual" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="additionalAddressProcessing" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="coordType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="coordX" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="coordY" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="distanceToSiteCenter" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="microregionId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultAddressSearch", propOrder = {
    "actual",
    "additionalAddressProcessing",
    "coordType",
    "coordX",
    "coordY",
    "distanceToSiteCenter",
    "microregionId",
    "text"
})
public class ResultAddressSearch {

    protected boolean actual;
    protected int additionalAddressProcessing;
    protected int coordType;
    protected double coordX;
    protected double coordY;
    protected Double distanceToSiteCenter;
    protected Long microregionId;
    protected String text;

    /**
     * Gets the value of the actual property.
     * 
     */
    public boolean isActual() {
        return actual;
    }

    /**
     * Sets the value of the actual property.
     * 
     */
    public void setActual(boolean value) {
        this.actual = value;
    }

    /**
     * Gets the value of the additionalAddressProcessing property.
     * 
     */
    public int getAdditionalAddressProcessing() {
        return additionalAddressProcessing;
    }

    /**
     * Sets the value of the additionalAddressProcessing property.
     * 
     */
    public void setAdditionalAddressProcessing(int value) {
        this.additionalAddressProcessing = value;
    }

    /**
     * Gets the value of the coordType property.
     * 
     */
    public int getCoordType() {
        return coordType;
    }

    /**
     * Sets the value of the coordType property.
     * 
     */
    public void setCoordType(int value) {
        this.coordType = value;
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

    /**
     * Gets the value of the distanceToSiteCenter property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDistanceToSiteCenter() {
        return distanceToSiteCenter;
    }

    /**
     * Sets the value of the distanceToSiteCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDistanceToSiteCenter(Double value) {
        this.distanceToSiteCenter = value;
    }

    /**
     * Gets the value of the microregionId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMicroregionId() {
        return microregionId;
    }

    /**
     * Sets the value of the microregionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMicroregionId(Long value) {
        this.microregionId = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

}
