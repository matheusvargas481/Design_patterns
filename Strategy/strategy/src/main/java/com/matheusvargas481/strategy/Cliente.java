package com.matheusvargas481.strategy;

public class Cliente {

    private String nome;
    private String email;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Cliente(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
}
