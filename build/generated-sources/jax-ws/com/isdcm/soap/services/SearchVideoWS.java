
package com.isdcm.soap.services;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SearchVideoWS", targetNamespace = "http://services.soap.isdcm.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SearchVideoWS {


    /**
     * 
     * @param searchByCreationDateRequest
     * @return
     *     returns java.util.List<com.isdcm.soap.services.VideoDTO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchByCreationDate", targetNamespace = "http://services.soap.isdcm.com/", className = "com.isdcm.soap.services.SearchByCreationDate")
    @ResponseWrapper(localName = "searchByCreationDateResponse", targetNamespace = "http://services.soap.isdcm.com/", className = "com.isdcm.soap.services.SearchByCreationDateResponse")
    @Action(input = "http://services.soap.isdcm.com/SearchVideoWS/searchByCreationDateRequest", output = "http://services.soap.isdcm.com/SearchVideoWS/searchByCreationDateResponse")
    public List<VideoDTO> searchByCreationDate(
        @WebParam(name = "searchByCreationDateRequest", targetNamespace = "")
        SearchByCreationDateRequest searchByCreationDateRequest);

    /**
     * 
     * @param author
     * @return
     *     returns java.util.List<com.isdcm.soap.services.VideoDTO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchByAuthor", targetNamespace = "http://services.soap.isdcm.com/", className = "com.isdcm.soap.services.SearchByAuthor")
    @ResponseWrapper(localName = "searchByAuthorResponse", targetNamespace = "http://services.soap.isdcm.com/", className = "com.isdcm.soap.services.SearchByAuthorResponse")
    @Action(input = "http://services.soap.isdcm.com/SearchVideoWS/searchByAuthorRequest", output = "http://services.soap.isdcm.com/SearchVideoWS/searchByAuthorResponse")
    public List<VideoDTO> searchByAuthor(
        @WebParam(name = "author", targetNamespace = "")
        String author);

    /**
     * 
     * @param title
     * @return
     *     returns java.util.List<com.isdcm.soap.services.VideoDTO>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "searchByTitle", targetNamespace = "http://services.soap.isdcm.com/", className = "com.isdcm.soap.services.SearchByTitle")
    @ResponseWrapper(localName = "searchByTitleResponse", targetNamespace = "http://services.soap.isdcm.com/", className = "com.isdcm.soap.services.SearchByTitleResponse")
    @Action(input = "http://services.soap.isdcm.com/SearchVideoWS/searchByTitleRequest", output = "http://services.soap.isdcm.com/SearchVideoWS/searchByTitleResponse")
    public List<VideoDTO> searchByTitle(
        @WebParam(name = "title", targetNamespace = "")
        String title);

}
