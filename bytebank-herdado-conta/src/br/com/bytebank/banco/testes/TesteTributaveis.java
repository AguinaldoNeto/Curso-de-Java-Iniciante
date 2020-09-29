package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelos.*;

public class TesteTributaveis {

	public static void main(String[] args) {
		
	ContaCorrente cc = new ContaCorrente(69, 123456);
	cc.deposita(100.0);
	
	SeguroDeVida sv = new SeguroDeVida();
	
	CalculadorDeImposto ci = new CalculadorDeImposto();
	ci.registra(cc);
	ci.registra(sv);
	
	System.out.println(ci.getTotalImposto());
	
		
	}
}
