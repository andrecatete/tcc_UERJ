<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
		<script src="js/lib/JQuery 3.3.1.js"></script>
		<script src="js/lib/JQuery-3.3.1.js"></script>
						
		<title>Incluir matéria B - dados</title>
	</head>
	
	<body>
		<div class="container">			

			<h1>Informe dados para cadastro</h1>	
			<br>
					
			<form action="../IncluirMateriaB" method="post">  
				<h3>nome e turma da materia</h3><br>
			   	<div class="well">
			   		<div class="row">	    				
	    				
    					<div class="col-lg-3 form-group row" style="text-align:center">    						
    						<label for="nomeMateria" class="col-form-label col-form-label-lg"><h3>&nbsp &nbsp &nbsp &nbsp &nbsp nome da materia:</h3></label>
    					</div>      					
      					<div class="col-lg-4 form-group row">
      						<input type="text" class="form-control form-control-lg" id="nomeMateria" name="nomeMateria" placeholder="nome da materia" required></input>     						
	      				</div>	      				
	      				<div class="col-lg-3 form-group row" style="text-align:center" >    						
    						<label for="numeroTurma" class="col-form-label col-form-label-lg"><h3>&nbsp &nbsp &nbsp &nbsp &nbsp número da turma:</h3></label>
    					</div>
	      				<div class="col-lg-2 form-group row">
   							<select class="form-control form-control-lg form-group" id="nomeTurma" name="nomeTurma">
						  		<option value="Turma 1">Turma 1</option>
						      	<option value="Turma 2">Turma 2</option>
						      	<option value="Turma 3">Turma 3</option>
						      	<option value="Turma 4">Turma 4</option>
						      	<option value="Turma 5">Turma 5</option>
				      	    	
							</select>	   					
	   					</div>
					</div>
 				</div><br> 	

   				<h3>primeiro dia da semana</h3><br>
   					    				
   				<div class="well">
					<div class="row ">
				   		
				   		<div class="col-lg-2 form-group row" style="text-align:center">    						
	    					<label for="nomeMateria" class="col-form-label col-form-label-lg"><h3>&nbsp &nbsp &nbsp &nbsp &nbsp 1º dia:</h3></label>
	    				</div>				   			    					      				
		      			<div class="col-lg-2 form-group row">		
	   						<select class="form-control form-control-lg form-group" id="dia1Semana" name="dia1Semana">							  		
						  		<option value="seg">segunda</option>
						      	<option value="ter">terça</option>
						      	<option value="qua">quarta</option>
						      	<option value="qui">quinta</option>
						      	<option value="sex">sexta</option>
						      	<option value="sab">sábado</option>				      	    	
							</select>	   					
		   				</div>
		   					
		   				<div class="col-lg-2 form-group row" style="text-align:center">    						
	    					<label for="nomeMateria" class="col-form-label col-form-label-lg"><h3>&nbsp &nbsp &nbsp &nbsp &nbsp 1º tempo:</h3></label>
	    				</div>
		   				<div class="col-lg-2 form-group row">		
	   						<select class="form-control form-control-lg form-group" id="tempo1Dia1" name="tempo1Dia1">
						  		<option value="M1">M1</option>
						  		<option value="M2">M2</option>
						  		<option value="M3">M3</option>
						  		<option value="M4">M4</option>
						  		<option value="M5">M5</option>
						  		<option value="M6">M6</option>
						  		<option value="T1">T1</option>
						  		<option value="T2">T2</option>
						  		<option value="T3">T3</option>
						  		<option value="T4">T4</option>
						  		<option value="T5">T5</option>
						  		<option value="T6">T6</option>
						  		<option value="N1">N1</option>
						  		<option value="N2">N2</option>
						  		<option value="N3">N3</option>
						  		<option value="N4">N4</option>
						  		<option value="N5">N5</option>
						  		<option value="N6">N6</option>							      					      	    	
							</select>	   					
		   				</div>
		   					
		   				<div class="col-lg-2 form-group row" style="text-align:center">    						
	    					<label for="nomeMateria" class="col-form-label col-form-label-lg"><h3>&nbsp &nbsp &nbsp &nbsp &nbsp 2º tempo:</h3></label>
	    				</div>
		   				<div class="col-lg-2 form-group row">		
	   						<select class="form-control form-control-lg form-group" id="tempo2Dia1" name="tempo2Dia1">							  		
						  		<option value="M1">M1</option>
						  		<option value="M2">M2</option>
						  		<option value="M3">M3</option>
						  		<option value="M4">M4</option>
						  		<option value="M5">M5</option>
						  		<option value="M6">M6</option>
						  		<option value="T1">T1</option>
						  		<option value="T2">T2</option>
						  		<option value="T3">T3</option>
						  		<option value="T4">T4</option>
						  		<option value="T5">T5</option>
						  		<option value="T6">T6</option>
						  		<option value="N1">N1</option>
						  		<option value="N2">N2</option>
						  		<option value="N3">N3</option>
						  		<option value="N4">N4</option>
						  		<option value="N5">N5</option>
						  		<option value="N6">N6</option>								      					      	    	
							</select>	   					
		   				</div>		   					
					</div>
 				</div><br>	   					
		
				<br><h3>segundo dia da semana</h3><br>
		
				<div class="well">
					<div class="row ">
				   		
				   		<div class="col-lg-2 form-group row" style="text-align:center">    						
    						<label for="nomeMateria" class="col-form-label col-form-label-lg"><h3>&nbsp &nbsp &nbsp &nbsp &nbsp 2º dia:</h3></label>
    					</div>				   			    					      				
	      				<div class="col-lg-2 form-group row">		
   							<select class="form-control form-control-lg form-group" id="dia2Semana" name="dia2Semana">							  		
						      	<option value="seg">segunda</option>
						      	<option value="ter">terça</option>
						      	<option value="qua">quarta</option>
						      	<option value="qui">quinta</option>
						      	<option value="sex">sexta</option>
						      	<option value="sab">sábado</option>				      	    	
							</select>	   					
	   					</div>
		   					
	   					<div class="col-lg-2 form-group row" style="text-align:center">    						
    						<label for="nomeMateria" class="col-form-label col-form-label-lg"><h3>&nbsp &nbsp &nbsp &nbsp &nbsp 1º tempo:</h3></label>
    					</div>
	   					<div class="col-lg-2 form-group row">		
   							<select class="form-control form-control-lg form-group" id="tempo1Dia2" name="tempo1Dia2">							  		
						  		<option value="M1">M1</option>
						  		<option value="M2">M2</option>
						  		<option value="M3">M3</option>
						  		<option value="M4">M4</option>
						  		<option value="M5">M5</option>
						  		<option value="M6">M6</option>
						  		<option value="T1">T1</option>
						  		<option value="T2">T2</option>
						  		<option value="T3">T3</option>
						  		<option value="T4">T4</option>
						  		<option value="T5">T5</option>
						  		<option value="T6">T6</option>
						  		<option value="N1">N1</option>
						  		<option value="N2">N2</option>
						  		<option value="N3">N3</option>
						  		<option value="N4">N4</option>
						  		<option value="N5">N5</option>
						  		<option value="N6">N6</option>							      					      	    	
							</select>	   					
	   					</div>
		   					
	   					<div class="col-lg-2 form-group row" style="text-align:center">    						
    						<label for="nomeMateria" class="col-form-label col-form-label-lg"><h3>&nbsp &nbsp &nbsp &nbsp &nbsp 2º tempo:</h3></label>
    					</div>
	   					<div class="col-lg-2 form-group row">		
   							<select class="form-control form-control-lg form-group" id="tempo2Dia2" name="tempo2Dia2">							  		
						  		<option value="M1">M1</option>
						  		<option value="M2">M2</option>
						  		<option value="M3">M3</option>
						  		<option value="M4">M4</option>
						  		<option value="M5">M5</option>
						  		<option value="M6">M6</option>
						  		<option value="T1">T1</option>
						  		<option value="T2">T2</option>
						  		<option value="T3">T3</option>
						  		<option value="T4">T4</option>
						  		<option value="T5">T5</option>
						  		<option value="T6">T6</option>
						  		<option value="N1">N1</option>
						  		<option value="N2">N2</option>
						  		<option value="N3">N3</option>
						  		<option value="N4">N4</option>
						  		<option value="N5">N5</option>
						  		<option value="N6">N6</option>							      					      	    	
							</select>	   					
	   					</div>		   					
					</div>
				</div><br>
				
				<br><h3>terceiro dia da semana</h3><br>
		
				<div class="well">
					<div class="row ">
				   		
				   		<div class="col-lg-2 form-group row" style="text-align:center">    						
    						<label for="nomeMateria" class="col-form-label col-form-label-lg"><h3>&nbsp &nbsp &nbsp &nbsp &nbsp 3º dia:</h3></label>
    					</div>				   			    					      				
	      				<div class="col-lg-2 form-group row">		
   							<select class="form-control form-control-lg form-group" id="dia3Semana" name="dia3Semana">							  		
						      	<option value="seg">segunda</option>
						      	<option value="ter">terça</option>
						      	<option value="qua">quarta</option>
						      	<option value="qui">quinta</option>
						      	<option value="sex">sexta</option>
						      	<option value="sab">sábado</option>				      	    	
							</select>	   					
	   					</div>
		   					
	   					<div class="col-lg-2 form-group row" style="text-align:center">    						
    						<label for="nomeMateria" class="col-form-label col-form-label-lg"><h3>&nbsp &nbsp &nbsp &nbsp &nbsp 1º tempo:</h3></label>
    					</div>
	   					<div class="col-lg-2 form-group row">		
   							<select class="form-control form-control-lg form-group" id="tempo1Dia3" name="tempo1Dia3">							  		
						  		<option value="M1">M1</option>
						  		<option value="M2">M2</option>
						  		<option value="M3">M3</option>
						  		<option value="M4">M4</option>
						  		<option value="M5">M5</option>
						  		<option value="M6">M6</option>
						  		<option value="T1">T1</option>
						  		<option value="T2">T2</option>
						  		<option value="T3">T3</option>
						  		<option value="T4">T4</option>
						  		<option value="T5">T5</option>
						  		<option value="T6">T6</option>
						  		<option value="N1">N1</option>
						  		<option value="N2">N2</option>
						  		<option value="N3">N3</option>
						  		<option value="N4">N4</option>
						  		<option value="N5">N5</option>
						  		<option value="N6">N6</option>							      					      	    	
							</select>	   					
	   					</div>
		   					
	   					<div class="col-lg-2 form-group row" style="text-align:center">    						
    						<label for="nomeMateria" class="col-form-label col-form-label-lg"><h3>&nbsp &nbsp &nbsp &nbsp &nbsp 2º tempo:</h3></label>
    					</div>
	   					<div class="col-lg-2 form-group row">		
   							<select class="form-control form-control-lg form-group" id="tempo2Dia3" name="tempo2Dia3">							  		
						  		<option value="M1">M1</option>
						  		<option value="M2">M2</option>
						  		<option value="M3">M3</option>
						  		<option value="M4">M4</option>
						  		<option value="M5">M5</option>
						  		<option value="M6">M6</option>
						  		<option value="T1">T1</option>
						  		<option value="T2">T2</option>
						  		<option value="T3">T3</option>
						  		<option value="T4">T4</option>
						  		<option value="T5">T5</option>
						  		<option value="T6">T6</option>
						  		<option value="N1">N1</option>
						  		<option value="N2">N2</option>
						  		<option value="N3">N3</option>
						  		<option value="N4">N4</option>
						  		<option value="N5">N5</option>
						  		<option value="N6">N6</option>							      					      	    	
							</select>	   					
	   					</div>		   					
					</div>
				</div><br><br>
 					
 					<div class="form-group">
						<button type="submit" class="btn btn-dark btn-xl"><h3>gravar</h3></button>
						<input type="reset" class="btn btn-outline-dark btn-lg" value="limpar" />
					</div>
					 					
				</div>								
			</form>
		</div>
		
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">		
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
		<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
				
	</body>

</html>