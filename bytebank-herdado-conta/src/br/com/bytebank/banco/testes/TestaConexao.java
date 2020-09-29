package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelos.*;

public class TestaConexao {

	public static void main(String[] args) {
		
		try (Conexao conexao = new Conexao() ) {
			conexao.leDados();
		} catch(IllegalStateException ex) {
			System.out.println("Deu erro na conexão");
		}
	}
}	