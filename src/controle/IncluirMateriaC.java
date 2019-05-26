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

@WebServlet("/IncluirMateriaC")
public class IncluirMateriaC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public IncluirMateriaC() {
        super();
    }
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		HttpSession session = request.getSession();
		
		Materia materia = new Materia();
		String var1 = request.getParameter("nomeMateria");
		String var2 = request.getParameter("nomeTurma");
		String var3 = request.getParameter("dia1Semana");
		String var4 = request.getParameter("tempo1Dia1");
		String var5 = request.getParameter("tempo2Dia1");		
		String var6 = request.getParameter("tempo3Dia1");
				
		materia.iniciarC('C', var1, App.id++, var2, var3, var4, var5, var6);
		App.lista.add(materia);					
		response.sendRedirect("jsp/incluirVerificarMateria.jsp");
		
		session.invalidate();
	}
}
