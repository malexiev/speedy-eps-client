
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
 *         &lt;element name="foreignParcelNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="packId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="parcelId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="seqNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="size" type="{http://ver01.eps.speedy.sirma.com/}size" minOccurs="0"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 *  @since 1.0.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramParcelInfo", propOrder = {
	"foreignParcelNumber",
    "packId",
    "parcelId",
    "seqNo",
    "size",
    "weight"
})
public class ParamParcelInfo {

	/**
	 * Foreign parcel number
	 * MANDATORY: YES
	 * @since 2.5.0
	 */
	protected String foreignParcelNumber;
	
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
     * Parcel size
     * MANDATORY: if pallet service is specified
     * @since 2.3.0
     */
    protected Size size;
    
    /**
     * Parcel weight
     * MANDATORY: if pallet service is specified
     * @since 2.3.0
     */
    protected Double weight;

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

    /**
     * Gets the parcel's size
     * @return Parcel's size
     * @since 2.3.0
     */
    public Size getSize() {
        return size;
    }

    /**
     * Sets parcel's size
     * @param size Parcel's size
     * @since 2.3.0
     */
    public void setSize(Size size) {
        this.size = size;
    }
    
    /**
     * Gets the parcel's weight
     * @return Parcel's weight
     * @since 2.3.0
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * Sets parcel's weight
     * @param weight Parcel's weight
     * @since 2.3.0
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }
    
    /**
     * Get foreign parcel number
     * @return Foreign parcel number
     * @since 2.5.0
     */
 	public String getForeignParcelNumber() {
 		return foreignParcelNumber;
 	}
 		
 	/**
 	 * Set foreign parcel number
 	 * @param foreignParcelNumber Foreign parcel number
 	 * @since 2.5.0
 	 */
 	public void setForeignParcelNumber(String foreignParcelNumber) {
 		this.foreignParcelNumber = foreignParcelNumber;
 	}
}
