package br.com.estudosjava.javacore.Jmodificadorfinal.classes;

public class Carro {

    private static double velocidadeMax;
    private String nome;
    private String modelo;

    public static double getVelocidadeMax() {
        return velocidadeMax;
    }

    public static void setVelocidadeMax(double velocidadeMax) {
        Carro.velocidadeMax = velocidadeMax;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
