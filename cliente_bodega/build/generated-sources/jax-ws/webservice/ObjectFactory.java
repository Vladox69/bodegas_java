
package webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice package. 
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

    private final static QName _ListarBodegas_QNAME = new QName("http://webservice/", "ListarBodegas");
    private final static QName _ListarBodegasResponse_QNAME = new QName("http://webservice/", "ListarBodegasResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarBodegas }
     * 
     */
    public ListarBodegas createListarBodegas() {
        return new ListarBodegas();
    }

    /**
     * Create an instance of {@link ListarBodegasResponse }
     * 
     */
    public ListarBodegasResponse createListarBodegasResponse() {
        return new ListarBodegasResponse();
    }

    /**
     * Create an instance of {@link DetalleAdmin }
     * 
     */
    public DetalleAdmin createDetalleAdmin() {
        return new DetalleAdmin();
    }

    /**
     * Create an instance of {@link Detalle }
     * 
     */
    public Detalle createDetalle() {
        return new Detalle();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarBodegas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "ListarBodegas")
    public JAXBElement<ListarBodegas> createListarBodegas(ListarBodegas value) {
        return new JAXBElement<ListarBodegas>(_ListarBodegas_QNAME, ListarBodegas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarBodegasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "ListarBodegasResponse")
    public JAXBElement<ListarBodegasResponse> createListarBodegasResponse(ListarBodegasResponse value) {
        return new JAXBElement<ListarBodegasResponse>(_ListarBodegasResponse_QNAME, ListarBodegasResponse.class, null, value);
    }

}
