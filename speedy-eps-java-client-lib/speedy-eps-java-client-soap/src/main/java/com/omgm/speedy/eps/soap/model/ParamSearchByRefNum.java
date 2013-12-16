
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for paramSearchByRefNum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paramSearchByRefNum">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="referenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="searchInField" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * <p>Instances of thics class are used az parameters for picking search web services class
 * 
 * @since 1.0.0
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramSearchByRefNum", propOrder = {
    "dateFrom",
    "dateTo",
    "referenceNumber",
    "searchInField"
})
public class ParamSearchByRefNum {

	/**
     * Pick-up date - from
     * MANDATORY: NO
     */
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateFrom;
    
    /**
     * Pick-up date - to
     * MANDATORY: NO
     */
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTo;
    
    /**
     * The reference code to be searched (exact match, case sensitive)
     * MANDATORY: YES
     */
    protected String referenceNumber;
    
    /**
     * Specifies where to search: 0 means [Ref1 or Ref2], 1 means [Ref1], 2 means [Ref2]
     * MANDATORY: YES
     */
    protected int searchInField;

    /**
     * Gets the pick-up date - from
     * @return Pick-up date - from
     */
    public XMLGregorianCalendar getDateFrom() {
        return dateFrom;
    }

    /**
     * Sets the pick-up date - from
     * @param dateFrom Pick-up date - from
     */
    public void setDateFrom(XMLGregorianCalendar dateFrom) {
        this.dateFrom = dateFrom;
    }

    /**
     * Gets the pick-up date - to
     * @return Pick-up date - to
     */
    public XMLGregorianCalendar getDateTo() {
        return dateTo;
    }

    /**
     * Sets the pick-up date - to
     * @param dateTo Pick-up date - to
     */
    public void setDateTo(XMLGregorianCalendar dateTo) {
        this.dateTo = dateTo;
    }

    /**
     * Gets the reference code to be searched (exact match, case sensitive)
     * @return The reference code to be searched
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Sets the reference code to be searched (exact match, case sensitive)
     * @param referenceNumber The reference code to be searched
     */
    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    /**
     * Gets the searchInField code - 0 means [Ref1 or Ref2], 1 means [Ref1], 2 means [Ref2]
     * @return searchInField code
     */
    public int getSearchInField() {
        return searchInField;
    }

    /**
     * Sets the searchInField code.
     * Specifies where to search: 0 means [Ref1 or Ref2], 1 means [Ref1], 2 means [Ref2]
     * @param searchInField Field search code
     */
    public void setSearchInField(int searchInField) {
        this.searchInField = searchInField;
    }

}
