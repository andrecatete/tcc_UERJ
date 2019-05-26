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
		<link rel="stylesheet" href="css/bootstrap.min.css" media="screen">		
		<script src="js/lib/bootstrap.min.js"></script>
		<script src="js/lib/jquery-3.2.1.js"></script>
		<script src="js/lib/JQuery 3.3.1.js"></script>
		<script src="js/lib/JQuery-3.3.1.js"></script>
		-->
		
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">		
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
		<script type="text/javascript">
			$(document).ready(function() {
    			$('#exampleModalLong').modal('show');
			})
		</script>
				 				
		<title>Detalhar categoria E</title>
	</head>

	<body>
	    <!-- ModalE -->
		<div class="modal fade" id="exampleModalLong"  tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle" aria-hidden="true">
		  	<div class="modal-dialog modal-lg modal-dialog-centered" role="document">
		    	<div class="modal-content">
		      		<div class="modal-header">
		        		<h2 class="modal-title" id="exampleModalLongTitle">Matéria: <% out.println(App.materiaDetalhada.getNomeMateria());%></h2>
		        		<button type="button" class="close" data-dismiss="modal" aria-label="Close">
		          			<span aria-hidden="true">&times;</span>
		        		</button>
		      		</div>	      		
		      		<div class="modal-body">	        		
					<h3><% out.println(App.materiaDetalhada.getTurma().getNomeTurma()); %></h3>
		      			<table class="table table-striped">			
							<tr>
								<td><h3>Dia</h3></td>
								<td><h3>1º Tempo</h3></td>
								<td><h3>2º Tempo</h3></td>							
							</tr>						
							<%							
									out.println("<tr>");
										out.println("<td><h3>" + App.materiaDetalhada.getTurma().getTurma2Dias2E1Tempos1E2().getNomeDiaSemana() + "</h3></td>");
										out.println("<td><h3>" + App.materiaDetalhada.getTurma().getTurma2Dias2E1Tempos1E2().getDiaSemana2Dias2E1Tempos().getNomeTempo1() + "</h3></td>");
										out.println("<td><h3>" + App.materiaDetalhada.getTurma().getTurma2Dias2E1Tempos1E2().getDiaSemana2Dias2E1Tempos().getNomeTempo2() + "</h3></td>");
									out.println("</tr>");									
									out.println("<tr>");	
										out.println("<td><h3>" + App.materiaDetalhada.getTurma().getTurma2Dias2E1Tempos3().getNomeDiaSemana() + "</h3></td>");
										out.println("<td><h3>" + App.materiaDetalhada.getTurma().getTurma2Dias2E1Tempos3().getDiaSemana2Dias2E1Tempos().getNomeTempo1() + "</h3></td>");
										out.println("<td>" + "</td>");
									out.println("</tr>");
							%>				
						</table>
		      		</div>
		      		<div class="modal-footer">
		        		<button type="button" class="btn btn-dark btn-lg" data-dismiss="modal"><h3>fechar</h3></button>	        	
		      		</div>
		    	</div>
		  	</div>
		</div>
		
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">		
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
		
	</body>
	
	<!-- MENU -->
	<div class="container-fluid">
		<%@include file="incluirVerificarMateria.jsp" %>
	</div>
	<!-- FIM MENU-->	

</html>