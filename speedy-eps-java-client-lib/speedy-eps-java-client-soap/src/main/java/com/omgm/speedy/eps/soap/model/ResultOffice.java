
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultOffice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultOffice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://ver01.eps.speedy.sirma.com/}valueAddress" minOccurs="0"/>
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
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultOffice", propOrder = {
    "address",
    "id",
    "name",
    "siteId",
    "workingTimeFrom",
    "workingTimeHalfFrom",
    "workingTimeHalfTo",
    "workingTimeTo"
})
public class ResultOffice {

    protected ValueAddress address;
    protected long id;
    protected String name;
    protected Long siteId;
    protected Short workingTimeFrom;
    protected Short workingTimeHalfFrom;
    protected Short workingTimeHalfTo;
    protected Short workingTimeTo;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link ValueAddress }
     *     
     */
    public ValueAddress getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueAddress }
     *     
     */
    public void setAddress(ValueAddress value) {
        this.address = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the siteId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSiteId() {
        return siteId;
    }

    /**
     * Sets the value of the siteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSiteId(Long value) {
        this.siteId = value;
    }

    /**
     * Gets the value of the workingTimeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getWorkingTimeFrom() {
        return workingTimeFrom;
    }

    /**
     * Sets the value of the workingTimeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setWorkingTimeFrom(Short value) {
        this.workingTimeFrom = value;
    }

    /**
     * Gets the value of the workingTimeHalfFrom property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getWorkingTimeHalfFrom() {
        return workingTimeHalfFrom;
    }

    /**
     * Sets the value of the workingTimeHalfFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setWorkingTimeHalfFrom(Short value) {
        this.workingTimeHalfFrom = value;
    }

    /**
     * Gets the value of the workingTimeHalfTo property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getWorkingTimeHalfTo() {
        return workingTimeHalfTo;
    }

    /**
     * Sets the value of the workingTimeHalfTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setWorkingTimeHalfTo(Short value) {
        this.workingTimeHalfTo = value;
    }

    /**
     * Gets the value of the workingTimeTo property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getWorkingTimeTo() {
        return workingTimeTo;
    }

    /**
     * Sets the value of the workingTimeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setWorkingTimeTo(Short value) {
        this.workingTimeTo = value;
    }

}
