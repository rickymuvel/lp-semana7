<%@page import="entidad.Menu"%>
<%@page import="java.util.List"%>
<jsp:include page="intranetValida.jsp" />
<%@page import="entidad.Usuario"%>
<TABLE width="100%" border="0">

		  <TR><td>&nbsp;</td></TR>
		  <TR>
		  	   <TD>
				   <A class=SiteLinkBold href="intranetPrincipal.jsp">
		                Principal
		           </A>
	           <TD>
		  </TR>		
		   <TR><td>&nbsp;</td></TR>

			<%
			  List<Menu> data =  (List<Menu>) session.getAttribute("MENU_LOGEADO");
			  for(Menu m:data){
			  if(data!= null){
			%>
					<TR>
					    <TD>
							<A class="SiteLinkBold" 
								href="<%= m.getUrl()%>">
			                	<%= m.getDescripcion() %>
			                </A>
						</TD>
				  	</TR>		
			
			<%	  
			  }}
			%>
		  

		  <TR><td>&nbsp;</td></TR>
		  <TR>
			    <TD>
					<A class="SiteLinkBold" HREF="logout">
				    	   Salir
				   	 </A>
				</TD>
		  </TR>	
		  <TR><td>&nbsp;</td></TR>
		  <TR><td>&nbsp;</td></TR>
		  
		  <TR>
			  <td>
			  		<%
			  			Usuario usu = (Usuario) session.getAttribute("USUARIO_LOGEADO");   
			  		%>
			  		<font color="white"><b> 
			  			Bienvenido sr(a) : 
			  				<%= usu.getNombre()  %> &nbsp; <%= usu.getApellido()  %>
			  		</b></font>
			  </td>
		  </TR>	
		  
		 <TR><td>
		 		<A class="SiteLinkBold" href="logout">
	                	Salir
	            </A>
		</td></TR>
</TABLE>

