
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultQuarter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultQuarter">
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
 * <p>Instances of this class are returned as a result of Speedy web service queries for quarters
 * 
 * @since 1.0.0
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultQuarter", propOrder = {
    "actualName",
    "id",
    "name",
    "type"
})
public class ResultQuarter {

	/**
     * Actual name (in case "name" is an old name)
     */
    protected String actualName;
    
    /**
     * Quarter ID
     */
    protected long id;
    
    /**
     * Quarter name
     */
    protected String name;
    
    /**
     * Quarter type
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
     * Sets the actual name (in case "name" is an old name)
     * @param value Actual name
     */
    public void setActualName(String value) {
        this.actualName = value;
    }

    /**
     * Gets the quarter id
     * @return Quarter id
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the quarter id
     * @param id Quarter id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Gets the quarter name
     * @return Quarter name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the quarter name
     * @param name Quarter name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the quarter type
     * @return Quarter type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the quarter type
     * @param type Quarter type
     */
    public void setType(String type) {
        this.type = type;
    }

}
