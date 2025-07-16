
package com.cpsmart.wexclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSCreateAndSubmitOrderData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSCreateAndSubmitOrderData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="policyNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="orderType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cardStyle" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="orderQty" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="embossedName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="shipToFirst" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="shipToLast" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="shipToAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="shipToAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="shipToCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="shipToState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="shipToZip" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="shipToCountry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="shippingMethod" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="rushProcessing" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cardCarrier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="props" type="{http://com.tch.cards.service/types}WSOrderProp" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "WSCreateAndSubmitOrderData", propOrder = {
    "policyNumber",
    "orderType",
    "cardStyle",
    "orderQty",
    "embossedName",
    "shipToFirst",
    "shipToLast",
    "shipToAddress1",
    "shipToAddress2",
    "shipToCity",
    "shipToState",
    "shipToZip",
    "shipToCountry",
    "shippingMethod",
    "rushProcessing",
    "cardCarrier",
    "props",
    "cards"
})
public class WSCreateAndSubmitOrderData {

    protected int policyNumber;
    protected int orderType;
    protected int cardStyle;
    protected int orderQty;
    @XmlElement(required = true)
    protected String embossedName;
    @XmlElement(required = true)
    protected String shipToFirst;
    @XmlElement(required = true)
    protected String shipToLast;
    @XmlElement(required = true)
    protected String shipToAddress1;
    @XmlElement(required = true)
    protected String shipToAddress2;
    @XmlElement(required = true)
    protected String shipToCity;
    @XmlElement(required = true)
    protected String shipToState;
    @XmlElement(required = true)
    protected String shipToZip;
    @XmlElement(required = true)
    protected String shipToCountry;
    protected int shippingMethod;
    @XmlElement(required = true)
    protected String rushProcessing;
    @XmlElement(required = true)
    protected String cardCarrier;
    @XmlElement(nillable = true)
    protected List<WSOrderProp> props;
    @XmlElement(nillable = true)
    protected List<WSOrderCard> cards;

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
     * Gets the value of the orderQty property.
     * 
     */
    public int getOrderQty() {
        return orderQty;
    }

    /**
     * Sets the value of the orderQty property.
     * 
     */
    public void setOrderQty(int value) {
        this.orderQty = value;
    }

    /**
     * Gets the value of the embossedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmbossedName() {
        return embossedName;
    }

    /**
     * Sets the value of the embossedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmbossedName(String value) {
        this.embossedName = value;
    }

    /**
     * Gets the value of the shipToFirst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToFirst() {
        return shipToFirst;
    }

    /**
     * Sets the value of the shipToFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToFirst(String value) {
        this.shipToFirst = value;
    }

    /**
     * Gets the value of the shipToLast property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToLast() {
        return shipToLast;
    }

    /**
     * Sets the value of the shipToLast property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToLast(String value) {
        this.shipToLast = value;
    }

    /**
     * Gets the value of the shipToAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAddress1() {
        return shipToAddress1;
    }

    /**
     * Sets the value of the shipToAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAddress1(String value) {
        this.shipToAddress1 = value;
    }

    /**
     * Gets the value of the shipToAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAddress2() {
        return shipToAddress2;
    }

    /**
     * Sets the value of the shipToAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAddress2(String value) {
        this.shipToAddress2 = value;
    }

    /**
     * Gets the value of the shipToCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCity() {
        return shipToCity;
    }

    /**
     * Sets the value of the shipToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCity(String value) {
        this.shipToCity = value;
    }

    /**
     * Gets the value of the shipToState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToState() {
        return shipToState;
    }

    /**
     * Sets the value of the shipToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToState(String value) {
        this.shipToState = value;
    }

    /**
     * Gets the value of the shipToZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToZip() {
        return shipToZip;
    }

    /**
     * Sets the value of the shipToZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToZip(String value) {
        this.shipToZip = value;
    }

    /**
     * Gets the value of the shipToCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCountry() {
        return shipToCountry;
    }

    /**
     * Sets the value of the shipToCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCountry(String value) {
        this.shipToCountry = value;
    }

    /**
     * Gets the value of the shippingMethod property.
     * 
     */
    public int getShippingMethod() {
        return shippingMethod;
    }

    /**
     * Sets the value of the shippingMethod property.
     * 
     */
    public void setShippingMethod(int value) {
        this.shippingMethod = value;
    }

    /**
     * Gets the value of the rushProcessing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRushProcessing() {
        return rushProcessing;
    }

    /**
     * Sets the value of the rushProcessing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRushProcessing(String value) {
        this.rushProcessing = value;
    }

    /**
     * Gets the value of the cardCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCarrier() {
        return cardCarrier;
    }

    /**
     * Sets the value of the cardCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCarrier(String value) {
        this.cardCarrier = value;
    }

    /**
     * Gets the value of the props property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the props property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSOrderProp }
     * 
     * 
     */
    public List<WSOrderProp> getProps() {
        if (props == null) {
            props = new ArrayList<WSOrderProp>();
        }
        return this.props;
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
