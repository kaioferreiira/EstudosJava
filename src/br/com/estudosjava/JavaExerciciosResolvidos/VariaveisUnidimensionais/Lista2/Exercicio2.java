package br.com.estudosjava.JavaExerciciosResolvidos.VariaveisUnidimensionais.Lista2;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {


        boolean logico;
        logico = false;
        int n=0;
        Scanner sc = new Scanner(System.in);

        int [] vet =  new int[5];
        for(int i = 0; i < vet.length; i++){
            vet[i] = sc.nextInt();
        }

        System.out.println("Digite o valor");
        n = sc.nextInt();

        for(int i = 0; i < vet.length; i++){

            if(n  == vet[i]) {
                logico = true;
            }
        }

        if(logico == true){
            System.out.println("elemento encontrado! ");
        }else {
            System.out.println("elemento não encontrado!");
        }
    }
}
