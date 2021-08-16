
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

    private final static QName _VenderProducto_QNAME = new QName("http://webservice/", "VenderProducto");
    private final static QName _VenderProductoResponse_QNAME = new QName("http://webservice/", "VenderProductoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VenderProducto }
     * 
     */
    public VenderProducto createVenderProducto() {
        return new VenderProducto();
    }

    /**
     * Create an instance of {@link VenderProductoResponse }
     * 
     */
    public VenderProductoResponse createVenderProductoResponse() {
        return new VenderProductoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VenderProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "VenderProducto")
    public JAXBElement<VenderProducto> createVenderProducto(VenderProducto value) {
        return new JAXBElement<VenderProducto>(_VenderProducto_QNAME, VenderProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VenderProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "VenderProductoResponse")
    public JAXBElement<VenderProductoResponse> createVenderProductoResponse(VenderProductoResponse value) {
        return new JAXBElement<VenderProductoResponse>(_VenderProductoResponse_QNAME, VenderProductoResponse.class, null, value);
    }

}
