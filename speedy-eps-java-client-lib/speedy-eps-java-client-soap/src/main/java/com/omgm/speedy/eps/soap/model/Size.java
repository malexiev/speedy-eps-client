
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for size complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="size">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="depth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * <p>Instances of this class are used in parameter classes to specify picking size dimensions
 * 
 * @since 1.0.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "size", propOrder = {
    "depth",
    "height",
    "width"
})
public class Size {

	/**
     * Depth(cm). Maximum value is 9999
     * MANDATORY: NO
     */
    protected Integer depth;
    
    /**
     * Height (cm). Maximum value is 9999
     * MANDATORY: NO
     */
    protected Integer height;
    
    /**
     * Width (cm). Maximum value is 9999
     * MANDATORY: NO
     */
    protected Integer width;

    /**
     * Gets the depth (cm)
     * @return The depth in cm
     */
    public Integer getDepth() {
        return depth;
    }

    /**
     * Sets the depth (cm).
     * Maximum value is 9999
     * @param depth Depth in cm
     */
    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    /**
     * Gets the height (cm)
     * @return The height in cm
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * Sets the height (cm).
     * Maximum value is 9999
     * @param height Height in cm    
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * Gets the width (cm)
     * @return The width in cm
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * Sets the width (cm).
     * Maximum value is 9999
     * @param width Width in cm    
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

}
