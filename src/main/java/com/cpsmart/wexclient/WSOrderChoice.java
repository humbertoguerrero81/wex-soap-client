
package com.cpsmart.wexclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSOrderChoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSOrderChoice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="prop" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="required" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="cardScope" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="unique" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="priorPost" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="validationType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="allowed" type="{http://com.tch.cards.service/types}WSOrderAllowedValue" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSOrderChoice", propOrder = {
    "prop",
    "required",
    "cardScope",
    "unique",
    "priorPost",
    "validationType",
    "allowed"
})
public class WSOrderChoice {

    @XmlElement(required = true)
    protected String prop;
    protected boolean required;
    protected boolean cardScope;
    protected boolean unique;
    @XmlElement(required = true, nillable = true)
    protected String priorPost;
    @XmlElement(required = true, nillable = true)
    protected String validationType;
    @XmlElement(nillable = true)
    protected List<WSOrderAllowedValue> allowed;

    /**
     * Gets the value of the prop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProp() {
        return prop;
    }

    /**
     * Sets the value of the prop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProp(String value) {
        this.prop = value;
    }

    /**
     * Gets the value of the required property.
     * 
     */
    public boolean isRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     */
    public void setRequired(boolean value) {
        this.required = value;
    }

    /**
     * Gets the value of the cardScope property.
     * 
     */
    public boolean isCardScope() {
        return cardScope;
    }

    /**
     * Sets the value of the cardScope property.
     * 
     */
    public void setCardScope(boolean value) {
        this.cardScope = value;
    }

    /**
     * Gets the value of the unique property.
     * 
     */
    public boolean isUnique() {
        return unique;
    }

    /**
     * Sets the value of the unique property.
     * 
     */
    public void setUnique(boolean value) {
        this.unique = value;
    }

    /**
     * Gets the value of the priorPost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorPost() {
        return priorPost;
    }

    /**
     * Sets the value of the priorPost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorPost(String value) {
        this.priorPost = value;
    }

    /**
     * Gets the value of the validationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationType() {
        return validationType;
    }

    /**
     * Sets the value of the validationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationType(String value) {
        this.validationType = value;
    }

    /**
     * Gets the value of the allowed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSOrderAllowedValue }
     * 
     * 
     */
    public List<WSOrderAllowedValue> getAllowed() {
        if (allowed == null) {
            allowed = new ArrayList<WSOrderAllowedValue>();
        }
        return this.allowed;
    }

}
