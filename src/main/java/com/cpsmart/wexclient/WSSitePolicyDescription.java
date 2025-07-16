
package com.cpsmart.wexclient;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSSitePolicyDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSSitePolicyDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sitePolicy" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="siteDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sitePolicyPolicy" type="{http://com.tch.cards.service/types}WSPolicyDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSSitePolicyDescription", propOrder = {
    "sitePolicy",
    "siteDescription",
    "sitePolicyPolicy"
})
public class WSSitePolicyDescription {

    protected int sitePolicy;
    @XmlElement(required = true, nillable = true)
    protected String siteDescription;
    @XmlElement(nillable = true)
    protected List<WSPolicyDescription> sitePolicyPolicy;

    /**
     * Gets the value of the sitePolicy property.
     * 
     */
    public int getSitePolicy() {
        return sitePolicy;
    }

    /**
     * Sets the value of the sitePolicy property.
     * 
     */
    public void setSitePolicy(int value) {
        this.sitePolicy = value;
    }

    /**
     * Gets the value of the siteDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteDescription() {
        return siteDescription;
    }

    /**
     * Sets the value of the siteDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteDescription(String value) {
        this.siteDescription = value;
    }

    /**
     * Gets the value of the sitePolicyPolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sitePolicyPolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSitePolicyPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSPolicyDescription }
     * 
     * 
     */
    public List<WSPolicyDescription> getSitePolicyPolicy() {
        if (sitePolicyPolicy == null) {
            sitePolicyPolicy = new ArrayList<WSPolicyDescription>();
        }
        return this.sitePolicyPolicy;
    }

}
