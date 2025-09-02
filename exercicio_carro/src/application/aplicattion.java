package application;

import java.util.Scanner;

public class aplicattion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean finish= false;
		
		do{
		System.out.println("Carro Digital:");
		System.out.println("1 - Ligar o Carro");
		System.out.println("2 - Desligar o Carro");
		System.out.println("3 - Acelerar o Carro");
		System.out.println("4 - Desacelerar o Carro");
		System.out.println("5 - Virar para esquerda");
		System.out.println("6 - Virar para direira");
		System.out.println("7 - Verificar velocidade");
		System.out.println("8 - Subir a marcha");
		System.out.println("9 - Descer a marcha");
		System.out.println("10 - Sair");
		System.out.print("Escolha uma opção: ");
		int option = sc.nextInt();
		
		}while(finish != false);
		
		sc.close();
	}
	
	

}
