package br.com.bytebank.banco.modelos;

public class Cliente {
	
	private String  nome;
	private String  cpf;
	private String  profissao;
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = "Nome completo do titular: " + nome;
	}

	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = "CPF do titular da conta: " + cpf;
	}
	
	public String getProfissao() {
		return this.profissao;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = "Profissão do titular da conta: " + profissao;
	}
	
	
	
	
	
	
	
}

