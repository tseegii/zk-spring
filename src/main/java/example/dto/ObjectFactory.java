
package example.dto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the example.dto package. 
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

    private final static QName _PersonListResponse_QNAME = new QName("http://www.frunix.org/schemas/personList", "personListResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: example.dto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PersonListResponse.Persons }
     * 
     */
    public PersonListResponse.Persons createPersonListResponsePersons() {
        return new PersonListResponse.Persons();
    }

    /**
     * Create an instance of {@link PersonDto }
     * 
     */
    public PersonDto createPerson() {
        return new PersonDto();
    }

    /**
     * Create an instance of {@link PersonListRequest }
     * 
     */
    public PersonListRequest createPersonListRequest() {
        return new PersonListRequest();
    }

    /**
     * Create an instance of {@link PersonListResponse }
     * 
     */
    public PersonListResponse createPersonListResponse() {
        return new PersonListResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.frunix.org/schemas/personList", name = "personListResponse")
    public JAXBElement<PersonListResponse> createPersonListResponse(PersonListResponse value) {
        return new JAXBElement<PersonListResponse>(_PersonListResponse_QNAME, PersonListResponse.class, null, value);
    }

}
