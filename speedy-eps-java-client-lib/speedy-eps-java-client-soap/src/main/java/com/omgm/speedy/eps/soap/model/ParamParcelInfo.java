
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paramParcelInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paramParcelInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="packId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="parcelId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="seqNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * <p>Instances of this class are used as parameters in web service calls for picking calculation and registration
 * 
 *  @since 1.0.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramParcelInfo", propOrder = {
    "packId",
    "parcelId",
    "seqNo"
})
public class ParamParcelInfo {

	/**
     * Parcel's pack id
     * MANDATORY: YES
     */
    protected Long packId;
    
    /**
     * Parcel ID
     * MANDATORY: YES
     */
    protected long parcelId;
    
    /**
     * Parcel's sequence number (2, 3, ...)
     * MANDATORY: YES
     */
    protected int seqNo;

    /**
     * Gets the parcel's pack id
     * @return Parcel's pack id
     */
    public Long getPackId() {
        return packId;
    }

    /**
     * Sets the parcel's pack id
     * @param packId Parcel's pack id
     */
    public void setPackId(Long packId) {
        this.packId = packId;
    }

    /**
     * Gets the parcel id
     * @return Parcel id
     */
    public long getParcelId() {
        return parcelId;
    }

    /**
     * Sets the parcelId
     * @param parcelId Parcel id
     */
    public void setParcelId(long parcelId) {
        this.parcelId = parcelId;
    }

    /**
     * Gets the parcel's sequence number
     * @return Parcel's sequence number
     */
    public int getSeqNo() {
        return seqNo;
    }

    /**
     * Sets the parcel's serial number (2, 3, ...)
     * Parcel with number 1 is the default parcel for BOL
     * @return Parcel's serial number
     */
    public void setSeqNo(int value) {
        this.seqNo = value;
    }

}
