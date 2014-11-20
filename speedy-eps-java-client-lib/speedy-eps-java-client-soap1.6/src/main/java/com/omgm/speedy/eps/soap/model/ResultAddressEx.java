
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultAddressEx complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultAddressEx">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apartmentNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="blockNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commonObjectId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="commonObjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coordTypeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="coordX" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="coordY" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="entranceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="floorNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fullAddressString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quarterId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="quarterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quarterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="resultSite" type="{http://ver01.eps.speedy.sirma.com/}resultSite" minOccurs="0"/>
 *         &lt;element name="streetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="streetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="streetType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="frnAddressLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="frnAddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultAddressEx", propOrder = {
    "addressNote",
    "apartmentNo",
    "blockNo",
    "commonObjectId",
    "commonObjectName",
    "coordTypeId",
    "coordX",
    "coordY",
    "entranceNo",
    "floorNo",
    "fullAddressString",
    "postCode",
    "quarterId",
    "quarterName",
    "quarterType",
    "resultSite",
    "streetId",
    "streetName",
    "streetNo",
    "streetType",
    "countryId",
    "frnAddressLine1",
    "frnAddressLine2",
    "stateId"
})
public class ResultAddressEx {

    protected String addressNote;
    protected String apartmentNo;
    protected String blockNo;
    protected Long commonObjectId;
    protected String commonObjectName;
    protected Integer coordTypeId;
    protected Double coordX;
    protected Double coordY;
    protected String entranceNo;
    protected String floorNo;
    protected String fullAddressString;
    protected String postCode;
    protected Long quarterId;
    protected String quarterName;
    protected String quarterType;
    protected ResultSite resultSite;
    protected Long streetId;
    protected String streetName;
    protected String streetNo;
    protected String streetType;
    protected long countryId;
    protected String frnAddressLine1;
    protected String frnAddressLine2;
    protected String stateId;

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
     * Gets the value of the commonObjectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommonObjectName() {
        return commonObjectName;
    }

    /**
     * Sets the value of the commonObjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommonObjectName(String value) {
        this.commonObjectName = value;
    }

    /**
     * Gets the value of the coordTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCoordTypeId() {
        return coordTypeId;
    }

    /**
     * Sets the value of the coordTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCoordTypeId(Integer value) {
        this.coordTypeId = value;
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
     * Gets the value of the fullAddressString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullAddressString() {
        return fullAddressString;
    }

    /**
     * Sets the value of the fullAddressString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullAddressString(String value) {
        this.fullAddressString = value;
    }

    /**
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
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
     * Gets the value of the resultSite property.
     * 
     * @return
     *     possible object is
     *     {@link ResultSite }
     *     
     */
    public ResultSite getResultSite() {
        return resultSite;
    }

    /**
     * Sets the value of the resultSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultSite }
     *     
     */
    public void setResultSite(ResultSite value) {
        this.resultSite = value;
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

    /**
     * Gets the value of the countryId property.
     * 
     */
    public long getCountryId() {
        return countryId;
    }

    /**
     * Sets the value of the countryId property.
     * 
     */
    public void setCountryId(long value) {
        this.countryId = value;
    }

    /**
     * Gets the value of the frnAddressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrnAddressLine1() {
        return frnAddressLine1;
    }

    /**
     * Sets the value of the frnAddressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrnAddressLine1(String value) {
        this.frnAddressLine1 = value;
    }

    /**
     * Gets the value of the frnAddressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrnAddressLine2() {
        return frnAddressLine2;
    }

    /**
     * Sets the value of the frnAddressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrnAddressLine2(String value) {
        this.frnAddressLine2 = value;
    }

    /**
     * Gets the value of the stateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateId() {
        return stateId;
    }

    /**
     * Sets the value of the stateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateId(String value) {
        this.stateId = value;
    }

}
