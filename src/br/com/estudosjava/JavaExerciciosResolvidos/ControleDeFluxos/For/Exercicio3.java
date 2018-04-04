package br.com.estudosjava.JavaExerciciosResolvidos.ControleDeFluxos.For;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {


        int alunos = 0;
        String nome;
        String melhorAluno = "";
        float nota;
        float maiorNota=0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite quantos alunos tem na turma: ");
        alunos =  teclado.nextInt();

        for (int i =1; i<= alunos; i++){
            System.out.println("Digite o nome do aluno: ");
            nome =  teclado.nextLine();

            System.out.println("Digite sua nota");
            nota = teclado.nextFloat();

            if(nota >= maiorNota){
                maiorNota =nota;
                melhorAluno = nome;
            }
        }
        System.out.println("O melhor aluno foi: " + melhorAluno + " e sua nota é: " + maiorNota);
    }
}
