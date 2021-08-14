
package webservices;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.1
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "servicioUsuario", targetNamespace = "http://webservice/", wsdlLocation = "http://localhost:8080/servicio_bodega/servicioUsuario?wsdl")
public class ServicioUsuario_Service
    extends Service
{

    private final static URL SERVICIOUSUARIO_WSDL_LOCATION;
    private final static WebServiceException SERVICIOUSUARIO_EXCEPTION;
    private final static QName SERVICIOUSUARIO_QNAME = new QName("http://webservice/", "servicioUsuario");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/servicio_bodega/servicioUsuario?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICIOUSUARIO_WSDL_LOCATION = url;
        SERVICIOUSUARIO_EXCEPTION = e;
    }

    public ServicioUsuario_Service() {
        super(__getWsdlLocation(), SERVICIOUSUARIO_QNAME);
    }

    public ServicioUsuario_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICIOUSUARIO_QNAME, features);
    }

    public ServicioUsuario_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICIOUSUARIO_QNAME);
    }

    public ServicioUsuario_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICIOUSUARIO_QNAME, features);
    }

    public ServicioUsuario_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServicioUsuario_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServicioUsuario
     */
    @WebEndpoint(name = "servicioUsuarioPort")
    public ServicioUsuario getServicioUsuarioPort() {
        return super.getPort(new QName("http://webservice/", "servicioUsuarioPort"), ServicioUsuario.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServicioUsuario
     */
    @WebEndpoint(name = "servicioUsuarioPort")
    public ServicioUsuario getServicioUsuarioPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice/", "servicioUsuarioPort"), ServicioUsuario.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICIOUSUARIO_EXCEPTION!= null) {
            throw SERVICIOUSUARIO_EXCEPTION;
        }
        return SERVICIOUSUARIO_WSDL_LOCATION;
    }

}
