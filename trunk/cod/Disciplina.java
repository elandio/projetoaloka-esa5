import java.io.Serializable;


public class Disciplina implements Serializable{
	
	String nome;
	Curso curso;
	boolean alocada = false;
	
	public Disciplina() {
		
	}
	
	public Disciplina(String nome, Curso curso) {
		super();
		this.nome = nome;
		this.curso = curso;
	}
	
	public String nomecurso(){
		return this.getCurso().getNome();
	}

	public String getNome() {
		return nome;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

	public boolean isAlocada() {
		return alocada;
	}

	public void setAlocada(boolean alocada) {
		this.alocada = alocada;
	}

	@Override
	public String toString() {
		return "Disciplina [nome=" + this.getNome() +"]"+"\n";
	}
	
	public String toString2() {
		return "Disciplina [nome=" + this.getNome() +"   "+"Curso: " + this.nomecurso()+"]"+"\n";
	}

	
	
	
}
