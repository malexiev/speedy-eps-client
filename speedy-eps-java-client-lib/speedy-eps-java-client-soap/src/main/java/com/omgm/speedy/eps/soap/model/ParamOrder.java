
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
 * <p>Java class for paramOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paramOrder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billOfLadingsList" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="billOfLadingsToIncludeType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="contactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneNumber" type="{http://ver01.eps.speedy.sirma.com/}paramPhoneNumber" minOccurs="0"/>
 *         &lt;element name="pickupDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="readinessTime" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="workingEndTime" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * <p>Instances of this class are used as parameters for orders web service calls
 * 
 * @since 1.0.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramOrder", propOrder = {
    "billOfLadingsList",
    "billOfLadingsToIncludeType",
    "contactName",
    "phoneNumber",
    "pickupDate",
    "readinessTime",
    "workingEndTime"
})
public class ParamOrder {

	/**
     * List of BOL numbers.
     * MANDATORY: Must be set <=> billOfLadingsToIncludeType = 10.
     */
    @XmlElement(nillable = true)
    protected List<Long> billOfLadingsList;
    
    /**
     * Specifies the set of shipments/BOLs to be ordered:
     * •[10] Explicit numbers (in billOfLadingsList)
     * •[20] All not-ordered-yet BOLs created by the logged client
     * •[30] All not-ordered-yet BOLs created by the logged client or members of his/her contract (taking into account user's permissions)
     * MANDATORY: YES
     */
    protected int billOfLadingsToIncludeType;
    

    /**
     * Contact name.
     * Limited to 60 symbols.
     * MANDATORY: YES
     */
    protected String contactName;
    
    /**
     * Phone number
     * MANDATORY: YES
     */
    protected ParamPhoneNumber phoneNumber;
    
    /**
     * The date for shipments pick-up (the "time" component is ignored). The default value is "today".
     * MANDATORY: NO
     */
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar pickupDate;
    
    /**
     * Specifies when all the shipments/parcels will be ready for pickup. The default value is "now".
     * MANDATORY: Only if pickupDate > today
     */
    protected Short readinessTime;
    
    /**
     * The sender's working time end
     * MANDATORY: YES
     */
    protected Short workingEndTime;

    /**
     * Gets the value of the billOfLadingsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billOfLadingsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillOfLadingsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getBillOfLadingsList() {
        if (billOfLadingsList == null) {
            billOfLadingsList = new ArrayList<Long>();
        }
        return this.billOfLadingsList;
    }

    /**
     * Gets the value of the billOfLadingsToIncludeType property.
     * 
     */
    public int getBillOfLadingsToIncludeType() {
        return billOfLadingsToIncludeType;
    }

    /**
     * Sets the value of the billOfLadingsToIncludeType property.
     * 
     */
    public void setBillOfLadingsToIncludeType(int value) {
        this.billOfLadingsToIncludeType = value;
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link ParamPhoneNumber }
     *     
     */
    public ParamPhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamPhoneNumber }
     *     
     */
    public void setPhoneNumber(ParamPhoneNumber value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the pickupDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPickupDate() {
        return pickupDate;
    }

    /**
     * Sets the value of the pickupDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPickupDate(XMLGregorianCalendar value) {
        this.pickupDate = value;
    }

    /**
     * Gets the value of the readinessTime property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getReadinessTime() {
        return readinessTime;
    }

    /**
     * Sets the value of the readinessTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setReadinessTime(Short value) {
        this.readinessTime = value;
    }

    /**
     * Gets the value of the workingEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getWorkingEndTime() {
        return workingEndTime;
    }

    /**
     * Sets the value of the workingEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setWorkingEndTime(Short value) {
        this.workingEndTime = value;
    }

}
