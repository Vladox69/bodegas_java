<%-- 
    Document   : productos.jsp
    Created on : 14/08/2021, 11:02:30
    Author     : ASUS
--%>

<%@page import="webservices.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
        <script src="js/tabla.js" type="text/javascript"></script>
    </head>
    <body>
        <%
            Usuario u = (Usuario) session.getAttribute("usuarioValido");
            if (u.getPerfil().equalsIgnoreCase("admin")) {
        %>
        <header class="contenedor">
            <nav class="navegacion">
                <a href="Navegacion?accion=inicio">Inicio</a>
                <a href="Navegacion?accion=admin">ADMIN</a>
                <a href="Navegacion?accion=producto">Producto</a>
                <a href="Navegacion?accion=cerrar">Cerrar sesión</a>
            </nav>
        </header>
        <%} else {%>
        <header class="contenedor">
            <nav class="navegacion">
                <a href="Navegacion?accion=inicio">Inicio</a>
                <a href="Navegacion?accion=producto">Producto</a>
                <a href="Navegacion?accion=cerrar">Cerrar sesión</a>
            </nav>
            <%}%>
        </header>
        <main>
            <h1> Bienvenido usuario <%= u.getIdbod()%></h1>
            <select name="bodegas" id=""> 
                <option value="1">GUAYAQUIL</option>
                <option value="2">QUITO</option>
                <option value="3">CUENCA</option>
            </select>

            <table name="detalleprod">
                <tr name="detail">
                    <td><b>NOMBRE</b></td>
                    <td><b>CIUDAD</b></td>
                    <td><b>CANTIDAD</b></td>
                    <td><b>ESTADO</b></td>
                </tr>
            </table>
        </main>
    </body>
</html>
