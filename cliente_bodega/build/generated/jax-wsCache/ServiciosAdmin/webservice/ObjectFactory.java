
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

    private final static QName _ActualizarCantidad_QNAME = new QName("http://webservice/", "ActualizarCantidad");
    private final static QName _ActualizarCantidadResponse_QNAME = new QName("http://webservice/", "ActualizarCantidadResponse");
    private final static QName _ActualizarPrecio_QNAME = new QName("http://webservice/", "ActualizarPrecio");
    private final static QName _ActualizarPrecioResponse_QNAME = new QName("http://webservice/", "ActualizarPrecioResponse");
    private final static QName _Ciudades_QNAME = new QName("http://webservice/", "Ciudades");
    private final static QName _CiudadesResponse_QNAME = new QName("http://webservice/", "CiudadesResponse");
    private final static QName _ListarBodegas_QNAME = new QName("http://webservice/", "listarBodegas");
    private final static QName _ListarBodegasResponse_QNAME = new QName("http://webservice/", "listarBodegasResponse");
    private final static QName _Productos_QNAME = new QName("http://webservice/", "productos");
    private final static QName _ProductosResponse_QNAME = new QName("http://webservice/", "productosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActualizarCantidad }
     * 
     */
    public ActualizarCantidad createActualizarCantidad() {
        return new ActualizarCantidad();
    }

    /**
     * Create an instance of {@link ActualizarCantidadResponse }
     * 
     */
    public ActualizarCantidadResponse createActualizarCantidadResponse() {
        return new ActualizarCantidadResponse();
    }

    /**
     * Create an instance of {@link ActualizarPrecio }
     * 
     */
    public ActualizarPrecio createActualizarPrecio() {
        return new ActualizarPrecio();
    }

    /**
     * Create an instance of {@link ActualizarPrecioResponse }
     * 
     */
    public ActualizarPrecioResponse createActualizarPrecioResponse() {
        return new ActualizarPrecioResponse();
    }

    /**
     * Create an instance of {@link Ciudades }
     * 
     */
    public Ciudades createCiudades() {
        return new Ciudades();
    }

    /**
     * Create an instance of {@link CiudadesResponse }
     * 
     */
    public CiudadesResponse createCiudadesResponse() {
        return new CiudadesResponse();
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
     * Create an instance of {@link Productos }
     * 
     */
    public Productos createProductos() {
        return new Productos();
    }

    /**
     * Create an instance of {@link ProductosResponse }
     * 
     */
    public ProductosResponse createProductosResponse() {
        return new ProductosResponse();
    }

    /**
     * Create an instance of {@link Bodega }
     * 
     */
    public Bodega createBodega() {
        return new Bodega();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarCantidad }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActualizarCantidad }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "ActualizarCantidad")
    public JAXBElement<ActualizarCantidad> createActualizarCantidad(ActualizarCantidad value) {
        return new JAXBElement<ActualizarCantidad>(_ActualizarCantidad_QNAME, ActualizarCantidad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarCantidadResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActualizarCantidadResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "ActualizarCantidadResponse")
    public JAXBElement<ActualizarCantidadResponse> createActualizarCantidadResponse(ActualizarCantidadResponse value) {
        return new JAXBElement<ActualizarCantidadResponse>(_ActualizarCantidadResponse_QNAME, ActualizarCantidadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarPrecio }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActualizarPrecio }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "ActualizarPrecio")
    public JAXBElement<ActualizarPrecio> createActualizarPrecio(ActualizarPrecio value) {
        return new JAXBElement<ActualizarPrecio>(_ActualizarPrecio_QNAME, ActualizarPrecio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarPrecioResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ActualizarPrecioResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "ActualizarPrecioResponse")
    public JAXBElement<ActualizarPrecioResponse> createActualizarPrecioResponse(ActualizarPrecioResponse value) {
        return new JAXBElement<ActualizarPrecioResponse>(_ActualizarPrecioResponse_QNAME, ActualizarPrecioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ciudades }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Ciudades }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "Ciudades")
    public JAXBElement<Ciudades> createCiudades(Ciudades value) {
        return new JAXBElement<Ciudades>(_Ciudades_QNAME, Ciudades.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CiudadesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CiudadesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "CiudadesResponse")
    public JAXBElement<CiudadesResponse> createCiudadesResponse(CiudadesResponse value) {
        return new JAXBElement<CiudadesResponse>(_CiudadesResponse_QNAME, CiudadesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarBodegas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarBodegas }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "listarBodegas")
    public JAXBElement<ListarBodegas> createListarBodegas(ListarBodegas value) {
        return new JAXBElement<ListarBodegas>(_ListarBodegas_QNAME, ListarBodegas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarBodegasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarBodegasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "listarBodegasResponse")
    public JAXBElement<ListarBodegasResponse> createListarBodegasResponse(ListarBodegasResponse value) {
        return new JAXBElement<ListarBodegasResponse>(_ListarBodegasResponse_QNAME, ListarBodegasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Productos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Productos }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "productos")
    public JAXBElement<Productos> createProductos(Productos value) {
        return new JAXBElement<Productos>(_Productos_QNAME, Productos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProductosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "productosResponse")
    public JAXBElement<ProductosResponse> createProductosResponse(ProductosResponse value) {
        return new JAXBElement<ProductosResponse>(_ProductosResponse_QNAME, ProductosResponse.class, null, value);
    }

}
