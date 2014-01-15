
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultOfficeEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultOfficeEx">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://ver01.eps.speedy.sirma.com/}resultAddressEx" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siteId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="workingTimeFrom" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="workingTimeHalfFrom" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="workingTimeHalfTo" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="workingTimeTo" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * <p>Instances of this class are returned as a result of Speedy web service queries for offices
 * This structure returns ResultAddressEx instead of ValueAddress structure
 * 
 * @since 2.2.0
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultOfficeEx", propOrder = {
    "address",
    "id",
    "name",
    "siteId",
    "workingTimeFrom",
    "workingTimeHalfFrom",
    "workingTimeHalfTo",
    "workingTimeTo"
})
public class ResultOfficeEx {

	/**
     * Office address
     */
    protected ResultAddressEx address;
    
    /**
     * Office ID
     */
    protected long id;
    
    /**
     * Office name
     */
    protected String name;
    
    /**
     * Serving site ID
     */
    protected Long siteId;
    
    /**
     * Working time for FULL working days - FROM
     */
    protected Short workingTimeFrom;
    
    /**
     * Working time for HALF working days - FROM
     */
    protected Short workingTimeHalfFrom;
    
    /**
     * Working time for HALF working days - TO
     */
    protected Short workingTimeHalfTo;
    
    /**
     * Working time for FULL working days - TO
     */
    protected Short workingTimeTo;

    /**
     * Gets the office address
     * @return Office address
     */
    public ResultAddressEx getAddress() {
        return address;
    }

    /**
     * Sets the office address
     * @param value Office address
     */
    public void setAddress(ResultAddressEx value) {
        this.address = value;
    }

    /**
     * Gets office identifier in Speedy nomenclature
     * @return Office identifier
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the office identifier
     * @param id Office identifier
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Gets the office name
     * @return Office name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the office name
     * @param name Office name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the serving site identifier in Speedy address nomenclature
     * @return Serving site identifier
     */
    public Long getSiteId() {
        return siteId;
    }

    /**
     * Sets the serving site identifier
     * @param siteId Serving site identifier
     */
    public void setSiteId(Long siteId) {
        this.siteId = siteId;
    }

    /**
     * Gets the office start working time of normal working day.
     * Format is "HHmm"
     * @return Office start working time of normal working day
     */
    public Short getWorkingTimeFrom() {
        return workingTimeFrom;
    }

    /**
     * Sets the office start working time of normal working day
     * @param workingTimeFrom Office start working time of normal working day
     */
    public void setWorkingTimeFrom(Short value) {
        this.workingTimeFrom = value;
    }

    /**
     * Gets the office start working time of half-working day.
     * Format is "HHmm"
     * @return Office start working time of half-working day
     */
    public Short getWorkingTimeHalfFrom() {
        return workingTimeHalfFrom;
    }

    /**
     * Sets the office start working time of half-working day
     * @param workingTimeHalfFrom Office start working time of half-working day
     */
    public void setWorkingTimeHalfFrom(Short value) {
        this.workingTimeHalfFrom = value;
    }

    /**
     * Gets the office end working time of half-working day.
     * Format is "HHmm"
     * @return Office end working time of half-working day
     */
    public Short getWorkingTimeHalfTo() {
        return workingTimeHalfTo;
    }

    /**
     * Sets the office end working time of half-working day
     * @param workingTimeHalfTo Office end working time of half-working day
     */
    public void setWorkingTimeHalfTo(Short value) {
        this.workingTimeHalfTo = value;
    }

    /**
     * Gets the office end working time of normal working day.
     * Format is "HHmm"
     * @return Office end working time of normal working day
     */
    public Short getWorkingTimeTo() {
        return workingTimeTo;
    }

    /**
     * Sets the office end working time of normal working day
     * @param workingTimeTo Office end working time of normal working day
     */
    public void setWorkingTimeTo(Short value) {
        this.workingTimeTo = value;
    }

}
