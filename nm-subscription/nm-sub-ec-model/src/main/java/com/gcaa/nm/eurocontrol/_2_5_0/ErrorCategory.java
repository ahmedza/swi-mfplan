//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.08 at 11:11:39 PM GST 
//


package com.gcaa.nm.eurocontrol._2_5_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrorCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ErrorCategory"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GEN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ErrorCategory", namespace = "eurocontrol/cfmu/b2b/CommonServices")
@XmlEnum
public enum ErrorCategory {

    GEN;

    public String value() {
        return name();
    }

    public static ErrorCategory fromValue(String v) {
        return valueOf(v);
    }

}
