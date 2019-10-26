package br.com.estudosjava.JavaExerciciosResolvidos.ControleDeFluxos.DoWhile;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int inicio;
        int fim;
        int i=0;
        System.out.println("Digite o valor inicial");
        inicio = leitor.nextInt();

        System.out.println("Digite o valor final");
        fim = leitor.nextInt();

        if (inicio < fim) {
            i=inicio;
            do {
                System.out.println(i);
                i++;
            }while(i <= fim);

        } else {
            i=inicio;
            do{
                System.out.println(i);
                i--;
            }while(i >= fim);

        }
    }
}
