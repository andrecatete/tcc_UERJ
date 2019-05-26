package modelo;

public class MassaInicial {
	
	public void iniciando() {	
		
		Materia algebra = new Materia();					// 01 materia ate aqui
		Materia algebra_linear = new Materia();
		Materia calculoI = new Materia();
		Materia calculoII = new Materia();
		Materia calculoIII = new Materia();
		Materia calculoIV = new Materia();
		Materia calculo_das_probabilidades = new Materia();
		Materia elementos_de_logica = new Materia();
		Materia fisicaI = new Materia();
		Materia fisicaII = new Materia();					// 10 materias ate aqui
		Materia algebra_analitica = new Materia();
		Materia matematica_discreta = new Materia();
		Materia AEDI = new Materia();
		Materia AEDII = new Materia();
		Materia algoritmos_em_grafos = new Materia();
		Materia analise_de_projetos_de_sistemas = new Materia();
		Materia arquitetura_de_computadoresI = new Materia();
		Materia arquitetura_de_computadoresII = new Materia();
		Materia arquitetura_avancada_de_computadores = new Materia();
		Materia banco_de_dadosI = new Materia();			// 20 materias ate aqui
/*		Materia banco_de_dadosII = new Materia();
		Materia calculo_numerico = new Materia();
		Materia computacao_grafica = new Materia();
		Materia engenharia_de_software = new Materia();
		Materia estrutura_de_linguagens = new Materia();
		Materia etica = new Materia();
		Materia fundamentos_da_computacao = new Materia();
		Materia inteligencia_artificial = new Materia();
		Materia interface_humano_computador = new Materia();
		Materia linguagem_de_programacaoI = new Materia();	// 30 materias ate aqui
		Materia linguagem_de_programacaoII = new Materia();
		Materia metodologia_projeto_final = new Materia();
		Materia otimizacao_em_grafos = new Materia();
		Materia portugues_instrumental = new Materia();
		Materia redesI = new Materia();						// 35 materias ate aqui
		Materia redesII = new Materia();					
		Materia sitemas_distribuidos = new Materia();
		Materia sistemas_operacionaisI = new Materia();
		Materia sistemas_operacionaisII = new Materia();
		Materia teoria_da_computacao = new Materia();		// 40 materias ate aqui
		Materia otimizacao_combinatoria = new Materia();
		Materia algebra_linear_aplicada = new Materia();
		Materia analise_numerica = new Materia();
		Materia estatistica_aplicada = new Materia();
		Materia fisicaIII = new Materia();
		Materia fisicaIV = new Materia();
		Materia lingua_inglesa = new Materia();		
		Materia algoritmos_computacionais = new Materia();
		Materia empreendedorismo = new Materia();
		Materia filosofia_da_ciencia = new Materia();		// 50 materias ate aqui
		Materia fundamentos_da_administracao = new Materia();
		Materia informatica_na_educacao = new Materia();
		Materia algoritmos_distribuidos = new Materia();
		Materia computacao_cientifica = new Materia();
		Materia desenvolvimento_de_algoritmos = new Materia();
		Materia engenharia_de_requisitos = new Materia();
		Materia gestao_de_tecnologia = new Materia();
		Materia modelagem_de_sistemas = new Materia();
		Materia programacao_paralela = new Materia();
		Materia qualidade_de_software = new Materia();		// 60 materias ate aqui
		*/		
		// 2 dias com 2 tempos por dia -> categoria 'A'
		// 3 dias com 2 tempos por dia -> categoria 'B'
		// 1 dia com 3 tempos por dia -> categoria 'C'
		// 1 dia com 4 tempos por dia -> categoria 'D'
		// 1 dia com 2 tempos e um dia com 1 tempo -> categoria 'E'
		
		algebra.iniciarA('A', "algebra", 1, "Turma 1", "seg", "M1", "M2", "ter", "M3", "M4"); // categoria 'A'                    9  argumentos
		algebra_linear.iniciarA('A', "algebra linear", 2, "Turma 2", "ter", "M1", "M2", "qui", "M3", "M4"); // categoria 'A'					9  argumentos
		calculoI.iniciarA('A', "calculo I", 3, "Turma 1", "seg", "M3", "M4", "qui", "M5", "M6"); // categoria 'A'					9  argumentos	
		calculoII.iniciarA('A', "calculo II", 4, "Turma 1", "qui", "T3", "T4", "sex", "T1", "T2"); // categoria 'A'					9  argumentos
		calculoIII.iniciarA('A', "calculo III", 5, "Turma 1", "qui", "T3", "T4", "sex", "T5", "T6"); // categoria 'A'					9  argumentos
		calculoIV.iniciarA('A',"calculo IV", 6, "Turma 1", "sex", "T1", "T2", "sab", "T3", "T4"); // categoria 'A'								9  argumentos
		calculo_das_probabilidades.iniciarB('B', "calculo das probabilidades", 7, "Turma 1", "seg", "N1", "N2", "ter", "N3", "N4", "qua", "N5", "N6"); // categoria 'B'	12 argumentos
		elementos_de_logica.iniciarB('B', "elementos de logica", 8, "Turma 1", "seg", "N1", "N2", "ter", "N3", "N4", "qua", "N1", "N2"); // categoria 'B'	12 argumentos
		fisicaI.iniciarC('C', "fisica I", 9, "Turma 1", "qua", "N1", "N2", "N3"); // categoria 'C'										7  argumentos
		fisicaII.iniciarD_E('D', "fisica II", 10, "Turma 1", "qui", "M1", "M2", "M3", "M4"); // categoria 'D'							8  argumentos
		algebra_analitica.iniciarA('A', "algebra analitica", 11, "Turma 1", "ter", "M1", "M2", "qui", "M1", "M2"); // categoria 'A'						9  argumentos
		matematica_discreta.iniciarD_E('D', "matematica discreta", 12, "Turma 1", "sex", "M1", "M2", "M3", "M4"); // categoria 'D'						8  argumentos		
		AEDI.iniciarA('A', "AED I", 13, "Turma 1", "ter", "T3", "T4", "qui", "T5", "T6"); // categoria 'A'							9  argumentos		
		AEDII.iniciarD_E('E', "AED II", 14, "Turma 1", "qua", "T1", "T2", "qui", "T3"); // categoria 'E'
		algoritmos_em_grafos.iniciarD_E('D', "algoritmos em grafos", 15, "Turma 1", "qua", "T1", "T2", "T3", "T4"); // categoria 'D'						8  argumentos		
		analise_de_projetos_de_sistemas.iniciarA('A', "analise de projetos de sistemas", 16, "Turma 1", "seg", "N3", "N4", "qua", "N5", "N6"); // categoria 'A'							9  argumentos		
		arquitetura_de_computadoresI.iniciarD_E('E', "arquitetura de computadores I", 17, "Turma 1", "seg", "N1", "N2", "ter", "N3"); // categoria 'E'
		arquitetura_de_computadoresII.iniciarD_E('D', "arquitetura de computadores II", 18, "Turma 1", "sex", "N1", "N2", "N3", "N4"); // categoria 'D'						8  argumentos		
		arquitetura_avancada_de_computadores.iniciarA('A', "arquitetura avancada de computadores", 19, "Turma 1", "seg", "M3", "M4", "qui", "M5", "M6"); // categoria 'A'							9  argumentos		
		banco_de_dadosI.iniciarD_E('E', "banco de dados I", 20, "Turma 1", "seg", "M1", "M2", "sex", "M3"); // categoria 'E'
/*		banco_de_dadosII.iniciarD_E('D', "modelagem", 21, "Turma 1", "qua", "T1", "T2", "T3", "T4"); // categoria 'D'						8  argumentos		
		calculo_numerico.iniciarA('A', "redes", 22, "Turma 1", "ter", "M3", "M4", "qui", "M5", "M6"); // categoria 'A'							9  argumentos		
		computacao_grafica.iniciarD_E('E', "compiladores", 23, "Turma 1", "seg", "N1", "N2", "ter", "N3"); // categoria 'E'
		engenharia_de_software.iniciarD_E('D', "modelagem", 24, "Turma 1", "qua", "T1", "T2", "T3", "T4"); // categoria 'D'						8  argumentos		
		estrutura_de_linguagens.iniciarA('A', "redes", 25, "Turma 1", "ter", "M3", "M4", "qui", "M5", "M6"); // categoria 'A'							9  argumentos		
		etica.iniciarD_E('E', "compiladores", 26, "Turma 1", "seg", "N1", "N2", "ter", "N3"); // categoria 'E'
		fundamentos_da_computacao.iniciarD_E('D', "modelagem", 27, "Turma 1", "qua", "T1", "T2", "T3", "T4"); // categoria 'D'						8  argumentos		
		inteligencia_artificial.iniciarA('A', "redes", 28, "Turma 1", "ter", "M3", "M4", "qui", "M5", "M6"); // categoria 'A'							9  argumentos		
		interface_humano_computador.iniciarD_E('E', "compiladores", 29, "Turma 1", "seg", "N1", "N2", "ter", "N3"); // categoria 'E'
		linguagem_de_programacaoI.iniciarD_E('D', "modelagem", 30, "Turma 1", "qua", "T1", "T2", "T3", "T4"); // categoria 'D'						8  argumentos		
		linguagem_de_programacaoII.iniciarA('A', "redes", 31, "Turma 1", "ter", "M3", "M4", "qui", "M5", "M6"); // categoria 'A'							9  argumentos		
		metodologia_projeto_final.iniciarD_E('E', "compiladores", 32, "Turma 1", "seg", "N1", "N2", "ter", "N3"); // categoria 'E'
		otimizacao_em_grafos.iniciarD_E('D', "modelagem", 33, "Turma 1", "qua", "T1", "T2", "T3", "T4"); // categoria 'D'						8  argumentos		
		portugues_instrumental.iniciarA('A', "redes", 34, "Turma 1", "ter", "M3", "M4", "qui", "M5", "M6"); // categoria 'A'							9  argumentos		
		redesI.iniciarD_E('E', "compiladores", 35, "Turma 1", "seg", "N1", "N2", "ter", "N3"); // categoria 'E'
		redesII.iniciarD_E('D', "modelagem", 36, "Turma 1", "qua", "T1", "T2", "T3", "T4"); // categoria 'D'						8  argumentos		
		sitemas_distribuidos.iniciarA('A', "redes", 37, "Turma 1", "ter", "M3", "M4", "qui", "M5", "M6"); // categoria 'A'							9  argumentos		
		sistemas_operacionaisI.iniciarD_E('E', "compiladores", 38, "Turma 1", "seg", "N1", "N2", "ter", "N3"); // categoria 'E'
		sistemas_operacionaisII.iniciarD_E('D', "modelagem", 39, "Turma 1", "qua", "T1", "T2", "T3", "T4"); // categoria 'D'						8  argumentos		
		teoria_da_computacao.iniciarA('A', "redes", 40, "Turma 1", "ter", "M3", "M4", "qui", "M5", "M6"); // categoria 'A'							9  argumentos		
		otimizacao_combinatoria.iniciarD_E('E', "compiladores", 41, "Turma 1", "seg", "N1", "N2", "ter", "N3"); // categoria 'E'
		algebra_linear_aplicada.iniciarD_E('D', "modelagem", 42, "Turma 1", "qua", "T1", "T2", "T3", "T4"); // categoria 'D'						8  argumentos		
		analise_numerica.iniciarA('A', "redes", 43, "Turma 1", "ter", "M3", "M4", "qui", "M5", "M6"); // categoria 'A'							9  argumentos		
		estatistica_aplicada.iniciarD_E('E', "compiladores", 44, "Turma 1", "seg", "N1", "N2", "ter", "N3"); // categoria 'E'
		fisicaIII.iniciarD_E('D', "modelagem", 45, "Turma 1", "qua", "T1", "T2", "T3", "T4"); // categoria 'D'						8  argumentos		
		fisicaIV.iniciarA('A', "redes", 46, "Turma 1", "ter", "M3", "M4", "qui", "M5", "M6"); // categoria 'A'							9  argumentos		
		lingua_inglesa.iniciarD_E('E', "compiladores", 47, "Turma 1", "seg", "N1", "N2", "ter", "N3"); // categoria 'E'
		algoritmos_computacionais.iniciarD_E('D', "modelagem", 48, "Turma 1", "qua", "T1", "T2", "T3", "T4"); // categoria 'D'						8  argumentos		
		empreendedorismo.iniciarA('A', "redes", 49, "Turma 1", "ter", "M3", "M4", "qui", "M5", "M6"); // categoria 'A'							9  argumentos		
		filosofia_da_ciencia.iniciarD_E('E', "compiladores", 50, "Turma 1", "seg", "N1", "N2", "ter", "N3"); // categoria 'E'
		fundamentos_da_administracao.iniciarD_E('D', "modelagem", 51, "Turma 1", "qua", "T1", "T2", "T3", "T4"); // categoria 'D'						8  argumentos		
		informatica_na_educacao.iniciarA('A', "redes", 52, "Turma 1", "ter", "M3", "M4", "qui", "M5", "M6"); // categoria 'A'							9  argumentos		
		algoritmos_distribuidos.iniciarD_E('E', "compiladores", 53, "Turma 1", "seg", "N1", "N2", "ter", "N3"); // categoria 'E'
		computacao_cientifica.iniciarD_E('D', "modelagem", 54, "Turma 1", "qua", "T1", "T2", "T3", "T4"); // categoria 'D'						8  argumentos		
		desenvolvimento_de_algoritmos.iniciarA('A', "redes", 55, "Turma 1", "ter", "M3", "M4", "qui", "M5", "M6"); // categoria 'A'							9  argumentos		
		engenharia_de_requisitos.iniciarD_E('E', "compiladores", 56, "Turma 1", "seg", "N1", "N2", "ter", "N3"); // categoria 'E'
		gestao_de_tecnologia.iniciarD_E('D', "modelagem", 57, "Turma 1", "qua", "T1", "T2", "T3", "T4"); // categoria 'D'						8  argumentos		
		modelagem_de_sistemas.iniciarA('A', "redes", 58, "Turma 1", "ter", "M3", "M4", "qui", "M5", "M6"); // categoria 'A'							9  argumentos		
		programacao_paralela.iniciarD_E('E', "compiladores", 59, "Turma 1", "seg", "N1", "N2", "ter", "N3"); // categoria 'E'
		qualidade_de_software.iniciarD_E('D', "modelagem", 60, "Turma 1", "qua", "T1", "T2", "T3", "T4"); // categoria 'D'						8  argumentos		
		
		*/
			
		App.lista.add(algebra);	
		App.lista.add(algebra_linear);		
		App.lista.add(calculoI);
		App.lista.add(calculoII);	 
		App.lista.add(calculoIII);
		App.lista.add(calculoIV);
		App.lista.add(calculo_das_probabilidades);
		App.lista.add(elementos_de_logica);
		App.lista.add(fisicaI);
		App.lista.add(fisicaII);
		App.lista.add(algebra_analitica);
		App.lista.add(matematica_discreta);
		App.lista.add(AEDI);
		App.lista.add(AEDII);		
		App.lista.add(algoritmos_em_grafos);
		App.lista.add(analise_de_projetos_de_sistemas);	
		App.lista.add(arquitetura_de_computadoresI);		
		App.lista.add(arquitetura_de_computadoresII);
		App.lista.add(arquitetura_avancada_de_computadores);	 
		App.lista.add(banco_de_dadosI);
/*		App.lista.add(banco_de_dadosII);
		App.lista.add(calculo_numerico);
		App.lista.add(computacao_grafica);
		App.lista.add(engenharia_de_software);
		App.lista.add(estrutura_de_linguagens);
		App.lista.add(etica);
		App.lista.add(fundamentos_da_computacao);
		App.lista.add(inteligencia_artificial);
		App.lista.add(interface_humano_computador);
		App.lista.add(linguagem_de_programacaoI);
		App.lista.add(linguagem_de_programacaoII);	
		App.lista.add(metodologia_projeto_final);		
		App.lista.add(otimizacao_em_grafos);
		App.lista.add(portugues_instrumental);	 
		App.lista.add(redesI);
		App.lista.add(redesII);
		App.lista.add(sitemas_distribuidos);
		App.lista.add(sistemas_operacionaisI);
		App.lista.add(sistemas_operacionaisII);
		App.lista.add(teoria_da_computacao);
		App.lista.add(otimizacao_combinatoria);
		App.lista.add(algebra_linear_aplicada);
		App.lista.add(analise_numerica);
		App.lista.add(estatistica_aplicada);
		App.lista.add(fisicaIII);
		App.lista.add(fisicaIV);	
		App.lista.add(lingua_inglesa);		
		App.lista.add(algoritmos_computacionais);
		App.lista.add(empreendedorismo);	 
		App.lista.add(filosofia_da_ciencia);
		App.lista.add(fundamentos_da_administracao);
		App.lista.add(informatica_na_educacao);
		App.lista.add(algoritmos_distribuidos);
		App.lista.add(computacao_cientifica);
		App.lista.add(desenvolvimento_de_algoritmos);
		App.lista.add(engenharia_de_requisitos);
		App.lista.add(gestao_de_tecnologia);
		App.lista.add(modelagem_de_sistemas);
		App.lista.add(programacao_paralela);
		App.lista.add(qualidade_de_software);
		
			*/
		}
}