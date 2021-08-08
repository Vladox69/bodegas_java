/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import modelo.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceRef;
import modelo.Cliente;
import webservices.ServicioUsuario_Service;
import webservices.Usuario;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/servicio_bodega/servicioUsuario.wsdl")
    private ServicioUsuario_Service service;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private Usuario validarUsuario(java.lang.String nombre, java.lang.String contra) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservices.ServicioUsuario port = service.getServicioUsuarioPort();
        return port.validarUsuario(nombre, contra);
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        if (request.getParameter("login") != null) {
            String usuario = request.getParameter("usuario");
            String contra = request.getParameter("contra");
            HttpSession sesion = request.getSession();
            Usuario u = validarUsuario(usuario, contra);
            
            if( u == null ){
                out.print("Usuario o contraseña incorrecta");
                response.sendRedirect("index.jsp");
            }else if (u != null && u.getPerfil().equalsIgnoreCase("admin")) {
                sesion.setAttribute("usuarioValido", "1");
                sesion.setAttribute("usuarioValido", u.getNombre());
                //Si el usuario es valida se redirecciona a la ventana de admin
                response.sendRedirect("admin.jsp");
            } else if (u != null && u.getPerfil().equalsIgnoreCase("vendedor")) {
                sesion.setAttribute("usuarioValido", "1");
                sesion.setAttribute("usuarioValido", u.getNombre());
                //Si el usuario es valida se redirecciona a la ventana del vendedor
                response.sendRedirect("admin.jsp");
            }

        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    

}
