<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import = "java.util.ArrayList"%>
<%@page import = "java.util.List"%>
<%@page import = "modelo.App"%>
<%@page import = "modelo.ImprimeMatriz"%>
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
				<div class="container" align="center">
					<!-- <div class="col-md-5"></div> -->
					<form action="incluirCategoriaMateria.jsp" method="post">
						<div class="form-group">
								<button type="submit" class="btn btn-dark btn-lg"><h3>incluir</h3></button>				
						</div>
					</form>
				</div>
			</div>			
			<p><h1>Lista de matérias candidatas a se cursar no período:</h1></p>	
			<br>			
			
			<div class="container-fluid">
				<%@include file="listarMaterias.jsp" %>
			</div>

			<!-- Modal Filtro-->
			<button type="button" class="btn btn-dark btn-lg" data-toggle="modal" data-target="#Modal"><h3>filtro (opcional)</h3></button>
			
			<form action="../Filtro" method="post">
			<div class="modal fade" id="Modal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
			  	<div class="modal-sm modal-dialog modal-dialog-centered" role="document">
			    	<div class="modal-content">
			      		<div class="modal-header">
			        		<h1 class="modal-title" id="exampleModalLabel">Escolha as opções que NÃO vai querer</h1>
			        		<button type="button" class="close" data-dismiss="modal" aria-label="Close">
			          			<span aria-hidden="true">&times;</span>
			        		</button>
			      		</div>
			      		
			      		<!--  body modal -->   
			      		<div class="modal-body">			      			
				        		<div class="form-check">			        			
				        			<div class="col-lg-4">
										<input class="form-check-input" type="checkbox" value="M1" id="checkM1" name="checkM1">
										<label class="form-check-label" for="checkM1"><h3>M1</h3></label>
									</div>
									<div class="col-lg-4">
										<input class="form-check-input" type="checkbox" value="M2" id="checkM2" name="checkM2">
										<label class="form-check-label" for="checkM2"><h3>M2</h3></label>
									</div>
									<div class="col-lg-4">
										<input class="form-check-input" type="checkbox" value="M3" id="checkM3" name="checkM3">
										<label class="form-check-label" for="checkM3"><h3>M3</h3></label>
									</div>
				        			<div class="col-lg-4">
										<input class="form-check-input" type="checkbox" value="M4" id="checkM4" name="checkM4">
										<label class="form-check-label" for="checkM4"><h3>M4</h3></label>
									</div>
									<div class="col-lg-4">
										<input class="form-check-input" type="checkbox" value="M5" id="checkM5" name="checkM5">
										<label class="form-check-label" for="checkM5"><h3>M5</h3></label>
									</div>
									<div class="col-lg-4">
										<input class="form-check-input" type="checkbox" value="M6" id="checkM6" name="checkM6">
										<label class="form-check-label" for="checkM6"><h3>M6</h3></label>
									</div>
				        			<div class="col-lg-4">
										<input class="form-check-input" type="checkbox" value="T1" id="checkT1" name="checkT1">
										<label class="form-check-label" for="checkT1"><h3>T1</h3></label>
									</div>
									<div class="col-lg-4">
										<input class="form-check-input" type="checkbox" value="T2" id="checkT2" name="checkT2">
										<label class="form-check-label" for="checkT2"><h3>T2</h3></label>
									</div>
									<div class="col-lg-4">
										<input class="form-check-input" type="checkbox" value="T3" id="checkT3" name="checkT3">
										<label class="form-check-label" for="checkT3"><h3>T3</h3></label>
									</div>
				        			<div class="col-lg-4">
										<input class="form-check-input" type="checkbox" value="T4" id="checkT4" name="checkT4">
										<label class="form-check-label" for="checkT4"><h3>T4</h3></label>
									</div>
									<div class="col-lg-4">
										<input class="form-check-input" type="checkbox" value="T5" id="checkT5" name="checkT5">
										<label class="form-check-label" for="checkT5"><h3>T5</h3></label>
									</div>
									<div class="col-lg-4">
										<input class="form-check-input" type="checkbox" value="T6" id="checkT6" name="checkT6">
										<label class="form-check-label" for="checkT6"><h3>T6</h3></label>
									</div>
				        			<div class="col-lg-4">
										<input class="form-check-input" type="checkbox" value="N1" id="checkN1" name="checkN1">
										<label class="form-check-label" for="checkN1"><h3>N1</h3></label>
									</div>
									<div class="col-lg-4">
										<input class="form-check-input" type="checkbox" value="N2" id="checkN2" name="checkN2">
										<label class="form-check-label" for="checkN2"><h3>N2</h3></label>
									</div>
									<div class="col-lg-4">
										<input class="form-check-input" type="checkbox" value="N3" id="checkN3" name="checkN3">
										<label class="form-check-label" for="checkN3"><h3>N3</h3></label>
									</div>
				        			<div class="col-lg-4">
										<input class="form-check-input" type="checkbox" value="N4" id="checkN4" name="checkN4">
										<label class="form-check-label" for="checkN4"><h3>N4</h3></label>
									</div>
									<div class="col-lg-4">
										<input class="form-check-input" type="checkbox" value="N5" id="checkN5" name="checkN5">
										<label class="form-check-label" for="checkN5"><h3>N5</h3></label>
									</div>
									<div class="col-lg-4">
										<input class="form-check-input" type="checkbox" value="N6" id="checkN6" name="checkN6">
										<label class="form-check-label" for="checkN6"><h3>N6</h3></label>
									</div>
								</div>													
			      		</div>
			      		
			      		<div class="modal-footer form-group">
			        		<button type="button" class="btn btn-outline-dark btn-lg" data-dismiss="modal"><h3>Fechar</h3></button>
			        		<button type="submit" class="btn btn-dark btn-xl" ><h3>gravar</h3></button>
			      		</div>
			      		
			    	</div>
			  	</div>
			</div>
			</form>
			<!-- FIM Modal Filtro-->
			<br><br>	
					 
			<!-- Modal  Matriz-->			
			<button type="button" class="btn btn-dark btn-lg" data-toggle="modal" data-target="#Modal02"><h3>matriz (informativo)</h3></button>
			
			<style>.modal .modal-content { width: 1000px; }</style>
			<div class="modal fade" id="Modal02"  tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle" aria-hidden="true">
			  	<div class="modal-dialog modal-lg" role="document">
			    	<div class="modal-content">
			      		<div class="modal-header">
			        		<h2 class="modal-title" id="exampleModalLongTitle">Matriz</h2>
			        		<button type="button" class="close" data-dismiss="modal" aria-label="Close">
			          			<span aria-hidden="true">&times;</span>
			        		</button>
			      		</div>
			      		<div class="modal-body">						
			      			<table class="table table-striped">			
								<tr>
									<td><h3>X</h3></td>
									<td><h3>M1</h3></td>
									<td><h3>M2</h3></td>
									<td><h3>M3</h3></td>
									<td><h3>M4</h3></td>
									<td><h3>M5</h3></td>
									<td><h3>M6</h3></td>
									<td><h3>T1</h3></td>
									<td><h3>T2</h3></td>
									<td><h3>T3</h3></td>
									<td><h3>T4</h3></td>
									<td><h3>T5</h3></td>
									<td><h3>T6</h3></td>
									<td><h3>N1</h3></td>
									<td><h3>N2</h3></td>
									<td><h3>N3</h3></td>
									<td><h3>N4</h3></td>
									<td><h3>N5</h3></td>
									<td><h3>N6</h3></td>
								</tr>						
								<%
								int [][]mat = new int[6][18];
								ImprimeMatriz imprimeMatriz = new ImprimeMatriz();
								for(Materia p: App.lista) {
									mat = imprimeMatriz.preparaMatriz(p);	
								}								
								out.println("<tr>");
									out.println("<td><h3>" + "seg" + "</h3></td>");
									for(int i = 0; i < 18; i++){
										out.println("<td><h3>" + mat[0][i] + "</h3></td>");
									}											
								out.println("</tr>");
								out.println("<tr>");
									out.println("<td><h3>" + "ter" + "</h3></td>");
									for(int i = 0; i < 18; i++){
										out.println("<td><h3>" + mat[1][i] + "</h3></td>");
									}			
								out.println("</tr>");
								out.println("<tr>");
									out.println("<td><h3>" + "qua" + "</h3></td>");
									for(int i = 0; i < 18; i++){
										out.println("<td><h3>" + mat[2][i] + "</h3></td>");
									}											
								out.println("</tr>");
								out.println("<tr>");
									out.println("<td><h3>" + "qui" + "</h3></td>");
									for(int i = 0; i < 18; i++){
										out.println("<td><h3>" + mat[3][i] + "</h3></td>");
									}			
								out.println("</tr>");
								out.println("<tr>");
									out.println("<td><h3>" + "sex" + "</h3></td>");
									for(int i = 0; i < 18; i++){
										out.println("<td><h3>" + mat[4][i] + "</h3></td>");
									}											
								out.println("</tr>");
								out.println("<tr>");
									out.println("<td><h3>" + "sab" + "</h3></td>");
									for(int i = 0; i < 18; i++){
										out.println("<td><h3>" + mat[5][i] + "</h3></td>");
									}			
								out.println("</tr>");
								%>				
							</table>
			      		</div>
			      		<div class="modal-footer">
			        		<button type="button" class="btn btn-dark btn-xl" data-dismiss="modal"><h3>fechar</h3></button>	        	
			      		</div>
			    	</div>
			  	</div>
			</div>	
			 
			<!-- FIM Modal Matriz-->				
			<br><br>
			<!-- botão quantidade de matérias-->
			<p><h1>Informe quantas matérias gostaria de cursar no período</h1></p>
			<p><h2>e receba as opções de quadros que poderá usar</h2></p>
			<div class="dropdown">
			  	<button class="btn btn-dark btn-lg dropdown-toggle" type="button" data-toggle="dropdown"><h3>quantidade</h3></button>
			  	<ul class="dropdown-menu">				    
				    <li><a href="../Compara?comp=3"><h3>03 matérias</h3></a></li>
				    <li><a href="../Compara?comp=4"><h3>04 matérias</h3></a></li>
				    <li><a href="../Compara?comp=5"><h3>05 matérias</h3></a></li>
				    <li><a href="../Compara?comp=6"><h3>06 matérias</h3></a></li>
				    <li><a href="../Compara?comp=7"><h3>07 matérias</h3></a></li>
				    <li><a href="../Compara?comp=8"><h3>08 matérias</h3></a></li>
				    <li><a href="../Compara?comp=9"><h3>09 matérias</h3></a></li>
				    <li><a href="../Compara?comp=10"><h3>10 matérias</h3></a></li>
				    <li><a href="../Compara?comp=11"><h3>11 matérias</h3></a></li>
				    <li><a href="../Compara?comp=12"><h3>12 matérias</h3></a></li>
			  	</ul>			  	
			</div>
			<!-- FIM botão quantidade de matérias-->
			<br><br> 
		</div>
	</body>
	
	<!-- RODAPÉ -->
	<div class="container-fluid">
		<%@include file="rodape.jsp" %>
	</div>
	<!-- FIM - RODAPÉ -->

</html>