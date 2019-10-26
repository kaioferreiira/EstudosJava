package br.com.estudosjava.JavaExerciciosResolvidos.ControleDeFluxos.While;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int inicio;
        int fim;
        int i;
        System.out.println("Digite o valor inicial");
        inicio = leitor.nextInt();

        System.out.println("Digite o valor final");
        fim = leitor.nextInt();

        if (inicio < fim) {

            i = inicio;
            while (i <= fim) {
                System.out.println(i);
                i++;
            }
        } else {

        }
            i = inicio;
            while (i >= fim) {
                System.out.println(i);
                i--;
        }

    }
}
