package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelos.*;

public class testeObject {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(69, 12345);
		ContaPoupanca cp = new ContaPoupanca(69, 77785);
		System.out.println(cc);
		System.out.println(cp);
		
	}
}
