
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

    private final static QName _Listar_QNAME = new QName("http://webservice/", "Listar");
    private final static QName _ListarResponse_QNAME = new QName("http://webservice/", "ListarResponse");
    private final static QName _BuscarBodega_QNAME = new QName("http://webservice/", "buscarBodega");
    private final static QName _BuscarBodegaResponse_QNAME = new QName("http://webservice/", "buscarBodegaResponse");
    private final static QName _Hello_QNAME = new QName("http://webservice/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://webservice/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Listar }
     * 
     */
    public Listar createListar() {
        return new Listar();
    }

    /**
     * Create an instance of {@link ListarResponse }
     * 
     */
    public ListarResponse createListarResponse() {
        return new ListarResponse();
    }

    /**
     * Create an instance of {@link BuscarBodega }
     * 
     */
    public BuscarBodega createBuscarBodega() {
        return new BuscarBodega();
    }

    /**
     * Create an instance of {@link BuscarBodegaResponse }
     * 
     */
    public BuscarBodegaResponse createBuscarBodegaResponse() {
        return new BuscarBodegaResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Bodega }
     * 
     */
    public Bodega createBodega() {
        return new Bodega();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Listar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "Listar")
    public JAXBElement<Listar> createListar(Listar value) {
        return new JAXBElement<Listar>(_Listar_QNAME, Listar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "ListarResponse")
    public JAXBElement<ListarResponse> createListarResponse(ListarResponse value) {
        return new JAXBElement<ListarResponse>(_ListarResponse_QNAME, ListarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarBodega }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "buscarBodega")
    public JAXBElement<BuscarBodega> createBuscarBodega(BuscarBodega value) {
        return new JAXBElement<BuscarBodega>(_BuscarBodega_QNAME, BuscarBodega.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarBodegaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "buscarBodegaResponse")
    public JAXBElement<BuscarBodegaResponse> createBuscarBodegaResponse(BuscarBodegaResponse value) {
        return new JAXBElement<BuscarBodegaResponse>(_BuscarBodegaResponse_QNAME, BuscarBodegaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
