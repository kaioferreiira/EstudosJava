package br.com.estudosjava.JavaExerciciosResolvidos.ControleDeFluxos.DoWhile;

import java.util.Scanner;

public class Exercicio4Fatorial {


    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int i, fator = 0, resultado = 1;

        System.out.println("Digite o numero: ");
        fator = teclado.nextInt();

        i = fator;
        do{
            resultado = resultado * i;
            i--;
        }while (i >= 1);

        System.out.println(resultado);


    }
}
