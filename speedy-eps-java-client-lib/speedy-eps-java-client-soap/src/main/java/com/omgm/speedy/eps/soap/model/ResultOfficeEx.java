
package com.omgm.speedy.eps.soap.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="maxParcelDimensions" type="{http://ver01.eps.speedy.sirma.com/}size" minOccurs="0"/>
 *         &lt;element name="maxParcelWeight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="workingTimeSchedule" type="{http://ver01.eps.speedy.sirma.com/}resultWorkingTime" maxOccurs="unbounded" minOccurs="0"/>
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
    "workingTimeTo",
    "maxParcelDimensions",
    "maxParcelWeight",
    "workingTimeSchedule"
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
     * Max parcel dimensions (size)
     */
    protected Size maxParcelDimensions;
    
    /**
     * Max parcel weight
     */
    protected Double maxParcelWeight;
    
    /**
     * Working time schedule
     */
    @XmlElement(nillable = true)
    protected List<ResultWorkingTime> workingTimeSchedule;
    
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

    /**
     * Gets the maximum parcel dimensions (size)
     * @return Maximum parcel dimensions (size)
     * @since 2.6.0
     */
    public Size getMaxParcelDimensions() {
        return maxParcelDimensions;
    }

    /**
     * Sets the maximum parcel dimensions (size)
     * @param maxParcelDimensions Maximum parcel dimensions (size)
     * @since 2.6.0    
     */
    public void setMaxParcelDimensions(Size maxParcelDimensions) {
        this.maxParcelDimensions = maxParcelDimensions;
    }

    /**
     * Gets the maximum parcel weight
     * @return Maximum parcel weight
     * @since 2.6.0    
     */
    public Double getMaxParcelWeight() {
        return maxParcelWeight;
    }

    /**
     * Sets the maximum parcel weight
     * @param maxParcelWeight Maximum parcel weight
     * @since 2.6.0    
     */
    public void setMaxParcelWeight(Double maxParcelWeight) {
        this.maxParcelWeight = maxParcelWeight;
    }

    /**
     * Gets the workingTimeSchedule
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workingTimeSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkingTimeSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResultWorkingTime }
     * 
     * @since 2.6.0
     */
    public List<ResultWorkingTime> getWorkingTimeSchedule() {
        if (workingTimeSchedule == null) {
            workingTimeSchedule = new ArrayList<ResultWorkingTime>();
        }
        return this.workingTimeSchedule;
    }
}
