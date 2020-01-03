package com.matheussoilegra.coreengineering.tema12;

public class PessoaBuilder {

    private Pessoa pessoa;

    public PessoaBuilder() {
        this.pessoa = new Pessoa();
    }

    public static PessoaBuilder builder() {
        return new PessoaBuilder();
    }

    public PessoaBuilder pessoaComNome(String nome) {
        this.pessoa.setNome(nome);
        return this;
    }

    public PessoaBuilder pessoaComDataNascimento(String dataNascimento) {
        this.pessoa.setDataNascimento (dataNascimento);
        return this;
    }

    public PessoaBuilder pessoaComEndereco(String rua, int numero, String cidade, String estado) {
        Endereco endereco = new Endereco();
        endereco.setRua(rua);
        endereco.setNumero(numero);
        endereco.setCidade(cidade);
        endereco.setEstado(estado);
        this.pessoa.setEndereco(endereco);
        return this;
    }

    public Pessoa build() {
        return this.pessoa;
    }

}
