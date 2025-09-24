package model;

public class Car {
	
	private final int[] SPEED_LIMITS = { 0, 20, 40, 60, 80, 100, 120 };
	
	private int march;
	private int speed;
	private boolean isTurnOn;

	public Car() {
		march = 0;
		speed = 0;
		isTurnOn = false;
	}

	private boolean checkIfIsOn() {
		if (!isTurnOn) {
			System.out.println("O carro está desligado");
			return false;
		}
		return true;
	}

	public String checkSpeed() {
		if (!checkIfIsOn()) { 
			return "";	//retorna carro desligado		
		}
		return speed + " km";
	}

	public void accelerate() {
		if (!checkIfIsOn())
			return;
		else if (increaseSpeedManager())
			speed++;
	}

	public void decelerate() {
		if (!checkIfIsOn())
			return;
		else if (decreaseSpeedManager())
			speed--;
	}

	public void increaseMarch() {
		if (!checkIfIsOn())
			return;
		else if (march == 6)
			System.out.println("O carro já está na 6º marcha");
		else
			march++;
		System.out.println(march + "º marcha");
	}

	public void decreaseMarch() {
		if (!checkIfIsOn())
			return;
		else if (march == 0)
			System.out.println("O carro está em ponto morto");
		else
			march--;
		System.out.println(march + "º marcha");
	}
	
	private void turn(String direction) {
		if (!checkIfIsOn())
			return;
		else if (speed < 1)
			System.out.println("O carro está parado");
		else if (speed > 40)
			System.out.println("Diminua a velocidade para virar");
		else
			System.out.println("O carro virou para a " + direction);
	}
	
	public void turnLeft() {
		turn("esquerda");
	}

	public void turnRight() {
		turn("direita"); 
	}

	public void turnOn() {
		if (isTurnOn)
			System.out.println("O carro já está ligado");
		else {
			isTurnOn = true;
			System.out.println("Você ligou o carro");
		}

	}

	public void turnOff() {
		if (!isTurnOn)
			System.out.println("O carro já está desligado");
		else if (march == 0 && speed == 0) {
			isTurnOn = false;
			System.out.println("Você desligou o carro");
		} else
			System.out.println("Pare o carro e deixe em ponto morto antes de desligá-lo");

	}

	public boolean increaseSpeedManager() {

		int maxSpeed = SPEED_LIMITS[this.march];
		int minSpeed = this.march > 0 ? SPEED_LIMITS[this.march -1] : 0;

		if (maxSpeed == 0) {
			System.out.println("O carro está em ponto morto, para acelerar suba para a 1º marcha.");
			return false;
		}
		
		if(maxSpeed == 120) {
			System.out.println("Velocidade máxima atingida");
			return false;
		}

		if (this.speed == maxSpeed) {
			System.out.println("Para acelerar suba para a " + (this.march + 1) + "º marcha");
			return false;
		}

		if (this.speed >= minSpeed && this.speed < maxSpeed) {
			return true;
		}
		
		return false;
	}

	public boolean decreaseSpeedManager() {
		
		int minSpeed = this.march > 0 ? SPEED_LIMITS[this.march -1] : 0;

		if (this.speed == 0) {
			System.out.println("O carro está parado");
			return false;
		}

		if (this.speed == minSpeed) {
			System.out.println("Para desacelerar desça para a " + (this.march - 1) + "º marcha");
			return false;
		}

		if (this.speed > minSpeed) {
			return true;
		}
				
		return false;
	}
}
