package br.com.estudosjava.javacore.Npolimorfimo.classes;

public class Gerente extends  Funcionario {

    private double participacaoLucros;
    public Gerente(String nome, double salario, double participacaoLucros) {
        super(nome, salario);
        this.participacaoLucros = participacaoLucros;
    }

    @Override
    public void calcularPagamento() {
        this.salario = this.salario + participacaoLucros;
    }


    public double getParticipacaoLucros() {
        return participacaoLucros;
    }

    public void setParticipacaoLucros(double participacaoLucros) {
        this.participacaoLucros = participacaoLucros;
    }
}
