package br.com.bytebank.banco.modelos;

public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente(int agencia, int corrente) {
		super(agencia, corrente);
	}
	
	@Override
	boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar)   ;
	}

	public void deposita(double valor) {
		super.saldo = super.saldo + valor;
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
	@Override
	public String toString() {
		return "Conta Corrente" + "\n" + super.toString();
	}
	
	
	
}
