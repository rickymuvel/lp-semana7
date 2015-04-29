package controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ServletLogout
 */

public class ServletLogout extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//1 se obtiene la session
		HttpSession session = request.getSession();
		
		//2 se destruye la session
		session.invalidate();
		
		//3 se vuelbve al login
		request.setAttribute("MENSAJE", "usuario sali� de la intranet");
		request.getRequestDispatcher("/portalLogin.jsp").forward(request, response);

	}

}
