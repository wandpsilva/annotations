package anotacoes.model;

import anotacoes.annotation.ValidaPessoa;

public class Cliente {
    private Long cpf;
    private String nome;
    @ValidaPessoa
    private String pessoa;

    public Cliente(){}

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cpf=" + cpf +
                ", nome='" + nome + '\'' +
                ", pessoa='" + pessoa + '\'' +
                '}';
    }
}
