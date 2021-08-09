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
}
