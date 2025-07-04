package services;

import java.util.Scanner;

public class Services {
	
	
	public static void multiplicationTable(int n) {
		for(int i = 1; i <= 10; i++) {
			System.out.printf("%d X %d = %d %n", n, i, (n*i));
		}
	}
	
	public static void IMCcalculator(Float weight, Float height) {
		Float imc = weight / (height * height); 
		String analysis = IMCanalysis(imc);
		printResult(analysis);
	}

	private static String IMCanalysis(Float imc) {
		String result = "";
		
		if(imc <= 18.5) {
			result = "Abaixo do peso";
		}else if(imc <= 24.9) {
			result = "Peso ideal";
		}else if(imc <= 29.9) {
			result = "Levemente acima do peso";
		}else if(imc <= 34.9) {
			result = "Obesidade Grau I";
		}else if(imc <= 39.9) {
			result = "Obesidade Grau II (Severa)";
		}else if(imc >= 40.0) {
			result = "Obesidade Grau III (Mórbida)";
		}
		
		return result;
	}
	
	private static void printResult(String result) {
		System.out.println(result);
	}
	
	/* Exercício 3: Escreva um código que o usuário entre com um primeiro número, 
	 * um segundo número maior que o primeiro e escolhe entre a opção par e impar, 
	 * com isso o código deve informar todos os números pares ou ímpares 
	 * (de acordo com a seleção inicial) no intervalo de números informados, incluindo os números 
	 * informados e em ordem decrescente;
	 */
	
	public static void evenOddBetween(int number1, int number2, char option) {
		
		switch (option) {
			case 'E'-> {
					for(int i = number2; i >= number1; i--) 
						if(i % 2 == 0) System.out.println(i);					
					}				
			
			case 'O' -> {
				for(int i = number2; i != number1; i--) 
					if(i % 2 != 0) System.out.println(i);
			}
			default -> throw new IllegalArgumentException("Please enter a valid option.");
		}
	}
	
	/* Exercício 4: Escreva um código onde o usuário informa um número inicial, 
	 * posteriormente irá informar outros N números, a execução do código irá continuar 
	 * até que o número informado dividido pelo primeiro número tenha resto diferente 
	 * de 0 na divisão, números menores que o primeiro número devem ser ignorados
	 */
	
	public static void divisionTest(int number1) {
		
		Scanner sc = new Scanner(System.in);		
		int number2;
		boolean condition = true;
		
		while(condition) {
			System.out.print("Enter the second number: ");
			number2 = sc.nextInt();
			
			if(number2 < number1) continue;
			
			if(number2 % number1 != 0) condition = false;
			
		}
		sc.close();
	}
	
	
}
