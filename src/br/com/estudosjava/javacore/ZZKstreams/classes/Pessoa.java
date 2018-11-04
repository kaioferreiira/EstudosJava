package br.com.estudosjava.javacore.ZZKstreams.classes;

import java.util.Arrays;
import java.util.List;

public class Pessoa {

    private String nome;
    private int idade;
    private double salario;

    public Pessoa(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public static List<Pessoa> bancoDeDados() {
        return Arrays.asList(
                new Pessoa("Kaio", 25, 100.00),
                new Pessoa("lucas", 75, 2300.00),
                new Pessoa("flavio", 45, 4300.00),
                new Pessoa("sergio", 15, 5300.00),
                new Pessoa("rafael", 22, 8300.00)
        );
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
