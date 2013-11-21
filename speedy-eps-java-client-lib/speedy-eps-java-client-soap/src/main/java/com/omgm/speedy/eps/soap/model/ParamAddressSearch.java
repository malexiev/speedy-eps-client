
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramAddressSearch", propOrder = {
    "blockNo",
    "commonObjectId",
    "entranceNo",
    "quarterId",
    "siteId",
    "streetId",
    "streetNo"
})
public class ParamAddressSearch {

    protected String blockNo;
    protected Long commonObjectId;
    protected String entranceNo;
    protected Long quarterId;
    protected long siteId;
    protected Long streetId;
    protected String streetNo;

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

}
