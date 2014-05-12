
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paramOptionsBeforePayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="paramOptionsBeforePayment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="open" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * @since 2.3.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramOptionsBeforePayment", propOrder = {
    "open"
})
public class ParamOptionsBeforePayment {

	/**
	 * Open before payment option
	 */
    protected boolean open;

    /**
     * Gets the value of the open property.
     * @return  Open before payment option
     */
    public boolean isOpen() {
        return open;
    }

    /**
     * Sets the value of the open property.
     * @param open Open before payment option
     */
    public void setOpen(boolean open) {
        this.open = open;
    }

}
