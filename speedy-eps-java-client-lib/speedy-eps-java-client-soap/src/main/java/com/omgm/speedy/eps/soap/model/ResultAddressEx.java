
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * <p>Instances of this class are returned as a result of web service method calls for addresses. 
 * The structure is exetended with full address represenation and GPS coordinates
 * 
 * @since 2.2.0
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
    "streetType"
})
public class ResultAddressEx {

	/**
     * Address note
     */
    protected String addressNote;
    
    /**
     * Apartment number
     */
    protected String apartmentNo;
    
    /**
     * Block number
     */
    protected String blockNo;
    
    /**
     * Common object identifier in Speedy address nomenclature
     */
    protected Long commonObjectId;
    
    /**
     * Common object name
     */
    protected String commonObjectName;
    
    /**
     * GPS coordinates type
     */
    protected Integer coordTypeId;
    
    /**
     * GPS X coordinate
     */
    protected Double coordX;
    
    /**
     * GPS Y coordinate
     */
    protected Double coordY;
    
    /**
     * Entrance number
     */
    protected String entranceNo;
    
    /**
     * Floor number
     */
    protected String floorNo;
    
    /**
     * Full address text, suitable for UI 
     */
    protected String fullAddressString;
    
    /**
     * Post code
     */
    protected String postCode;
    
    /**
     * Quarter identifier in Speedy address nomenclature
     */
    protected Long quarterId;
    
    /**
     * Quarter name
     */
    protected String quarterName;
    
    /**
     * Quarter type
     */
    protected String quarterType;
    
    /**
     * Address site structure
     */
    protected ResultSite resultSite;
    
    /**
     * Street identifier in Speedy address nomenclature
     */
    protected Long streetId;
    
    /**
     * Street name
     */
    protected String streetName;
    
    /**
     * Street number
     */
    protected String streetNo;
    
    /**
     * Street type
     */
    protected String streetType;

    /**
     * Gets the address note
     * @return address note
     */
    public String getAddressNote() {
        return addressNote;
    }

    /**
     * Sets the address note
     * @param addressNote Address note
     */
    public void setAddressNote(String addressNote) {
        this.addressNote = addressNote;
    }

    /**
     * Gets the apartment No
     * @return Apartment No
     */
    public String getApartmentNo() {
        return apartmentNo;
    }

    /**
     * Sets the apartment No
     * @param apartmentNo Apartment No
     */
    public void setApartmentNo(String apartmentNo) {
        this.apartmentNo = apartmentNo;
    }

    /**
     * Gets the block No
     * @return Block No
     */
    public String getBlockNo() {
        return blockNo;
    }

    /**
     * Sets the block No
     * @param blockNo Block No
     */
    public void setBlockNo(String blockNo) {
        this.blockNo = blockNo;
    }

    /**
     * Gets the common object id in Speedy address nomenclature
     * @return Common object ID
     */
    public Long getCommonObjectId() {
        return commonObjectId;
    }

    /**
     * Sets the common object id
     * @param commonObjectId Common object id
     */
    public void setCommonObjectId(Long commonObjectId) {
        this.commonObjectId = commonObjectId;
    }

    /**
     * Gets the common object name
     * @return Common object name
     */
    public String getCommonObjectName() {
        return commonObjectName;
    }

    /**
     * Sets the common object name
     * @param commonObjectName Common object name
     */
    public void setCommonObjectName(String commonObjectName) {
        this.commonObjectName = commonObjectName;
    }

    /**
     * Gets the GPS coordinate type
     * @return GPS coordinate type
     */
    public Integer getCoordTypeId() {
        return coordTypeId;
    }

    /**
     * Sets the GPS coordinate type
     * @param coordTypeId GPS coordinate type
     */
    public void setCoordTypeId(Integer coordTypeId) {
        this.coordTypeId = coordTypeId;
    }

    /**
     * Gets the GPS X coordinate
     * @return GPS X coordinate
     */
    public Double getCoordX() {
        return coordX;
    }

    /**
     * Sets the GPS X coordinate
     * @param coordX GPS X coordinate
     */
    public void setCoordX(Double coordX) {
        this.coordX = coordX;
    }

    /**
     * Gets the GPS Y coordinate
     * @return GPS Y coordinate
     */
    public Double getCoordY() {
        return coordY;
    }

    /**
     * Sets the GPS Y coordinate
     * @param coordY GPS Y coordinate
     */
    public void setCoordY(Double coordY) {
        this.coordY = coordY;
    }

    /**
     * Gets the entrance No
     * @return Entrance No
     */
    public String getEntranceNo() {
        return entranceNo;
    }

    /**
     * Sets the entrance No
     * @param entranceNo Entrance No
     */
    public void setEntranceNo(String entranceNo) {
        this.entranceNo = entranceNo;
    }

    /**
     * Gets the floor No
     * @return Floor No
     */
    public String getFloorNo() {
        return floorNo;
    }

    /**
     * Sets the floor No
     * @param floorNo Floor No
     */
    public void setFloorNo(String floorNo) {
        this.floorNo = floorNo;
    }

    /**
     * Gets the full address text, suitable for UI
     * @return Full address text
     */
    public String getFullAddressString() {
        return fullAddressString;
    }

    /**
     * Sets the full address text, suitable for UI
     * @param fullAddressString Full address text
     */
    public void setFullAddressString(String fullAddressString) {
        this.fullAddressString = fullAddressString;
    }

    /**
     * Gets the post code
     * @return Post code
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets the post code
     * @param postCode Post code
     */
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    /**
     * Gets the quarter identifier in Speedy address nomenclature
     * @return Qaurter identifier
     */
    public Long getQuarterId() {
        return quarterId;
    }

    /**
     * Sets the quarter identifier
     * @param quarterId Quarter identifier
     */
    public void setQuarterId(Long quarterId) {
        this.quarterId = quarterId;
    }

    /**
     * Gets the qaurter name
     * @return Qaurter name
     */
    public String getQuarterName() {
        return quarterName;
    }

    /**
     * Sets the qaurter name
     * @param quarterName Qaurter name
     */
    public void setQuarterName(String quarterName) {
        this.quarterName = quarterName;
    }

    /**
     * Gets quarter type
     * @return Quarter type
     */
    public String getQuarterType() {
        return quarterType;
    }

    /**
     * Sets the quarter type
     * @param quarterType Quarter type
     */
    public void setQuarterType(String quarterType) {
        this.quarterType = quarterType;
    }

    /**
     * Gets the address site details
     * @return Address site details
     */
    public ResultSite getResultSite() {
        return resultSite;
    }

    /**
     * Sets the address site details
     * @param resultSite Address site details
     */
    public void setResultSite(ResultSite resultSite) {
        this.resultSite = resultSite;
    }

    /**
     * Gets the street identifier in Speedy address nomenclature
     * @return Street identifier
     */
    public Long getStreetId() {
        return streetId;
    }

    /**
     * Sets the street identifier in Speedy address nomenclature
     * @param streetId Street identifier 
     */
    public void setStreetId(Long streetId) {
        this.streetId = streetId;
    }

    /**
     * Gets the street name
     * @return Street name
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Sets the street name
     * @param streetName Street name
     */
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    /**
     * Gets the street No
     * @return Street No
     */
    public String getStreetNo() {
        return streetNo;
    }

    /**
     * Sets the street No
     * @param streetNo Street No
     */
    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    /**
     * Gets the street type
     * @return Street type
     */
    public String getStreetType() {
        return streetType;
    }

    /**
     * Sets the street type
     * @param streetType Street type
     */
    public void setStreetType(String streetType) {
        this.streetType = streetType;
    }

}
