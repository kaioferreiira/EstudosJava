package br.com.estudosjava.JavaExerciciosResolvidos.ControleDeFluxos.For;

import java.util.Scanner;

public class Exercicio4Fatorial {

    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        int i, fator = 0 , resultado=1;

        System.out.println("Digite o numero: ");
        fator =  teclado.nextInt();

        for (i = fator; i >= 1; i-- ){
        resultado = resultado * i;
        }

        System.out.println(resultado);


    }
}
