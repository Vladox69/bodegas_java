<%-- 
    Document   : admin.jsp
    Created on : Aug 7, 2021, 7:35:40 PM
    Author     : Usuario
--%>

<%@page import="java.util.List"%>
<%@page import="modelo.AdminB"%>
<%@page import="webservice.DetalleAdmin"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
        .cantidad, 
        select{
            position: relative;
            height: 30px;
            width: 60%;
            left: 25px;
            border: 1px solid #95B8E7;
            background-color: #fff;
            vertical-align: middle;
            display: inline-block;
            overflow: hidden;
            white-space: nowrap;
            margin: 0;
            padding: 0;
            outline: none;
            -moz-border-radius: 5px 5px 5px 5px;
            -webkit-border-radius: 5px 5px 5px 5px;
            border-radius: 5px 5px 5px 5px;
            margin-bottom: 10px;
        }

        .formulario__input-error{
            font-size: 12px;
            margin-bottom: 0;
            display: none;
        }

        .formulario__input-error-activo{
            display: block;
        }

        /* actualizar*/
        table{
            border: 1px solid black;
            border-collapse: collapse;
            user-select: none;
        }
        table td{
            border:1px solid black;
            padding: 10px 20px;
            text-transform: uppercase;
        }
        table tr:hover{
            background:#ccc;
            color: red;
        }
        /*table td:hover{
                color: red;
        }*/
        .contenedor {
            color: black;
        }


        .actualizar,
        .actualizarN{
            border: 2px solid bisque;
            padding:30px 20px;
            width:350px;
            height:350px;
            float: left;
            display:block;
        }

        .actualizar{
            position: relative;
            left: 17%;
            top: 5%;
            user-select: none;
        } 

        .actualizarN{
            position: relative;
            left: 27%;
            top: 5%;
            user-select: none;
        } 

        *{
            padding: 0%;
        }

        input{
            cursor: pointer;
            left: 15px;
            margin-left:88px;
            margin-top: 5px;
            width: 120px;
            height: 25px;
        }
    </style>
    <body>
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
                <td><%= bodega.getIdprod()%></td>
                <td><%= bodega.getIdbod()%></td>
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
            <form action="models/actualizarProductos.php" method="post" id="formulario">
                <label for="">Bodegas: </label>
                <select id="ciud" name="ciudad">
                    <option value disabled selected>
                        Selecciona una ciudad
                    </option>
                    <option value="1">GUAYAQUIL</option>
                    <option value="2">QUITO</option>
                    <option value="3">CUENCA</option>
                </select>
                </br>
                <div id="productos" name="producto">
                </div>
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
            <form action="models/actualizarNombre.php" method="post" id="formulario">

                <label for="">Producto:</label>
                <select name="productoN" id="">
                    <option value="<?php echo $fila[1] ?>"> hola </option>
                </select>

                <div>
                    <label for="cantidad">Precio:</label><input type="text" id="cant" class="cantidad" name="nombre">
                </div>

                <div class="botones">
                    <input type="submit" id="enviarN" value="Enviar" name="enviar">
                </div>

            </form>
        </div>
    </body>
</html>
