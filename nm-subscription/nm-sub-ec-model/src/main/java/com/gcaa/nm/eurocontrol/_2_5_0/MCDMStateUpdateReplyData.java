//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.08 at 11:11:39 PM GST 
//


package com.gcaa.nm.eurocontrol._2_5_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MCDMStateUpdateReplyData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MCDMStateUpdateReplyData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="newMCDMState" type="{eurocontrol/cfmu/b2b/FlowServices}MCDMState"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MCDMStateUpdateReplyData", propOrder = {
    "newMCDMState"
})
public class MCDMStateUpdateReplyData {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String newMCDMState;

    /**
     * Gets the value of the newMCDMState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewMCDMState() {
        return newMCDMState;
    }

    /**
     * Sets the value of the newMCDMState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewMCDMState(String value) {
        this.newMCDMState = value;
    }

}