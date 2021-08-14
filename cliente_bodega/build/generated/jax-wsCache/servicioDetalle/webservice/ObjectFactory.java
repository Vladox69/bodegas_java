
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

    private final static QName _DetalleBodega_QNAME = new QName("http://webservice/", "DetalleBodega");
    private final static QName _DetalleBodegaResponse_QNAME = new QName("http://webservice/", "DetalleBodegaResponse");
    private final static QName _ListaGeneral_QNAME = new QName("http://webservice/", "ListaGeneral");
    private final static QName _ListaGeneralResponse_QNAME = new QName("http://webservice/", "ListaGeneralResponse");
    private final static QName _ListarStock_QNAME = new QName("http://webservice/", "ListarStock");
    private final static QName _ListarStockResponse_QNAME = new QName("http://webservice/", "ListarStockResponse");
    private final static QName _ProductoBuscado_QNAME = new QName("http://webservice/", "ProductoBuscado");
    private final static QName _ProductoBuscadoResponse_QNAME = new QName("http://webservice/", "ProductoBuscadoResponse");
    private final static QName _Hello_QNAME = new QName("http://webservice/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://webservice/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DetalleBodega }
     * 
     */
    public DetalleBodega createDetalleBodega() {
        return new DetalleBodega();
    }

    /**
     * Create an instance of {@link DetalleBodegaResponse }
     * 
     */
    public DetalleBodegaResponse createDetalleBodegaResponse() {
        return new DetalleBodegaResponse();
    }

    /**
     * Create an instance of {@link ListaGeneral }
     * 
     */
    public ListaGeneral createListaGeneral() {
        return new ListaGeneral();
    }

    /**
     * Create an instance of {@link ListaGeneralResponse }
     * 
     */
    public ListaGeneralResponse createListaGeneralResponse() {
        return new ListaGeneralResponse();
    }

    /**
     * Create an instance of {@link ListarStock }
     * 
     */
    public ListarStock createListarStock() {
        return new ListarStock();
    }

    /**
     * Create an instance of {@link ListarStockResponse }
     * 
     */
    public ListarStockResponse createListarStockResponse() {
        return new ListarStockResponse();
    }

    /**
     * Create an instance of {@link ProductoBuscado }
     * 
     */
    public ProductoBuscado createProductoBuscado() {
        return new ProductoBuscado();
    }

    /**
     * Create an instance of {@link ProductoBuscadoResponse }
     * 
     */
    public ProductoBuscadoResponse createProductoBuscadoResponse() {
        return new ProductoBuscadoResponse();
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
     * Create an instance of {@link Detalle }
     * 
     */
    public Detalle createDetalle() {
        return new Detalle();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetalleBodega }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "DetalleBodega")
    public JAXBElement<DetalleBodega> createDetalleBodega(DetalleBodega value) {
        return new JAXBElement<DetalleBodega>(_DetalleBodega_QNAME, DetalleBodega.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetalleBodegaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "DetalleBodegaResponse")
    public JAXBElement<DetalleBodegaResponse> createDetalleBodegaResponse(DetalleBodegaResponse value) {
        return new JAXBElement<DetalleBodegaResponse>(_DetalleBodegaResponse_QNAME, DetalleBodegaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaGeneral }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "ListaGeneral")
    public JAXBElement<ListaGeneral> createListaGeneral(ListaGeneral value) {
        return new JAXBElement<ListaGeneral>(_ListaGeneral_QNAME, ListaGeneral.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaGeneralResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "ListaGeneralResponse")
    public JAXBElement<ListaGeneralResponse> createListaGeneralResponse(ListaGeneralResponse value) {
        return new JAXBElement<ListaGeneralResponse>(_ListaGeneralResponse_QNAME, ListaGeneralResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarStock }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "ListarStock")
    public JAXBElement<ListarStock> createListarStock(ListarStock value) {
        return new JAXBElement<ListarStock>(_ListarStock_QNAME, ListarStock.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarStockResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "ListarStockResponse")
    public JAXBElement<ListarStockResponse> createListarStockResponse(ListarStockResponse value) {
        return new JAXBElement<ListarStockResponse>(_ListarStockResponse_QNAME, ListarStockResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductoBuscado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "ProductoBuscado")
    public JAXBElement<ProductoBuscado> createProductoBuscado(ProductoBuscado value) {
        return new JAXBElement<ProductoBuscado>(_ProductoBuscado_QNAME, ProductoBuscado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductoBuscadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "ProductoBuscadoResponse")
    public JAXBElement<ProductoBuscadoResponse> createProductoBuscadoResponse(ProductoBuscadoResponse value) {
        return new JAXBElement<ProductoBuscadoResponse>(_ProductoBuscadoResponse_QNAME, ProductoBuscadoResponse.class, null, value);
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
