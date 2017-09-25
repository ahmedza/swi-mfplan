//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.08 at 11:11:39 PM GST 
//


package com.gcaa.nm.eurocontrol._2_5_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegulationProposalListRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegulationProposalListRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{eurocontrol/cfmu/b2b/FlowServices}RegulationOrMCDMOnlyListRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="requestedRegulationProposalFields" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="item" type="{eurocontrol/cfmu/b2b/FlowServices}RegulationProposalField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="approvalStates" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="item" type="{eurocontrol/cfmu/b2b/FlowServices}MCDMApprovalState" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegulationProposalListRequest", propOrder = {
    "requestedRegulationProposalFields",
    "approvalStates"
})
public class RegulationProposalListRequest
    extends RegulationOrMCDMOnlyListRequest
{

    protected RegulationProposalListRequest.RequestedRegulationProposalFields requestedRegulationProposalFields;
    protected RegulationProposalListRequest.ApprovalStates approvalStates;

    /**
     * Gets the value of the requestedRegulationProposalFields property.
     * 
     * @return
     *     possible object is
     *     {@link RegulationProposalListRequest.RequestedRegulationProposalFields }
     *     
     */
    public RegulationProposalListRequest.RequestedRegulationProposalFields getRequestedRegulationProposalFields() {
        return requestedRegulationProposalFields;
    }

    /**
     * Sets the value of the requestedRegulationProposalFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulationProposalListRequest.RequestedRegulationProposalFields }
     *     
     */
    public void setRequestedRegulationProposalFields(RegulationProposalListRequest.RequestedRegulationProposalFields value) {
        this.requestedRegulationProposalFields = value;
    }

    /**
     * Gets the value of the approvalStates property.
     * 
     * @return
     *     possible object is
     *     {@link RegulationProposalListRequest.ApprovalStates }
     *     
     */
    public RegulationProposalListRequest.ApprovalStates getApprovalStates() {
        return approvalStates;
    }

    /**
     * Sets the value of the approvalStates property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegulationProposalListRequest.ApprovalStates }
     *     
     */
    public void setApprovalStates(RegulationProposalListRequest.ApprovalStates value) {
        this.approvalStates = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="item" type="{eurocontrol/cfmu/b2b/FlowServices}MCDMApprovalState" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class ApprovalStates {

        @XmlSchemaType(name = "anySimpleType")
        protected List<String> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getItem() {
            if (item == null) {
                item = new ArrayList<String>();
            }
            return this.item;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="item" type="{eurocontrol/cfmu/b2b/FlowServices}RegulationProposalField" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class RequestedRegulationProposalFields {

        @XmlSchemaType(name = "anySimpleType")
        protected List<String> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getItem() {
            if (item == null) {
                item = new ArrayList<String>();
            }
            return this.item;
        }

    }

}
