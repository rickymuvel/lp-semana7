package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class intranetCuerpo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<img align=\"left\" width=\"24\" SRC=\"images/apoyos/1x1.gif\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<table cellspacing=\"0\" cellpadding=\"0\" width=\"100%\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t<table cellspacing=\"0\" cellpadding=\"0\" width=\"100%\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td class=\"HomeHead\"><span id=\"WelcomeMsg\">Bienvenidos a la Intranet</span>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<table cellspacing=\"0\" cellpadding=\"2\" width=\"600\" border=\"0\">\r\n");
      out.write("\t\t\t<tr valign=\"top\">\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t<table width=\"300\">\r\n");
      out.write("\t\t\t\t\t<tr valign=\"top\">\r\n");
      out.write("\t\t\t\t\t\t<td><span class=\"NormalDouble\"> Deseamos dar a conocer a los\r\n");
      out.write("\t\t\t\t\t\tartistas y los artesanos alrededor del mundo a través de una\r\n");
      out.write("\t\t\t\t\t\tplataforma global para expresar sus talentos artísticos verdaderos\r\n");
      out.write("\t\t\t\t\t\ty para estimular su creatividad. Y, deseamos proveerle a usted el\r\n");
      out.write("\t\t\t\t\t\tacceso a único, donde encontrara grandes valores que solamente la\r\n");
      out.write("\t\t\t\t\t\tinfraestructura del Internet puede permitir. En la esencia más\r\n");
      out.write("\t\t\t\t\t\tprofunda de nuestra filosofía, deseamos crear un puente entre\r\n");
      out.write("\t\t\t\t\t\tusted y los muchos artesanos talentosos a través del globo.\r\n");
      out.write("\t\t\t\t\t\tQuisiéramos que usted supiera sobre de quién usted compra.\r\n");
      out.write("\t\t\t\t\t\tQuisiéramos que usted sintiera ese accesorio del producto de las\r\n");
      out.write("\t\t\t\t\t\tmanos que lo crearon. En el espiritu del Internet, permitanos\r\n");
      out.write("\t\t\t\t\t\testar juntos. <br>\r\n");
      out.write("\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t</span></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td align=\"left\">\r\n");
      out.write("\t\t\t\t\t<img border=\"0\" height=\"300\" width=\"409\" src=\"images/apoyos/anillos.jpg\"> <br>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("</table>\r\n");
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
