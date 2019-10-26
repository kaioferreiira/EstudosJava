package br.com.estudosjava.javacore.ZZIoptional.Classes;

import java.util.Optional;

public class Seguradora {
    private String nome;


    public Seguradora(String nome) {
        this.nome = nome;
    }

    public Seguradora() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Seguradora{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
