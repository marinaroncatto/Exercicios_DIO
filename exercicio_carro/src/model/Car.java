package model;

public class Car {
	
	private int march;
	private int speed;
	private boolean isTurnOn;
	
	public Car() {
		march = 0;
		speed = 0;
		isTurnOn = false;
	}
	
	public String checkSpeed() {
		if(isTurnOn == false) 
			return "O carro está desligado";
		else
			return speed + " km";
	}
	
	public void accelerate() {
		if(isTurnOn == false) 
			System.out.println("O carro está desligado");
		else if(speed == 120)
			System.out.println("Velocidade máxima de 120 km atingida");
		else
			speed++;
	}
	
	public void decelerate() {
		if(isTurnOn == false) 
			System.out.println("O carro está desligado");
		else if(speed == 0)
			System.out.println("O carro está parado");
		else
			speed--;
	}
	
	public void increaseMarch() {
		if(isTurnOn == false) 
			System.out.println("O carro está desligado");
		else if(march == 6)
			System.out.println("O carro já está na 6º marcha");
		else
			march++;
			System.out.println(march + "º marcha");
	}
	
	public void decreaseMarch() {
		if(isTurnOn == false) 
			System.out.println("O carro está desligado");
		else if(march == 0)
			System.out.println("O carro está em ponto morto");
		else
			march--;
			System.out.println(march + "º marcha");
	}
	
	public void turnLeft() {
		if(isTurnOn == false) 
			System.out.println("O carro está desligado");
		else if(speed < 1)
			System.out.println("O carro está parado");
		else if(speed > 40)
			System.out.println("Diminua a velocidade para virar");
		else
			System.out.println("O carro virou para a esqueda");
	}
	
	public void turnRight() {
		if(isTurnOn == false) 
			System.out.println("O carro está desligado");
		else if(speed < 1)
			System.out.println("O carro está parado");
		else if(speed > 40)
			System.out.println("Diminua a velocidade para virar");
		else
			System.out.println("O carro virou para a direita");
	}
	
	public void turnOn() {
		if(isTurnOn == true) 
			System.out.println("O carro já está ligado");
		else {
			isTurnOn = true;
			System.out.println("Você ligou o carro");
		}					
			
	}
	
	public void turnOff() {
		if(isTurnOn == false) 
			System.out.println("O carro já está desligado");
		else if(march == 0 && speed == 0) {
			isTurnOn = false;
			System.out.println("Você desligou o carro");
		}			
		else
			System.out.println("Pare o carro e deixe em ponto morto antes de desligá-lo");
			
	}
}
