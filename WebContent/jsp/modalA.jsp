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
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
		<script type="text/javascript">
			$(document).ready(function() {
    			$('#exampleModalLong').modal('show');
			})
		</script>
				 				
		<title>Detalhar categoria A</title>
	</head>

	<body>
	    <!-- ModalA -->
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
										out.println("<td><h3>" + App.materiaDetalhada.getTurma().getTurma2Dias2Tempos1().getNomeDiaSemana() + "</h3></td>");
										out.println("<td><h3>" + App.materiaDetalhada.getTurma().getTurma2Dias2Tempos1().getDiaSemana2Dias2Tempos().getNomeTempo1() + "</h3></td>");
										out.println("<td><h3>" + App.materiaDetalhada.getTurma().getTurma2Dias2Tempos1().getDiaSemana2Dias2Tempos().getNomeTempo2() + "</h3></td>");
									out.println("</tr>");									
									out.println("<tr>");	
										out.println("<td><h3>" + App.materiaDetalhada.getTurma().getTurma2Dias2Tempos2().getNomeDiaSemana() + "</h3></td>");
										out.println("<td><h3>" + App.materiaDetalhada.getTurma().getTurma2Dias2Tempos2().getDiaSemana2Dias2Tempos().getNomeTempo1() + "</h3></td>");
										out.println("<td><h3>" + App.materiaDetalhada.getTurma().getTurma2Dias2Tempos2().getDiaSemana2Dias2Tempos().getNomeTempo2() + "</h3></td>");
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
		<!-- FIM ModalA -->		
		
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">		
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
		
	</body>
	
	<!-- MENU -->
	<div class="container-fluid">
		<%@include file="incluirVerificarMateria.jsp" %>
	</div>
	<!-- FIM MENU-->	

</html>