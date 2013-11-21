
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paramAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paramAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apartmentNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="blockNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commonObjectId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="coordX" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="coordY" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="entranceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="floorNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quarterId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="quarterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quarterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siteId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="streetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="streetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramAddress", propOrder = {
    "addressNote",
    "apartmentNo",
    "blockNo",
    "commonObjectId",
    "coordX",
    "coordY",
    "entranceNo",
    "floorNo",
    "quarterId",
    "quarterName",
    "quarterType",
    "siteId",
    "streetId",
    "streetName",
    "streetNo",
    "streetType"
})
public class ParamAddress {

    protected String addressNote;
    protected String apartmentNo;
    protected String blockNo;
    protected Long commonObjectId;
    protected Double coordX;
    protected Double coordY;
    protected String entranceNo;
    protected String floorNo;
    protected Long quarterId;
    protected String quarterName;
    protected String quarterType;
    protected long siteId;
    protected Long streetId;
    protected String streetName;
    protected String streetNo;
    protected String streetType;

    /**
     * Gets the value of the addressNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressNote() {
        return addressNote;
    }

    /**
     * Sets the value of the addressNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressNote(String value) {
        this.addressNote = value;
    }

    /**
     * Gets the value of the apartmentNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApartmentNo() {
        return apartmentNo;
    }

    /**
     * Sets the value of the apartmentNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApartmentNo(String value) {
        this.apartmentNo = value;
    }

    /**
     * Gets the value of the blockNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockNo() {
        return blockNo;
    }

    /**
     * Sets the value of the blockNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockNo(String value) {
        this.blockNo = value;
    }

    /**
     * Gets the value of the commonObjectId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCommonObjectId() {
        return commonObjectId;
    }

    /**
     * Sets the value of the commonObjectId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCommonObjectId(Long value) {
        this.commonObjectId = value;
    }

    /**
     * Gets the value of the coordX property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCoordX() {
        return coordX;
    }

    /**
     * Sets the value of the coordX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCoordX(Double value) {
        this.coordX = value;
    }

    /**
     * Gets the value of the coordY property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCoordY() {
        return coordY;
    }

    /**
     * Sets the value of the coordY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCoordY(Double value) {
        this.coordY = value;
    }

    /**
     * Gets the value of the entranceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntranceNo() {
        return entranceNo;
    }

    /**
     * Sets the value of the entranceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntranceNo(String value) {
        this.entranceNo = value;
    }

    /**
     * Gets the value of the floorNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloorNo() {
        return floorNo;
    }

    /**
     * Sets the value of the floorNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloorNo(String value) {
        this.floorNo = value;
    }

    /**
     * Gets the value of the quarterId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQuarterId() {
        return quarterId;
    }

    /**
     * Sets the value of the quarterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQuarterId(Long value) {
        this.quarterId = value;
    }

    /**
     * Gets the value of the quarterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuarterName() {
        return quarterName;
    }

    /**
     * Sets the value of the quarterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuarterName(String value) {
        this.quarterName = value;
    }

    /**
     * Gets the value of the quarterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuarterType() {
        return quarterType;
    }

    /**
     * Sets the value of the quarterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuarterType(String value) {
        this.quarterType = value;
    }

    /**
     * Gets the value of the siteId property.
     * 
     */
    public long getSiteId() {
        return siteId;
    }

    /**
     * Sets the value of the siteId property.
     * 
     */
    public void setSiteId(long value) {
        this.siteId = value;
    }

    /**
     * Gets the value of the streetId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStreetId() {
        return streetId;
    }

    /**
     * Sets the value of the streetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStreetId(Long value) {
        this.streetId = value;
    }

    /**
     * Gets the value of the streetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * Gets the value of the streetNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetNo() {
        return streetNo;
    }

    /**
     * Sets the value of the streetNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetNo(String value) {
        this.streetNo = value;
    }

    /**
     * Gets the value of the streetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetType() {
        return streetType;
    }

    /**
     * Sets the value of the streetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetType(String value) {
        this.streetType = value;
    }

}
