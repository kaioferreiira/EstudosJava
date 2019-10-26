package br.com.estudosjava.JavaExerciciosResolvidos.polimorfismo.classes;

public class Carneiro extends Animal{
    public Carneiro(){
        this.nome = "Carneiro";
        this.numeroPatas = 4;

    }

    @Override
    public void som(){
        System.out.println("O " + this.nome + " que tem " + this.numeroPatas + " patas, faz BÉÉÉ");

    }
}