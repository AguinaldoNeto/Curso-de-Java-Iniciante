package br.com.bytebank.banco.util;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

import br.com.bytebank.banco.modelos.Conta;

public class TesteOutrosWrappers {

	public static void main(String[] args) {

	Integer idadeRef = Integer.valueOf(20);//autoboxing
	System.out.println(idadeRef.intValue());//unboxing	
		
	Double dRef = Double.valueOf(3.2);//autoboxing
	System.out.println(dRef.doubleValue());//unboxing	
	
	Boolean bRef = Boolean.TRUE; //autoboxing
	System.out.println(bRef.booleanValue());//unboxing
	
	Number numero = Integer.valueOf(7);
	System.out.println(numero.floatValue());
	
	List<Number> listaDeTelefone = new ArrayList<>();
	
	listaDeTelefone.add(32693222);
	listaDeTelefone.add(99999998);
	
	System.out.println(listaDeTelefone);
	
	}

}
