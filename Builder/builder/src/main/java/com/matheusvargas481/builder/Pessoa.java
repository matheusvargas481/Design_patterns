package com.matheussoilegra.coreengineering.tema12;

public class Pessoa {

    private String nome;
    private String dataNascimento;
    private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Informações: Nome: " + getNome() + "; Data de Nascimento: " + getDataNascimento() + ";\nEndereço: " + getEndereco();
    }

}
