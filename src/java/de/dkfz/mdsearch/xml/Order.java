
/*
 * Copyright (c) 2018. dkfz
 *
 * Distributed under the MIT License (license terms are at https://github.com/eilslabs/MdsSearchTool/blob/master/LICENSE).
 *
 *
 */

package de.dkfz.mdsearch.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Ascending" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element ref="{http://schema.samply.de/ccp/MdrKey}MdrKey"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "Order", namespace = "http://schema.samply.de/ccp/Query")
public class Order {

    @XmlElement(name = "Ascending", defaultValue = "true")
    protected boolean ascending;
    @XmlElement(name = "MdrKey", namespace = "http://schema.samply.de/ccp/MdrKey", required = true)
    protected String mdrKey;

    /**
     * Ruft den Wert der ascending-Eigenschaft ab.
     * 
     */
    public boolean isAscending() {
        return ascending;
    }

    /**
     * Legt den Wert der ascending-Eigenschaft fest.
     * 
     */
    public void setAscending(boolean value) {
        this.ascending = value;
    }

    /**
     * Ruft den Wert der mdrKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdrKey() {
        return mdrKey;
    }

    /**
     * Legt den Wert der mdrKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdrKey(String value) {
        this.mdrKey = value;
    }

}
