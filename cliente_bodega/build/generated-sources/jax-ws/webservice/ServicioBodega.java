
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
@WebService(name = "servicioBodega", targetNamespace = "http://webservice/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServicioBodega {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://webservice/", className = "webservice.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://webservice/", className = "webservice.HelloResponse")
    @Action(input = "http://webservice/servicioBodega/helloRequest", output = "http://webservice/servicioBodega/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @return
     *     returns java.util.List<webservice.Bodega>
     */
    @WebMethod(operationName = "Listar")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Listar", targetNamespace = "http://webservice/", className = "webservice.Listar")
    @ResponseWrapper(localName = "ListarResponse", targetNamespace = "http://webservice/", className = "webservice.ListarResponse")
    @Action(input = "http://webservice/servicioBodega/ListarRequest", output = "http://webservice/servicioBodega/ListarResponse")
    public List<Bodega> listar();

    /**
     * 
     * @param ciudad
     * @return
     *     returns webservice.Bodega
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarBodega", targetNamespace = "http://webservice/", className = "webservice.BuscarBodega")
    @ResponseWrapper(localName = "buscarBodegaResponse", targetNamespace = "http://webservice/", className = "webservice.BuscarBodegaResponse")
    @Action(input = "http://webservice/servicioBodega/buscarBodegaRequest", output = "http://webservice/servicioBodega/buscarBodegaResponse")
    public Bodega buscarBodega(
        @WebParam(name = "ciudad", targetNamespace = "")
        String ciudad);

}
