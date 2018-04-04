package br.com.estudosjava.JavaExerciciosResolvidos.ControleDeFluxos.While;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;

        System.out.println("Digite o valor: ");
        n =  teclado.nextInt();
        int i=1;
        while(i <= 10){
            System.out.println(i + " * " + n + " =" + (i*n));
            i++;
        }
    }
}
