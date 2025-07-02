package application;

import java.util.Scanner;

import services.Services;

public class Program {

	public static void main(String[] args) {
		
		//Exercício 1: Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;
		//Services.multiplicationTable(5);
		
		/*Exercício 2: Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:

			Se for menor ou igual a 18,5 "Abaixo do peso";
			se for entre 18,6 e 24,9 "Peso ideal";
			Se for entre 25,0 e 29,9 "Levemente acima do peso";
			Se for entre 30,0 e 34,9 "Obesidade Grau I";
			Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
			Se for maior ou igual a 40,0 "Obesidade III (Mórbida)"; */
		
		//Services.IMCcalculator(50.0f, 1.50f);
		
		/* Exercício 3: Escreva um código que o usuário entre com um primeiro número, 
		 * um segundo número maior que o primeiro e escolhe entre a opção par e impar, 
		 * com isso o código deve informar todos os números pares ou ímpares 
		 * (de acordo com a seleção inicial) no intervalo de números informados, incluindo os números 
		 * informados e em ordem decrescente;
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		int number1 = sc.nextInt();
		
		System.out.print("Enter the second number (higher than first): ");
		int number2 = sc.nextInt();
		
		System.out.print("Choose an option (Even/Odd): ");
		char option = sc.next().toUpperCase().charAt(0);
		
		Services.evenOddBetween(number1, number2, option);
		
		sc.close();

	}

}
