package controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.ComparaMaterias;

@WebServlet("/Compara")
public class Compara extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Compara() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		ComparaMaterias comparaMaterias = new ComparaMaterias();
		
		int comp = Integer.parseInt(request.getParameter("comp"));
							
		switch(comp) {
		case 2:
			comparaMaterias.compara2();
			response.sendRedirect("jsp/listar2MateriasComparadas.jsp");
			break;
		case 3:
			comparaMaterias.compara3();
			response.sendRedirect("jsp/listar3MateriasComparadas.jsp");
			break;
		case 4:
			comparaMaterias.compara4();
			response.sendRedirect("jsp/listar4MateriasComparadas.jsp");
			break;
		case 5:
			comparaMaterias.compara5();
			response.sendRedirect("jsp/listar5MateriasComparadas.jsp");
			break;
		case 6:
			comparaMaterias.compara6();
			response.sendRedirect("jsp/listar6MateriasComparadas.jsp");
			break;
		case 7:
			comparaMaterias.compara7();
			response.sendRedirect("jsp/listar7MateriasComparadas.jsp");
			break;
		case 8:
			comparaMaterias.compara8();
			response.sendRedirect("jsp/listar8MateriasComparadas.jsp");
			break;
		case 9:
			comparaMaterias.compara9();
			response.sendRedirect("jsp/listar9MateriasComparadas.jsp");
			break;
		case 10:
			comparaMaterias.compara10();
			response.sendRedirect("jsp/listar10MateriasComparadas.jsp");
			break;
		case 11:
			comparaMaterias.compara11();
			response.sendRedirect("jsp/listar11MateriasComparadas.jsp");
			break;			
		case 12:
			comparaMaterias.compara12();
			response.sendRedirect("jsp/listar12MateriasComparadas.jsp");
			break;
		}	
		
		session.invalidate();
	}
	
}
