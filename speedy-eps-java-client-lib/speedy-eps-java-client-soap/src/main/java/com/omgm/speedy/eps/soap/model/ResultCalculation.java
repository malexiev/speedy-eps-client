
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
 * <p>Instances of this class are returned as a result of Speedy caclulcation web service methods
 * 
 * @since 1.0.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultCalculation", propOrder = {
    "amounts",
    "deadlineDelivery",
    "partialDiscount",
    "takingDate"
})
public class ResultCalculation {

	/**
     * Shipment's price (structure with values that form the price)
     */
    protected ResultAmounts amounts;
    
    /**
     * Deadline for delivery
     */
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deadlineDelivery;
    
    /**
     * Specifies if the discounts are potentially partial (the final discounts might be bigger depending on the other participants' contracts).
     */
    protected boolean partialDiscount;
    
    /**
     * The pick-up date
     */
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar takingDate;

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
     * Gets the partial discount flag value.
     * Specifies if the discounts are potentially partial 
     * (the final discounts might be bigger depending on the other participants' contracts).
     * @return Partial discount flag value
     */
    public boolean isPartialDiscount() {
        return partialDiscount;
    }

    /**
     * Sets the partial discount flag value
     * @param partialDiscount Partial discount flag value
     */
    public void setPartialDiscount(boolean partialDiscount) {
        this.partialDiscount = partialDiscount;
    }

    /**
     * Gets the pick-up date
     * @return The pick-up date
     */
    public XMLGregorianCalendar getTakingDate() {
        return takingDate;
    }

    /**
     * Sets the pick-up date
     * @param takingDate The pick-up date
     */
    public void setTakingDate(XMLGregorianCalendar takingDate) {
        this.takingDate = takingDate;
    }

}
