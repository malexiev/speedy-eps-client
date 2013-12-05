
package com.omgm.speedy.eps.soap.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fixedDiscountCardId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fixedDiscountCardId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agreementId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cardId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * <p>Instances of this class are used for fixed discount cards
 * 
 * @since 1.0.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fixedDiscountCardId", propOrder = {
    "agreementId",
    "cardId"
})
public class FixedDiscountCardId {

	/**
     * Agreement (contract) ID
     */
    protected Long agreementId;
    
    /**
     * Card ID
     */
    protected Long cardId;

    /**
     * Get aggreement (contract) id
     * @return Aggreement (contract) id
     */
    public Long getAgreementId() {
        return agreementId;
    }

    /**
     * Set aggreement (contract) id
     * @param agreementId Aggreement (contract) id
     */
    public void setAgreementId(Long agreementId) {
        this.agreementId = agreementId;
    }

    /**
     * Get card id
     * @return Card id
     */
    public Long getCardId() {
        return cardId;
    }

    /**
     * Sets card id
     * @param cardId Card id
     */
    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

}
