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
import models.Bodega;
import providers.BodegaProvider;

/**
 *
 * @author ASUS
 */
@WebService(serviceName = "servicioBodega")
public class servicioBodega {
    BodegaProvider bodegaProvider=new BodegaProvider();
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
    @WebMethod(operationName = "Listar")
    public List<Bodega> Listar() {
        List bodegas=bodegaProvider.listarBodegas();
        return bodegas;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "buscarBodega")
    public Bodega buscarBodega(@WebParam(name = "ciudad") String ciudad) {
        Bodega bodega=bodegaProvider.buscarBodega(ciudad);
        return bodega;
    }
}
