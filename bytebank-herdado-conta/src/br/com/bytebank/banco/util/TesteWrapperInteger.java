package br.com.bytebank.banco.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {

	int idade = 20;
	Integer idadeRef = Integer.valueOf(20);
	int valor = idadeRef.intValue();
	System.out.println(idadeRef.doubleValue());

	
	String s = args[0];
	//Integer NumerCar = Integer.valueOf(s);
	int numero = Integer.parseInt(s);
	
	//List numeros = new ArrayList();
	//numeros.add(idadeRef);
	System.out.println(numero);
	
	}

}
