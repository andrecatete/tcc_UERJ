package modelo;

public class Turma {

	String nomeTurma;
	
	DiaSemana turma2Dias2Tempos1 = new DiaSemana();
	DiaSemana turma2Dias2Tempos2 = new DiaSemana();		
	DiaSemana turma3Dias2Tempos1 = new DiaSemana();
	DiaSemana turma3Dias2Tempos2 = new DiaSemana();
	DiaSemana turma3Dias2Tempos3 = new DiaSemana();
	DiaSemana turma1Dia3Tempos = new DiaSemana();
	DiaSemana turma1Dia4Tempos = new DiaSemana();
	DiaSemana turma2Dias2E1Tempos1E2 = new DiaSemana();
	DiaSemana turma2Dias2E1Tempos3 = new DiaSemana();
 

	/***** getters and setters *****/
	public String getNomeTurma() {
		return nomeTurma;
	}
	public void setNomeTurma(String t) {
		nomeTurma = t;
	}
	
	public DiaSemana getTurma2Dias2Tempos1() {
		return turma2Dias2Tempos1;
	}
	public void setTurma2Dias2Tempos1(DiaSemana turma2Dias2Tempos1) {
		this.turma2Dias2Tempos1 = turma2Dias2Tempos1;
	}
	
	public DiaSemana getTurma2Dias2Tempos2() {
		return turma2Dias2Tempos2;
	}
	public void setTurma2Dias2Tempos2(DiaSemana turma2Dias2Tempos2) {
		this.turma2Dias2Tempos2 = turma2Dias2Tempos2;
	}
	
	public DiaSemana getTurma3Dias2Tempos1() {
		return turma3Dias2Tempos1;
	}
	public void setTurma3Dias2Tempos1(DiaSemana turma3Dias2Tempos1) {
		this.turma3Dias2Tempos1 = turma3Dias2Tempos1;
	}
	
	public DiaSemana getTurma3Dias2Tempos2() {
		return turma3Dias2Tempos2;
	}
	public void setTurma3Dias2Tempos2(DiaSemana turma3Dias2Tempos2) {
		this.turma3Dias2Tempos2 = turma3Dias2Tempos2;
	}
	
	public DiaSemana getTurma3Dias2Tempos3() {
		return turma3Dias2Tempos3;
	}
	public void setTurma3Dias2Tempos3(DiaSemana turma3Dias2Tempos3) {
		this.turma3Dias2Tempos3 = turma3Dias2Tempos3;
	}
	
	public DiaSemana getTurma1Dia3Tempos() {
		return turma1Dia3Tempos;
	}
	public void setTurma1Dia3Tempos(DiaSemana turma1Dia3Tempos) {
		this.turma1Dia3Tempos = turma1Dia3Tempos;
	}
	
	public DiaSemana getTurma1Dia4Tempos() {
		return turma1Dia4Tempos;
	}
	public void setTurma1Dia4Tempos(DiaSemana turma1Dia4Tempos) {
		this.turma1Dia4Tempos = turma1Dia4Tempos;
	}
	
	public DiaSemana getTurma2Dias2E1Tempos1E2() {
		return turma2Dias2E1Tempos1E2;
	}
	public void setTurma2Dias2E1Tempos1E2(DiaSemana turma2Dias2E1Tempos1E2) {
		this.turma2Dias2E1Tempos1E2 = turma2Dias2E1Tempos1E2;
	}
	
	public DiaSemana getTurma2Dias2E1Tempos3() {
		return turma2Dias2E1Tempos3;
	}
	public void setTurma2Dias2E1Tempos3(DiaSemana turma2Dias2E1Tempos3) {
		this.turma2Dias2E1Tempos3 = turma2Dias2E1Tempos3;
	}
	/*****************************************************/
	
	/***** configura turma de 2 dias com 2 tempos por dia -> turma2Dias2Tempos*****/	
	public void configTurma(String T, String dia01, String tempo01, String tempo02, String dia02, 
			String tempo03, String tempo04) {
		setNomeTurma(T);
		turma2Dias2Tempos1.configDiaSemana2Dias2Tempos(dia01, tempo01, tempo02);
		turma2Dias2Tempos2.configDiaSemana2Dias2Tempos(dia02, tempo03, tempo04);
	}	
	/*****************************************************/
	
	/***** configura turma de 3 dias com 2 tempos por dia -> turma3Dias2Tempos*****/	
	public void configTurma(String T, String dia01, String tempo01, String tempo02, String dia02, 
			String tempo03, String tempo04, String dia03, String tempo05, String tempo06) {
		setNomeTurma(T);		
		turma3Dias2Tempos1.configDiaSemana3Dias2Tempos(dia01, tempo01, tempo02);
		turma3Dias2Tempos2.configDiaSemana3Dias2Tempos(dia02, tempo03, tempo04);
		turma3Dias2Tempos3.configDiaSemana3Dias2Tempos(dia03, tempo05, tempo06);
	}	
	/*****************************************************/
	
	/***** configura turma de 1 dia com 3 tempos por dia -> turma1Dia3Tempos*****/	
	public void configTurma(String T, String dia01, String tempo01, String tempo02, String tempo03) {
		setNomeTurma(T);		
		turma1Dia3Tempos.configDiaSemana1Dia3Tempos(dia01, tempo01, tempo02, tempo03);		
	}	
	/*****************************************************/
	
	/***** configura turma de 1 dia com 4 tempos por dia -> turma1Dia4Tempos*****/	
	public void configTurma(String T, String dia01, String tempo01, String tempo02, String tempo03, String tempo04) {
		setNomeTurma(T);
		turma1Dia4Tempos.configDiaSemana1Dia4Tempos(dia01, tempo01, tempo02, tempo03, tempo04);		
	}	
	/*****************************************************/

	/***** configura turma de 1 dia com 2 e 1 dia com 1 tempo -> turma2Dias2E1Tempos*****/	
	public void configTurma2E1(String T, String dia01, String tempo01, String tempo02, String dia02, String tempo03) {
		setNomeTurma(T);
		 turma2Dias2E1Tempos1E2.configDiaSemana2Dias2E1Tempos1E2(dia01, tempo01, tempo02);
		 turma2Dias2E1Tempos3.configDiaSemana2Dias2E1Tempos3(dia02, tempo03);
	}	
	/*****************************************************/
}
