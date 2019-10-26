package br.com.estudosjava.introducao.operadores;

import java.util.Scanner;

public class EntradasPeloTecladoScanner {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);

        int num1;
        float num2;
        float result;

        System.out.println("Digite o valor do número 1: ");
        num1 = entrada.nextInt();

        System.out.println("Digite o valor do numero 2: ");
        num2 = entrada.nextFloat();

        System.out.println();


        System.out.println(num1 + num2);
    }
}
