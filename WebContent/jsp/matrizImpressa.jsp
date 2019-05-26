<!-- <%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import = "modelo.App"%>
<%@page import = "modelo.Materia"%>
<%@page import = "modelo.MateriasListadas"%>
<%@page import = "modelo.ImprimeMatriz"%>
<%@page import = "modelo.Turma"%>
<%@page import = "java.util.ArrayList"%>
<%@page import = "java.util.List"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">		
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
			
		<title>Matérias - Listagem Geral</title>
	</head>
			
	<body>
		<% /*
		ImprimeMatriz imprimeMatriz = new ImprimeMatriz();
		int [][]mat = new int[6][18];
		
		for(Materia p: App.lista) {
			mat = imprimeMatriz.preparaMatriz(p);	
		}*/
		%>
		<div class="container">			
			<table class="table table-striped">			
				<tr>
					<td>M1</td>					
					<td>M2</td>
					<td>M3</td>
					<td>M4</td>
					<td>M5</td>					
					<td>M6</td>					
					<td>T1</td>					
					<td>T2</td>
					<td>T3</td>
					<td>T4</td>
					<td>T5</td>					
					<td>T6</td>					
					<td>N1</td>					
					<td>N2</td>
					<td>N3</td>
					<td>N4</td>
					<td>N5</td>					
					<td>N6</td>					
				</tr>						
				<%/*
					for(int i = 0; i < 6; i++){
						for(int j = 0; j < 18; j++){
							out.println("<tr>");
								out.println("<td>" + mat[i][j] + "</td>");														
							out.println("<tr>");
						}
					}
				*/%>
				
			</table>		
		</div>
				
	</body>

</html>-->