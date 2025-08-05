package entities;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ContaBancaria {
	
	private String saldo;
	private String chequeEspecial;
	
	public ContaBancaria(String deposito) {
		this.saldo = deposito;
		calcularChequeEspecial();
	}
	
	public String consultarSaldo() {
		BigDecimal sald = new BigDecimal(this.saldo);
		sald = sald.setScale(2, RoundingMode.HALF_EVEN);
		return "R$ "+ sald;
	}
	
	public void depositar(String deposito) {
		BigDecimal sald = toBigDecimal(this.saldo);
		BigDecimal dep = toBigDecimal(deposito);
		sald = sald.add(dep);
		sald = sald.setScale(2, RoundingMode.HALF_EVEN);
		this.saldo = sald.toPlainString();
	}
	
	public void sacar(String saque) {
		BigDecimal sald = toBigDecimal(this.saldo);
		BigDecimal saq = toBigDecimal(saque);
		sald = sald.subtract(saq);
		sald = sald.setScale(2, RoundingMode.HALF_EVEN);
		this.saldo = sald.toPlainString();
		saq = saq.setScale(2, RoundingMode.HALF_EVEN);
		System.out.println("R$ " + saq + " sacado(s)");
	}
	
	private void calcularChequeEspecial() {
		BigDecimal sald = toBigDecimal(this.saldo);
		
		if(sald.compareTo(new BigDecimal(500)) <= 0) {
			BigDecimal cheq = new BigDecimal(50.00);
			cheq = cheq.setScale(2, RoundingMode.HALF_EVEN);
			this.chequeEspecial = cheq.toPlainString();
		}
		else {
			BigDecimal cheq = sald.multiply(new BigDecimal(0.5));
			cheq = cheq.setScale(2, RoundingMode.HALF_EVEN);
			this.chequeEspecial = cheq.toPlainString();
		}
						
	}
	
	public String getChequeEspecial() {
		return "R$ " + chequeEspecial;
	}
		
	private BigDecimal toBigDecimal(String string) {
		try { 
			return new BigDecimal(string).setScale(4, RoundingMode.HALF_EVEN);			
		}
		catch(Exception e) {
			return BigDecimal.ZERO;
		}
	}
}
