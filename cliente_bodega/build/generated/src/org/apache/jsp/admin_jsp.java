package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import modelo.AdminB;
import webservice.DetalleAdmin;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        .cantidad, \n");
      out.write("        select{\n");
      out.write("            position: relative;\n");
      out.write("            height: 30px;\n");
      out.write("            width: 60%;\n");
      out.write("            left: 25px;\n");
      out.write("            border: 1px solid #95B8E7;\n");
      out.write("            background-color: #fff;\n");
      out.write("            vertical-align: middle;\n");
      out.write("            display: inline-block;\n");
      out.write("            overflow: hidden;\n");
      out.write("            white-space: nowrap;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            outline: none;\n");
      out.write("            -moz-border-radius: 5px 5px 5px 5px;\n");
      out.write("            -webkit-border-radius: 5px 5px 5px 5px;\n");
      out.write("            border-radius: 5px 5px 5px 5px;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .formulario__input-error{\n");
      out.write("            font-size: 12px;\n");
      out.write("            margin-bottom: 0;\n");
      out.write("            display: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .formulario__input-error-activo{\n");
      out.write("            display: block;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* actualizar*/\n");
      out.write("        table{\n");
      out.write("            border: 1px solid black;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            user-select: none;\n");
      out.write("        }\n");
      out.write("        table td{\n");
      out.write("            border:1px solid black;\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            text-transform: uppercase;\n");
      out.write("        }\n");
      out.write("        table tr:hover{\n");
      out.write("            background:#ccc;\n");
      out.write("            color: red;\n");
      out.write("        }\n");
      out.write("        /*table td:hover{\n");
      out.write("                color: red;\n");
      out.write("        }*/\n");
      out.write("        .contenedor {\n");
      out.write("            color: black;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("        .actualizar,\n");
      out.write("        .actualizarN{\n");
      out.write("            border: 2px solid bisque;\n");
      out.write("            padding:30px 20px;\n");
      out.write("            width:350px;\n");
      out.write("            height:350px;\n");
      out.write("            float: left;\n");
      out.write("            display:block;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .actualizar{\n");
      out.write("            position: relative;\n");
      out.write("            left: 17%;\n");
      out.write("            top: 5%;\n");
      out.write("            user-select: none;\n");
      out.write("        } \n");
      out.write("\n");
      out.write("        .actualizarN{\n");
      out.write("            position: relative;\n");
      out.write("            left: 27%;\n");
      out.write("            top: 5%;\n");
      out.write("            user-select: none;\n");
      out.write("        } \n");
      out.write("\n");
      out.write("        *{\n");
      out.write("            padding: 0%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        input{\n");
      out.write("            cursor: pointer;\n");
      out.write("            left: 15px;\n");
      out.write("            margin-left:88px;\n");
      out.write("            margin-top: 5px;\n");
      out.write("            width: 120px;\n");
      out.write("            height: 25px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td><b>NOMBRE</b></td>\n");
      out.write("                <td><b>CIUDAD</b></td>\n");
      out.write("                <td><b>CANTIDAD</b></td>\n");
      out.write("                <td><b>ESTADO</b></td>\n");
      out.write("                <td><b>PRECIO</b></td>\n");
      out.write("            </tr>\n");
      out.write("            ");

                AdminB adminB = new AdminB();
                List<DetalleAdmin> lista = adminB.listarBodegas();
                for (DetalleAdmin bodega : lista) {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print( bodega.getIdprod());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( bodega.getIdbod());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( bodega.getCantidad());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( bodega.getEstado());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( bodega.getPrecio());
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            ");
 }
      out.write("\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("        <hr>\n");
      out.write("\n");
      out.write("        <!-- Actualizar cantidad -->\n");
      out.write("        <div class=\"actualizar\">\n");
      out.write("            <h2>Actualizar Cantidad</h2>\n");
      out.write("            <form action=\"models/actualizarProductos.php\" method=\"post\" id=\"formulario\">\n");
      out.write("                <label for=\"\">Bodegas: </label>\n");
      out.write("                <select id=\"ciud\" name=\"ciudad\">\n");
      out.write("                    <option value disabled selected>\n");
      out.write("                        Selecciona una ciudad\n");
      out.write("                    </option>\n");
      out.write("                    <option value=\"1\">GUAYAQUIL</option>\n");
      out.write("                    <option value=\"2\">QUITO</option>\n");
      out.write("                    <option value=\"3\">CUENCA</option>\n");
      out.write("                </select>\n");
      out.write("                </br>\n");
      out.write("                <div id=\"productos\" name=\"producto\">\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <label for=\"cantidad\">Cantidad:</label><input type=\"number\" id=\"cant\" class=\"cantidad\" name=\"cantidad\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"botones\">\n");
      out.write("                    <input type=\"submit\" id=\"enviar\" value=\"Enviar\" name=\"enviar\">\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Actualizar Producto-->\n");
      out.write("        <div class=\"actualizarN\">\n");
      out.write("            <h2>Actualizar precio</h2>\n");
      out.write("            <form action=\"models/actualizarNombre.php\" method=\"post\" id=\"formulario\">\n");
      out.write("\n");
      out.write("                <label for=\"\">Producto:</label>\n");
      out.write("                <select name=\"productoN\" id=\"\">\n");
      out.write("                    <option value=\"<?php echo $fila[1] ?>\"> hola </option>\n");
      out.write("                </select>\n");
      out.write("\n");
      out.write("                <div>\n");
      out.write("                    <label for=\"cantidad\">Precio:</label><input type=\"text\" id=\"cant\" class=\"cantidad\" name=\"nombre\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"botones\">\n");
      out.write("                    <input type=\"submit\" id=\"enviarN\" value=\"Enviar\" name=\"enviar\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
