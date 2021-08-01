/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservice;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import models.Detalle;
import providers.DetalleProvider;

/**
 *
 * @author ASUS
 */
@WebService(serviceName = "servicioDetalle")
public class servicioDetalle {
    DetalleProvider detalleProvider=new DetalleProvider();
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ListaGeneral")
    public List<Detalle> ListaGeneral() {
        List<Detalle> detalle_general=detalleProvider.listarDetalle();
        return detalle_general;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ListarStock")
    public List<Detalle> ListarStock() {
        List<Detalle> detalle_stock=detalleProvider.listadoProductosStock();
        return detalle_stock;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ProductoBuscado")
    public List<Detalle> ProductoBuscado(@WebParam(name = "idprod") String idprod) {
        List<Detalle> producto_buscado=detalleProvider.listadoProductoBuscado(idprod);
        return producto_buscado;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "DetalleBodega")
    public List<Detalle> DetalleBodega(@WebParam(name = "idbod") String idbod) {
        List<Detalle> detalle_bodega=detalleProvider.listadoProductosBodega(idbod);
        return detalle_bodega;
    }

}
