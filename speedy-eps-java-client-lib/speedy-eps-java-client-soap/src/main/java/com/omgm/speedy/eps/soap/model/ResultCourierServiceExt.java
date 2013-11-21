
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for resultCourierServiceExt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultCourierServiceExt">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ver01.eps.speedy.sirma.com/}resultCourierService">
 *       &lt;sequence>
 *         &lt;element name="deliveryDeadline" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultCourierServiceExt", propOrder = {
    "deliveryDeadline"
})
public class ResultCourierServiceExt
    extends ResultCourierService
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deliveryDeadline;

    /**
     * Gets the value of the deliveryDeadline property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryDeadline() {
        return deliveryDeadline;
    }

    /**
     * Sets the value of the deliveryDeadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryDeadline(XMLGregorianCalendar value) {
        this.deliveryDeadline = value;
    }

}
