package com.matheussoilegra.coreengineering.tema12;

public class Main {
	public static void main(String[] args) {
		Pessoa pessoa = PessoaBuilder.builder()
				.pessoaComNome("Matheus")
				.pessoaComDataNascimento("10/11/1994")
				.pessoaComEndereco("Governador Palheta", 421, "Sapucaia do Sul", "RS")
				.build();
		System.out.println(pessoa);
	}
}