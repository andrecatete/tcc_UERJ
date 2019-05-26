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

@WebServlet("/Filtro")
public class Filtro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Filtro() {
        super();
    }
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		HttpSession session = request.getSession();
				
		App.listaImpropria[0] = request.getParameter("checkM1");
		App.listaImpropria[1] = request.getParameter("checkM2");
		App.listaImpropria[2] = request.getParameter("checkM3");
		App.listaImpropria[3] = request.getParameter("checkM4");
		App.listaImpropria[4] = request.getParameter("checkM5");
		App.listaImpropria[5] = request.getParameter("checkM6");
		App.listaImpropria[6] = request.getParameter("checkT1");
		App.listaImpropria[7] = request.getParameter("checkT2");
		App.listaImpropria[8] = request.getParameter("checkT3");
		App.listaImpropria[9] = request.getParameter("checkT4");
		App.listaImpropria[10] = request.getParameter("checkT5");
		App.listaImpropria[11] = request.getParameter("checkT6");
		App.listaImpropria[12] = request.getParameter("checkN1");
		App.listaImpropria[13] = request.getParameter("checkN2");
		App.listaImpropria[14] = request.getParameter("checkN3");
		App.listaImpropria[15] = request.getParameter("checkN4");
		App.listaImpropria[16] = request.getParameter("checkN5");
		App.listaImpropria[17] = request.getParameter("checkN6");
		
		response.sendRedirect("jsp/incluirVerificarMateria.jsp");
		
		session.invalidate();
	}
}
