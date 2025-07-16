
package com.cpsmart.wexclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSGetOrderCardsData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSGetOrderCardsData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="policyNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="orderType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cardStyle" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cards" type="{http://com.tch.cards.service/types}WSOrderCard" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSGetOrderCardsData", propOrder = {
    "orderId",
    "policyNumber",
    "orderType",
    "cardStyle",
    "cards"
})
public class WSGetOrderCardsData {

    protected long orderId;
    protected int policyNumber;
    protected int orderType;
    protected int cardStyle;
    @XmlElement(nillable = true)
    protected List<WSOrderCard> cards;

    /**
     * Gets the value of the orderId property.
     * 
     */
    public long getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     */
    public void setOrderId(long value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the policyNumber property.
     * 
     */
    public int getPolicyNumber() {
        return policyNumber;
    }

    /**
     * Sets the value of the policyNumber property.
     * 
     */
    public void setPolicyNumber(int value) {
        this.policyNumber = value;
    }

    /**
     * Gets the value of the orderType property.
     * 
     */
    public int getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     */
    public void setOrderType(int value) {
        this.orderType = value;
    }

    /**
     * Gets the value of the cardStyle property.
     * 
     */
    public int getCardStyle() {
        return cardStyle;
    }

    /**
     * Sets the value of the cardStyle property.
     * 
     */
    public void setCardStyle(int value) {
        this.cardStyle = value;
    }

    /**
     * Gets the value of the cards property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cards property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCards().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSOrderCard }
     * 
     * 
     */
    public List<WSOrderCard> getCards() {
        if (cards == null) {
            cards = new ArrayList<WSOrderCard>();
        }
        return this.cards;
    }

}
