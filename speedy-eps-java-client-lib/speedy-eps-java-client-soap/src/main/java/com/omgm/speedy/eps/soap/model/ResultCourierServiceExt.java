
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
 * <p>Instances of this class are returned as a result of Speedy web service calls for services allowed between sites
 * 
 * @since 1.0.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultCourierServiceExt", propOrder = {
    "deliveryDeadline"
})
public class ResultCourierServiceExt
    extends ResultCourierService
{

	/**
     * The deadline for shipment delivery
     */
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deliveryDeadline;

    /**
     * Gets the deadline for shipment delivery
     * @return Deadline for shipment delivery
     */
    public XMLGregorianCalendar getDeliveryDeadline() {
        return deliveryDeadline;
    }

    /**
     * Sets the deadline for shipment delivery
     * @param deliveryDeadline Deadline for shipment delivery
     */
    public void setDeliveryDeadline(XMLGregorianCalendar deliveryDeadline) {
        this.deliveryDeadline = deliveryDeadline;
    }

}
