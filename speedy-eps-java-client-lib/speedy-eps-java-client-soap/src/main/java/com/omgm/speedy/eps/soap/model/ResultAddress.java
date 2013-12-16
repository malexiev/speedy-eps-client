
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="apartmentNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="blockNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commonObjectId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="commonObjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entranceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="floorNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="municipalityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quarterId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="quarterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quarterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siteId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="siteName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="siteType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 * <p>Instances of this class are returned as a result of web service method calls for addresses
 * 
 * @since 1.0.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultAddress", propOrder = {
    "addressNote",
    "apartmentNo",
    "blockNo",
    "commonObjectId",
    "commonObjectName",
    "entranceNo",
    "floorNo",
    "municipalityName",
    "postCode",
    "quarterId",
    "quarterName",
    "quarterType",
    "regionName",
    "siteId",
    "siteName",
    "siteType",
    "streetId",
    "streetName",
    "streetNo",
    "streetType"
})
public class ResultAddress {

	/**
     * Address note
     */
    protected String addressNote;
    
    /**
     * Appartment No
     */
    protected String apartmentNo;
    
    /**
     * Block No
     */
    protected String blockNo;
    
    /**
     * Common object ID
     */
    protected Long commonObjectId;
    
    /**
     * Common object name
     */
    protected String commonObjectName;
    
    /**
     * Entrance No
     */
    protected String entranceNo;
    
    /**
     * Floor No
     */
    protected String floorNo;
    
    /**
     * Municpality name
     */
    protected String municipalityName;
    
    /**
     * Post code
     */
    protected String postCode;
    
    /**
     * Quarter ID
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
     * Region name
     */
    protected String regionName;
    
    /**
     * Site id
     */
    protected long siteId;
    
    /**
     * Site name
     */
    protected String siteName;
    
    /**
     * Site type
     */
    protected String siteType;
    
    /**
     * Street ID
     */
    protected Long streetId;
    
    /**
     * Street name
     */
    protected String streetName;
    
    /**
     * Street No
     */
    protected String streetNo;
    
    /**
     * Street type
     */
    protected String streetType;

    /**
     * Gets address note
     * @return Address note
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
     * Gets the common object id
     * @return Common object id
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
     * Gets the municipality name
     * @return Municipality name
     */
    public String getMunicipalityName() {
        return municipalityName;
    }

    /**
     * Sets the municipality name
     * @param municipalityName Municipality name
     */
    public void setMunicipalityName(String municipalityName) {
        this.municipalityName = municipalityName;
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
     * Gets the quarter id
     * @return Quarter id
     */
    public Long getQuarterId() {
        return quarterId;
    }

    /**
     * Sets the quarter id
     * @param quarterId quarter id
     */
    public void setQuarterId(Long quarterId) {
        this.quarterId = quarterId;
    }

    /**
     * Gets the quarter name
     * @return Quarter name
     */
    public String getQuarterName() {
        return quarterName;
    }

    /**
     * Sets the quarter name
     * @param quarterName Quarter name
     */
    public void setQuarterName(String quarterName) {
        this.quarterName = quarterName;
    }

    /**
     * Gets the quarter type 
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
     * Gets the region name
     * @return Region name
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * Sets the region name
     * @param regionName Region name
     */
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    /**
     * Gets the site id
     * @return Site id
     */
    public long getSiteId() {
        return siteId;
    }

    /**
     * Sets the site id
     * @param siteId Site id
     */
    public void setSiteId(long siteId) {
        this.siteId = siteId;
    }

    /**
     * Gets the site name
     * @return Site name
     */
    public String getSiteName() {
        return siteName;
    }

    /**
     * Sets the site name
     * @param siteName Site name
     */
    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    /**
     * Gets the site type
     * @return Site type
     */
    public String getSiteType() {
        return siteType;
    }

    /**
     * Sets the site type
     * @param siteType Site type
     */
    public void setSiteType(String siteType) {
        this.siteType = siteType;
    }

    /**
     * Gets the street id
     * @return Street id
     */
    public Long getStreetId() {
        return streetId;
    }

    /**
     * Sets the street id
     * @param streetId Street id
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
