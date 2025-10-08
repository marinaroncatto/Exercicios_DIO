package model;

public final class Gerente extends Pessoa{

	public Gerente(String nome, String email, String senha) {
		super(nome, email, senha, true);
		//administrador sempre true
	}
	
	public void gerarRelarioFinanceiro() {
		System.out.println("Relatório financeiro gerado");
	}

}
