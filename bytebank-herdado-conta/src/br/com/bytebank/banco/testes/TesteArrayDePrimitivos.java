package br.com.bytebank.banco.testes;

public class TesteArrayDePrimitivos {

	public static void main(String[] args) {

	int[] idades = new int[5];
	
	for(int i = 0; i < idades.length; i++) {
		idades[i] = i*i;
		System.out.println(idades[i]);
		// 0*0 = 0
		// 1*1 = 1
		// 2*2 = 4
		// 3*3 = 9
		// 4*4 = 16
	}		
	}

}
