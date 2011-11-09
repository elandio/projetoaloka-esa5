import java.io.Serializable;


public class Usuario implements Serializable{
	private String username;
	private String password;
	private Object tipo;
	private String nome;
	private String matricula;
	private String email;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	private Departamento departamento;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Object getTipo() {
		return tipo;
	}
	
	public void setTipo(Object tipo) {
		this.tipo = tipo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Usuario(String username, String password, Object tipo, String nome,
			String matricula, String email, Departamento departamento) {
		super();
		this.username = username;
		this.password = password;
		this.tipo = tipo;
		this.nome = nome;
		this.matricula = matricula;
		this.email = email;
		this.departamento = departamento;
	}

	public Usuario(){
		
	}
	
}
