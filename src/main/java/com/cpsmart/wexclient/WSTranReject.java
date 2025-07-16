
package com.cpsmart.wexclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WSTranReject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSTranReject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tranDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="cardNum" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="invoice" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="locId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="locName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="locCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="locState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="errorDesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSTranReject", propOrder = {
    "tranDate",
    "cardNum",
    "invoice",
    "locId",
    "locName",
    "locCity",
    "locState",
    "errorCode",
    "errorDesc",
    "unit"
})
public class WSTranReject {

    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tranDate;
    @XmlElement(required = true, nillable = true)
    protected String cardNum;
    @XmlElement(required = true, nillable = true)
    protected String invoice;
    protected int locId;
    @XmlElement(required = true, nillable = true)
    protected String locName;
    @XmlElement(required = true, nillable = true)
    protected String locCity;
    @XmlElement(required = true, nillable = true)
    protected String locState;
    protected int errorCode;
    @XmlElement(required = true, nillable = true)
    protected String errorDesc;
    @XmlElement(required = true, nillable = true)
    protected String unit;

    /**
     * Gets the value of the tranDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTranDate() {
        return tranDate;
    }

    /**
     * Sets the value of the tranDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTranDate(XMLGregorianCalendar value) {
        this.tranDate = value;
    }

    /**
     * Gets the value of the cardNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNum() {
        return cardNum;
    }

    /**
     * Sets the value of the cardNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNum(String value) {
        this.cardNum = value;
    }

    /**
     * Gets the value of the invoice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoice(String value) {
        this.invoice = value;
    }

    /**
     * Gets the value of the locId property.
     * 
     */
    public int getLocId() {
        return locId;
    }

    /**
     * Sets the value of the locId property.
     * 
     */
    public void setLocId(int value) {
        this.locId = value;
    }

    /**
     * Gets the value of the locName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocName() {
        return locName;
    }

    /**
     * Sets the value of the locName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocName(String value) {
        this.locName = value;
    }

    /**
     * Gets the value of the locCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocCity() {
        return locCity;
    }

    /**
     * Sets the value of the locCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocCity(String value) {
        this.locCity = value;
    }

    /**
     * Gets the value of the locState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocState() {
        return locState;
    }

    /**
     * Sets the value of the locState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocState(String value) {
        this.locState = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     */
    public int getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     */
    public void setErrorCode(int value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDesc() {
        return errorDesc;
    }

    /**
     * Sets the value of the errorDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDesc(String value) {
        this.errorDesc = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

}
