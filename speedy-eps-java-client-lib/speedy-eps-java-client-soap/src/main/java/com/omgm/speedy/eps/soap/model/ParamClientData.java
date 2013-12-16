
package com.omgm.speedy.eps.soap.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paramClientData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paramClientData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://ver01.eps.speedy.sirma.com/}paramAddress" minOccurs="0"/>
 *         &lt;element name="clientId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="contactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="objectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partnerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phones" type="{http://ver01.eps.speedy.sirma.com/}paramPhoneNumber" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * <p>Used to pass client data in requests
 * 
 * @since 1.0.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramClientData", propOrder = {
    "address",
    "clientId",
    "contactName",
    "email",
    "objectName",
    "partnerName",
    "phones"
})
public class ParamClientData {

	/**
     * Address details
     * MANDATORY: Required when clientId is null
     */
    protected ParamAddress address;
    
    /**
     * Client/Partner ID
     * MANDATORY: NO
     */
    protected Long clientId;
    
    /**
     * Contact name.
     * Maximum size is 60 symbols.
     * MANDATORY: NO
     */
    protected String contactName;
    
    /**
     * Email
     * Maximum size is 256 symbols.
     * MANDATORY: NO
     * @since 2.1.0
     */
    protected String email;
    
    /**
     * Company department/office.
     * Maximum size is 60 symbols.
     * MANDATORY: Allowed <=> clientId is null.
     */
    protected String objectName;
    
    /**
     * Name of the client (company or private person).
     * Maximum size is 60 symbols.
     * MANDATORY: Must be set <=> clientId is null.
     */
    protected String partnerName;
    @XmlElement(nillable = true)
    
    /**
     * Phone numbers.
     * This list contains maximum 3 phone numbers.
     * MANDATORY: Sender's phone number is always required.
     *   Receiver's phone number is required if the shipment is to be delivered on a half-working day or
     *   the shipment needs to be delivered the day it has been picked up.
     *   ("Required" means at least one valid phone number must be set.)
     */
    protected List<ParamPhoneNumber> phones;

    /**
     * Gets the client address 
     * @return Client address
     */
    public ParamAddress getAddress() {
        return address;
    }

    /**
     * Sets the client address
     * @param address Client address
     */
    public void setAddress(ParamAddress address) {
        this.address = address;
    }

    /**
     * Gets the clientId - client/partner ID
     * @return Client/Partner id
     */
    public Long getClientId() {
        return clientId;
    }

    /**
     * Sets the clientId - client/partner ID
     * @param clientId Client/Partner id
     */
    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    /**
     * Gets the contact name
     * @return Conctact name
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the contact name.
     * Maximum size is 60 symbols
     * @param contactName Contact name
     */
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    /**
     * Gets the client email
     * @return Client email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the client email.
     * Maximum size is 256 symbols
     * @param email Client email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the object name - company department/office
     * @return Company department/office name
     */
    public String getObjectName() {
        return objectName;
    }

    /**
     * Sets the object name - company department/office.
     * Maximum size is 60 symbols.
     * Requres clientId to be set
     * @param objectName Company department/office name
     */
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    /**
     * Gets the partner name -  name of the client (company or private person)
     * @return Name of the client (company or private person)
     */
    public String getPartnerName() {
        return partnerName;
    }

    /**
     * Sets the partner name - name of the client (company or private person).
     * Maximum size is 60 symbols.
     * Must be set, when clientId is null
     * @param partnerName Name of the client (company or private person)
     */
    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    /**
     * Gets the phone numbers list.
     * This list contains maximum 3 phone numbers.
     * Sender's phone number is always required.
     * Receiver's phone number is required if the shipment is to be delivered on a half-working day or
     * the shipment needs to be delivered the day it has been picked up.
     * ("Required" means at least one valid phone number must be set.)
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
     * {@link ParamPhoneNumber }
     * @return List if phone numbers
     * 
     */
    public List<ParamPhoneNumber> getPhones() {
        if (phones == null) {
            phones = new ArrayList<ParamPhoneNumber>();
        }
        return this.phones;
    }

}
