package br.com.estudosjava.introducao.controlefluxo;

import java.util.Scanner;

public class ControleDeFluxo3 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int dia = 0;

        System.out.println("Digite um numero para encontrar o seu dia: ");
        dia = leitor.nextInt();

//        if (dia == 1) {
//            System.out.println("Domingo");
//        } else if (dia == 2) {
//            System.out.println("Segunda");
//        } else if (dia == 3) {
//            System.out.println("Terça");
//        } else if (dia == 4) {
//            System.out.println("Quarta");
//        } else if (dia == 5) {
//            System.out.println("Quinta");
//        } else if (dia == 6) {
//            System.out.println("Sexta");
//        } else{
//            System.out.println("Sabado");
//        }


        // so pode colocar char, byte, int short, enum , string
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Número digitado é inválido!!!");
                break;
        }
//
//        char sexo = 'F';
//
//        switch (sexo) {
//            case 'F':
//                System.out.println("Feminino");
//                break;
//            case 'M':
//                System.out.println("Masculino");
//                break;
//            default:
//                System.out.println("Opção inválida! ");
//        }
    }
}
