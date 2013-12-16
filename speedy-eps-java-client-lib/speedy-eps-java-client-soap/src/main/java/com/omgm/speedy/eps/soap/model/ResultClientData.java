
package com.omgm.speedy.eps.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultClientData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultClientData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://ver01.eps.speedy.sirma.com/}resultAddress" minOccurs="0"/>
 *         &lt;element name="clientId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="contactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partnerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phones" type="{http://ver01.eps.speedy.sirma.com/}resultPhoneNumber" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * <p>Instances of this class are returned as a result of Speedy web service method calls for client data
 * 
 * @since 1.0.0
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultClientData", propOrder = {
    "address",
    "clientId",
    "contactName",
    "objectName",
    "partnerName",
    "phones"
})
public class ResultClientData {

	/**
     * Address
     */
    protected ResultAddress address;
    
    /**
     * Client ID
     */
    protected long clientId;
    
    /**
     * Contact name
     */
    protected String contactName;
    
    /**
     * Company department/office
     */
    protected String objectName;
    
    /**
     * Name of the client (company or private person)
     */
    protected String partnerName;
    
    /**
     * Phone numbers
     */
    @XmlElement(nillable = true)
    protected List<ResultPhoneNumber> phones;

    /**
     * Gets the client address
     * @return Client address
     */
    public ResultAddress getAddress() {
        return address;
    }

    /**
     * Sets the client address
     * @param address Client address
     */
    public void setAddress(ResultAddress address) {
        this.address = address;
    }

    /**
     * Gets the client id
     * @return Client id
     */
    public long getClientId() {
        return clientId;
    }

    /**
     * Sets the Client id
     * @param clientId Client id
     */
    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    /**
     * Gets the contact name 
     * @return Contact name 
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the contact name 
     * @param contactName Contact name 
     */
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    /**
     * Gets the company department/office
     * @return Company department/office
     */
    public String getObjectName() {
        return objectName;
    }

    /**
     * Sets the company department/office
     * @param objectName Company department/office
     */
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    /**
     * Gets the name of the client (company or private person)
     * @return The name of the client (company or private person)
     */
    public String getPartnerName() {
        return partnerName;
    }

    /**
     * Sets the name of the client (company or private person)
     * @param partnerName Name of the client (company or private person)
     */
    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    /**
     * Gets the list of client phone numbers.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResultPhoneNumber }
     * 
     * 
     */
    public List<ResultPhoneNumber> getPhones() {
        if (phones == null) {
            phones = new ArrayList<ResultPhoneNumber>();
        }
        return this.phones;
    }

}
