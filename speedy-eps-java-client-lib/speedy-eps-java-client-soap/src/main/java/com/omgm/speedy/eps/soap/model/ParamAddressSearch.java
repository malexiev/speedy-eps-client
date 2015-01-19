
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paramAddressSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paramAddressSearch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="blockNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commonObjectId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="entranceNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quarterId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="siteId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="streetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="streetNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnCityCenterIfNoAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>         
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * <p>Used as a search criteria in address search methods
 * 
 * @since 1.0.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramAddressSearch", propOrder = {
    "blockNo",
    "commonObjectId",
    "entranceNo",
    "quarterId",
    "siteId",
    "streetId",
    "streetNo",
    "returnCityCenterIfNoAddress"
})
public class ParamAddressSearch {

	/**
     * Block No/name
     * MANDATORY: NO
     */
    protected String blockNo;
    
    /**
     * Common object ID
     * MANDATORY: NO
     */
    protected Long commonObjectId;
    
    /**
     * Entrance
     * MANDATORY: NO
     */
    protected String entranceNo;
    
    /**
     * Quarter ID
     * MANDATORY: NO
     */
    protected Long quarterId;
    
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
     * Street No
     * MANDATORY: NO
     */
    protected String streetNo;
    
    /**
     * Return city center if no address option flag
     * MANDATORY: NO
     * @since 2.6.0
     */
    private boolean returnCityCenterIfNoAddress; 

    /**
     * Gets the blockNo.
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
     * Gets the entranceNo
     * @return Entrance No
     */
    public String getEntranceNo() {
        return entranceNo;
    }

    /**
     * Sets the entranceNo
     * @param entranceNo Entrance No
     */
    public void setEntranceNo(String entranceNo) {
        this.entranceNo = entranceNo;
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
     * Gets the siteId
     * @return Site id
     */
    public long getSiteId() {
        return siteId;
    }

    /**
     * Sets the siteId
     * @param siteId Site id
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
     * Gets streetNo
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
     * Get return city center if no address option flag
     * @return return city center if no address option flag
     * @since 2.6.0
     */
    public boolean isReturnCityCenterIfNoAddress() {
		return returnCityCenterIfNoAddress;
	}

    /**
     * Sets the return city center if no address option flag 
     * @param returnCityCenterIfNoAddress Option flag value
     * @since 2.6.0
     */
	public void setReturnCityCenterIfNoAddress(boolean returnCityCenterIfNoAddress) {
		this.returnCityCenterIfNoAddress = returnCityCenterIfNoAddress;
	}
}
