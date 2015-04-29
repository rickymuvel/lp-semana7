package controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class ServletLogout extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. Obtener la sesion
		HttpSession session = request.getSession();
		
		// 2. Destruimos la sesion
		session.invalidate();
		
		request.setAttribute("MENSAJE", "Usuario sali� de sesion");
		request.getRequestDispatcher("/portalLogin.jsp").forward(request, response);
	}

}
