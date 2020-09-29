package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelos.Conta;
import br.com.bytebank.banco.modelos.ContaCorrente;
import br.com.bytebank.banco.modelos.ContaPoupanca;

public class TesteArrayString {

	public static void main(String[] args) {
		
		//int[] idades = new int[5];
		Conta[] referencias = new Conta[5];
		
		ContaPoupanca cc0 = new ContaPoupanca(69, 12345);
		ContaCorrente cc1 = new ContaCorrente(69, 22344);
		ContaCorrente cc2 = new ContaCorrente(69, 98510);
		ContaCorrente cc3 = new ContaCorrente(69, 10098);
		ContaCorrente cc4 = new ContaCorrente(69, 89560);
		
		referencias[0] = cc0;
		referencias[1] = cc1;
		referencias[2] = cc2;
		referencias[3] = cc3;
		referencias[4] = cc4;
		
		ContaPoupanca ref0 = (ContaPoupanca)referencias[0];
		ContaCorrente ref1 = (ContaCorrente)referencias[1];
		
		System.out.println(ref0);
		System.out.println(ref1);
		
	}
}
