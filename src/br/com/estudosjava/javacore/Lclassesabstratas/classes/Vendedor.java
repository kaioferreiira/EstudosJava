package br.com.estudosjava.javacore.Lclassesabstratas.classes;

public class Vendedor extends Funcionario {

    public Vendedor() {
    }

    public Vendedor(String nome, String clt, double salario) {
        super(nome, clt, salario);
    }

    @Override
    public void calculaSalario() {
        this.salario =  salario + (salario * 0.3);
    }

    @Override
    public void imprime() {

    }
}
