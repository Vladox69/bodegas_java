
package webservice;

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
@WebService(name = "Vender", targetNamespace = "http://webservice/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Vender {


    /**
     * 
     * @param producto
     * @param cantidad
     * @param bodega
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "VenderProducto")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "VenderProducto", targetNamespace = "http://webservice/", className = "webservice.VenderProducto")
    @ResponseWrapper(localName = "VenderProductoResponse", targetNamespace = "http://webservice/", className = "webservice.VenderProductoResponse")
    @Action(input = "http://webservice/Vender/VenderProductoRequest", output = "http://webservice/Vender/VenderProductoResponse")
    public String venderProducto(
        @WebParam(name = "producto", targetNamespace = "")
        String producto,
        @WebParam(name = "bodega", targetNamespace = "")
        String bodega,
        @WebParam(name = "cantidad", targetNamespace = "")
        int cantidad);

}
