
public class Fachada {
	
	Crud c = new Crud();
	
	public void addProfessor(Professor p){
		c.addProfessor(p);
	}
	public void addDisciplina (Disciplina d){
		c.addDisciplina(d);
	}
	public void addSecretario(Secretario s){
		c.addSecretario(s);
	}
	public void removerProfessor(String nome){
		c.removerProfessor(nome);
	}
	public void removerDisciplina(String nome){
		c.removerDisciplina(nome);
	}
	public void removerSecretario(String nome){
		c.removerSecretario(nome);
	}
	public void ArquivoProf(){
		c.ArquivoProf();
	}
	public String CarregarProf(){
		return c.CarregarProf();
	}
	public void ArquivoSecr(){
		c.ArquivoSecr();
	}
	public String CarregarSecr(){
		return c.CarregarSecr();
	}
	public int size(){
		return c.size();
	}
}
