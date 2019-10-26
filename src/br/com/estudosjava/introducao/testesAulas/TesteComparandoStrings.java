package br.com.estudosjava.introducao.testesAulas;

import java.util.Scanner;

public class TesteComparandoStrings {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

//        System.out.println("nome 1 :");
//        String nome1 = teclado.nextLine();
//
//        System.out.println("nome 2 :");
//        String nome2 = teclado.nextLine();
//
//        if (nome1.equals(nome2)){
//            System.out.println("deu certo");
//        }

        String parada = "sim";

        while (parada.equals("nao")){
            System.out.println("Deu certo");

            System.out.println("Deseja parar: ");
            parada =  teclado.nextLine();



        }


    }
}
