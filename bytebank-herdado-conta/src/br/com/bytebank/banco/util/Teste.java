package br.com.bytebank.banco.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.omg.CosNaming.NamingContextPackage.CannotProceed;

import br.com.bytebank.banco.modelos.Cliente;
import br.com.bytebank.banco.modelos.Conta;
import br.com.bytebank.banco.modelos.ContaCorrente;
import br.com.bytebank.banco.modelos.ContaPoupanca;

public class Teste {
	
	public static void main(String[] args) {//Criamos os objetos
	
	Conta cc1 = new ContaCorrente(22,33);
	Cliente clienteCC1 = new Cliente();
	clienteCC1.setNome("Nico");
	cc1.setTitular(clienteCC1);
	cc1.deposita(333.0);
	
	Conta cp1 = new ContaPoupanca(22, 44);
	Cliente clienteCP1 = new Cliente();
	clienteCP1.setNome("Guilherme");
	cp1.setTitular(clienteCP1);
	cp1.deposita(444.0);
	
	Conta cc2 = new ContaCorrente(22, 11);
	Cliente clienteCC2 = new Cliente();
	clienteCC2.setNome("Paulo");
	cc2.setTitular(clienteCC2);
	cc2.deposita(111.0);
	
	Conta cp2 = new ContaPoupanca(22, 22);
	Cliente clienteCP2 = new Cliente();
	clienteCP2.setNome("Ana");
	cp2.setTitular(clienteCP2);
	cp2.deposita(222.0);
	
	List<Conta> lista = new ArrayList<>(); // Criamos a lista e adicionamos os
	// objetos dentro dessa lista
	lista.add(cc1);
	lista.add(cp1);
	lista.add(cc2);
	lista.add(cp2);
	
	for(Conta conta:lista) // Criamos o for para visualizar a ordenação dentro
	// dentro da lista
	System.out.println(conta);
	System.out.println("-------------");
	
	//NumeroDaContaComparator comparador = new NumeroDaContaComparator();
	//TitularDaContaTitular titularComparador = new TitularDaContaTitular();
	lista.sort(new TitularDaContaTitular());
	// Criamos o for para visualizar a ordenação dentro dentro da lista 
	
	Collections.sort(lista);
	//Collections.reverse(lista);
	
	for(Conta conta:lista)
	System.out.println(conta + "\n" + conta.getTitular().getNome() + "\n");
	
	}
}

class TitularDaContaTitular implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		String nomeC1 = c1.getTitular().getNome();
		String nomeC2 = c2.getTitular().getNome();
		return nomeC1.compareTo(nomeC2);
	}
}

class NumeroDaContaComparator implements Comparator<Conta> {
//Criamos a classe para poder utilizar o método Compare e foi passado todos
// os parâmetros.
	@Override
	public int compare(Conta c1, Conta c2) {
	
		return Integer.compare(c1.getCcorrente(), c2.getCcorrente()); // Outra opção.
		
//		return c1.getCcorrente() - c2.getCcorrente(); Uma opção

//		if (c1.getCcorrente() < c2.getCcorrente()) { Uma opção
//			return -1;
//		}
//		if(c1.getCcorrente() > c2.getCcorrente()) {
//			return 1;
//		}	
//		return 0;
	}
}



