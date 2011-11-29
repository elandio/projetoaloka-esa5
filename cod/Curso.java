import java.io.Serializable;
import java.util.*;


public class Curso implements Serializable{
	
	private String nome;
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	private Departamento departamento;
	
	
	
	public Curso(String nome, List<Disciplina> disciplinas,
			Departamento departamento) {
		super();
		this.nome = nome;
		this.disciplinas = disciplinas;
		this.departamento = departamento;
	}
	
	public Curso(){
		
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public Departamento getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", disciplinas=" + disciplinas.toString()
				+ ", departamento=" + departamento.toString() + "]";
	}

}
