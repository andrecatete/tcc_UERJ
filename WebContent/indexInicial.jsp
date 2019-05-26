<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
		-->
		
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">		
		<link rel="stylesheet" href="css/bootstrap.min.css" media="screen">		
		<script src="js/lib/bootstrap.min.js"></script>
		<script src="js/lib/jquery-3.2.1.js"></script>
		
		<title>Tela Inicial</title>
	</head>
	
	<!-- MENU VISITANTE-->
	<div class="container-fluid">
		<%@include file="menuInicial.jsp" %>
	</div>
	<!-- FIM - MENU VISITANTE-->
		
	<body>			
		<div class="container">
			<br>
			<div class="alert alert-warning" role="alert">
  				<h1>Aqui você encontra a melhor maneira de escolher as matérias para cursar no período!!!</h1>
			</div>
			<br>			
			<div class="row">		
				<div class="col-lg-12 card mb-3">
			  		<img class="card-img-top" src="imagem/biblioteca.png" alt="Card image cap">				  	
				</div>
			</div>
			
			<div class="row">
				<div class="col-md-5"></div>
								  
				<form class="col-md-2 form-inline" action="Inicio" method="post">    		
					<div class="form-group">
						<label class="control-label" for="singlebutton"></label>
							<h1>&nbsp &nbsp &nbsp &nbsp</h1>   						
      						<button id="botao" name="botao" class="btn btn-dark btn-lg"><h3>iniciar</h3></button>
					</div>
				</form>
									
			</div>
					
		</div><br>				
	</body>
	
	<!-- RODAPÉ -->
	<div class="container-fluid">
		<%@include file="jsp/rodape.jsp" %>
	</div>
	<!-- FIM - RODAPÉ -->
	
</html>