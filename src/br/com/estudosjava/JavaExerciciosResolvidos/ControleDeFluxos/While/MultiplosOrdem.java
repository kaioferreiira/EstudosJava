package br.com.estudosjava.JavaExerciciosResolvidos.ControleDeFluxos.While;

import java.util.Scanner;

public class MultiplosOrdem {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n, parada = 0, i = 0;

        System.out.println("Digite um numero: ");
        n = teclado.nextInt();

        if (n <= 0) {
            System.out.println("Numero digitado invalido!!!");
        } else {
            System.out.println("Numero Válido!!!");

            while (i <= n) {
                if (i % 3 == 0) {
                    System.out.println(i);
                } else if (i % 8 == 0) {
                    System.out.println(i);
                }

                i++;

            }

        }

    }

}
