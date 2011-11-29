import java.awt.List;


public class Fachada {
	
	Crud c = new Crud();
	
	public void addCurso(Curso curso){
		c.addCurso(curso);
	}
	public void addProfessor(Professor p){
		c.addProfessor(p);
	}
	public void addDisciplina (Disciplina d){
		c.addDisciplina(d);
	}
	public void addSecretario(Secretario s){
		c.addSecretario(s);
	}
	public void addDepartamento(Departamento d){
		c.addDepartamento(d);
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
	public void removerCurso(String nome){
		c.removerCurso(nome);
	}
	public void removerDepartamento(String nome){
		c.removerDepartamento(nome);
	}
	public String pesquisarProfessor(String nome){
		return c.pesquisarProfessor(nome);
	}
	public String pesquisarSecretario(String nome){
		return c.pesquisarSecretario(nome);
	}
	public String pesquisarDepartamento(String nome){
		return c.pesquisarDepartamento(nome);
	}
	public String pesquisarDisciplina(String nome){
		return c.pesquisarDsciplina(nome);
	}
	public String pesquisarCurso(String nome){
		return c.pesquisarCurso(nome);
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
	public void ArquivoCurso(){
		c.ArquivoCurso();
	}
	public String CarregarCurso(){
		return c.CarregarCurso();
	}
	public void ArquivoDiscipl(){
		c.ArquivoDiscipl();
	}
	public String CarregarDiscipl(){
		return c.CarregarDiscipl();
	}
	public void ArquivoDepto(){
		c.ArquivoDepto();
	}
	//public String CarregarDepto(){
		//return c.CarregarDepto();
	//}
	public int sizeProfessor(){
		return c.sizeProfessor();
	}
	public int sizeSecretario(){
		return c.sizeSecretario();
	}
	public int sizeDisciplinas(){
		return c.sizeDisciplinas();
	}
	public int sizeCurso(){
		return c.sizeCurso();
	}
	public int sizeDepartamento(){
		return c.sizeDepartamento();
	}
	public boolean testCurso(String nome){
		return c.testCurso(nome);
	}
	public boolean testDepartamento(String nome){
		return c.testDepartamento(nome);
	}
}
