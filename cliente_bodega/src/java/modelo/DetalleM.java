/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author ASUS
 */
public class DetalleM {

    public  java.util.List<webservice.Detalle> detalleBodega(java.lang.String idbod) {
        webservice.ServicioDetalle_Service service = new webservice.ServicioDetalle_Service();
        webservice.ServicioDetalle port = service.getServicioDetallePort();
        return port.detalleBodega(idbod);
    }
    
}
