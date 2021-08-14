<%-- 
    Document   : admin.jsp
    Created on : Aug 7, 2021, 7:35:40 PM
    Author     : Usuario
--%>

<%@page import="webservice.Producto"%>
<%@page import="webservice.Bodega"%>
<%@page import="java.util.List"%>
<%@page import="modelo.AdminB"%>
<%@page import="webservice.DetalleAdmin"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ADMINISTRADOR</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>


    <body>

        <%
            HttpSession sesion = request.getSession();
            if(sesion.getAttribute("usuarioValido") == null){
                response.sendRedirect("index.jsp");
            }
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
           
            <table>
                <tr>
                    <td><b>NOMBRE</b></td>
                    <td><b>CIUDAD</b></td>
                    <td><b>CANTIDAD</b></td>
                    <td><b>ESTADO</b></td>
                    <td><b>PRECIO</b></td>
                </tr>
                <%
                    AdminB adminB = new AdminB();
                    List<DetalleAdmin> lista = adminB.listarBodegas();
                    for (DetalleAdmin bodega : lista) {
                %>
                <tr>
                    <td><%= bodega.getIdbod()%></td>
                    <td><%= bodega.getIdprod()%></td>
                    <td><%= bodega.getCantidad()%></td>
                    <td><%= bodega.getEstado()%></td>
                    <td><%= bodega.getPrecio()%></td>
                </tr>
                <% }%>
            </table>

            <hr>

            <!-- Actualizar cantidad -->
            <div class="actualizar">
                <h2>Actualizar Cantidad</h2>
                <form action="Admin?accion=cantidad" method="post" id="formulario">
                    <label for="">Bodegas: </label>
                    <select id="ciud" name="ciudad">
                        <option value disabled selected>
                            Selecciona una ciudad</option>
                            <%
                                List<Bodega> bod = adminB.ciudades();
                                for (Bodega p : bod) {
                            %>
                        <option value="<%= p.getId()%>"><%= p.getCiudad()%></option>
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
                        <option value="<%= p.getId()%>"><%= p.getNombre()%></option>
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

            <!-- Actualizar Producto-->
            <div class="actualizarN">
                <h2>Actualizar precio</h2>
                <form action="Admin?accion=precio" method="post" id="formulario">

                    <label for="Admin" >Producto: </label>
                    <select id="prod" name="producto">
                        <option value disabled selected>
                            Selecciona una Producto </option>
                            <%
                                for (Producto p : datos) {
                            %>
                        <option value="<%= p.getId()%>"><%= p.getNombre()%></option>
                        <% }%>
                    </select>

                    <div>
                        <label for="precio">Precio:</label><input type="text" id="precio" class="cantidad" name="precio">
                    </div>

                    <div class="botones">
                        <input type="submit" id="enviarN" value="Enviar" name="enviar">
                    </div>

                </form>
            </div>
        </main>
    </body>
</html>
