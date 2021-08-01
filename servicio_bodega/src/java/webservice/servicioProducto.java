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
import models.Producto;
import providers.ProductoProvider;

/**
 *
 * @author ASUS
 */
@WebService(serviceName = "servicioProducto")
public class servicioProducto {
    
    ProductoProvider productoProvider=new ProductoProvider();
    
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
    public List<Producto> Listar() {
        List productos=productoProvider.listarProductos();
        return productos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "buscarProducto")
    public Producto buscarProducto(@WebParam(name = "nombre") String nombre) {
        Producto producto =productoProvider.buscarProducto(nombre);
        return producto;
    }
}
