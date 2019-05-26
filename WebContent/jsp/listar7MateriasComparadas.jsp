<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import = "modelo.App"%>
<%@page import = "modelo.Materia"%>
<%@page import = "modelo.Turma"%>
<%@page import = "java.util.ArrayList"%>
<%@page import = "java.util.List"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	
	<head>
		<meta name=“viewport” content=“width=device-width,initial-scale=1”>		
		<link rel="stylesheet" href="../css/bootstrap.min.css"/>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	 	<script src="js/lib/jquery-3.2.1.js"></script>
		<script src="js/lib/bootstrap.min.js"></script>
			
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">		
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
			
		<title>Matérias - Listagem Geral</title>
	</head>
		
	<!-- MENU -->
	<div class="container-fluid">
		<%@include file="menu.jsp" %>
	</div>
	<!-- FIM MENU -->
			
	<body>
	<br>
		<div class="container">
			<table class="table table-striped table-hover">
				<tr>
					<td><h2>nome</h2></td>							
					<td><h2>turma</h2></td>
					<td><h2>detalhar</h2></td>
				</tr>
				<%
				App.totalBlocagem = 0;
				int i = 1;
					for(Materia p: App.listasComparadas){
						out.println("<tr class='warning'>");
							out.println("<td><h3>" + p.getNomeMateria() + "</h3></td>");							
							out.println("<td><h3>" + p.getTurma().getNomeTurma() + "</h3></td>");
							out.println("<td> &nbsp &nbsp &nbsp &nbsp" + "<a class=' btn btn-success btn-xs' href='../DetalharMateriaY?id=" + p.getId() + "'>" +"<span class= 'glyphicon glyphicon-zoom-in'></span></a>" + "</td>");
						out.println("<tr>");
						if (i == 7){
							out.println("<tr>");
								out.println("<td>" + "<div class='col-lg-10 alert alert-secondary' role='alert'></div>" + "</td>");																
								out.println("<td>" + "<div class='col-lg-5 alert alert-secondary' role='alert'></div>" + "</td>");																
								out.println("<td>" + "<div class='col-lg-4 alert alert-secondary' role='alert'></div>" + "</td>");
							out.println("<tr>");
							i = 0;
							App.totalBlocagem++;
						}
						i++;
					}
					App.numModalComparadas = 7;
					App.listasComparadas.clear();
				%>				
			</table>		
			<div>
				<div class="alert alert-dark" role="alert"><h2>Total de blocos de materias encontrado: <%out.println(App.totalBlocagem);%></h2></div>				
			</div>
			
			<%
			if(App.totalBlocagem == 0)
				out.println("<div class='alert alert-danger' role='alert'><h2>Não há combinações disponíveis</h2></div>");
			%>	
			
			<!-- 
			<div>
				<div class="alert alert-dark" role="alert"> Tempo de execução: <%out.println(App.tempoInicial);%></div>				
			</div>
			 -->
				
		</div>	
	</body>
	
	<!-- RODAPÉ -->
	<div class="container-fluid">
		<%@include file="rodape.jsp" %>
	</div>
	<!-- FIM - RODAPÉ -->

</html>