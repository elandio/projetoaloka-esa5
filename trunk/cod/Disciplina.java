import java.io.Serializable;


public class Disciplina implements Serializable{
	
	String nome;
	//Curso curso;
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Disciplina :" +this.getNome() ;
	}
	
	
}
