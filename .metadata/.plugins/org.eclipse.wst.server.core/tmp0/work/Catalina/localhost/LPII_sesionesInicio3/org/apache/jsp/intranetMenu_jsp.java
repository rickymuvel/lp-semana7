package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entidad.Menu;
import java.util.List;
import entidad.Usuario;

public final class intranetMenu_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "intranetValida.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("<TABLE width=\"100%\" border=\"0\">\r\n");
      out.write("\r\n");
      out.write("\t\t  <TR><td>&nbsp;</td></TR>\r\n");
      out.write("\t\t  <TR>\r\n");
      out.write("\t\t  \t   <TD>\r\n");
      out.write("\t\t\t\t   <A class=SiteLinkBold href=\"intranetPrincipal.jsp\">\r\n");
      out.write("\t\t                Principal\r\n");
      out.write("\t\t           </A>\r\n");
      out.write("\t           <TD>\r\n");
      out.write("\t\t  </TR>\t\t\r\n");
      out.write("\t\t   <TR><td>&nbsp;</td></TR>\r\n");
      out.write("\r\n");
      out.write("\t\t\t");

			  List<Menu> data =  (List<Menu>) session.getAttribute("MENU_LOGEADO");
			  for(Menu m:data){
			  if(data!= null){
			
      out.write("\r\n");
      out.write("\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t    <TD>\r\n");
      out.write("\t\t\t\t\t\t\t<A class=\"SiteLinkBold\" \r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"");
      out.print( m.getUrl());
      out.write("\">\r\n");
      out.write("\t\t\t                \t");
      out.print( m.getDescripcion() );
      out.write("\r\n");
      out.write("\t\t\t                </A>\r\n");
      out.write("\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t  \t</TR>\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");
	  
			  }}
			
      out.write("\r\n");
      out.write("\t\t  \r\n");
      out.write("\r\n");
      out.write("\t\t  <TR><td>&nbsp;</td></TR>\r\n");
      out.write("\t\t  <TR>\r\n");
      out.write("\t\t\t    <TD>\r\n");
      out.write("\t\t\t\t\t<A class=\"SiteLinkBold\" HREF=\"logout\">\r\n");
      out.write("\t\t\t\t    \t   Salir\r\n");
      out.write("\t\t\t\t   \t </A>\r\n");
      out.write("\t\t\t\t</TD>\r\n");
      out.write("\t\t  </TR>\t\r\n");
      out.write("\t\t  <TR><td>&nbsp;</td></TR>\r\n");
      out.write("\t\t  <TR><td>&nbsp;</td></TR>\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  <TR>\r\n");
      out.write("\t\t\t  <td>\r\n");
      out.write("\t\t\t  \t\t");

			  			Usuario usu = (Usuario) session.getAttribute("USUARIO_LOGEADO");   
			  		
      out.write("\r\n");
      out.write("\t\t\t  \t\t<font color=\"white\"><b> \r\n");
      out.write("\t\t\t  \t\t\tBienvenido sr(a) : \r\n");
      out.write("\t\t\t  \t\t\t\t");
      out.print( usu.getNombre()  );
      out.write(" &nbsp; ");
      out.print( usu.getApellido()  );
      out.write("\r\n");
      out.write("\t\t\t  \t\t</b></font>\r\n");
      out.write("\t\t\t  </td>\r\n");
      out.write("\t\t  </TR>\t\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t <TR><td>\r\n");
      out.write("\t\t \t\t<A class=\"SiteLinkBold\" href=\"logout\">\r\n");
      out.write("\t                \tSalir\r\n");
      out.write("\t            </A>\r\n");
      out.write("\t\t</td></TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("\r\n");
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
