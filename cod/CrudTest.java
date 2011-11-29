import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class CrudTest {

	@Test
	public void test() {
		Crud c = new Crud();	
		Professor p = new Professor("rafael", "senha123", null, "Rafael Lima", "0102", "rafael@projetoaloka.com", null);
		assertTrue(c.sizeProfessor()==0);
		c.addProfessor(p);
		assertTrue(c.sizeProfessor()==1);
		assertTrue(p.getUsername()=="rafael");
		assertTrue(p.getPassword()=="senha123");
		assertTrue(p.getNome()=="Rafael Lima");
		assertTrue(p.getMatricula()=="0102");
		Professor p2 = new Professor("guilherme", "pass123", null, "Guilherme Chagas","0103", "guilherme@projetoaloka.com", null);
		c.addProfessor(p2);
		assertTrue(c.sizeProfessor()==2);
		c.removerProfessor("Rafael Lima");
		assertTrue(c.sizeProfessor()==1);
		assertEquals(c.pesquisarProfessor("Guilherme Chagas"), "Guilherme Chagas");
		
		//temina o teste -provisório- de professor
		
		Secretario s = new Secretario("marcus", "senha123", null, "Marcus Vinicius", "0201", "marcus@projetoaloka.com", null, "8785-5585");
		assertTrue(c.sizeSecretario()==0);
		c.addSecretario(s);
		assertTrue(c.sizeSecretario()==1);
		assertTrue(s.getTelefone()=="8785-5585");
		assertTrue(s.getEmail()=="marcus@projetoaloka.com");
		Secretario s2 = new Secretario("heitor", "doidera", null, "Heitor José", "0202", "heitor@projetoaloka.com", null, "8787-8790");
		c.addSecretario(s2);
		assertTrue(c.sizeSecretario()==2);
		c.removerSecretario("Heitor José");
		assertTrue(c.sizeSecretario()==1);
		c.removerSecretario("Marcus Vinicius");
		assertTrue(c.sizeSecretario()==0); 
		c.addSecretario(s);
		assertEquals(c.pesquisarSecretario("Marcus Vinicius"), "Marcus Vinicius");
		
		//termina o teste -provisório- de secretário
		
		Curso curso = new Curso("Sistemas de Informação", null, null);
		assertTrue(c.sizeCurso()==0);
		c.addCurso(curso);
		assertTrue(c.sizeCurso()==1);
		assertTrue(curso.getNome()=="Sistemas de Informação");
		Curso curso2 = new Curso("Ciência da Computação", null, null);
		c.addCurso(curso2);
		assertTrue(c.sizeCurso()==2);
		c.removerCurso("Ciência da Computação");
		assertTrue(c.sizeCurso()==1); 
		assertEquals(c.pesquisarCurso("Sistemas de Informação"), "Sistemas de Informação");
		
		//termina o teste -provisório- de curso
		
		ArrayList<Professor> professores = new ArrayList<Professor>();
		ArrayList<Secretario> secretarios = new ArrayList<Secretario>();
		ArrayList<Curso> cursos = new ArrayList<Curso>();
		professores.add(p);
		secretarios.add(s);
		cursos.add(curso);
		Departamento dpto = new Departamento("DCE", professores, secretarios, cursos);
		assertTrue(dpto.getNome()=="DCE");
		c.addDepartamento(dpto);
		assertTrue(c.sizeDepartamento()==1);
		c.removerDepartamento("DCE");
		assertTrue(c.sizeDepartamento()==0);
		c.addDepartamento(dpto);
		assertEquals(c.pesquisarDepartamento("DCE"), "DCE");
		
		 //termina o teste -provisório- de departamento
	
		Disciplina dis = new Disciplina("Engenharia Aplicada", curso);
		assertTrue(dis.getNome()=="Engenharia Aplicada");
		c.addDisciplina(dis);
		assertTrue(c.sizeCurso()==1);
		assertEquals(c.pesquisarDsciplina("Engenharia Aplicada"), "Engenharia Aplicada");
		c.removerDisciplina("Engenharia Aplicada");
		assertTrue(c.sizeDisciplinas()==0);
		
		//termina o teste -provisório- de disciplina
	}

}