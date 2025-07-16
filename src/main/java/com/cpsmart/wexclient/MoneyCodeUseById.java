
package com.cpsmart.wexclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MoneyCodeUseById complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MoneyCodeUseById"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="checkNumber" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="locName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="locCity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="locState" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="locPhone" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoneyCodeUseById", propOrder = {
    "amount",
    "checkNumber",
    "time",
    "locName",
    "locCity",
    "locState",
    "locPhone"
})
public class MoneyCodeUseById {

    protected double amount;
    protected long checkNumber;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar time;
    @XmlElement(required = true, nillable = true)
    protected String locName;
    @XmlElement(required = true, nillable = true)
    protected String locCity;
    @XmlElement(required = true, nillable = true)
    protected String locState;
    @XmlElement(required = true, nillable = true)
    protected String locPhone;

    /**
     * Gets the value of the amount property.
     * 
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(double value) {
        this.amount = value;
    }

    /**
     * Gets the value of the checkNumber property.
     * 
     */
    public long getCheckNumber() {
        return checkNumber;
    }

    /**
     * Sets the value of the checkNumber property.
     * 
     */
    public void setCheckNumber(long value) {
        this.checkNumber = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
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
     * Gets the value of the locPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocPhone() {
        return locPhone;
    }

    /**
     * Sets the value of the locPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocPhone(String value) {
        this.locPhone = value;
    }

}
