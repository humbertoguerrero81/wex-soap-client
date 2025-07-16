
package com.cpsmart.wexclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WSOrderSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSOrderSummary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="orderStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="statusMsg" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="embossedName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="orderQty" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="orderType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="policyNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cardStyle" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="shippingMethod" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="rushProcessing" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="shipToFirst" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="shipToLast" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="shipToAddress1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="shipToAddress2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="shipToCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="shipToState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="shipToZip" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="shipToCountry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSOrderSummary", propOrder = {
    "orderId",
    "createdDate",
    "orderStatus",
    "statusMsg",
    "embossedName",
    "orderQty",
    "orderType",
    "policyNumber",
    "cardStyle",
    "shippingMethod",
    "rushProcessing",
    "shipToFirst",
    "shipToLast",
    "shipToAddress1",
    "shipToAddress2",
    "shipToCity",
    "shipToState",
    "shipToZip",
    "shipToCountry"
})
public class WSOrderSummary {

    protected long orderId;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElement(required = true, nillable = true)
    protected String orderStatus;
    @XmlElement(required = true, nillable = true)
    protected String statusMsg;
    @XmlElement(required = true, nillable = true)
    protected String embossedName;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer orderQty;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer orderType;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer policyNumber;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer cardStyle;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer shippingMethod;
    @XmlElement(required = true, nillable = true)
    protected String rushProcessing;
    @XmlElement(required = true, nillable = true)
    protected String shipToFirst;
    @XmlElement(required = true, nillable = true)
    protected String shipToLast;
    @XmlElement(required = true, nillable = true)
    protected String shipToAddress1;
    @XmlElement(required = true, nillable = true)
    protected String shipToAddress2;
    @XmlElement(required = true, nillable = true)
    protected String shipToCity;
    @XmlElement(required = true, nillable = true)
    protected String shipToState;
    @XmlElement(required = true, nillable = true)
    protected String shipToZip;
    @XmlElement(required = true, nillable = true)
    protected String shipToCountry;

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
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the orderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderStatus(String value) {
        this.orderStatus = value;
    }

    /**
     * Gets the value of the statusMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusMsg() {
        return statusMsg;
    }

    /**
     * Sets the value of the statusMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusMsg(String value) {
        this.statusMsg = value;
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
     * Gets the value of the orderQty property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderQty() {
        return orderQty;
    }

    /**
     * Sets the value of the orderQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderQty(Integer value) {
        this.orderQty = value;
    }

    /**
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrderType(Integer value) {
        this.orderType = value;
    }

    /**
     * Gets the value of the policyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPolicyNumber() {
        return policyNumber;
    }

    /**
     * Sets the value of the policyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPolicyNumber(Integer value) {
        this.policyNumber = value;
    }

    /**
     * Gets the value of the cardStyle property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCardStyle() {
        return cardStyle;
    }

    /**
     * Sets the value of the cardStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCardStyle(Integer value) {
        this.cardStyle = value;
    }

    /**
     * Gets the value of the shippingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getShippingMethod() {
        return shippingMethod;
    }

    /**
     * Sets the value of the shippingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setShippingMethod(Integer value) {
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

}
