import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Crud {
	
	private List<Professor> professores = new ArrayList<Professor>();
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	private List<Secretario> secretarios = new ArrayList<Secretario>();
	
	public void addProfessor (Professor p){
		professores.add(p);
	}
	
	public void addDisciplina (Disciplina d){
		disciplinas.add(d);
	}
	
	public void addSecretario (Secretario s){
		secretarios.add(s);
	}
	
	public int size(){
		return professores.size();
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
	
	private ArquivarProf arquivo = new ArquivarProf();
	
	public void ArquivoProf(){
		arquivo.salvar(professores);
	}
	
	public String CarregarProf(){
		professores = arquivo.recuperar();
		String aux = "Professores:";
		for(int i=0;i<professores.size();i++){
			aux = professores.get(i).toString();
		}
		return aux;
	}
	
	private ArquivarSecretario arqsecr = new ArquivarSecretario();
	
	public void ArquivoSecr(){
		arqsecr.salvar(secretarios);
	}
	
	public String CarregarSecr(){
		secretarios = arqsecr.recuperar();
		String aux = "Secretarios:";
		for(int i=0;i<secretarios.size();i++){
			aux = secretarios.get(i).toString();
		}
		return aux;
	}
	
	
}
