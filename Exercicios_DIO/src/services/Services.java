package services;

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
}
