import java.io.Serializable;
import java.util.ArrayList;


public class Departamento implements Serializable{
	
	private String nome;
	private ArrayList<Professor> professores;
	private ArrayList<Secretario> secretarios;
	private ArrayList<Curso> cursos;
	//private ArrayList<Departamento> Departamentos;
	
	public Departamento() {
		
	}
	
	
	public Departamento(String nome, ArrayList<Professor> professores,
			ArrayList<Secretario> secretarios, ArrayList<Curso> cursos) {
		super();
		this.nome = nome;
		this.professores = professores;
		this.secretarios = secretarios;
		this.cursos = cursos;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Professor> getProfessores() {
		return professores;
	}
	public void setProfessores(ArrayList<Professor> professores) {
		this.professores = professores;
	}
	public ArrayList<Secretario> getSecretarios() {
		return secretarios;
	}
	public void setSecretarios(ArrayList<Secretario> secretarios) {
		this.secretarios = secretarios;
	}
	public ArrayList<Curso> getCursos() {
		return cursos;
	}
	public void setCursos(ArrayList<Curso> cursos) {
		this.cursos = cursos;
	}
	@Override
	public String toString() {
		return "Departamento [nome=" + this.getNome() + "]"+"\n";
	}

	
}
