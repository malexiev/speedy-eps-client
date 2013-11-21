
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for listServicesForSites complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listServicesForSites">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="senderSiteId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="receiverSiteId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listServicesForSites", propOrder = {
    "sessionId",
    "date",
    "senderSiteId",
    "receiverSiteId"
})
public class ListServicesForSites {

    protected String sessionId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    protected long senderSiteId;
    protected long receiverSiteId;

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the senderSiteId property.
     * 
     */
    public long getSenderSiteId() {
        return senderSiteId;
    }

    /**
     * Sets the value of the senderSiteId property.
     * 
     */
    public void setSenderSiteId(long value) {
        this.senderSiteId = value;
    }

    /**
     * Gets the value of the receiverSiteId property.
     * 
     */
    public long getReceiverSiteId() {
        return receiverSiteId;
    }

    /**
     * Sets the value of the receiverSiteId property.
     * 
     */
    public void setReceiverSiteId(long value) {
        this.receiverSiteId = value;
    }

}
