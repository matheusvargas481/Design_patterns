package com.matheussoilegra.coreengineering.tema12;

import org.junit.Assert;
import org.junit.Test;

public class PessoaBuilderTest {

    @Test
    public void testarPessoaBuilder() {
        Assert.assertNotNull(PessoaBuilder.builder());
    }

    @Test
    public void testarPessoaComNome() {
        String nome = "Matheus";
        Pessoa pessoa = PessoaBuilder.builder().pessoaComNome(nome).build();
        Assert.assertEquals(nome, pessoa.getNome());
    }

    @Test
    public void testarPessoaComDataNascimento() {
        String dataNascimento = "10/11/1994";
        Pessoa pessoa = PessoaBuilder.builder().pessoaComDataNascimento(dataNascimento).build();
        Assert.assertEquals(dataNascimento, pessoa.getDataNascimento());
    }

    @Test
    public void testarPessoaComEndereco() {
        String rua = "Governador Palheta";
        int numero = 421;
        String cidade = "Sapucaia do Sul";
        String estado = "RS";
        Pessoa pessoa = PessoaBuilder.builder().pessoaComEndereco(rua, numero, cidade, estado).build();
        Assert.assertNotNull(pessoa.getEndereco());
    }

}
