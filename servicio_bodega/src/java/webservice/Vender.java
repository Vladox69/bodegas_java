/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservice;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import providers.VenderProductos;

/**
 *
 * @author usuario1
 */
@WebService(serviceName = "Vender")
public class Vender {

    VenderProductos vp = new VenderProductos();
    @WebMethod(operationName = "VenderProducto")
    public String VenderProducto(@WebParam(name = "producto") String producto, @WebParam(name = "bodega") String bodega, @WebParam(name = "cantidad") int cantidad) {
        String vendido = vp.venderProducto(producto, bodega, cantidad);
        return vendido;
    }
}
