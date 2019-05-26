package modelo;

public class DiaSemana {

	String nomeDiaSemana;
		
	Tempo diaSemana2Dias2Tempos = new Tempo();	
	Tempo diaSemana3Dias2Tempos = new Tempo();	
	Tempo diaSemana1Dia3Tempos = new Tempo();	
	Tempo diaSemana1Dia4Tempos = new Tempo();	
	Tempo diaSemana2Dias2E1Tempos = new Tempo();	
		
	/***** getters and setters *****/
	public String getNomeDiaSemana() {
		return nomeDiaSemana;
	}
	public void setNomeDiaSemana(String nomeDiaSemana) {
		this.nomeDiaSemana = nomeDiaSemana;
	}	
	
	public Tempo getDiaSemana2Dias2Tempos() {
		return diaSemana2Dias2Tempos;
	}
	public void setDiaSemana2Dias2Tempos(Tempo diaSemana2Dias2Tempos) {
		this.diaSemana2Dias2Tempos = diaSemana2Dias2Tempos;
	}
	
	public Tempo getDiaSemana3Dias2Tempos() {
		return diaSemana3Dias2Tempos;
	}
	public void setDiaSemana3Dias2Tempos(Tempo diaSemana3Dias2Tempos) {
		this.diaSemana3Dias2Tempos = diaSemana3Dias2Tempos;
	}
	
	public Tempo getDiaSemana1Dia3Tempos() {
		return diaSemana1Dia3Tempos;
	}
	public void setDiaSemana1Dia3Tempos(Tempo diaSemana1Dia3Tempos) {
		this.diaSemana1Dia3Tempos = diaSemana1Dia3Tempos;
	}
	
	public Tempo getDiaSemana1Dia4Tempos() {
		return diaSemana1Dia4Tempos;
	}
	public void setDiaSemana1Dia4Tempos(Tempo diaSemana1Dia4Tempos) {
		this.diaSemana1Dia4Tempos = diaSemana1Dia4Tempos;
	}
	
	public Tempo getDiaSemana2Dias2E1Tempos() {
		return diaSemana2Dias2E1Tempos;
	}
	public void setDiaSemana2Dias2E1Tempos(Tempo diaSemana2Dias2E1Tempos) {
		this.diaSemana2Dias2E1Tempos = diaSemana2Dias2E1Tempos;
	}
	/*****************************************************/
	
	/***** configura turma de 2 dias com 2 tempos por dia -> turma2Dias2Tempos*****/	
	public void configDiaSemana2Dias2Tempos( String dia, String tempoA, String tempoB ) {
		
		setNomeDiaSemana(dia);
		
		diaSemana2Dias2Tempos.confTempo(tempoA, tempoB);		
	}
	/*****************************************************/	

	/***** configura turma de 3 dias com 2 tempos por dia -> turma3Dias2Tempos*****/	
	public void configDiaSemana3Dias2Tempos( String dia, String tempoA, String tempoB ) {
		
		setNomeDiaSemana(dia);
		
		diaSemana3Dias2Tempos.confTempo(tempoA, tempoB);		
	}
	/*****************************************************/
	
	/***** configura turma de 1 dia com 3 tempos por dia -> turma1Dia3Tempos*****/	
	public void configDiaSemana1Dia3Tempos( String dia, String tempoA, String tempoB, String tempoC ) {
		
		setNomeDiaSemana(dia);
		
		diaSemana1Dia3Tempos.confTempo(tempoA, tempoB, tempoC);		
	}
	/*****************************************************/
	
	/***** configura turma de 1 dia com 4 tempos por dia -> turma1Dia4Tempos*****/	
	public void configDiaSemana1Dia4Tempos( String dia, String tempoA, String tempoB, String tempoC, String tempoD ) {
		
		setNomeDiaSemana(dia);
		
		diaSemana1Dia4Tempos.confTempo(tempoA, tempoB, tempoC, tempoD);		
	}
	/*****************************************************/	

	/***** configura turma de 1 dia com 2 tempos e 1 dia com 1 tempo (1º dia) -> turma2Dias2E1Tempos*****/	
	public void configDiaSemana2Dias2E1Tempos1E2( String dia, String tempoA, String tempoB) {
		
		setNomeDiaSemana(dia);
		
		diaSemana2Dias2E1Tempos.confTempo2E1_1E2(tempoA, tempoB);
	}
	/*****************************************************/	

	/***** configura turma de 1 dia com 2 tempos e 1 dia com 1 tempo (2º dia) -> turma2Dias2E1Tempos*****/	
	public void configDiaSemana2Dias2E1Tempos3( String dia, String tempoA) {
		
		setNomeDiaSemana(dia);
		
		diaSemana2Dias2E1Tempos.confTempo2E1_3(tempoA);
	}
	/*****************************************************/	
}
