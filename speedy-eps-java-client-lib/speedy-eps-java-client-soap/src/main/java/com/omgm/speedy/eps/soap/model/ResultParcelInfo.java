
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultParcelInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultParcelInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parcelId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="seqNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * <p>Instances of this class are returned as a result of create picking Speedy web service calls
 * 
 * @since 1.0.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultParcelInfo", propOrder = {
    "parcelId",
    "seqNo"
})
public class ResultParcelInfo {

	/**
     * Parcel ID. First parcel's ID is always the same as the BOL number.
     */
    protected long parcelId;
    
    /**
     * Parcel's sequence number (1, 2, 3, ...)
     */
    protected int seqNo;

    /**
     * Gets the parcel id
     * @return Parcel id
     */
    public long getParcelId() {
        return parcelId;
    }

    /**
     * Sets the parcel id
     * @param parcelId Parcel id
     */
    public void setParcelId(long parcelId) {
        this.parcelId = parcelId;
    }

    /**
     * Gets the parcel's sequence number (1, 2, 3, ...)
     * @return Parcel's sequence number
     */
    public int getSeqNo() {
        return seqNo;
    }

    /**
     * Sets the parcel's sequence number
     * @param seqNo Parcel's sequence number
     */
    public void setSeqNo(int seqNo) {
        this.seqNo = seqNo;
    }

}
