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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MCDMOnlyUpdateRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MCDMOnlyUpdateRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{eurocontrol/cfmu/b2b/CommonServices}Request"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataset" type="{eurocontrol/cfmu/b2b/CommonServices}Dataset"/&gt;
 *         &lt;element name="mcdmOnly" type="{eurocontrol/cfmu/b2b/FlowServices}MCDMOnly"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MCDMOnlyUpdateRequest", propOrder = {
    "dataset",
    "mcdmOnly"
})
public class MCDMOnlyUpdateRequest
    extends Request
{

    @XmlElement(required = true)
    protected Dataset dataset;
    @XmlElement(required = true)
    protected MCDMOnly mcdmOnly;

    /**
     * Gets the value of the dataset property.
     * 
     * @return
     *     possible object is
     *     {@link Dataset }
     *     
     */
    public Dataset getDataset() {
        return dataset;
    }

    /**
     * Sets the value of the dataset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dataset }
     *     
     */
    public void setDataset(Dataset value) {
        this.dataset = value;
    }

    /**
     * Gets the value of the mcdmOnly property.
     * 
     * @return
     *     possible object is
     *     {@link MCDMOnly }
     *     
     */
    public MCDMOnly getMcdmOnly() {
        return mcdmOnly;
    }

    /**
     * Sets the value of the mcdmOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link MCDMOnly }
     *     
     */
    public void setMcdmOnly(MCDMOnly value) {
        this.mcdmOnly = value;
    }

}