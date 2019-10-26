package br.com.estudosjava.JavaExerciciosResolvidos.Provas.P2;

import java.util.Scanner;

public class Ex1Prova {
    public static void main(String[] args) {


    /*  Um professor deseja armazenar a nota de 10 alunos com seus respectivos nomes, após ler todos os dados deverá
        ser realizado um cálculo de média das notas dos alunos. Ao obter e media dos alunos devera imprimir na tela o valor da media e o nome dos
        alunos com nota superior a media.

        Devera ser impresso assim:
        A média dos alunos é: 4.6

        Lista dos alunos cuja nota é superior a média da turma:


*/

        String[] nomes;
        nomes = new String[5];
        double[] notas = new double[5];
        double soma = 0, media;


        for (int i = 0; i < notas.length; i++) {
            System.out.println("Entre com o nome do aluno nº " + (i + 1));
            nomes[i] = new Scanner(System.in).nextLine();
            System.out.println("Entre com a nota do aluno nº " + (i + 1));
            notas[i] = new Scanner(System.in).nextDouble();
            soma = soma + notas[i];
        }
        media = soma / 5;

        System.out.println("A média dos alunos é: " + media);
        System.out.println();
        System.out.println("Lista dos alunos cuja nota é superior a média da turma");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media)
                System.out.println(nomes[i]);
        }
    }


}

