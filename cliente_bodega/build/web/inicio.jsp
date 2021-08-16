<%-- 
    Document   : inicio.jsp
    Created on : 14-ago-2021, 14:12:33
    Author     : usuario1
--%>

<%@page import="webservices.Usuario"%>
<%@page import="webservice.Producto"%>
<%@page import="webservice.Bodega"%>
<%@page import="modelo.AdminB"%>
<%@page import="webservice.Detalle"%>
<%@page import="java.util.List"%>
<%@page import="modelo.DetalleM"%>
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
            Usuario u = (Usuario) session.getAttribute("usuarioValido");
            if(u.getPerfil().equalsIgnoreCase("admin")){
        %>
        <header class="contenedor">
            <nav class="navegacion">
                <a href="Navegacion?accion=inicio">Inicio</a>
                <a href="Navegacion?accion=admin">ADMIN</a>
                <a href="Navegacion?accion=producto">Producto</a>
                <a href="Navegacion?accion=cerrar">Cerrar sesión</a>
            </nav>
        </header>
        <%}else{%>
        <header class="contenedor">
            <nav class="navegacion">
                <a href="Navegacion?accion=inicio">Inicio</a>
                <a href="Navegacion?accion=producto">Producto</a>
                <a href="Navegacion?accion=cerrar">Cerrar sesión</a>
            </nav>
        </header>
        <%}%>
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
                    List<Detalle> lista = detalleM.detalleBodega(u.getIdbod());
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

            <hr>
            <!--VENDER PRODUCTO-->
            <!-- Actualizar cantidad -->
            <div class="actualizar">
                <h2>Vender Producto</h2>
                <form action="VenderProducto" method="post" id="formulario">
                    <label for="">Bodegas: </label>
                    <select id="ciud" name="ciudad">
                        <option value disabled selected>
                            Selecciona una ciudad</option>
                            <%
                                AdminB adminB = new AdminB();
                                List<Bodega> bod = adminB.ciudades();
                                for (Bodega p : bod) {
                            %>
                        <option value="<%= p.getCiudad()%>"><%= p.getCiudad()%></option>
                        <% } %>
                    </select>

                    <br>
                    <label for="Admin" >Producto: </label>
                    <select id="prod" name="producto">
                        <option value disabled selected>
                            Selecciona una Producto </option>
                            <%
                                List<Producto> datos = adminB.productos();
                                for (Producto p : datos) {
                            %>
                        <option value="<%= p.getNombre()%>"><%= p.getNombre()%></option>
                        <% } %>
                    </select>
                    </br>
                    <!--<div id="productos" name="producto">
                    </div>-->
                    <div>
                        <label for="cantidad">Cantidad:</label><input type="number" id="cant" class="cantidad" name="cantidad">
                    </div>

                    <div class="botones">
                        <input type="submit" id="enviar" value="Enviar" name="enviar">
                    </div>
                </form>
            </div>
        </main>
    </body>
</html>
