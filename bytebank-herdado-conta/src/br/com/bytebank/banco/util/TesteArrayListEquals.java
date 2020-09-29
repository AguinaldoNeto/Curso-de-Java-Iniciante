package br.com.bytebank.banco.util;

import java.util.ArrayList;
import java.util.List;

import br.com.bytebank.banco.modelos.Conta;
import br.com.bytebank.banco.modelos.ContaCorrente;
import br.com.bytebank.banco.modelos.ContaPoupanca;

public class TesteArrayListEquals {

	public static void main(String[] args) {

		List<Conta> lista = new ArrayList<Conta>();
		
		Conta cc00 = new ContaCorrente(69, 12345);
		lista.add(cc00);
		
		Conta cc01 = new ContaCorrente(69, 88885);
		lista.add(cc01);
		
		Conta cc02 = new ContaCorrente(88, 65894);
		lista.add(cc02);
		
		Conta cc03 = new ContaCorrente(88, 85600);
		lista.add(cc03);
		
		Conta cc04 = new ContaCorrente(69, 95489);
		lista.add(cc04);
		
		Conta cp00 = new ContaPoupanca(55, 96547);
		lista.add(cp00);
		
		Conta cp01 = new ContaPoupanca(55, 55988);
		lista.add(cp01);
		
		Conta cp02 = new ContaPoupanca(22, 13216);
		lista.add(cp02);
		
		Conta cp03 = new ContaPoupanca(22, 21355);
		lista.add(cp03);
		
		Conta cp04 = new ContaPoupanca(55, 88951);
		lista.add(cp04);
		
		Conta cp05 = new ContaPoupanca(55, 33855);
		
		boolean igualdade = lista.contains(cp05);
		System.out.println("Já existe: " + igualdade);
		
		
		for(Conta todasAsContas : lista) { 
			//Pegar todos os objetos criados, e com a referencia genérica : pegar 
			//desta lista de nome criado no ArrayList e imprimir
		System.out.println(todasAsContas);
		}
			
	}
}
