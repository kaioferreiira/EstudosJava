package br.com.estudosjava.JavaExerciciosResolvidos.VariaveisUnidimensionais.Lista2;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        int[] valores;
        int pares = 0;
        valores = new int[5];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < valores.length; i++) {
            valores[i] = sc.nextInt();
        }

        for (int i = 0; i < valores.length; i++) {

            if (valores[i] % 2 == 0) {
                System.out.println(valores[i]);
                pares++;
            }
        }

        System.out.println("A quantidade de pares encotrados é de: " + pares);

    }
}
