package br.com.estudosjava.javacore.Jmodificadorfinal.classes;

public final class Carro {

    private static final double VELOCIDADE_lIMITE = 200;
    private String nome;
    private String modelo;


    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public static double getVelocidadelimite() {
        return VELOCIDADE_lIMITE;
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
