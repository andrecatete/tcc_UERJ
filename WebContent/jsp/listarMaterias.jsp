<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import = "modelo.App"%>
<%@page import = "modelo.Materia"%>
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
			
	<body>
	
		<div class="container">			
			<table class="table table-striped table-hover">			
				<tr>
					<td><h2>nome</h2></td>							
					<td><h2>turma</h2></td>
					<td><h2>detalhar</h2></td>
					<td><h2>excluir</h2></td>					
				</tr>
						
				<%
					for(Materia p: App.lista){
						out.println("<tr class='warning'>");
							out.println("<td><h3>" + p.getNomeMateria() + "</h3></td>");							
							out.println("<td><h3>" + p.getTurma().getNomeTurma() + "</h3></td>");
							out.println("<td> &nbsp &nbsp &nbsp &nbsp" + "<a class=' btn btn-success btn-xs' href='../DetalharMateriaX?id=" + p.getId() + "'>" +"<span class= 'glyphicon glyphicon-zoom-in'></span></a>" + "</td>");								
							out.println("<td> &nbsp &nbsp &nbsp &nbsp" + "<a class=' btn btn-danger btn-xs'  href='../ExcluirMateriaX?id=" + p.getId() + "'>" + "<span class= 'glyphicon glyphicon-remove'></span></a>" + "</td>");							
						out.println("<tr>");
					}
				%>
				
			</table>		
		</div>
				
	</body>

</html>