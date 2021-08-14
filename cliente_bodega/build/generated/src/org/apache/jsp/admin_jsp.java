package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import webservice.Producto;
import webservice.Bodega;
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>ADMINISTRADOR</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <style>\r\n");
      out.write("        .cantidad, \r\n");
      out.write("        select{\r\n");
      out.write("            position: relative;\r\n");
      out.write("            height: 30px;\r\n");
      out.write("            width: 60%;\r\n");
      out.write("            left: 25px;\r\n");
      out.write("            border: 1px solid #95B8E7;\r\n");
      out.write("            background-color: #fff;\r\n");
      out.write("            vertical-align: middle;\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("            overflow: hidden;\r\n");
      out.write("            white-space: nowrap;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            outline: none;\r\n");
      out.write("            -moz-border-radius: 5px 5px 5px 5px;\r\n");
      out.write("            -webkit-border-radius: 5px 5px 5px 5px;\r\n");
      out.write("            border-radius: 5px 5px 5px 5px;\r\n");
      out.write("            margin-bottom: 10px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .formulario__input-error{\r\n");
      out.write("            font-size: 12px;\r\n");
      out.write("            margin-bottom: 0;\r\n");
      out.write("            display: none;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .formulario__input-error-activo{\r\n");
      out.write("            display: block;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        /* actualizar*/\r\n");
      out.write("        table{\r\n");
      out.write("            border: 1px solid black;\r\n");
      out.write("            border-collapse: collapse;\r\n");
      out.write("            user-select: none;\r\n");
      out.write("        }\r\n");
      out.write("        table td{\r\n");
      out.write("            border:1px solid black;\r\n");
      out.write("            padding: 10px 20px;\r\n");
      out.write("            text-transform: uppercase;\r\n");
      out.write("        }\r\n");
      out.write("        table tr:hover{\r\n");
      out.write("            background:#ccc;\r\n");
      out.write("            color: red;\r\n");
      out.write("        }\r\n");
      out.write("        /*table td:hover{\r\n");
      out.write("                color: red;\r\n");
      out.write("        }*/\r\n");
      out.write("        .contenedor {\r\n");
      out.write("            color: black;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        .actualizar,\r\n");
      out.write("        .actualizarN{\r\n");
      out.write("            border: 2px solid bisque;\r\n");
      out.write("            padding:30px 20px;\r\n");
      out.write("            width:350px;\r\n");
      out.write("            height:350px;\r\n");
      out.write("            float: left;\r\n");
      out.write("            display:block;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .actualizar{\r\n");
      out.write("            position: relative;\r\n");
      out.write("            left: 17%;\r\n");
      out.write("            top: 5%;\r\n");
      out.write("            user-select: none;\r\n");
      out.write("        } \r\n");
      out.write("\r\n");
      out.write("        .actualizarN{\r\n");
      out.write("            position: relative;\r\n");
      out.write("            left: 27%;\r\n");
      out.write("            top: 5%;\r\n");
      out.write("            user-select: none;\r\n");
      out.write("        } \r\n");
      out.write("\r\n");
      out.write("        *{\r\n");
      out.write("            padding: 0%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        input{\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            left: 15px;\r\n");
      out.write("            margin-left:88px;\r\n");
      out.write("            margin-top: 5px;\r\n");
      out.write("            width: 120px;\r\n");
      out.write("            height: 25px;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");

            HttpSession sesion = request.getSession();
            if ( session.getAttribute("usuarioValido") == null || session.getAttribute("usuarioValido").equals("0") ){
                response.sendRedirect("index.jsp");
            }
        
      out.write("\r\n");
      out.write("        <table>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td><b>NOMBRE</b></td>\r\n");
      out.write("                <td><b>CIUDAD</b></td>\r\n");
      out.write("                <td><b>CANTIDAD</b></td>\r\n");
      out.write("                <td><b>ESTADO</b></td>\r\n");
      out.write("                <td><b>PRECIO</b></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");

                AdminB adminB = new AdminB();
                List<DetalleAdmin> lista = adminB.listarBodegas();
                for (DetalleAdmin bodega : lista) {
            
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>");
      out.print( bodega.getIdprod());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( bodega.getIdbod());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( bodega.getCantidad());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( bodega.getEstado());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( bodega.getPrecio());
      out.write("</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");
 }
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("\r\n");
      out.write("        <hr>\r\n");
      out.write("\r\n");
      out.write("        <!-- Actualizar cantidad -->\r\n");
      out.write("        <div class=\"actualizar\">\r\n");
      out.write("            <h2>Actualizar Cantidad</h2>\r\n");
      out.write("            <form action=\"Admin?accion=cantidad\" method=\"post\" id=\"formulario\">\r\n");
      out.write("                <label for=\"\">Bodegas: </label>\r\n");
      out.write("                <select id=\"ciud\" name=\"ciudad\">\r\n");
      out.write("                    <option value disabled selected>\r\n");
      out.write("                        Selecciona una ciudad</option>\r\n");
      out.write("                    ");

                        List<Bodega> bod = adminB.ciudades();
                        for( Bodega p:bod ){
                    
      out.write("\r\n");
      out.write("                    <option value=\"");
      out.print( p.getId() );
      out.write('"');
      out.write('>');
      out.print( p.getCiudad() );
      out.write("</option>\r\n");
      out.write("                    ");
 } 
      out.write("\r\n");
      out.write("                </select>\r\n");
      out.write("                \r\n");
      out.write("                <br>\r\n");
      out.write("                <label for=\"Admin\" >Producto: </label>\r\n");
      out.write("                <select id=\"prod\" name=\"producto\">\r\n");
      out.write("                    <option value disabled selected>\r\n");
      out.write("                        Selecciona una Producto </option>\r\n");
      out.write("                    ");

                        List<Producto> datos = adminB.productos();
                        for( Producto p:datos ){
                    
      out.write("\r\n");
      out.write("                    <option value=\"");
      out.print( p.getId() );
      out.write('"');
      out.write('>');
      out.print( p.getNombre() );
      out.write("</option>\r\n");
      out.write("                    ");
 } 
      out.write("\r\n");
      out.write("                </select>\r\n");
      out.write("                </br>\r\n");
      out.write("                <!--<div id=\"productos\" name=\"producto\">\r\n");
      out.write("                </div>-->\r\n");
      out.write("                <div>\r\n");
      out.write("                    <label for=\"cantidad\">Cantidad:</label><input type=\"number\" id=\"cant\" class=\"cantidad\" name=\"cantidad\">\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"botones\">\r\n");
      out.write("                    <input type=\"submit\" id=\"enviar\" value=\"Enviar\" name=\"enviar\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Actualizar Producto-->\r\n");
      out.write("        <div class=\"actualizarN\">\r\n");
      out.write("            <h2>Actualizar precio</h2>\r\n");
      out.write("            <form action=\"Admin?accion=precio\" method=\"post\" id=\"formulario\">\r\n");
      out.write("\r\n");
      out.write("                 <label for=\"Admin\" >Producto: </label>\r\n");
      out.write("                <select id=\"prod\" name=\"producto\">\r\n");
      out.write("                    <option value disabled selected>\r\n");
      out.write("                        Selecciona una Producto </option>\r\n");
      out.write("                    ");

                        for( Producto p:datos ){
                    
      out.write("\r\n");
      out.write("                    <option value=\"");
      out.print( p.getId() );
      out.write('"');
      out.write('>');
      out.print( p.getNombre() );
      out.write("</option>\r\n");
      out.write("                    ");
 } 
      out.write("\r\n");
      out.write("                </select>\r\n");
      out.write("\r\n");
      out.write("                <div>\r\n");
      out.write("                    <label for=\"precio\">Precio:</label><input type=\"text\" id=\"precio\" class=\"cantidad\" name=\"precio\">\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"botones\">\r\n");
      out.write("                    <input type=\"submit\" id=\"enviarN\" value=\"Enviar\" name=\"enviar\">\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
