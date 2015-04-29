package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class intranetProducto_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "intranetValida.jsp", out, false);
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Bienvenido a la Intranet</title>\r\n");
      out.write("<link href=\"css/estilos.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body background=\"images/apoyos/fondointranetsinfondo.jpg\"\r\n");
      out.write("\tleftmargin=\"0\" topmargin=\"0\" rightmargin=\"0\" bottommargin=\"0\"\r\n");
      out.write("\tmarginheight=\"0\" marginwidth=\"0\">\r\n");
      out.write("\r\n");
      out.write("<table cellspacing=\"0\" cellpadding=\"0\" width=\"100%\" border=\"0\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "intranetCabecera.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td valign=\"top\" width=\"190\">\r\n");
      out.write("\t\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "intranetMenu.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t\t<td align=\"center\" valign=\"top\">\r\n");
      out.write("\t\t\t<h1> Producto </h1>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!-- method=post  \r\n");
      out.write("\t\t\t\t No se vean los parametros en el browser -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!-- \r\n");
      out.write("\t\t\t\tenctype=\"multipart/form-data\"\r\n");
      out.write("\t\t\t\tPueda enviarse archivos en el formulario\r\n");
      out.write("\t\t\t -->\r\n");
      out.write("\t\t\t<form action=\"producto\" method=\"post\" \r\n");
      out.write("\t\t\t\t\t\t\t\t\tenctype=\"multipart/form-data\">\r\n");
      out.write("\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>Nombre</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"nombre\" ></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>Descripción</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"descripcion\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\t\t\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>Precio</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"precio\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\t\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>Stock</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"stock\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\t\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>Categoría</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<select name=\"categoria\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"1\">Anillos</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"2\">Aretes</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"3\">Brazalete</option>\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\t\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>Estado</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<select name=\"estado\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"1\">ACTIVO</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t<option value=\"2\">INACTIVO</option>\r\n");
      out.write("\t\t\t\t\t\t\t</select>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\t\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>Imagen</td>\r\n");
      out.write("\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"file\" name=\"imagen\">\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"submit\" value=\"enviar\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"reset\" value=\"borrar\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</form>\t\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
