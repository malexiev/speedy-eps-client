
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for resultWorkingTime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultWorkingTime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="workingTimeFrom" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="workingTimeTo" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * <p> Instances of this class represents office working time for a certain date
 * 
 * @since 2.6.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultWorkingTime", propOrder = {
    "date",
    "workingTimeFrom",
    "workingTimeTo"
})
public class ResultWorkingTime {

	/**
	 * Date for which working time is valid
	 */
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    
    /**
     * Working time start (HHMM)
     */
    protected Short workingTimeFrom;
    
    /**
     * Working time end (HHMM)
     */
    protected Short workingTimeTo;

    /**
     * Gets the date this working time is valid
     * @return Working time date
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the date this working time is valid
     * @param date Working time date
     */
    public void setDate(XMLGregorianCalendar date) {
        this.date = date;
    }

    /**
     * Gets the working time start time (HHMM)
     * @return Working time start time (HHMM)
     */
    public Short getWorkingTimeFrom() {
        return workingTimeFrom;
    }

    /**
     * Sets the working time start time (HHMM)
     * @param workingTimeFrom Working time start time (HHMM)
     */
    public void setWorkingTimeFrom(Short workingTimeFrom) {
        this.workingTimeFrom = workingTimeFrom;
    }

    /**
     * Gets the working time end time (HHMM)
     * @return Working time end time (HHMM)
     */
    public Short getWorkingTimeTo() {
        return workingTimeTo;
    }

    /**
     * Sets the working time end time (HHMM)
     * @param workingTimeFrom Working time end time (HHMM)
     */
    public void setWorkingTimeTo(Short value) {
        this.workingTimeTo = value;
    }

}
