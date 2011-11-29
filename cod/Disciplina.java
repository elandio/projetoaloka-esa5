import java.io.Serializable;


public class Disciplina implements Serializable{
	
	String nome;
	Curso curso;
	
	public Disciplina() {
		
	}
	
	public Disciplina(String nome, Curso curso) {
		super();
		this.nome = nome;
		this.curso = curso;
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

	@Override
	public String toString() {
		return "Disciplina [nome=" + nome  +"]";
	}

	
	
	
}
