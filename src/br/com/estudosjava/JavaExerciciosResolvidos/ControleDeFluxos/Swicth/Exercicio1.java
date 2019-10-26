package br.com.estudosjava.JavaExerciciosResolvidos.ControleDeFluxos.Swicth;

import java.util.Scanner;

public class Exercicio1 {

    /*Faça um algoritmo em Java que simule os paramtros de uma calculadora básica, realizar a soma, multiplicação,
    subtração e divisão de dois números informados pelo usuário.
*/
    public static void main(String[] args) {

        float a;
        float b;
        double resultado = 0;
        int op;

        Scanner s = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        a = s.nextFloat();
        System.out.println("Digite o segundo numero: ");
        b = s.nextFloat();

        System.out.println("Qual operação deseja realizar?");
        System.out.println("1 - soma");
        System.out.println("2 - multiplicação");
        System.out.println("3 - subtração");
        System.out.println("4 - divisão");
        op = s.nextInt();

        switch (op){
            case 1:
                resultado =  a + b;
                break;
            case 2:
                resultado =  a * b;
                break;
            case 3:
                resultado =  a - b;
                break;
            case 4:
                resultado =  a / b;
                break;
            default:
                System.out.println("Opção digitada é invalido !!!");
        }

        System.out.println("O resultado da operação é: " + resultado);
    }
}
