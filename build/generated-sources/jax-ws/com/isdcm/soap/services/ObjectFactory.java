
package com.isdcm.soap.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.isdcm.soap.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SearchByCreationDateRequest_QNAME = new QName("http://services.soap.isdcm.com/", "SearchByCreationDateRequest");
    private final static QName _SearchByAuthor_QNAME = new QName("http://services.soap.isdcm.com/", "searchByAuthor");
    private final static QName _SearchByAuthorResponse_QNAME = new QName("http://services.soap.isdcm.com/", "searchByAuthorResponse");
    private final static QName _SearchByCreationDate_QNAME = new QName("http://services.soap.isdcm.com/", "searchByCreationDate");
    private final static QName _SearchByCreationDateResponse_QNAME = new QName("http://services.soap.isdcm.com/", "searchByCreationDateResponse");
    private final static QName _SearchByTitle_QNAME = new QName("http://services.soap.isdcm.com/", "searchByTitle");
    private final static QName _SearchByTitleResponse_QNAME = new QName("http://services.soap.isdcm.com/", "searchByTitleResponse");
    private final static QName _Video_QNAME = new QName("http://services.soap.isdcm.com/", "video");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.isdcm.soap.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchByCreationDateRequest }
     * 
     */
    public SearchByCreationDateRequest createSearchByCreationDateRequest() {
        return new SearchByCreationDateRequest();
    }

    /**
     * Create an instance of {@link SearchByAuthor }
     * 
     */
    public SearchByAuthor createSearchByAuthor() {
        return new SearchByAuthor();
    }

    /**
     * Create an instance of {@link SearchByAuthorResponse }
     * 
     */
    public SearchByAuthorResponse createSearchByAuthorResponse() {
        return new SearchByAuthorResponse();
    }

    /**
     * Create an instance of {@link SearchByCreationDate }
     * 
     */
    public SearchByCreationDate createSearchByCreationDate() {
        return new SearchByCreationDate();
    }

    /**
     * Create an instance of {@link SearchByCreationDateResponse }
     * 
     */
    public SearchByCreationDateResponse createSearchByCreationDateResponse() {
        return new SearchByCreationDateResponse();
    }

    /**
     * Create an instance of {@link SearchByTitle }
     * 
     */
    public SearchByTitle createSearchByTitle() {
        return new SearchByTitle();
    }

    /**
     * Create an instance of {@link SearchByTitleResponse }
     * 
     */
    public SearchByTitleResponse createSearchByTitleResponse() {
        return new SearchByTitleResponse();
    }

    /**
     * Create an instance of {@link VideoDTO }
     * 
     */
    public VideoDTO createVideoDTO() {
        return new VideoDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByCreationDateRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soap.isdcm.com/", name = "SearchByCreationDateRequest")
    public JAXBElement<SearchByCreationDateRequest> createSearchByCreationDateRequest(SearchByCreationDateRequest value) {
        return new JAXBElement<SearchByCreationDateRequest>(_SearchByCreationDateRequest_QNAME, SearchByCreationDateRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByAuthor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soap.isdcm.com/", name = "searchByAuthor")
    public JAXBElement<SearchByAuthor> createSearchByAuthor(SearchByAuthor value) {
        return new JAXBElement<SearchByAuthor>(_SearchByAuthor_QNAME, SearchByAuthor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByAuthorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soap.isdcm.com/", name = "searchByAuthorResponse")
    public JAXBElement<SearchByAuthorResponse> createSearchByAuthorResponse(SearchByAuthorResponse value) {
        return new JAXBElement<SearchByAuthorResponse>(_SearchByAuthorResponse_QNAME, SearchByAuthorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByCreationDate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soap.isdcm.com/", name = "searchByCreationDate")
    public JAXBElement<SearchByCreationDate> createSearchByCreationDate(SearchByCreationDate value) {
        return new JAXBElement<SearchByCreationDate>(_SearchByCreationDate_QNAME, SearchByCreationDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByCreationDateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soap.isdcm.com/", name = "searchByCreationDateResponse")
    public JAXBElement<SearchByCreationDateResponse> createSearchByCreationDateResponse(SearchByCreationDateResponse value) {
        return new JAXBElement<SearchByCreationDateResponse>(_SearchByCreationDateResponse_QNAME, SearchByCreationDateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByTitle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soap.isdcm.com/", name = "searchByTitle")
    public JAXBElement<SearchByTitle> createSearchByTitle(SearchByTitle value) {
        return new JAXBElement<SearchByTitle>(_SearchByTitle_QNAME, SearchByTitle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchByTitleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soap.isdcm.com/", name = "searchByTitleResponse")
    public JAXBElement<SearchByTitleResponse> createSearchByTitleResponse(SearchByTitleResponse value) {
        return new JAXBElement<SearchByTitleResponse>(_SearchByTitleResponse_QNAME, SearchByTitleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VideoDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.soap.isdcm.com/", name = "video")
    public JAXBElement<VideoDTO> createVideo(VideoDTO value) {
        return new JAXBElement<VideoDTO>(_Video_QNAME, VideoDTO.class, null, value);
    }

}
