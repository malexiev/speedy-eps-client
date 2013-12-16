
package com.omgm.speedy.eps.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for resultBOL complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultBOL">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amounts" type="{http://ver01.eps.speedy.sirma.com/}resultAmounts" minOccurs="0"/>
 *         &lt;element name="deadlineDelivery" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="generatedParcels" type="{http://ver01.eps.speedy.sirma.com/}resultParcelInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * <p>Instances of this class are returned as a result of create picking speedy web service calls
 * 
 * @since 1.0.0
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultBOL", propOrder = {
    "amounts",
    "deadlineDelivery",
    "generatedParcels"
})
public class ResultBOL {

	/**
     * Amounts
     */
    protected ResultAmounts amounts;
    
    /**
     * Deadline for delivery
     */
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deadlineDelivery;
    
    /**
     * List of parcels data
     */
    @XmlElement(nillable = true)
    protected List<ResultParcelInfo> generatedParcels;

    /**
     * Gets the amounts calculated
     * @return Amounts calculated
     */
    public ResultAmounts getAmounts() {
        return amounts;
    }

    /**
     * Sets the amounts calculated
     * @param amounts Amounts calculated
     */
    public void setAmounts(ResultAmounts amounts) {
        this.amounts = amounts;
    }

    /**
     * Gets the deadline for delivery
     * @return Deadline for delivery
     */
    public XMLGregorianCalendar getDeadlineDelivery() {
        return deadlineDelivery;
    }

    /**
     * Sets the deadline for delivery
     * @param deadlineDelivery Deadline for delivery
     */
    public void setDeadlineDelivery(XMLGregorianCalendar deadlineDelivery) {
        this.deadlineDelivery = deadlineDelivery;
    }

    /**
     * Gets the list of parcels data
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generatedParcels property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneratedParcels().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResultParcelInfo }
     * 
     * 
     */
    public List<ResultParcelInfo> getGeneratedParcels() {
        if (generatedParcels == null) {
            generatedParcels = new ArrayList<ResultParcelInfo>();
        }
        return this.generatedParcels;
    }

}
