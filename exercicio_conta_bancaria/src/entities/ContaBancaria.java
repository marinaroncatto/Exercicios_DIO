package entities;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ContaBancaria {
	
	private String saldo;
	private String chequeEspecial;
	private String valorTotal;
	private String divida;
	private boolean usandoCheque;
	
 	public ContaBancaria(String deposito) {
		this.saldo = deposito;
		calcularChequeEspecial();
		calcularValorTotal();
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
	
	private void calcularValorTotal() {
		BigDecimal saldo = new BigDecimal(this.saldo);
		BigDecimal cheque = new BigDecimal(this.chequeEspecial);
		BigDecimal valorTotal = saldo.add(cheque);
		valorTotal = valorTotal.setScale(2, RoundingMode.HALF_EVEN);
		this.valorTotal = valorTotal.toPlainString();
	}
	
	public String getChequeEspecial() {
		return "R$ " + chequeEspecial;
	}
		
	private BigDecimal toBigDecimal(String string) {
		try { 
			return new BigDecimal(string).setScale(2, RoundingMode.HALF_EVEN);			
		}
		catch(Exception e) {
			return BigDecimal.ZERO;
		}
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
		
		if(this.divida != null) {
			BigDecimal div = toBigDecimal(this.divida);			
			if(div.compareTo(dep) <= 0) {
				sald = sald.subtract(div);
				this.divida = null;
			}
			else {
				div = div.subtract(sald);
				div = div.setScale(2, RoundingMode.HALF_EVEN);
				this.divida = div.toPlainString();
				sald = BigDecimal.ZERO;
			}			
		}
		
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
	
	public void pagarBoleto(String valor) {
		BigDecimal val = toBigDecimal(valor);
		BigDecimal sald = toBigDecimal(this.saldo);
		calcularValorTotal();
		BigDecimal total = toBigDecimal(this.valorTotal);
		
		if(val.compareTo(sald) <= 0) {
			sald = sald.subtract(val);		
			this.saldo = sald.toPlainString();
			System.out.println("O boleto de R$ " + valor + " foi pago com sucesso.");
		}
		else if(val.compareTo(total) <= 0) {
			BigDecimal cheq = toBigDecimal(this.chequeEspecial);
			total = total.subtract(val);
			this.saldo = BigDecimal.ZERO.toPlainString();
			this.chequeEspecial = total.toPlainString();
			calcularValorTotal();
			BigDecimal divid = cheq.subtract(total);
			divid = divid.multiply(new BigDecimal(0.2));
			divid = divid.setScale(2, RoundingMode.HALF_EVEN);
			this.divida = divid.toPlainString();
			this.usandoCheque = true;
			
			System.out.println("O boleto de R$ " + valor + " foi pago usando cheque especial.");
		}
		else 
			System.out.println("Valor do boleto excede o limite da conta.");
		
		
	}

	public boolean isUsandoCheque() {
		return usandoCheque;
	}


	public String getDivida() {
		return divida;
	}

}