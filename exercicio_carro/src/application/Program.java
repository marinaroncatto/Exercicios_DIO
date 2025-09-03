package application;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import model.Car;

public class Program {

	private static final Car CAR = new Car();
	private static final Map<Integer, Runnable> ACTIONS = new HashMap<>();

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			initializeActions();
			int option = 0;

			do {
				
				showMenu();
				if (!sc.hasNextInt()) {
					System.out.println("Digite apenas números!");
					sc.next(); // para limpar a entrada inválida do leitor
					continue;
				}

				option = sc.nextInt();
				Runnable action = ACTIONS.get(option);

				if (action != null)
					action.run();
				else if (option != 10)
					System.out.println("Opção inválida, escolha um item do menu.");

			} while (option != 10);
		}
		
		System.out.println("*** Até a próxima! ***");
	}

	private static void initializeActions() {
		ACTIONS.put(1, CAR::turnOn);
		ACTIONS.put(2, CAR::turnOff);
		ACTIONS.put(3, CAR::accelerate);
		ACTIONS.put(4, CAR::decelerate);
		ACTIONS.put(5, CAR::turnLeft);
		ACTIONS.put(6, CAR::turnRight);
		ACTIONS.put(7, () -> System.out.println(CAR.checkSpeed()));
		ACTIONS.put(8, CAR::increaseMarch);
		ACTIONS.put(9, CAR::decreaseMarch);
	}

	private static void showMenu() {
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
	}

}
