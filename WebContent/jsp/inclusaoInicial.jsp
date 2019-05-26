<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import = "java.util.ArrayList"%>
<%@page import = "java.util.List"%>
<%@page import = "modelo.App"%>
<%@page import = "modelo.Materia"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
		
	<head>
		<meta name=“viewport” content=“width=device-width,initial-scale=1”>		
		<link rel="stylesheet" href="../css/bootstrap.min.css"/>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	 	<script src="js/lib/jquery-3.2.1.js"></script>
		<script src="js/lib/bootstrap.min.js"></script>
		
		<!-- 
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">		
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
		-->
		
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">		
		<link rel="stylesheet" href="css/bootstrap.min.css" media="screen">		
		<script src="js/lib/bootstrap.min.js"></script>
		<script src="js/lib/jquery-3.2.1.js"></script>
		<script src="js/lib/JQuery 3.3.1.js"></script>
		<script src="js/lib/JQuery-3.3.1.js"></script>
				
		<title>Tela incluir / verificar blocagem</title>
	</head>


	<!-- MENU-->
	<div class="container-fluid">
		<%@include file="menu.jsp" %>
	</div>
	<!-- FIM MENU-->
	
	<body>
		<div class="container" align="center">
			<p><h1>Clique no botão para incluir materias que não estão na lista</h1></p>	
			<br>
			<div class="row">
				<div class="col-md-5"></div>
				<form action="incluirCategoriaMateria.jsp" method="post">
					<div class="form-group">
							<button type="submit" class="btn btn-primary">incluir</button>				
					</div>
				</form>
			</div>
			<p><h1>Selecione as matérias que gostaria de cursar no período</h1></p>	
			<br>
			
			
			<div class="container-fluid">
				<%@include file="listarMaterias.jsp" %>
			</div>
			
					
		</div>
	</body>
	
	<!-- RODAPÉ -->
	<div class="container-fluid">
		<%@include file="rodape.jsp" %>
	</div>
	<!-- FIM - RODAPÉ -->

</html>