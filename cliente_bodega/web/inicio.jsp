<%-- 
    Document   : Inicio.jsp
    Created on : 14/08/2021, 11:00:26
    Author     : ASUS
--%>

<%@page import="webservice.Detalle"%>
<%@page import="webservices.Usuario"%>
<%@page import="modelo.DetalleM"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
            <%
                 Usuario u =(Usuario) session.getAttribute("usuarioValido");
            %>
         <header class="contenedor">
            <nav class="navegacion">
                <a href="Navegacion?accion=inicio">Inicio</a>
                <a href="Navegacion?accion=admin">ADMIN</a>
                <a href="Navegacion?accion=producto">Producto</a>
                <a href="Navegacion?accion=cerrar">Cerrar sesión</a>
            </nav>
        </header>
        
       <main>
            <h1>Inicio</h1>
             <table>
                <tr>
                    <td><b>NOMBRE</b></td>
                    <td><b>CIUDAD</b></td>
                    <td><b>CANTIDAD</b></td>
                    <td><b>ESTADO</b></td>
                </tr>
                <%
                    DetalleM detalleM = new DetalleM();
                    List<Detalle> lista = detalleM.detalleBodega(u.getIdbod() );
                    for (Detalle bodega : lista) {
                %>
                <tr>
                    <td><%= bodega.getIdprod()%></td>
                    <td><%= bodega.getIdbod()%></td>
                    <td><%= bodega.getCantidad()%></td>
                    <td><%= bodega.getEstado()%></td>
                    
                </tr>
                <% }%>
            </table>
        </main>
    </body>
</html>
