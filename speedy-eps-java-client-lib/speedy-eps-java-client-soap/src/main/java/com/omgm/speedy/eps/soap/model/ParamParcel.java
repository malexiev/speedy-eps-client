
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paramParcel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paramParcel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billOfLading" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="packId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="parcelId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="size" type="{http://ver01.eps.speedy.sirma.com/}size" minOccurs="0"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * <p>Instances of this class are used to define parcels in pickings
 * 
 * @since 1.0.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramParcel", propOrder = {
    "billOfLading",
    "packId",
    "parcelId",
    "size",
    "weight"
})
public class ParamParcel {

	/**
     * The BOL to which the parcel is to be added
     * MANDATORY: YES
     */
    protected long billOfLading;
    
    /**
     * Packing ID
     * MANDATORY: NO
     */
    protected Long packId;
    
    /**
     * Parcel ID (if empty, the server will generate one)
     * MANDATORY: NO
     */
    protected Long parcelId;
    
    /**
     * Parcel size
     * MANDATORY: YES
     */
    protected Size size;
    
    /**
     * Real weight (kg)
     * MANDATORY: NO
     */
    protected double weight;

    /**
     * Gets the BOL to which the parcel is to be added
     * @return The BOL to which the parcel is to be added
     */
    public long getBillOfLading() {
        return billOfLading;
    }

    /**
     * Sets the BOL to which the parcel is to be added
     * @param billOfLading The BOL to which the parcel is to be added
     */
    public void setBillOfLading(long billOfLading) {
        this.billOfLading = billOfLading;
    }

    /**
     * Gets the packing ID.
     * @return Packing ID
     */
    public Long getPackId() {
        return packId;
    }

    /**
     * Sets the packing ID
     * @param packId Packing ID
     */
    public void setPackId(Long packId) {
        this.packId = packId;
    }

    /**
     * Gets parcel id.
     * @return Parcel id
     */
    public Long getParcelId() {
        return parcelId;
    }

    /**
     * Sets the parcel id (if empty, the server will generate one)
     * @param parcelId Parcel id
     */
    public void setParcelId(Long parcelId) {
        this.parcelId = parcelId;
    }

    /**
     * Gets the parcel size
     * @return Parcel size
     */
    public Size getSize() {
        return size;
    }

    /**
     * Sets the parcel size
     * @param size Parcel size
     */
    public void setSize(Size size) {
        this.size = size;
    }

    /**
     * Gets the real weight (kg)
     * @return Real weight in kg
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets the real weight in kg
     * @param weight Real weight (kg)
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

}
