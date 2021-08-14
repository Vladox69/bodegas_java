
package webservice;

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
 * JAX-WS RI 2.3.1
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServiciosAdmin", targetNamespace = "http://webservice/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServiciosAdmin {


    /**
     * 
     * @param precio
     * @param idProd
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ActualizarPrecio")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ActualizarPrecio", targetNamespace = "http://webservice/", className = "webservice.ActualizarPrecio")
    @ResponseWrapper(localName = "ActualizarPrecioResponse", targetNamespace = "http://webservice/", className = "webservice.ActualizarPrecioResponse")
    @Action(input = "http://webservice/ServiciosAdmin/ActualizarPrecioRequest", output = "http://webservice/ServiciosAdmin/ActualizarPrecioResponse")
    public String actualizarPrecio(
        @WebParam(name = "idProd", targetNamespace = "")
        String idProd,
        @WebParam(name = "precio", targetNamespace = "")
        double precio);

    /**
     * 
     * @return
     *     returns java.util.List<webservice.Bodega>
     */
    @WebMethod(operationName = "Ciudades")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Ciudades", targetNamespace = "http://webservice/", className = "webservice.Ciudades")
    @ResponseWrapper(localName = "CiudadesResponse", targetNamespace = "http://webservice/", className = "webservice.CiudadesResponse")
    @Action(input = "http://webservice/ServiciosAdmin/CiudadesRequest", output = "http://webservice/ServiciosAdmin/CiudadesResponse")
    public List<Bodega> ciudades();

    /**
     * 
     * @param idPro
     * @param idBod
     * @param cantidad
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "ActualizarCantidad")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ActualizarCantidad", targetNamespace = "http://webservice/", className = "webservice.ActualizarCantidad")
    @ResponseWrapper(localName = "ActualizarCantidadResponse", targetNamespace = "http://webservice/", className = "webservice.ActualizarCantidadResponse")
    @Action(input = "http://webservice/ServiciosAdmin/ActualizarCantidadRequest", output = "http://webservice/ServiciosAdmin/ActualizarCantidadResponse")
    public String actualizarCantidad(
        @WebParam(name = "idPro", targetNamespace = "")
        String idPro,
        @WebParam(name = "idBod", targetNamespace = "")
        String idBod,
        @WebParam(name = "cantidad", targetNamespace = "")
        int cantidad);

    /**
     * 
     * @return
     *     returns java.util.List<webservice.Producto>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "productos", targetNamespace = "http://webservice/", className = "webservice.Productos")
    @ResponseWrapper(localName = "productosResponse", targetNamespace = "http://webservice/", className = "webservice.ProductosResponse")
    @Action(input = "http://webservice/ServiciosAdmin/productosRequest", output = "http://webservice/ServiciosAdmin/productosResponse")
    public List<Producto> productos();

    /**
     * 
     * @return
     *     returns java.util.List<webservice.DetalleAdmin>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarBodegas", targetNamespace = "http://webservice/", className = "webservice.ListarBodegas")
    @ResponseWrapper(localName = "listarBodegasResponse", targetNamespace = "http://webservice/", className = "webservice.ListarBodegasResponse")
    @Action(input = "http://webservice/ServiciosAdmin/listarBodegasRequest", output = "http://webservice/ServiciosAdmin/listarBodegasResponse")
    public List<DetalleAdmin> listarBodegas();

}
