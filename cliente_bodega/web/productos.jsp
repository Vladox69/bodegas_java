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
    </head>
    <body>
        <header class="contenedor">
            <nav class="navegacion">
                <a href="Navegacion?accion=inicio">Inicio</a>
                <a href="Navegacion?accion=admin">ADMIN</a>
                <a href="Navegacion?accion=producto">Producto</a>
                <a href="Navegacion?accion=cerrar">Cerrar sesión</a>
            </nav>
        </header>
        <main>
             <%
                 Usuario u =(Usuario) session.getAttribute("usuarioValido");
            %>
            <h1> Bienvenido usuario <%= u.getIdbod()%></h1>
            
        </main>
    </body>
</html>
