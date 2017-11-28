package br.com.estudosjava.javacore.Fmodificadorestatico.classes;

public class Carro {

    private static double velocidadeLimite = 240;
    private String nome;
    private double velocideMaxima;

    public Carro(String nome, double velocideMaxima){
        this.nome = nome;
        this.velocideMaxima = velocideMaxima;
    }

    public Carro(){

    }

    public static void setVelocidadeLimite(double velocidadeLimite){
         Carro.velocidadeLimite = velocidadeLimite;
    }

    public static  double getVelocidadeLimite(double velocidadeLimite){
        return velocidadeLimite;
    }

    public  void imprime(){

        System.out.println("--------------------------------");
        System.out.println(this.nome);
        System.out.println(this.velocideMaxima);
        System.out.println(velocidadeLimite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocideMaxima() {
        return velocideMaxima;
    }

    public void setVelocideMaxima(double velocideMaxima) {
        this.velocideMaxima = velocideMaxima;
    }

}


