
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
 * <p>Instances of this class are returned as a result of Speedy address search web service methods
 * 
 * @since 1.0.0
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

	/**
     * Specifies if the address is actual now
     */
    protected boolean actual;
    
    /**
     * Internal/debug info
     */
    protected int additionalAddressProcessing;
    
    /**
     * GIS coordinates type
     */
    protected int coordType;
    
    /**
     * GIS coordinates - X
     */
    protected double coordX;
    
    /**
     * GIS coordinates - Y
     */
    protected double coordY;
    
    /**
     * Distance to site's center in kilometers (straight line)
     */
    protected Double distanceToSiteCenter;
    
    /**
     * Microregion ID
     */
    protected Long microregionId;
    
    /**
     * Text description of the address found
     */
    protected String text;

    /**
     * Gets the actual flag value
     * Specifies whether the address is actual now
     * @return Actual flag value
     */
    public boolean isActual() {
        return actual;
    }

    /**
     * Sets the actual flag value
     * @param actual Actual flag value
     */
    public void setActual(boolean actual) {
        this.actual = actual;
    }

    /**
     * Gets the additional address processing code.
     * Internal/debug info
     * @return Additional address processing code
     */
    public int getAdditionalAddressProcessing() {
        return additionalAddressProcessing;
    }

    /**
     * Sets the additional address processing code
     * @param additionalAddressProcessing Additional address processing code
     */
    public void setAdditionalAddressProcessing(int additionalAddressProcessing) {
        this.additionalAddressProcessing = additionalAddressProcessing;
    }

    /**
     * Gets the GIS coordinates type
     * @return GIS coodrdinates type
     */
    public int getCoordType() {
        return coordType;
    }

    /**
     * Sets the GIS coordinates type
     * @param coordType GIS coodrdinates type
     */
    public void setCoordType(int coordType) {
        this.coordType = coordType;
    }

    /**
     * Gets the GIS X coordinate
     * @return GIS X coordinate
     */
    public double getCoordX() {
        return coordX;
    }

    /**
     * Sets the GIS X coordinate
     * @param coordX GIS X coordinate
     */
    public void setCoordX(double coordX) {
        this.coordX = coordX;
    }

    /**
     * Gets the GIS Y coordinate
     * @return GIS Y coordinate
     */
    public double getCoordY() {
        return coordY;
    }

    /**
     * Sets the GIS Y coordinate
     * @param coordY GIS Y coordinate
     */
    public void setCoordY(double coordY) {
        this.coordY = coordY;
    }

    /**
     * Gets the distance to site center in km
     * @return Distance to site center in km
     */
    public Double getDistanceToSiteCenter() {
        return distanceToSiteCenter;
    }

    /**
     * Sets the distance to site center in km
     * @param distanceToSiteCenter Distance to site center in km
     */
    public void setDistanceToSiteCenter(Double distanceToSiteCenter) {
        this.distanceToSiteCenter = distanceToSiteCenter;
    }

    /**
     * Gets the microregion id
     * @return Microregion id
     */
    public Long getMicroregionId() {
        return microregionId;
    }

    /**
     * Sets the microregion id
     * @param microregionId Microregion id
     */
    public void setMicroregionId(Long microregionId) {
        this.microregionId = microregionId;
    }

    /**
     * Gets the text description of the address found
     * @return Text description of the address found
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the text description of the address found
     * @param text Text description of the address found
     */
    public void setText(String text) {
        this.text = text;
    }

}
