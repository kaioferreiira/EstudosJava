package br.com.estudosjava.JavaExerciciosResolvidos.ControleDeFluxos.For;


import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int n;

        System.out.println("Digite o valor: ");
        n =  teclado.nextInt();

        for(int i=1; i <= 10; i++){
            System.out.println(i + " * " + n + " =" + (i*n));
        }

    }
}
