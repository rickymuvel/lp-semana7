package controlador;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import patronDataAccessObjec.Factory;
import patronDataAccessObjec.UsuarioDao;
import entidad.Menu;
import entidad.Usuario;


public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
			String  usu = request.getParameter("txtLogin");
			String  pass = request.getParameter("txtPassword");
			
			Factory fabrica = Factory.getTipo(Factory.TIPO_MYSQL);
			UsuarioDao dao = fabrica.getUsuario();
			
			
			Usuario usuario = null;
			try {
				usuario = dao.valida(usu, pass);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
			if(usuario == null){
				request.setAttribute("MENSAJE", "usuario no existe");
				request.getRequestDispatcher("/portalLogin.jsp").forward(request, response);
			}else{
				//Se obtiene la session
				HttpSession session = request.getSession();
				
				List<Menu> menus = null;
				try {
					menus = dao.menuXUsuario(usuario.getCodigo());
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
				//se guarda en sesion el objeto que contiene los datos del usuario
				session.setAttribute("USUARIO_LOGEADO", usuario);
				session.setAttribute("MENU_LOGEADO", menus);
				
				//se ingresa a la intranet
				request.getRequestDispatcher("/intranetPrincipal.jsp").forward(request, response);  
			}
	}

}
