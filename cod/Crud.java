import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Crud {
	
	private List<Professor> professores = new ArrayList<Professor>();
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	private List<Secretario> secretarios = new ArrayList<Secretario>();
	private List<Departamento> departamentos = new ArrayList<Departamento>();
	private List<Curso> cursos = new ArrayList<Curso>();
	private List<Projeto> projetos = new ArrayList<Projeto>();
	private List<Usuario> usuarios = new ArrayList<Usuario>();
	private List<Turma> turmas = new ArrayList<Turma>();
	
	public void addTurma (Turma t){
		turmas = CarregarTurmas();
		turmas.add(t);
		ArquivoTurma();
	}

	public void addUsuario (Usuario u){
		usuarios = CarregarUsuario();
		usuarios.add(u);
		ArquivoUsuario();
	}
	public void addProfessor (Professor p){
		professores = CarregarProf();
		professores.add(p);
		ArquivoProf();
	}
	
	public void addDisciplina (Disciplina d){
		disciplinas = CarregarDiscipl();
		disciplinas.add(d);
		ArquivoDiscipl();
	}
	
	public void addSecretario (Secretario s){
		secretarios = CarregarSecr();
		secretarios.add(s);
		ArquivoSecr();
	}
	
	public void addCurso (Curso c){
		cursos = CarregarCurso();
		cursos.add(c);
		ArquivoCurso();
	}
	
	public void addDepartamento (Departamento d){
		departamentos = CarregarDepto();
		departamentos.add(d);
		ArquivoDepto();
	}
	
	public void addProjeto (Projeto p){
		projetos = CarregarProj();
		projetos.add(p);
		ArquivoProj();
	}
	
	public int sizeTurmas(){
		List<Turma> turmas2 = new ArrayList<Turma>();
		turmas2 = CarregarTurmas();
		return turmas2.size();
	}
	
	public int sizeProfessor(){
		List<Professor> professores2 = new ArrayList<Professor>();
		professores2 = CarregarProf();
		return professores2.size();
	}
	
	public int sizeSecretario(){
		List<Secretario> secretarios2 = new ArrayList<Secretario>();
		secretarios2 = CarregarSecr();
		return secretarios2.size();
	}
	
	public int sizeDisciplinas(){
		List<Disciplina> disciplinas2 = new ArrayList<Disciplina>();
		disciplinas2 = CarregarDiscipl();
		return disciplinas2.size();
	}
	
	public int sizeCurso(){
		List<Curso> cursos2 = new ArrayList<Curso>();
		cursos2 = CarregarCurso();
		return cursos2.size();
	}
	
	public int sizeDepartamento(){
		List<Departamento> departamentos2 = new ArrayList<Departamento>();
		departamentos2 = CarregarDepto();
		return departamentos2.size();
	}
	
	public int sizeProjeto(){
		List<Projeto> projetos2 = new ArrayList<Projeto>();
		projetos2 = CarregarProj();
		return projetos2.size();
	}
	
	public void removerSecretario(String nome){
		secretarios = CarregarSecr();
		for(int i = 0; i < secretarios.size(); ++i){
			if(nome.equals(secretarios.get(i).getNome())){
				secretarios.remove(i);
				ArquivoSecr();
			}
		}
		
	}
	
	public void removerProfessor(String nome){
		professores = CarregarProf();
		for(int i = 0; i < professores.size(); ++i){
			if(nome.equals(professores.get(i).getNome())){
				professores.remove(i);
				ArquivoProf();
			}
		}
	}
	
	public void removerDisciplina(String nome){
		disciplinas = CarregarDiscipl();
		for(int i = 0; i < disciplinas.size(); ++i){
			if(nome.equals(disciplinas.get(i).getNome())){
				disciplinas.remove(i);
				ArquivoDiscipl();
			}
		}
	}
	
	public void removerCurso(String nome){
		cursos = CarregarCurso();
		for(int i = 0;i < cursos.size(); ++i){
			if(nome.equals(cursos.get(i).getNome())){
				cursos.remove(i);
				ArquivoCurso();
			}
		}
	}
	
	public void removerDepartamento(String nome){
		departamentos = CarregarDepto();
		for(int i =0;i < departamentos.size(); ++i){
			if(nome.equals(departamentos.get(i).getNome())){
				departamentos.remove(i);
				ArquivoDepto();
			}
		}
	}
	
	public void removerProj(String nome){
		projetos = CarregarProj();
		professores = CarregarProf();
		for(int i = 0;i< projetos.size();++i){
			if(nome.equals(projetos.get(i).getNome())){
				projetos.remove(i);
				ArquivoProj();
				String prof = projetos.get(i).getProfessor();
				for(int cont = 0;cont < professores.size();++cont){
					if(prof.equals(professores.get(i).getNome())){
						professores.get(i).decr();
						ArquivoProf();
					}
				}
			}
		}
	}
	
	public String pesquisarProfessor(String nome){
		Professor professor = null;
		professores = CarregarProf();
		for(int i = 0; i < professores.size(); ++i){
			if(nome.equals(professores.get(i).getNome())){
				professor = professores.get(i);
			}
		}
		return professor.toString();
	}
	
	public String pesquisarSecretario(String nome){
		Secretario secretario = null;
		secretarios = CarregarSecr();
		for(int i = 0; i < secretarios.size(); ++i){
			if(nome.equals(secretarios.get(i).getNome())){
				secretario = secretarios.get(i);
			}
		}
		return secretario.toString();
	}
	
	public String pesquisarDepartamento(String nome){
		Departamento depto = null;
		departamentos = CarregarDepto();
		for(int i = 0; i < departamentos.size(); ++i){
			if(nome.equals(departamentos.get(i).getNome())){
				depto = departamentos.get(i);
			}
		}
		return depto.toString();
	}
	
	public String pesquisarCurso(String nome){
		Curso curso = null;
		cursos = CarregarCurso();
		for(int i = 0; i < cursos.size(); ++i){
			if(nome.equals(cursos.get(i).getNome())){
				curso = cursos.get(i);
			}
		}
		return curso.toString();
	}
	
	public String pesquisarDisciplina(String nome){
		Disciplina disciplina = null;
		disciplinas = CarregarDiscipl();
		for(int i = 0; i < disciplinas.size(); ++i){
			if(nome.equals(disciplinas.get(i).getNome())){
				disciplina = disciplinas.get(i);
			}
		}
		return disciplina.toString();
	}
	
	public String pesquisarProjeto(String nome){
		Projeto projeto = null;
		projetos = CarregarProj();
		for(int i = 0;i < projetos.size(); ++i){
			if(nome.equals(projetos.get(i).getNome())){
				projeto = projetos.get(i);
			}
		}
		return projeto.toString();
	}
	
	public boolean testProf(String nome){
		boolean result = false;
		List<Professor> professores2 = new ArrayList<Professor>();
		professores2 = CarregarProf();
		for(int i = 0;i< professores2.size(); ++i){
			if(nome.equals(professores2.get(i).getNome())){
				result = true;
			}
		}return result;
	}
	
	public boolean testCurso(String nome){
		boolean result = false;
		List <Curso> cursos2 = new ArrayList<Curso>();
		cursos2 = CarregarCurso();
		for(int i = 0;i< cursos2.size(); ++i){
			if(nome.equals(cursos2.get(i).getNome())){
				result = true;
			}
			
		}return result;
	}
	
	public boolean testDepartamento(String nome){
		boolean result = false;
		List<Departamento> departamentos2 = new ArrayList<Departamento>();
		departamentos2 = CarregarDepto();
		for(int i = 0;i< departamentos2.size();++i){
			if(nome.equals((departamentos2.get(i)).getNome())){
				result = true;
			}
		
		}return result;
	}
	
	private ArquivarProf arquivo = new ArquivarProf();
	
	public void ArquivoProf(){
		arquivo.salvar(professores);
	}
	
	public List CarregarProf(){
		professores = arquivo.recuperar();
		return professores;
	}
	
	private ArquivarSecretario arqsecr = new ArquivarSecretario();
	
	public void ArquivoSecr(){
		arqsecr.salvar(secretarios);
	}
	
	public List CarregarSecr(){
		secretarios = arqsecr.recuperar();
		return secretarios;
	}
	
	private ArquivarCurso arqcurso = new ArquivarCurso();
	
	public void ArquivoCurso(){
		arqcurso.salvar(cursos);
	}
	
	public List CarregarCurso(){
		cursos = arqcurso.recuperar();
		return cursos;
	}
	
private ArquivarDisciplina arqdisc = new ArquivarDisciplina();
	
	public void ArquivoDiscipl(){
		arqdisc.salvar(disciplinas);
	}
	
	public List CarregarDiscipl(){
		disciplinas = arqdisc.recuperar();
		return disciplinas;
	}
	
private ArquivarDepartamento arqdepto = new ArquivarDepartamento();
	
	public void ArquivoDepto(){
		arqdepto.salvar(departamentos);
	}
	
	public List CarregarDepto(){
		departamentos = arqdepto.recuperar();
		return departamentos;
	}
	
private ArquivarProjeto arqproj = new ArquivarProjeto();
	
	public void ArquivoProj(){
		arqproj.salvar(projetos);
	}
	
	public List CarregarProj(){
		projetos = arqproj.recuperar();
		return projetos;
	}
	
private ArquivarUsuario arqusu = new ArquivarUsuario();
	
	public void ArquivoUsuario(){
		arqusu.salvar(usuarios);
	}
	
	public List CarregarUsuario(){
		usuarios = arqusu.recuperar();
		return usuarios;
	}
	
private ArquivarTurmas arqturma = new ArquivarTurmas();
	
	public void ArquivoTurma(){
		arqturma.salvar(turmas);
	}
	
	public List CarregarTurmas(){
		turmas = arqturma.recuperar();
		return turmas;
	}
	
	public boolean ConfereUsername (String username){
		boolean confere = false;
		secretarios = CarregarSecr();
		if (secretarios.size()>0){
		for(int i = 0;i < secretarios.size(); ++i){           
			if(username.equals(secretarios.get(i).getUsername())){
				confere = true;
			}
		}
		}else 
			if(secretarios.size()==0){
				confere = true;
			}
		return confere;
	}
	
	public boolean ConferePassword (String password){
		boolean confere = false;
		secretarios = CarregarSecr();
		if(secretarios.size()>0){
		for(int i = 0;i < secretarios.size(); ++i){           
			if(password.equals(secretarios.get(i).getPassword())){
				confere = true;
			}
		}
		}else
			if(secretarios.size()==0){
				confere = true;
			}
		return confere;
	
	}
	
	public boolean ConfereProf (String nome){
		boolean confere = false;
		professores = CarregarProf();
		for(int i=0;i< professores.size();++i){
			if(nome.equals(professores.get(i).getNome()) && professores.get(i).getQuantDisciplina()<2){
				professores.get(i).setQuantDisciplina(professores.get(i).getQuantDisciplina() +1);
				ArquivoProf();
				confere = true;
			}
		}
		return confere;
	}
	
	public boolean ConfereDisciplina (String nome){
		boolean confere = false;
		disciplinas = CarregarDiscipl();
		for(int i=0; i<disciplinas.size();++i){
			if(nome.equals(disciplinas.get(i).getNome()) && disciplinas.get(i).isAlocada()==false){
				disciplinas.get(i).setAlocada(true);
				ArquivoDiscipl();
				confere = true;
			}
		}
		return confere;
	}
	
	public boolean ComparaProf (String nome){
		boolean compara = false;
		professores = CarregarProf();
		for(int i=0;i<professores.size();++i){
			if(nome.equals(professores.get(i).getNome())){
				compara = true;
			}
		}
		return compara;
	}
	
	public boolean ComparaSecr (String nome){
		boolean compara = false;
		secretarios = CarregarSecr();
		for(int i=0;i<secretarios.size();++i){
			if(nome.equals(secretarios.get(i).getNome())){
				compara = true;
			}
		}
		return compara;
	}
	
	public boolean ComparaCurso (String nome,String depto){
		boolean compara = false;
		cursos = CarregarCurso();
		for(int i=0;i<cursos.size();++i){
			if(nome.equals(cursos.get(i).getNome())){
				if(depto.equals(cursos.get(i).dpto())){
				compara = true;
				}
			}
		}
		return compara;
	}
	
	public boolean ComparaDisciplina (String nome,String curso){
		boolean compara = false;
		disciplinas = CarregarDiscipl();
		for(int i=0;i<disciplinas.size();++i){
			if(nome.equals(disciplinas.get(i).getNome())){
				if(curso.equals(disciplinas.get(i).nomecurso())){
				compara = true;
				}
			}
		}
		return compara;
	}
	
	public boolean ComparaDepto (String nome){
		boolean compara = false;
		departamentos = CarregarDepto();
		for(int i=0;i<departamentos.size();++i){
			if(nome.equals(departamentos.get(i).getNome())){
				compara = true;
			}
		}
		return compara;
	}
	
	public boolean ComparaProj (String nome){
		boolean compara = false;
		projetos = CarregarProj();
		for(int i=0;i<projetos.size();++i){
			if(nome.equals(projetos.get(i).getNome())){
				compara = true;
			}
		}
		return compara;
	}
	
	public boolean ConfereProfParaProj (String professor, String nome){
		boolean confere = false;
		Projeto proj = new Projeto();
		proj.setNome(nome);
		List<Projeto> projetos2 = new ArrayList<Projeto>();
		professores = CarregarProf();
		for(int i=0;i< professores.size();++i){
			if(professor.equals(professores.get(i).getNome()) && professores.get(i).getQuantProj()<2){
				confere = true;
				professores.get(i).incr();
				projetos2.add(proj);
				professores.get(i).setProjetos(projetos2);
				ArquivoProf();
			}
		}
		return confere;
	}

}
