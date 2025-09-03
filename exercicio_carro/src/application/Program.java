package application;

import java.util.Scanner;

import model.Car;

public class Program {

	private static final Car CAR = new Car();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int option;
		
		do{
		System.out.println("\n*** Carro Digital: ***\n");
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
		System.out.print("\nEscolha uma opção: ");
		option = sc.nextInt();
		
		menuActions(option);
		
		}while(option != 10);
		System.out.println("Até a próxima!");
		sc.close();
	}
	
	private static void menuActions(int option) {
		switch(option) {
			case 1 -> CAR.turnOn();
			case 2 -> CAR.turnOff();
			case 3 -> CAR.accelerate();
			case 4 -> CAR.decelerate();
			case 5 -> CAR.turnLeft();
			case 6 -> CAR.turnRight();
			case 7 -> System.out.println(CAR.checkSpeed()); 
			case 8 -> CAR.increaseMarch();
			case 9 -> CAR.decreaseMarch();
			default -> System.out.println("...");
		}
	}
	

}
