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
import models.DetalleAdmin;
import models.Producto;
import models.Bodega;
import providers.Admin;

/**
 *
 * @author usuario1
 */
@WebService(serviceName = "ServiciosAdmin")
public class ServiciosAdmin {

    /**
     * Web service operation
     */
    Admin ad = new Admin();
    @WebMethod(operationName = "listarBodegas")
    public List<DetalleAdmin> listarBodegas() {
        List datos = ad.listarBodegas();
        return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ActualizarCantidad")
    public String ActualizarCantidad(@WebParam(name = "idPro") String idPro, @WebParam(name = "idBod") String idBod, @WebParam(name = "cantidad") int cantidad) {
        String update1 = ad.actualizarCantidad(idPro, idBod, cantidad);
        return update1;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "productos")
    public List<Producto> productos() {
        List prod = ad.listarProductos();
        return prod;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Ciudades")
    public List<Bodega> Ciudades() {
        List ciudad = ad.listarBodegas2();
        return ciudad;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ActualizarPrecio")
    public String ActualizarPrecio(@WebParam(name = "idProd") String idProd, @WebParam(name = "precio") double precio) {
        String update2 = ad.actualizarPrecio(idProd, precio);
        return update2;
    }
}
