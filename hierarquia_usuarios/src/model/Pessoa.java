package model;

public abstract class Pessoa {
	
	private String nome;
	private String email;
	private String senha;
	private Boolean administrador;
	
	public Pessoa(String nome, String email, String senha, Boolean administrador) {
		super();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.administrador = administrador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Boolean getAdministrador() {
		return administrador;
	}
	
	public void realizarLogin() {
		System.out.println("Usuário realizou login");
	}
	
	public void realizarLogoff() {
		System.out.println("Usuário realizou logoff");
	}
	
	public void alterarDados() {
		System.out.println("Central de gerenciamento de dados do usuário");
	}
	
	
}
