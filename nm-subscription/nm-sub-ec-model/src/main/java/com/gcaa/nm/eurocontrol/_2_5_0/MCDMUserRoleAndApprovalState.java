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
 * <p>Java class for MCDMUserRoleAndApprovalState complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MCDMUserRoleAndApprovalState"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="user" type="{eurocontrol/cfmu/b2b/CommonServices}AirNavigationUnitId"/&gt;
 *         &lt;element name="role" type="{eurocontrol/cfmu/b2b/FlowServices}MCDMRole" minOccurs="0"/&gt;
 *         &lt;element name="approvalState" type="{eurocontrol/cfmu/b2b/FlowServices}MCDMApprovalState" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MCDMUserRoleAndApprovalState", propOrder = {
    "user",
    "role",
    "approvalState"
})
public class MCDMUserRoleAndApprovalState {

    @XmlElement(required = true)
    protected String user;
    @XmlSchemaType(name = "anySimpleType")
    protected String role;
    @XmlSchemaType(name = "anySimpleType")
    protected String approvalState;

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the approvalState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalState() {
        return approvalState;
    }

    /**
     * Sets the value of the approvalState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalState(String value) {
        this.approvalState = value;
    }

}
