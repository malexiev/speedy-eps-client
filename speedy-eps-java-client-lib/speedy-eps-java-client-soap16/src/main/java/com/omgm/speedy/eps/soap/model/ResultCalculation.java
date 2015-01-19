
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for resultCalculation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultCalculation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amounts" type="{http://ver01.eps.speedy.sirma.com/}resultAmounts" minOccurs="0"/>
 *         &lt;element name="deadlineDelivery" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="partialDiscount" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="takingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultCalculation", propOrder = {
    "amounts",
    "deadlineDelivery",
    "partialDiscount",
    "takingDate"
})
public class ResultCalculation {

    protected ResultAmounts amounts;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deadlineDelivery;
    protected boolean partialDiscount;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar takingDate;

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
     * Gets the value of the partialDiscount property.
     * 
     */
    public boolean isPartialDiscount() {
        return partialDiscount;
    }

    /**
     * Sets the value of the partialDiscount property.
     * 
     */
    public void setPartialDiscount(boolean value) {
        this.partialDiscount = value;
    }

    /**
     * Gets the value of the takingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTakingDate() {
        return takingDate;
    }

    /**
     * Sets the value of the takingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTakingDate(XMLGregorianCalendar value) {
        this.takingDate = value;
    }

}
