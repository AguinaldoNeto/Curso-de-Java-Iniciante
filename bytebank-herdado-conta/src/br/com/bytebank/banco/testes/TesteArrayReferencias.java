package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelos.Conta;
import br.com.bytebank.banco.modelos.ContaCorrente;
import br.com.bytebank.banco.modelos.GuardadorDeContas;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
	GuardadorDeContas guard = new GuardadorDeContas();
	
	ContaCorrente cc0 = new ContaCorrente(69, 123456);
	ContaCorrente cc1 = new ContaCorrente(69, 987558);
	
	guard.adiciona(cc0);
	guard.adiciona(cc1);
	
	int total = guard.getQuantidadeTotalDeContas();
	System.out.println(total);
	
	Conta referencia = guard.getReferencia(0);
	System.out.println(referencia.getAgencia());
	
	
	
	}
}
