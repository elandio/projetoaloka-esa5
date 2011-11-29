import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Crud {
	
	private List<Professor> professores = new ArrayList<Professor>();
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	private List<Secretario> secretarios = new ArrayList<Secretario>();
	private List<Departamento> departamentos = new ArrayList<Departamento>();
	private List<Curso> cursos = new ArrayList<Curso>();
	
	//private ArquivarProf arquivo = new ArquivarProf();
	public void addProfessor (Professor p){
		professores.add(p);
		//arquivo.salvar(p);
	}
	
	public void addDisciplina (Disciplina d){
		disciplinas.add(d);
	}
	
	public void addSecretario (Secretario s){
		secretarios.add(s);
	}
	
	public void addCurso (Curso c){
		cursos.add(c);
	}
	
	public void addDepartamento (Departamento d){
		departamentos.add(d);
	}
	
	public int sizeProfessor(){
		return professores.size();
	}
	
	public int sizeSecretario(){
		return secretarios.size();
	}
	
	public int sizeDisciplinas(){
		return disciplinas.size();
	}
	
	public int sizeCurso(){
		return cursos.size();
	}
	
	public int sizeDepartamento(){
		return departamentos.size();
	}
	
	public void removerSecretario(String nome){
		for(int i = 0; i < secretarios.size(); ++i){
			if(nome == secretarios.get(i).getNome()){
				secretarios.remove(i);
			}
		}
	}
	
	public void removerProfessor(String nome){
		for(int i = 0; i < professores.size(); ++i){
			if(nome == professores.get(i).getNome()){
				professores.remove(i);
			}
		}
	}
	
	public void removerDisciplina(String nome){
		for(int i = 0; i < disciplinas.size(); ++i){
			if(nome == disciplinas.get(i).getNome()){
				disciplinas.remove(i);
			}
		}
	}
	
	public void removerCurso(String nome){
		for(int i = 0;i < cursos.size(); ++i){
			if(nome == cursos.get(i).getNome()){
				cursos.remove(i);
			}
		}
	}
	
	public String pesquisarProfessor(String nome){
		String professor = null;
		for(int i = 0; i < professores.size(); ++i){
			if(nome == professores.get(i).getNome()){
				professor = professores.get(i).getNome();
			}
		}
		return professor;
	}
	
	public String pesquisarSecretario(String nome){
		String secretario = "";
		for(int i = 0; i < secretarios.size(); ++i){
			if(nome == secretarios.get(i).getNome()){
				secretario = secretarios.get(i).getNome();
			}
		}
		return secretario;
	}
	
	public String pesquisarDepartamento(String nome){
		String depto = "";
		for(int i = 0; i < departamentos.size(); ++i){
			if(nome == departamentos.get(i).getNome()){
				depto = departamentos.get(i).getNome();
			}
		}
		return depto;
	}
	
	public String pesquisarCurso(String nome){
		String curso = "";
		for(int i = 0; i < cursos.size(); ++i){
			if(nome == cursos.get(i).getNome()){
				curso = cursos.get(i).getNome();
			}
		}
		return curso;
	}
	
	public String pesquisarDsciplina(String nome){
		String disciplina = "";
		for(int i = 0; i < disciplinas.size(); ++i){
			if(nome == disciplinas.get(i).getNome()){
				disciplina = disciplinas.get(i).getNome();
			}
		}
		return disciplina;
	}
	
	public void removerDepartamento(String nome){
		for(int i =0;i < departamentos.size(); ++i){
			if(nome == departamentos.get(i).getNome()){
				departamentos.remove(i);
			}
		}
	}
	
	public boolean testCurso(String nome){
		boolean result = false;
		for(int i = 0;i< cursos.size(); ++i){
			if(nome == cursos.get(i).getNome()){
				result = true;
			}
			
		}return result;
	}
	
	public boolean testDepartamento(String nome){
		boolean result = false;
		for(int i = 0;i< CarregarDepto().size();++i){
			if(nome == ((Departamento) CarregarDepto().get(i)).getNome()){
				result = true;
			}
		
		}return result;
	}
	
	private ArquivarProf arquivo = new ArquivarProf();
	
	public void ArquivoProf(){
		arquivo.salvar(professores);
	}
	
	public String CarregarProf(){
		professores = arquivo.recuperar();
		String aux = "Professores:\n";
		for(int i=0;i<professores.size();i++){
			aux = aux+"\n"+"\n"+professores.get(i).toString();
		}
		return aux;
	}
	
	private ArquivarSecretario arqsecr = new ArquivarSecretario();
	
	public void ArquivoSecr(){
		arqsecr.salvar(secretarios);
	}
	
	public String CarregarSecr(){
		secretarios = arqsecr.recuperar();
		String aux = "Secretarios:\n";
		for(int i=0;i<secretarios.size();i++){
			aux = aux+"\n"+"\n"+secretarios.get(i).toString();
		}
		return aux;
	}
	
	private ArquivarCurso arqcurso = new ArquivarCurso();
	
	public void ArquivoCurso(){
		arqcurso.salvar(cursos);
	}
	
	public String CarregarCurso(){
		cursos = arqcurso.recuperar();
		String aux = "Cursos:\n";
		for(int i = 0;i< cursos.size();++i){
			aux = aux+"\n"+"\n"+cursos.get(i).toString();
		}
		return aux;
	}
	
private ArquivarDisciplina arqdisc = new ArquivarDisciplina();
	
	public void ArquivoDiscipl(){
		arqdisc.salvar(disciplinas);
	}
	
	public String CarregarDiscipl(){
		disciplinas = arqdisc.recuperar();
		String aux = "Disciplinas:\n";
		for(int i = 0;i< disciplinas.size();++i){
			aux = aux+"\n"+"\n"+disciplinas.get(i).toString();
		}
		return aux;
	}
	
private ArquivarDepartamento arqdepto = new ArquivarDepartamento();
	
	public void ArquivoDepto(){
		arqdepto.salvar(departamentos);
	}
	
	public List CarregarDepto(){
		departamentos = arqdepto.recuperar();
		//String aux = "Departamentos:\n";
		//for(int i = 0;i< departamentos.size();++i){
			//aux = aux+"\n"+"\n"+departamentos.get(i).toString();
		//}
		return departamentos;
	}

}
