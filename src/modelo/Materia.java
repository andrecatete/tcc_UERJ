package modelo;

public class Materia {
	
	Turma turma = new Turma();	
	
	String nomeMateria;
	char nomeCategoria;
	int id;
	
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	/***** getters and setters *****/	
	public String getNomeMateria() {
		return nomeMateria;
	}
	public void setNomeMateria(String nomeMateria) {
		this.nomeMateria = nomeMateria;
	}
	
	public char getNomeCategoria() {
		return nomeCategoria;
	}
	public void setNomeCategoria(char nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	/*****************************************************/
	
	/** configura turma de categorias D e E (CATEGORIAS D & E)**/
	public void iniciarD_E(char categoria, String materia, int id, String T, String dia01, String tempo01, String tempo02, 
			String tempo03_ou_dia02, String tempo04_ou_dia02tempo01) {		
		switch(categoria) {
		case 'D': iniciarD(categoria, materia, id, T, dia01, tempo01, tempo02,	tempo03_ou_dia02, tempo04_ou_dia02tempo01);
			break;
		case 'E': iniciarE(categoria, materia, id, T, dia01, tempo01, tempo02,	tempo03_ou_dia02, tempo04_ou_dia02tempo01);
			break;
		}
	}
	/*****************************************************/
	
	/***** configura turma de 2 dias com 2 tempos por dia (CATEGORIA A)*****/
	public void iniciarA(char categoria, String materia, int id, String T, String dia01, String tempo01, String tempo02, 
			String dia02, String tempo03, String tempo04) {		
		setNomeMateria(materia);
		setNomeCategoria(categoria);
		setId(id);
		turma.configTurma(T, dia01, tempo01, tempo02, dia02, tempo03, tempo04);	
	}
	/*****************************************************/
	
	/***** configura turma de 3 dias com 2 tempos por dia (CATEGORIA B)*****/	
	public void iniciarB(char categoria, String materia, int id, String T, String dia01, String tempo01, String tempo02, 
			String dia02, String tempo03, String tempo04, String dia03,	String tempo05, String tempo06) {
		setNomeMateria(materia);
		setNomeCategoria(categoria);
		setId(id);
		turma.configTurma(T, dia01, tempo01, tempo02, dia02, tempo03, tempo04, dia03, tempo05, tempo06);
	}	
	/*****************************************************/	
		 
	/***** configura turma de 1 dia com 3 tempos por dia (CATEGORIA C)*****/	  
	public void iniciarC(char categoria, String materia, int id, String T, String dia01, String tempo01, String tempo02,	
			String tempo03) {
		setNomeMateria(materia);
		setNomeCategoria(categoria);
		setId(id);
		turma.configTurma(T, dia01, tempo01, tempo02, tempo03 );
	}
	/*****************************************************/
	
	/***** configura turma de 1 dia com 4 tempos por dia (CATEGORIA D)*****/	  
	public void iniciarD(char categoria, String materia, int id, String T, String dia01, String tempo01, String tempo02,
			String tempo03,	String tempo04) {
		setNomeMateria(materia);
		setNomeCategoria(categoria);
		setId(id);
		turma.configTurma(T, dia01, tempo01, tempo02, tempo03, tempo04 );
	}
	/*****************************************************/
	
	/***** configura turma de 1 dia com 2 tempos e 1 dia com 1 tempo (CATEGORIA E)*****/	  
	public void iniciarE(char categoria, String materia, int id, String T, String dia01, String tempo01, String tempo02,
			String dia02, String tempo03) {
		setNomeMateria(materia);
		setNomeCategoria(categoria);
		setId(id);
		turma.configTurma2E1(T, dia01, tempo01, tempo02, dia02, tempo03 );
	}
	/*****************************************************/
}
