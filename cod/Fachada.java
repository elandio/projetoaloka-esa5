import java.awt.List;


public class Fachada {
	
	Crud c = new Crud();
	
	public void addUsuario(Usuario usuario){
		c.addUsuario(usuario);
	}
	public void addTurma(Turma t){
		c.addTurma(t);
	}
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
	public void addProjeto(Projeto p){
		c.addProjeto(p);
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
	public void removerProj(String nome){
		c.removerProj(nome);
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
		return c.pesquisarDisciplina(nome);
	}
	public String pesquisarCurso(String nome){
		return c.pesquisarCurso(nome);
	}
	public String pesquisarProj(String nome){
		return c.pesquisarProjeto(nome);
	}
	public void ArquivoProf(){
		c.ArquivoProf();
	}
	public void ArquivoSecr(){
		c.ArquivoSecr();
	}
	public void ArquivoCurso(){
		c.ArquivoCurso();
	}
	public void ArquivoDiscipl(){
		c.ArquivoDiscipl();
	}
	public void ArquivoDepto(){
		c.ArquivoDepto();
	}
	public void ArquivoProj(){
		c.ArquivoProf();
	}
	public void ArquivoUsuario(){
		c.ArquivoUsuario();
	}
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
	public int sizeProjeto(){
		return c.sizeProjeto();
	}
	public int sizeTurma(){
		return c.sizeTurmas();
	}
	public boolean testProf(String nome){
		return c.testProf(nome);
	}
	public boolean testCurso(String nome){
		return c.testCurso(nome);
	}
	public boolean testDepartamento(String nome){
		return c.testDepartamento(nome);
	}
	public boolean ConfereUsername(String username){
		return c.ConfereUsername(username);
	}
	public boolean ConferePassword(String password){
		return c.ConferePassword(password);
	}
	public boolean ConfereProf(String nome){
		return c.ConfereProf(nome);
	}
	public boolean ConfereDisciplina(String nome){
		return c.ConfereDisciplina(nome);
	}
	public boolean ComparaProf(String nome){
		return c.ComparaProf(nome);
	}
	public boolean ComparaSecr(String nome){
		return c.ComparaSecr(nome);
	}
	public boolean ComparaDisciplina(String nome, String curso){
		return c.ComparaDisciplina(nome,curso);
	}
	public boolean ComparaCurso (String nome, String depto){
		return c.ComparaCurso(nome,depto);
	}
	public boolean ComparaDepto (String nome){
		return c.ComparaDepto(nome);
	}
	public boolean ComparaProj (String nome){
		return c.ComparaProj(nome);
	}
	public boolean ConfereProfParaProj (String professor, String nome){
		return c.ConfereProfParaProj(professor, nome);
	}
}
