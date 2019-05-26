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

@WebServlet("/DetalharMateriaX")
public class DetalharMateriaX extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DetalharMateriaX() {
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
				App.materiaDetalhada = p;
				switch(p.getNomeCategoria()) {
				case 'A':
					response.sendRedirect("jsp/modalA.jsp");
					break;
				case 'B':
					response.sendRedirect("jsp/modalB.jsp");
					break;
				case 'C':
					response.sendRedirect("jsp/modalC.jsp");
					break;
				case 'D':
					response.sendRedirect("jsp/modalD.jsp");
					break;
				case 'E':
					response.sendRedirect("jsp/modalE.jsp");
					break;
				}								
				break;
			}
		}
		session.invalidate();
	}
}
