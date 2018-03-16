package br.com.estudosjava.introducao;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        String n;
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o dia da semana que quer saber: ");
        n = leitor.nextLine();


        switch (n){
            case "um":
                System.out.println("é domingo");
                break;
            case "dois":
                System.out.println("é segunda");
                break;
            case "seis":
                System.out.println("é sexta feira");
                break;

            default:
                System.out.println("numero digitado é incorreto! ");
        }




//        if (n == 1) {
//            System.out.println("É DOMINGO!!!");
//        } else if (n == 2) {
//            System.out.println("É SEGUNDA!!!");
//        } else {
//            System.out.println("Valor digitado é errado!!!");
//        }

    }
}