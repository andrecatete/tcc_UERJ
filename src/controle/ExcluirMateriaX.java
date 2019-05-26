package controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.App;
import modelo.Materia;

@WebServlet("/ExcluirMateriaX")
public class ExcluirMateriaX extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ExcluirMateriaX() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
				
		int id = Integer.parseInt(request.getParameter("id"));
				
		for(Materia p : App.lista) {
			if(p.getId() == id) {
				App.lista.remove(p);
				break;
			}
		}
		
		response.sendRedirect("jsp/incluirVerificarMateria.jsp");		
	}

}
