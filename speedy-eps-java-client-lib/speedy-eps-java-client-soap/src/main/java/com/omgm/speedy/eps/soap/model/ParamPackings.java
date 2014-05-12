
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paramPackings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paramPackings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="packingId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * @since 2.3.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramPackings", propOrder = {
    "count",
    "packingId"
})
public class ParamPackings {

	/**
	 * The number of packings
	 * MANDATORY: YES
	 */
    protected int count;
    
    /**
     * Packing id
     * MANDATORY: YES
     */
    protected long packingId;

    /**
     * Gets the value of the count property.
     * @return Number of packings
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets the value of the count property.
     * @param count Number of packings
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * Gets the value of the packingId property.
     * @return Packing id
     */
    public long getPackingId() {
        return packingId;
    }

    /**
     * Sets the value of the packingId property.
     * @param packingId Packing id
     */
    public void setPackingId(long packingId) {
        this.packingId = packingId;
    }

}
