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
 * <p>Java class for NMB2BAddendaErrataReplyData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NMB2BAddendaErrataReplyData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="file" type="{eurocontrol/cfmu/b2b/GeneralinformationServices}B2BInfoFile"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NMB2BAddendaErrataReplyData", namespace = "eurocontrol/cfmu/b2b/GeneralinformationServices", propOrder = {
    "file"
})
public class NMB2BAddendaErrataReplyData {

    @XmlElement(required = true)
    protected B2BInfoFile file;

    /**
     * Gets the value of the file property.
     * 
     * @return
     *     possible object is
     *     {@link B2BInfoFile }
     *     
     */
    public B2BInfoFile getFile() {
        return file;
    }

    /**
     * Sets the value of the file property.
     * 
     * @param value
     *     allowed object is
     *     {@link B2BInfoFile }
     *     
     */
    public void setFile(B2BInfoFile value) {
        this.file = value;
    }

}
