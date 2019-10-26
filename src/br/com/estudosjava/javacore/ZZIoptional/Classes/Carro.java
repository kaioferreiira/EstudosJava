package br.com.estudosjava.javacore.ZZIoptional.Classes;

import br.com.estudosjava.javacore.ZZIoptional.Classes2.Seguradora2;

import java.util.Optional;

public class Carro {

    private Seguradora seguradora2;
    private String nome;

    public Carro(Carro carro, String nome) {
        this.seguradora2 = seguradora2;
        this.nome = nome;
    }

    public Carro(String nome) {
        this.nome = nome;
    }

    public Optional<Seguradora> getSeguradora() {
        return Optional.ofNullable(seguradora2);
    }

    public void setCarro(Seguradora seguradora2) {
        this.seguradora2 = seguradora2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
