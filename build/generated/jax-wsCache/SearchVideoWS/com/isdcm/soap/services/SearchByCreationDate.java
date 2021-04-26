
package com.isdcm.soap.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para searchByCreationDate complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="searchByCreationDate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="searchByCreationDateRequest" type="{http://services.soap.isdcm.com/}searchByCreationDateRequest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchByCreationDate", propOrder = {
    "searchByCreationDateRequest"
})
public class SearchByCreationDate {

    protected SearchByCreationDateRequest searchByCreationDateRequest;

    /**
     * Obtiene el valor de la propiedad searchByCreationDateRequest.
     * 
     * @return
     *     possible object is
     *     {@link SearchByCreationDateRequest }
     *     
     */
    public SearchByCreationDateRequest getSearchByCreationDateRequest() {
        return searchByCreationDateRequest;
    }

    /**
     * Define el valor de la propiedad searchByCreationDateRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchByCreationDateRequest }
     *     
     */
    public void setSearchByCreationDateRequest(SearchByCreationDateRequest value) {
        this.searchByCreationDateRequest = value;
    }

}
