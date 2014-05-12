
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
 *         &lt;element name="serializedAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 * <p>Instances of this class are used as parameters on web service method calls for picking calculation and registration
 *
 * <p>When address is required (i.e. when clientId is null), at least one of the following rules must be met:
 * •not empty street (ID or Type&Name) and (streetNo or blockNo);
 * •not empty quarter (ID or Type&Name) and (streetNo or blockNo);
 * •not empty common object;
 * •not empty addressNote.
 * 
 * @since 1.0.0
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
    "serializedAddress",
    "siteId",
    "streetId",
    "streetName",
    "streetNo",
    "streetType"
})
public class ParamAddress {

	/**
     * Address note. Max size is 200 symbols.
     * MANDATORY: NO
     */
    protected String addressNote;
    
    /**
     * Appartment No. Max size is 10 symbols.
     * MANDATORY: NO
     */
    protected String apartmentNo;
    
    /**
     * Block No. Max size is 32 symbols.
     * MANDATORY: NO
     */
    protected String blockNo;
    
    /**
     * Common object ID
     * MANDATORY: NO
     */
    protected Long commonObjectId;
    
    /**
     * GIS coordinates - X
     * MANDATORY: NO
     */
    protected Double coordX;
    
    /**
     * GIS coordinates - Y
     * MANDATORY: NO
     */
    protected Double coordY;
    
    /**
     * Entrance No. Max size is 10 symbols.
     * MANDATORY: NO
     */    
    protected String entranceNo;
    
    /**
     * Floor No. Max size is 10 symbols.
     * MANDATORY: NO
     */
    protected String floorNo;
    
    /**
     * Quarter ID
     * MANDATORY: NO
     */
    protected Long quarterId;
    
    /**
     * Quarter name. Max size is 50 symbols.
     * MANDATORY: NO
     */
    protected String quarterName;
    
    /**
     * Quarter type. Max size is 15 symbols.
     * MANDATORY: NO
     */    
    protected String quarterType;
    
    /**
     * Site ID
     * MANDATORY: YES
     */
    protected long siteId;
    
    /**
     * Street ID
     * MANDATORY: NO
     */
    protected Long streetId;
    
    /**
    * Street name. Max size is 50 symbols.
    * MANDATORY: NO
    */
    protected String streetName;
    
    /**
     * Street No. Max size is 10 symbols.
     * MANDATORY: NO
     */
    protected String streetNo;
    
    /**
     * Street type. Max size is 15 symbols.
     * MANDATORY: NO
     */
    protected String streetType;
    
    /**
     * Serialized address
     * MANDATORY: NO
     * @since 2.3.0
     */
    protected String serializedAddress;

    /**
     * Gets address note
     * @return Address note
     */
    public String getAddressNote() {
        return addressNote;
    }

    /**
     * Sets address note.
     * Max size is 200 symbols
     * @param addressNote Address note  
     */
    public void setAddressNote(String addressNote) {
        this.addressNote = addressNote;
    }

    /**
     * Gets the apartment No
     * @return Appartment No
     *     
     */
    public String getApartmentNo() {
        return apartmentNo;
    }

    /**
     * Sets the apartment No.
     * Max size is 10 symbols
     * @param apartmentNo Appartment No
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
     * Sets the block No.
     * Max size is 32 symbols
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
     * Gets the GPS coordX
     * @return GPS coord X
     */
    public Double getCoordX() {
        return coordX;
    }

    /**
     * Sets the GPS coordX 
     * @param coordX GPS coord X
     */
    public void setCoordX(Double coordX) {
        this.coordX = coordX;
    }

    /**
     * Gets the GPS coordY
     * @return GPS coord Y
     */
    public Double getCoordY() {
        return coordY;
    }

    /**
     * Sets the GPS coordY
     * @param coordY GPS coord Y
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
     * Sets the entrance No.
     * Max size is 10 symbols
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
     * Sets the floor No.
     * Max size is 10 symbols
     * @param floorNo Floor No
     */
    public void setFloorNo(String floorNo) {
        this.floorNo = floorNo;
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
     * @param quarterId Quarter id
     */
    public void setQuarterId(Long quarterId) {
        this.quarterId = quarterId;
    }

    /**
     * Gets quarter name
     * @return Quarter name
     */
    public String getQuarterName() {
        return quarterName;
    }

    /**
     * Sets the quarter name.
     * Max size is 50 symbols
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
     * Sets the quarter type.
     * Max size is 15 symbols
     * @param quarterType Quarter type
     */
    public void setQuarterType(String quarterType) {
        this.quarterType = quarterType;
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
     * @param siteId site id
     */
    public void setSiteId(long siteId) {
        this.siteId = siteId;
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
     * Sets the street name.
     * Max size is 50 symbols
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
     * Sets the street type.
     * Max size is 15 symbols
     * @param streetType Street type
     */
    public void setStreetType(String streetType) {
        this.streetType = streetType;
    }
    
    /**
     * Get serialized address
     * @return Serialized address
     */
    public String getSerializedAddress() {
        return serializedAddress;
    }

    /**
     * Set serialized address
     * If not null and not empty other fields are ignored. The address is built from this string
     * @param serializedAddress Serialized address
     */
    public void setSerializedAddress(String serializedAddress) {
        this.serializedAddress = serializedAddress;
    }
}
