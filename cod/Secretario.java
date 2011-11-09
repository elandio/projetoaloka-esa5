import java.io.Serializable;


public class Secretario extends Usuario implements Serializable{
	
	private String telefone;

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}	
	
	public String toString() {
		return "Secretario ["+"Nome: "+this.getNome()+"\n"
		+"e-mail: "+this.getEmail()+"\n"
		+"Matricula: "+this.getMatricula()+"\n"
		+"Telefone: "+this.getTelefone()+"]";
	}

	public Secretario(String username, String password, Object tipo,
			String nome, String matricula, String email,
			Departamento departamento, String telefone) {
		super(username, password, tipo, nome, matricula, email, departamento);
		this.telefone = telefone;
	}
	public Secretario() {
		
	}
}
