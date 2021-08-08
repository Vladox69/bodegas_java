<%-- 
    Document   : admin.jsp
    Created on : Aug 7, 2021, 7:35:40 PM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
            HttpSession sesion = request.getSession();
            if ( session.getAttribute("usuarioValido") == null || session.getAttribute("usuarioValido").equals("0") ){
                response.sendRedirect("index.jsp");
            }
        %>
        
        <h1>Bienvenido admin 
            
        </h1>
    </body>
</html>
