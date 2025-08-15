package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class Program {

	/*
	 * Escreva um código onde temos uma conta bancaria que possa realizar as
	 * seguintes operações: Consultar saldo consultar cheque especial Depositar
	 * dinheiro; Sacar dinheiro; Pagar um boleto. Verificar se a conta está usando
	 * cheque especial. Siga as seguintes regras para implementar
	 * 
	 * A conta bancária deve ter um limite de cheque especial somado ao saldo da
	 * conta; O o valor do cheque especial é definido no momento da criação da
	 * conta, de acordo com o valor depositado na conta em sua criação; Se o valor
	 * depositado na criação da conta for de R$500,00 ou menos o cheque especial
	 * deve ser de R$50,00 Para valores acima de R$500,00 o cheque especial deve ser
	 * de 50% do valor depositado; Caso o limite de cheque especial seja usado,
	 * assim que possível a conta deve cobrar uma taxa de 20% do valor usado do
	 * cheque especial.
	 */
	private static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		//TODO ajustar regras de negócio de saque e depósito para incluir lógica de dívida
		
		Locale.setDefault(Locale.US);

		int option = 100;

		System.out.print("Insira o valor de depósito para criar sua conta bancária: ");
		String dep = SC.next();

		ContaBancaria cb = new ContaBancaria(dep);

		do {
			System.out.println();
			System.out.println("### Conta Bancária ###");
			System.out.println("1 - Consultar Saldo");
			System.out.println("2 - Consultar Cheque Especial");
			System.out.println("3 - Fazer Depósito");
			System.out.println("4 - Sacar dinheiro");
			System.out.println("5 - Pagar Boleto");
			System.out.println("6 - Verificar uso de cheque especial");
			System.out.println("7 - Consultar Valor Limite com Cheque Especial");
			System.out.println("8 - Consultar Dívida");
			System.out.println("0 - Sair");
			System.out.print("\nOpção escolhida: ");
			option = SC.nextInt();

			realizarOperacao(cb, option);

		} while (option != 0);

		System.out.println("Operação encerrada!");

	}

	private static void realizarOperacao(ContaBancaria cb, int option) {
		switch (option) {
		case 1 -> System.out.println("Saldo: " + cb.consultarSaldo());
		case 2 -> System.out.println("Cheque Especial: " + cb.consultarChequeEspecial());
		case 3 -> {
			System.out.println("Valor para depósito: ");
			String deposito = SC.next();
			cb.depositar(deposito);
		}
		case 4 -> {
			System.out.println("Valor para saque: ");
			String saque = SC.next();
			cb.sacar(saque);
		}
		case 5 -> {
			System.out.println("Valor do boleto: ");
			String boleto = SC.next();
			cb.pagarBoleto(boleto);
		}
		case 6 -> {
			boolean diduse = cb.isUsandoCheque();
			System.out.println(booleanResult(diduse));
		}
		case 7 -> System.out.println("Valor Limite com Cheque: " + cb.consultarValorLimite());
		case 8 -> System.out.println("Dívida: " + cb.consultarDivida());
		case 0 -> System.out.println("Finalizando...");

		default -> System.out.println("Valor inválido. Escolha uma opção do menu.");
		}
	}

	private static String booleanResult(boolean diduse) {
		if (diduse == true)
			return "Cheque especial em uso";
		else
			return "Cheque especial não foi utilizado";
	}

}
