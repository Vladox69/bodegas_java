/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import webservice.ServiciosAdmin_Service;

/**
 *
 * @author usuario1
 */
@WebServlet(name = "Admin", urlPatterns = {"/Admin"})
public class Admin extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/servicio_bodega/ServiciosAdmin.wsdl")
    private ServiciosAdmin_Service service;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            String accion = request.getParameter("accion");
            if (accion.equals("cantidad")) {
                String prod = request.getParameter("producto");
                String bod = request.getParameter("ciudad");
                int cant = Integer.parseInt(request.getParameter("cantidad"));
                if (!prod.equals("Selecciona una Producto") || !bod.equals("Selecciona una ciudad") || cant > 0) {
                    actualizarCantidad(prod, bod, cant);
                } else {
                    out.println("<script> alert('Ingrese valores veribles') <script>");
                }
            }
            if (accion.equals("precio")) {
                String prod = request.getParameter("producto");
                double precio = Double.parseDouble(request.getParameter("precio"));
                if (!prod.equals("Selecciona una Producto") || precio > 0) {
                    actualizarPrecio(prod, precio);
                } else {
                    out.println("<script> alert('Ingrese valores veribles') <script>");
                }
            }
            request.getRequestDispatcher("admin.jsp").forward(request, response);
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

    private String actualizarCantidad(java.lang.String idPro, java.lang.String idBod, int cantidad) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservice.ServiciosAdmin port = service.getServiciosAdminPort();
        return port.actualizarCantidad(idPro, idBod, cantidad);
    }

    private String actualizarPrecio(java.lang.String idProd, double precio) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        webservice.ServiciosAdmin port = service.getServiciosAdminPort();
        return port.actualizarPrecio(idProd, precio);
    }

}
