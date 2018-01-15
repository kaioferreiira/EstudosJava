package br.com.estudosjava.javacore.Lclassesabstratas.classes;

public abstract class Funcionario  extends Pessoa{

    protected String clt;
    protected double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String clt, double salario) {
        this.nome = nome;
        this.clt = clt;
        this.salario = salario;
    }

    /*  Classe abstrata não tem corpo, ela termina sempre com ";"   */
    public abstract void calculaSalario();

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", clt='" + clt + '\'' +
                ", salario=" + salario +
                '}';
    }


}
