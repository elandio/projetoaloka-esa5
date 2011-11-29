import java.io.Serializable;
import java.util.*;


public class Projeto implements Serializable{
	private int id;
	private String nome;
	private String professor;
	private List<Projeto> projetos = new ArrayList<Projeto>();
	
	public Projeto(int id, String nome, String tipo) {
		super();
		this.id = id;
		this.nome = nome;
	}
	
	public Projeto(){
		
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public String toString() {
		return "Projeto :" +this.getNome() ;
	}
	
}
