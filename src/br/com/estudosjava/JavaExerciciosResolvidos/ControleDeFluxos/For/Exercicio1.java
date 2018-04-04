package br.com.estudosjava.JavaExerciciosResolvidos.ControleDeFluxos.For;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner  leitor = new Scanner(System.in);
        int inicio;
        int fim;
        int i;
        System.out.println("Digite o valor inicial");
        inicio =  leitor.nextInt();

        System.out.println("Digite o valor final");
        fim =  leitor.nextInt();

        if(inicio < fim ){

            for (i =inicio; i <= fim; i++){
                System.out.println(i);
            }
        }else {
            for (i = inicio; i >= fim; i--){
                System.out.println(i);
            }
        }

    }
}
