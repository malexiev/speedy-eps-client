
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultStreet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultStreet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actualName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * <p>Instances of this class are returned as a result of Speedy web service queries for streets
 * 
 * @since 1.0.0
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultStreet", propOrder = {
    "actualName",
    "id",
    "name",
    "type"
})
public class ResultStreet {


    /**
     * Actual name (in case "name" is an old name)
     */
    protected String actualName;
    
    /**
     * Street ID
     */
    protected long id;
    
    /**
     * Street name
     */
    protected String name;
    
    /**
     * Street type
     */
    protected String type;

    /**
     * Gets the actual name (in case "name" is an old name)
     * @return Actual name
     */
    public String getActualName() {
        return actualName;
    }

    /**
     * Sets the actual name
     * @param actualName Actual name
     */
    public void setActualName(String actualName) {
        this.actualName = actualName;
    }

    /**
     * Gets the street id
     * @return Street id
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the street id
     * @param id Street id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Gets the street name
     * @return Street name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the street name
     * @param name Street name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the street type
     * @return Street type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the street type
     * @param type Street type
     */
    public void setType(String type) {
        this.type = type;
    }

}
