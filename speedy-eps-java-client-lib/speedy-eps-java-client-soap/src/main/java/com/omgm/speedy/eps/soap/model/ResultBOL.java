
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
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultBOL", propOrder = {
    "amounts",
    "deadlineDelivery",
    "generatedParcels"
})
public class ResultBOL {

    protected ResultAmounts amounts;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deadlineDelivery;
    @XmlElement(nillable = true)
    protected List<ResultParcelInfo> generatedParcels;

    /**
     * Gets the value of the amounts property.
     * 
     * @return
     *     possible object is
     *     {@link ResultAmounts }
     *     
     */
    public ResultAmounts getAmounts() {
        return amounts;
    }

    /**
     * Sets the value of the amounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultAmounts }
     *     
     */
    public void setAmounts(ResultAmounts value) {
        this.amounts = value;
    }

    /**
     * Gets the value of the deadlineDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeadlineDelivery() {
        return deadlineDelivery;
    }

    /**
     * Sets the value of the deadlineDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeadlineDelivery(XMLGregorianCalendar value) {
        this.deadlineDelivery = value;
    }

    /**
     * Gets the value of the generatedParcels property.
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
