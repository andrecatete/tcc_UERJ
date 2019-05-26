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

@WebServlet("/DetalharMateriaY")
public class DetalharMateriaY extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DetalharMateriaY() {
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
					response.sendRedirect("jsp/modalComparadoA.jsp");
					break;
				case 'B':
					response.sendRedirect("jsp/modalComparadoB.jsp");
					break;
				case 'C':
					response.sendRedirect("jsp/modalComparadoC.jsp");
					break;
				case 'D':
					response.sendRedirect("jsp/modalComparadoD.jsp");
					break;
				case 'E':
					response.sendRedirect("jsp/modalComparadoE.jsp");
					break;
				}								
				break;
			}
		}	
		
		session.invalidate();
	}
}
