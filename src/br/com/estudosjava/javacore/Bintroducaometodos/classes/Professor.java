package br.com.estudosjava.javacore.Bintroducaometodos.classes;

public class Professor {
    //crie os seguintes atributos: nome, matricula, rg, cpf
    // crie uma classe de teste para preencher e imprimir os dados

    public String nome;
    public String matricula;
    public String rg;
    public String cpf;

    public void imprimi(){

        System.out.println(this.nome);
        System.out.println(this.matricula);
        System.out.println(this.rg);
        System.out.println(this.cpf);
    }

}
