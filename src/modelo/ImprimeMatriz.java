package modelo;

public class ImprimeMatriz {
	
	public int matriz[][] = new int [6][18];
		
	public int[][] preparaMatriz(Materia p){
		
		char cat = p.getNomeCategoria();
		String dia;
		String dia2;
		String tempo1;
		String tempo2;
		String tempo3;
		String tempo4;
						
		switch(cat) {
			case 'A':
				dia = p.turma.turma2Dias2Tempos1.getNomeDiaSemana();
				tempo1 = p.turma.turma2Dias2Tempos1.diaSemana2Dias2Tempos.getNomeTempo1();
				tempo2 = p.turma.turma2Dias2Tempos1.diaSemana2Dias2Tempos.getNomeTempo2();				
				soma2(dia, tempo1, tempo2);
				dia = p.turma.turma2Dias2Tempos2.getNomeDiaSemana();
				tempo1 = p.turma.turma2Dias2Tempos2.diaSemana2Dias2Tempos.getNomeTempo1();
				tempo2 = p.turma.turma2Dias2Tempos2.diaSemana2Dias2Tempos.getNomeTempo2();				
				soma2(dia, tempo1, tempo2);
				break;
			case 'B':
				dia = p.turma.turma3Dias2Tempos1.getNomeDiaSemana();
				tempo1 = p.turma.turma3Dias2Tempos1.diaSemana3Dias2Tempos.getNomeTempo1();
				tempo2 = p.turma.turma3Dias2Tempos1.diaSemana3Dias2Tempos.getNomeTempo2();				
				soma2(dia, tempo1, tempo2);
				dia = p.turma.turma3Dias2Tempos2.getNomeDiaSemana();
				tempo1 = p.turma.turma3Dias2Tempos2.diaSemana3Dias2Tempos.getNomeTempo1();
				tempo2 = p.turma.turma3Dias2Tempos2.diaSemana3Dias2Tempos.getNomeTempo2();				
				soma2(dia, tempo1, tempo2);
				dia = p.turma.turma3Dias2Tempos3.getNomeDiaSemana();
				tempo1 = p.turma.turma3Dias2Tempos3.diaSemana3Dias2Tempos.getNomeTempo1();
				tempo2 = p.turma.turma3Dias2Tempos3.diaSemana3Dias2Tempos.getNomeTempo2();				
				soma2(dia, tempo1, tempo2);
				break;			
			case 'C':
				dia = p.turma.turma1Dia3Tempos.getNomeDiaSemana();
				tempo1 = p.turma.turma1Dia3Tempos.diaSemana1Dia3Tempos.getNomeTempo1();
				tempo2 = p.turma.turma1Dia3Tempos.diaSemana1Dia3Tempos.getNomeTempo2();				
				tempo3 = p.turma.turma1Dia3Tempos.diaSemana1Dia3Tempos.getNomeTempo3();				
				soma3(dia, tempo1, tempo2, tempo3);				
				break;			
			case 'D':
				dia = p.turma.turma1Dia4Tempos.getNomeDiaSemana();
				tempo1 = p.turma.turma1Dia4Tempos.diaSemana1Dia4Tempos.getNomeTempo1();
				tempo2 = p.turma.turma1Dia4Tempos.diaSemana1Dia4Tempos.getNomeTempo2();				
				tempo3 = p.turma.turma1Dia4Tempos.diaSemana1Dia4Tempos.getNomeTempo3();				
				tempo4 = p.turma.turma1Dia4Tempos.diaSemana1Dia4Tempos.getNomeTempo4();				
				soma4(dia, tempo1, tempo2, tempo3, tempo4);				
				break;			
			case 'E':
				dia = p.turma.turma2Dias2E1Tempos1E2.getNomeDiaSemana();
				tempo1 = p.turma.turma2Dias2E1Tempos1E2.diaSemana2Dias2E1Tempos.getNomeTempo1();
				tempo2 = p.turma.turma2Dias2E1Tempos1E2.diaSemana2Dias2E1Tempos.getNomeTempo2();
				soma2(dia, tempo1, tempo2);
				dia2 = p.turma.turma2Dias2E1Tempos3.getNomeDiaSemana();
				tempo3 = p.turma.turma2Dias2E1Tempos3.diaSemana2Dias2E1Tempos.getNomeTempo1();								
				soma1(dia2, tempo3);				
				break;			
			}
			return matriz;
		}
		
		//somando a matriz...
		public void soma1(String dia, String tempo){
			int i = 0;
			int j = 0;
			switch(dia) {
			case "seg": i = 0;  
				break;		
			case "ter": i = 1;  
				break;
			case "qua": i = 2;  
				break;		
			case "qui": i = 3;  
				break;
			case "sex": i = 4;  
				break;		
			case "sab": i = 5;  
				break;
			}
			switch(tempo) {
			case "M1": j = 0;  
				break;		
			case "M2": j = 1;  
				break;
			case "M3": j = 2;  
				break;		
			case "M4": j = 3;  
				break;
			case "M5": j = 4;  
				break;		
			case "M6": j = 5;  
				break;
			case "T1": j = 6;  
				break;		
			case "T2": j = 7;  
				break;
			case "T3": j = 8;  
				break;		
			case "T4": j = 9;  
				break;
			case "T5": j = 10;  
				break;		
			case "T6": j = 11;  
				break;
			case "N1": j = 12;  
				break;		
			case "N2": j = 13;  
				break;
			case "N3": j = 14;  
				break;		
			case "N4": j = 15;  
				break;
			case "N5": j = 16;  
				break;		
			case "N6": j = 17;  
				break;
			}
			matriz[i][j]++;	
		}	
		
		public void soma2(String dia, String tempo1, String tempo2){
			int i = 0;
			int j = 0;
			String x = "";
			String m[] = new String[2];
			m[0] = tempo1;
			m[1] = tempo2;
			switch(dia) {
			case "seg": i = 0;  
				break;		
			case "ter": i = 1;  
				break;
			case "qua": i = 2;  
				break;		
			case "qui": i = 3;  
				break;
			case "sex": i = 4;  
				break;		
			case "sab": i = 5;  
				break;
			}
			for(int h = 0; h < 2; h++ ) {	
				x = m[h];
				switch(x) {
				case "M1": j = 0;  
					break;		
				case "M2": j = 1;  
					break;
				case "M3": j = 2;  
					break;		
				case "M4": j = 3;  
					break;
				case "M5": j = 4;  
					break;		
				case "M6": j = 5;  
					break;
				case "T1": j = 6;  
					break;		
				case "T2": j = 7;  
					break;
				case "T3": j = 8;  
					break;		
				case "T4": j = 9;  
					break;
				case "T5": j = 10;  
					break;		
				case "T6": j = 11;  
					break;
				case "N1": j = 12;  
					break;		
				case "N2": j = 13;  
					break;
				case "N3": j = 14;  
					break;		
				case "N4": j = 15;  
					break;
				case "N5": j = 16;  
					break;		
				case "N6": j = 17;  
					break;
				}
				matriz[i][j]++;			
			}		
		}

		public void soma3(String dia, String tempo1, String tempo2, String tempo3){
			int i = 0;
			int j = 0;
			String x = "";
			String m[] = new String[3];
			m[0] = tempo1;
			m[1] = tempo2;
			m[2] = tempo3;
			switch(dia) {
			case "seg": i = 0;  
				break;		
			case "ter": i = 1;  
				break;
			case "qua": i = 2;  
				break;		
			case "qui": i = 3;  
				break;
			case "sex": i = 4;  
				break;		
			case "sab": i = 5;  
				break;
			}
			for(int h = 0; h < 3; h++ ) {	
				x = m[h];
				switch(x) {
				case "M1": j = 0;  
					break;		
				case "M2": j = 1;  
					break;
				case "M3": j = 2;  
					break;		
				case "M4": j = 3;  
					break;
				case "M5": j = 4;  
					break;		
				case "M6": j = 5;  
					break;
				case "T1": j = 6;  
					break;		
				case "T2": j = 7;  
					break;
				case "T3": j = 8;  
					break;		
				case "T4": j = 9;  
					break;
				case "T5": j = 10;  
					break;		
				case "T6": j = 11;  
					break;
				case "N1": j = 12;  
					break;		
				case "N2": j = 13;  
					break;
				case "N3": j = 14;  
					break;		
				case "N4": j = 15;  
					break;
				case "N5": j = 16;  
					break;		
				case "N6": j = 17;  
					break;
				}
				matriz[i][j]++;			
			}		
		}

		public void soma4(String dia, String tempo1, String tempo2, String tempo3, String tempo4){
			int i = 0;
			int j = 0;
			String x = "";
			String m[] = new String[4];
			m[0] = tempo1;
			m[1] = tempo2;
			m[2] = tempo3;
			m[3] = tempo4;
			switch(dia) {
			case "seg": i = 0;  
				break;		
			case "ter": i = 1;  
				break;
			case "qua": i = 2;  
				break;		
			case "qui": i = 3;  
				break;
			case "sex": i = 4;  
				break;		
			case "sab": i = 5;  
				break;
			}
			for(int h = 0; h < 4; h++ ) {	
				x = m[h];
				switch(x) {
				case "M1": j = 0;  
					break;		
				case "M2": j = 1;  
					break;
				case "M3": j = 2;  
					break;		
				case "M4": j = 3;  
					break;
				case "M5": j = 4;  
					break;		
				case "M6": j = 5;  
					break;
				case "T1": j = 6;  
					break;		
				case "T2": j = 7;  
					break;
				case "T3": j = 8;  
					break;		
				case "T4": j = 9;  
					break;
				case "T5": j = 10;  
					break;		
				case "T6": j = 11;  
					break;
				case "N1": j = 12;  
					break;		
				case "N2": j = 13;  
					break;
				case "N3": j = 14;  
					break;		
				case "N4": j = 15;  
					break;
				case "N5": j = 16;  
					break;		
				case "N6": j = 17;  
					break;
				}
				matriz[i][j]++;			
			}		
		}
	}


