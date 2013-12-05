
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
     * Gets addressNote
     * @return address note
     */
    public String getAddressNote() {
        return addressNote;
    }

    /**
     * Sets addressNote
     * @param addressNote Address note
     */
    public void setAddressNote(String addressNote) {
        this.addressNote = addressNote;
    }

    /**
     * Gets the apartmentNo.
     * @return Appartment No
     *     
     */
    public String getApartmentNo() {
        return apartmentNo;
    }

    /**
     * Sets the apartmentNo
     * @param apartmentNo Appartment No
     */
    public void setApartmentNo(String apartmentNo) {
        this.apartmentNo = apartmentNo;
    }

    /**
     * Gets the blockNo
     * @return Block No
     */
    public String getBlockNo() {
        return blockNo;
    }

    /**
     * Sets the blockNo
     * @param blockNo Block No
     */
    public void setBlockNo(String blockNo) {
        this.blockNo = blockNo;
    }

    /**
     * Gets the commonObjectId
     * @return Common object id
     */
    public Long getCommonObjectId() {
        return commonObjectId;
    }

    /**
     * Sets the commonObjectId
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
     * Gets the GPS coordY.
     * @return GPS coord Y
     */
    public Double getCoordY() {
        return coordY;
    }

    /**
     * Sets the value of the coordY property.
     * @param coordY GPS coord Y
     */
    public void setCoordY(Double coordY) {
        this.coordY = coordY;
    }

    /**
     * Gets the entranceNo
     * @return Entrance No
     */
    public String getEntranceNo() {
        return entranceNo;
    }

    /**
     * Sets the entranceNo.
     * @param entranceNo Entrance No
     */
    public void setEntranceNo(String entranceNo) {
        this.entranceNo = entranceNo;
    }

    /**
     * Gets the floorNo.
     * @return Floor No
     */
    public String getFloorNo() {
        return floorNo;
    }

    /**
     * Sets the floorNo.
     * @param floorNo Floor No
     */
    public void setFloorNo(String floorNo) {
        this.floorNo = floorNo;
    }

    /**
     * Gets the quarterId
     * @return Quarter id
     */
    public Long getQuarterId() {
        return quarterId;
    }

    /**
     * Sets the quarterId
     * @param quarterId Quarter id
     */
    public void setQuarterId(Long quarterId) {
        this.quarterId = quarterId;
    }

    /**
     * Gets quarterName
     * @return Quarter name
     */
    public String getQuarterName() {
        return quarterName;
    }

    /**
     * Sets the quarterName
     * @param quarterName
     */
    public void setQuarterName(String quarterName) {
        this.quarterName = quarterName;
    }

    /**
     * Gets the quarterType
     * @return Quarter type
     */
    public String getQuarterType() {
        return quarterType;
    }

    /**
     * Sets the quarterType
     * @param quarterType Quarter type
     */
    public void setQuarterType(String quarterType) {
        this.quarterType = quarterType;
    }

    /**
     * Gets the siteId.
     * @return Site id
     */
    public long getSiteId() {
        return siteId;
    }

    /**
     * Sets the siteId
     * @param siteId site id
     */
    public void setSiteId(long siteId) {
        this.siteId = siteId;
    }

    /**
     * Gets the streetId
     * @return Street id
     */
    public Long getStreetId() {
        return streetId;
    }

    /**
     * Sets the streetId
     * @param streetId Street id
     */
    public void setStreetId(Long streetId) {
        this.streetId = streetId;
    }

    /**
     * Gets the streetName
     * @return Street name
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Sets the streetName
     * @param streetName Street name
     */
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    /**
     * Gets the streetNo
     * @return Street No
     */
    public String getStreetNo() {
        return streetNo;
    }

    /**
     * Sets the streetNo
     * @param streetNo Street No
     */
    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    /**
     * Gets the streetType
     * @return Street type
     */
    public String getStreetType() {
        return streetType;
    }

    /**
     * Sets the streetType 
     * @param streetType Street type
     */
    public void setStreetType(String streetType) {
        this.streetType = streetType;
    }
}
