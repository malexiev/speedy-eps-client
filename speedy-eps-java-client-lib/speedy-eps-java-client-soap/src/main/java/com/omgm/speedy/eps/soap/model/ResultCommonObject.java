
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultCommonObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultCommonObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 * <p>Instances of this class are returned as a result of Speedy web service queries for common objects
 * 
 * @since 1.0.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultCommonObject", propOrder = {
    "address",
    "id",
    "name",
    "type"
})
public class ResultCommonObject {

    /**
     * Common object address
     */
    protected String address;
    
    /**
     * Common object ID
     */
    protected long id;
    
    /**
     * Common object name
     */
    protected String name;
    
    /**
     * Common object type
     */
    protected String type;

    /**
     * Gets the common object address
     * @return Common object address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the common object address
     * @param address Common object address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets the common object id
     * @return Common object id
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the common object id
     * @param id Common object id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Gets the common object name
     * @return Common object name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the common object name
     * @param name Common object name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the common object type
     * @return Common object type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the common object type
     * @param type Common object type
     */
    public void setType(String type) {
        this.type = type;
    }

}
