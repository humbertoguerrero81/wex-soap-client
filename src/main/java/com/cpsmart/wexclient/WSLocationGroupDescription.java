
package com.cpsmart.wexclient;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSLocationGroupDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSLocationGroupDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="grpId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ruleBased" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="editable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSLocationGroupDescription", propOrder = {
    "grpId",
    "name",
    "ruleBased",
    "editable"
})
public class WSLocationGroupDescription {

    protected int grpId;
    @XmlElement(required = true)
    protected String name;
    protected boolean ruleBased;
    protected boolean editable;

    /**
     * Gets the value of the grpId property.
     * 
     */
    public int getGrpId() {
        return grpId;
    }

    /**
     * Sets the value of the grpId property.
     * 
     */
    public void setGrpId(int value) {
        this.grpId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the ruleBased property.
     * 
     */
    public boolean isRuleBased() {
        return ruleBased;
    }

    /**
     * Sets the value of the ruleBased property.
     * 
     */
    public void setRuleBased(boolean value) {
        this.ruleBased = value;
    }

    /**
     * Gets the value of the editable property.
     * 
     */
    public boolean isEditable() {
        return editable;
    }

    /**
     * Sets the value of the editable property.
     * 
     */
    public void setEditable(boolean value) {
        this.editable = value;
    }

}
