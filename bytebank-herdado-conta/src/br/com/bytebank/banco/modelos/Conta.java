package br.com.bytebank.banco.modelos;

/**
 * Essa classe representa a moldura da conta.
 * @author Aguinaldo Neto
 *@version 1.0
 */

public abstract class Conta extends Object implements Comparable<Conta> { //ABAIXO SÃO OS ATRIBUTOS DA CONTA (SALDO, AGENCIA, NÚMERO, TITULAR)
	protected double saldo; //Liberado para as filhas visualizarem;
	private int  agencia;
	private int corrente;
	private Cliente titular;	
	private static int total;
	
	
	public Conta(int agencia, int corrente) {
		Conta.total++;
		//System.out.println("O total de conta é: " + Conta.total);
		this.agencia = agencia;
		this.corrente = corrente;
		//System.out.println("Dados da agência: " + agencia + " e dados da corrente: " + corrente);
	}
	
	public abstract void deposita(double valor); // Tenho que implementar pelas filhas.

	boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor; // saldo SUBTRAIA DELE MESMO (=-) O VALOR
			return true;
		} else {
			return false;
		}
	}	
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saca(valor)) {
		destino.deposita(valor);
		return true;
	} else {
		return false;
	}
}
	
	public void setSaldo(int valor) {
		this.saldo = valor;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Você não pode preencher com um número negativo ou O");
			return;
		}
		this.agencia = agencia;
	}
	
	public int getAgencia() {
		return this.agencia;
	}

	public int getCcorrente() {
		return this.corrente;
	}
	
	public void setCcorrente(int numero) {
		if(corrente <= 0) {
			System.out.println("Você não pode preencher com um número negativo ou O");
			return; // Parou aqui ... Se não colocar o RETURN, o resultado (0.0) e a mensagem aparecem juntas no retorno.
		} 
		this.corrente = numero;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public boolean equals (Object referencia) {
		Conta outraRef = (Conta) referencia; //Cast
		
		if(this.agencia != outraRef.agencia) {
			return false; // Se for falsa, não passa daqui.
		}
		
		if(this.corrente != outraRef.corrente) {
			return false; // Se for falsa, não passa daqui.
		}
		
		return true; //Se chegar aqui, está tudo certo.
	}
	
	@Override
	public String toString() {
		return "Agência: " + this.agencia + "\n" + "Conta: " + this.corrente + " - " + "Saldo: " + this.saldo;
	}
	
	@Override
		public int compareTo(Conta OutraConta) {
		
		return Double.compare(this.saldo, OutraConta.saldo); 
// Compare este saldo com saldo de outra conta 		
		}
	
}
	
	
	
	
	


