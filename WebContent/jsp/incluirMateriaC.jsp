<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
		
		<title>Incluir matéria C</title>
	</head>


	<!-- MENU -->
	<div class="container-fluid">
		<%@include file="menu.jsp" %>
	</div>
	<!-- FIM MENU -->
	
	<body>
		<div class="container">
			<p><h1>Selecione a categoria da matéria:</h1></p>	
			<br>
			
			<div class="row">				
				<div class="col-lg-4 dropdown">
				  	<button class="btn btn-dark btn-lg dropdown-toggle" type="button" data-toggle="dropdown"><h3>Categoria C</h3></button>
				  	<ul class="dropdown-menu">
					    <li><a href="incluirMateriaA.jsp"><h3>Categoria A - 2 dias por semana & 2 tempos por dia</h3></a></li>
					    <li><a href="incluirMateriaB.jsp"><h3>Categoria B - 3 dias por semana & 2 tempos por dia</h3></a></li>
					    <li><a href="incluirMateriaC.jsp"><h3>Categoria C - 1 dia por semana & 3 tempos por dia</h3></a></li>
					    <li><a href="incluirMateriaD.jsp"><h3>Categoria D - 1 dia por semana & 4 tempos por dia</h3></a></li>
					    <li><a href="incluirMateriaE.jsp"><h3>Categoria E - 1 dia c/ 2 tempos & 1 dia c/ 1 tempo</h3></a></li>
				  	</ul>			  	
				</div>
				<div class="col-lg-8">
					<h3>1 dia por semana & 3 tempos no dia</h3> 
				</div>
			</div>	
			<br>
			<br>			
			<%@include file="incluirMateriaCDados.jsp" %>			
		</div>
	
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">		
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
		
	</body>
	
	<!-- RODAPÉ -->
	<div class="container-fluid">
		<%@include file="rodape.jsp" %>
	</div>
	<!-- FIM RODAPÉ -->

</html>