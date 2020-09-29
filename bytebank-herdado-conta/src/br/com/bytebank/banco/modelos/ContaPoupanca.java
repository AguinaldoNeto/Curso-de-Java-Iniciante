package br.com.bytebank.banco.modelos;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int corrente) {
		super(agencia, corrente);
	}

	public void deposita(double valor) {
		super.saldo =+ valor;
	}
	
	@Override
	public String toString() {
		return "Conta Poupança" +"\n" + super.toString();
	}
	
	
	
}
