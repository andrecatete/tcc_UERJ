package modelo;

public class Tempo {
	
	String nomeTempo1;
	String nomeTempo2;	
	String nomeTempo3;
	String nomeTempo4;	
	
	/***** getters and setters *****/
	public String getNomeTempo1() {
		return nomeTempo1;
	}
	public void setNomeTempo1(String nomeTempo1) {
		this.nomeTempo1 = nomeTempo1;
	}
	
	public String getNomeTempo2() {
		return nomeTempo2;
	}
	public void setNomeTempo2(String nomeTempo2) {
		this.nomeTempo2 = nomeTempo2;
	}
	
	public String getNomeTempo3() {
		return nomeTempo3;
	}
	public void setNomeTempo3(String nomeTempo3) {
		this.nomeTempo3 = nomeTempo3;
	}
	
	public String getNomeTempo4() {
		return nomeTempo4;
	}
	public void setNomeTempo4(String nomeTempo4) {
		this.nomeTempo4 = nomeTempo4;
	}
	/*****************************************************/
	
	/***** configura turma de 2 dias com 2 tempos por dia *****/
	/*****  	 	   &&&&&&&&&&&&&&&&&				  *****/
	/***** configura turma de 3 dias com 2 tempos por dia *****/	
	public void confTempo(String tempoA, String tempoB) {
		setNomeTempo1(tempoA);
		setNomeTempo2(tempoB);				
	}
	
	/*****************************************************/		

	/***** configura turma de 1 dia com 3 tempos por dia *****/
	public void confTempo(String tempoA, String tempoB, String tempoC) {		
		setNomeTempo1(tempoA);
		setNomeTempo2(tempoB);
		setNomeTempo3(tempoC);
	}
	
	/*****************************************************/		
	
	/***** configura turma de 1 dia com 4 tempos por dia *****/
	public void confTempo(String tempoA, String tempoB, String tempoC, String tempoD) {		
		setNomeTempo1(tempoA);
		setNomeTempo2(tempoB);
		setNomeTempo3(tempoC);
		setNomeTempo4(tempoD);
	}
	
	/*****************************************************/		
	
	/***** configura turma de 1 dia com 2 tempos e 1 dia com 1 tempo (2º dia) *****/
	public void confTempo2E1_1E2(String tempoA, String tempoB) {		
		setNomeTempo1(tempoA);
		setNomeTempo2(tempoB);
	}
	
	/*****************************************************/		

	/***** configura turma de 1 dia com 2 tempos e 1 dia com 1 tempo (2º dia) *****/
	public void confTempo2E1_3(String tempoA) {		
		setNomeTempo1(tempoA);		
	}
	
	/*****************************************************/		
}
