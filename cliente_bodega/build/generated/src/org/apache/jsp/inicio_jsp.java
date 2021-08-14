package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import webservices.Usuario;
import webservice.Producto;
import webservice.Bodega;
import modelo.AdminB;
import webservice.Detalle;
import java.util.List;
import modelo.DetalleM;

public final class inicio_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            Usuario u = (Usuario) session.getAttribute("usuarioValido");
        
      out.write("\n");
      out.write("        <header class=\"contenedor\">\n");
      out.write("            <nav class=\"navegacion\">\n");
      out.write("                <a href=\"Navegacion?accion=inicio\">Inicio</a>\n");
      out.write("                <a href=\"Navegacion?accion=admin\">ADMIN</a>\n");
      out.write("                <a href=\"Navegacion?accion=producto\">Producto</a>\n");
      out.write("                <a href=\"Navegacion?accion=cerrar\">Cerrar sesión</a>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <main>\n");
      out.write("            <h1>Inicio</h1>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td><b>NOMBRE</b></td>\n");
      out.write("                    <td><b>CIUDAD</b></td>\n");
      out.write("                    <td><b>CANTIDAD</b></td>\n");
      out.write("                    <td><b>ESTADO</b></td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    DetalleM detalleM = new DetalleM();
                    List<Detalle> lista = detalleM.detalleBodega(u.getIdbod());
                    for (Detalle bodega : lista) {
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( bodega.getIdprod());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( bodega.getIdbod());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( bodega.getCantidad());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( bodega.getEstado());
      out.write("</td>    \n");
      out.write("                </tr>\n");
      out.write("                ");
 }
      out.write("\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("            <!--VENDER PRODUCTO-->\n");
      out.write("            <!-- Actualizar cantidad -->\n");
      out.write("            <div class=\"actualizar\">\n");
      out.write("                <h2>Actualizar Cantidad</h2>\n");
      out.write("                <form action=\"Admin?accion=cantidad\" method=\"post\" id=\"formulario\">\n");
      out.write("                    <label for=\"\">Bodegas: </label>\n");
      out.write("                    <select id=\"ciud\" name=\"ciudad\">\n");
      out.write("                        <option value disabled selected>\n");
      out.write("                            Selecciona una ciudad</option>\n");
      out.write("                            ");

                                AdminB adminB = new AdminB();
                                List<Bodega> bod = adminB.ciudades();
                                for (Bodega p : bod) {
                            
      out.write("\n");
      out.write("                        <option value=\"");
      out.print( p.getId());
      out.write('"');
      out.write('>');
      out.print( p.getCiudad());
      out.write("</option>\n");
      out.write("                        ");
 } 
      out.write("\n");
      out.write("                    </select>\n");
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                    <label for=\"Admin\" >Producto: </label>\n");
      out.write("                    <select id=\"prod\" name=\"producto\">\n");
      out.write("                        <option value disabled selected>\n");
      out.write("                            Selecciona una Producto </option>\n");
      out.write("                            ");

                                List<Producto> datos = adminB.productos();
                                for (Producto p : datos) {
                            
      out.write("\n");
      out.write("                        <option value=\"");
      out.print( p.getId());
      out.write('"');
      out.write('>');
      out.print( p.getNombre());
      out.write("</option>\n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                    </br>\n");
      out.write("                    <!--<div id=\"productos\" name=\"producto\">\n");
      out.write("                    </div>-->\n");
      out.write("                    <div>\n");
      out.write("                        <label for=\"cantidad\">Cantidad:</label><input type=\"number\" id=\"cant\" class=\"cantidad\" name=\"cantidad\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"botones\">\n");
      out.write("                        <input type=\"submit\" id=\"enviar\" value=\"Enviar\" name=\"enviar\">\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
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
