package br.com.estudosjava.javacore.Bintroducaometodos.classes;

public class Estudante {

        /*
        * Cria uma classe estudante com os seguintes atributos:
        * nome, idade, notas: tres notas.
        * metodo imprimir os dados e tirar a média
        * caso a media seja > 6 aprovado senao reprovado.
        *
        * */

    private String nome;
    private int idade;
    private double[] notas;


    public void imprimeDados() {
        System.out.println("nome" + this.nome);
        System.out.println("idade" + this.idade);
        if (this.notas != null) {
            for (double n : this.notas) {
                System.out.println("nota: " + n);
            }
        }
    }

    public void tirarMedia() {
        double soma = 0;
        double media = 0;
        for (double nota : this.notas) {
            soma += nota;
        }
        media = soma / notas.length;

        if (media >= 6) {
            System.out.println("Aluno Aprovado");
        } else {
            System.out.println("Aluno Reprovado");
        }

    }


    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public double[] getNotas(){
        return this.notas;
    }

    public void setNotas(double[] notas){
        this.notas = notas;
    }


}
