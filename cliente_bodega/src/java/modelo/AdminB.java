package modelo;

/**
 *
 * @author usuario1
 */
public class AdminB {

    public AdminB() {
    }

    public static java.util.List<webservice.DetalleAdmin> listarBodegas() {
        webservice.ServiciosAdmin_Service service = new webservice.ServiciosAdmin_Service();
        webservice.ServiciosAdmin port = service.getServiciosAdminPort();
        return port.listarBodegas();
    }
    
   
}
