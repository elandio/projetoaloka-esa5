import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Professor extends Usuario implements Serializable{

	public Professor(String username, String password, Object tipo,
			String nome, String matricula, String email,
			Departamento departamento) {
		super(username, password, tipo, nome, matricula, email, departamento);
		
	}
	
	public Professor(){
		
	}


	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	private List<Disciplina> preferidas = new ArrayList<Disciplina>();
	private List<Projeto> projetos = new ArrayList<Projeto>();
	
	
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	public List<Projeto> getProjetos() {
		return projetos;
	}
	public void setProjetos(List<Projeto> projetos) {
		this.projetos = projetos;
	}
	public String getPreferidas() {
		return preferidas.toString();
	}
	public void setPreferidas(List<Disciplina> preferidas) {
		this.preferidas = preferidas;
	}
	
	
	public String toString() {
		return "Professor ["+"Nome: "+this.getNome()+"\n"
		+"e-mail: "+this.getEmail()+"\n"
		+"Matricula: "+this.getMatricula()+"\n"
		+"Disciplinas Preferidas:"+this.getPreferidas()+ "]";
	}
	
	
	
}
