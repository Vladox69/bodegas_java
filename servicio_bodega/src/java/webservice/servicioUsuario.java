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
import models.Usuario;
import providers.UsuarioProvider;

/**
 *
 * @author ASUS
 */
@WebService(serviceName = "servicioUsuario")
public class servicioUsuario {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     * Listar los uaurios
     */
    UsuarioProvider usuarioProvider=new UsuarioProvider();
    @WebMethod(operationName = "Listar")
    public List<Usuario> Listar() {
        List usuario =usuarioProvider.listarUsuario();
        return usuario;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "buscarUsuario")
    public Usuario buscarUsuario(@WebParam(name = "nombre") String nombre) {
        Usuario usuario= usuarioProvider.buscarUsuario(nombre);
        return usuario;
    }
}
