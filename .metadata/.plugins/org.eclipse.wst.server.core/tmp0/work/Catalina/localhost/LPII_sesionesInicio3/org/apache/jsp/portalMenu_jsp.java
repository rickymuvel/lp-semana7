package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class portalMenu_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<TABLE width=\"100%\" border=\"0\">\r\n");
      out.write("\r\n");
      out.write("\t\t  <TR><td>&nbsp;</td></TR>\r\n");
      out.write("\t\t  <TR>\r\n");
      out.write("\t\t\t    <TD>\r\n");
      out.write("\t\t\t\t\t<A class=\"SiteLinkBold\" HREF=\"portalPrincipal.jsp\">\r\n");
      out.write("\t\t\t\t    \t   Home\r\n");
      out.write("\t\t\t\t   \t </A>\r\n");
      out.write("\t\t\t\t</TD>\r\n");
      out.write("\t\t  </TR>\t\t\r\n");
      out.write("\t\t  <TR>\r\n");
      out.write("\t\t\t    <TD>\r\n");
      out.write("\t\t\t\t\t<A class=\"SiteLinkBold\" HREF=\"portalLogin.jsp\">\r\n");
      out.write("\t\t\t\t    \t   Intranet\r\n");
      out.write("\t\t\t\t   \t </A>\r\n");
      out.write("\t\t\t\t</TD>\r\n");
      out.write("\t\t  </TR>\t  \r\n");
      out.write("</TABLE>\r\n");
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
