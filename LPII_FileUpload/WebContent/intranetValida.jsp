<%
	if(session.getAttribute("USUARIO_LOGEADO") == null){
		request.setAttribute("MENSAJE", "Para ingresar debe logearse");
		pageContext.forward("/portalLogin.jsp");
	}

%>