package br.com.estudosjava.JavaExerciciosResolvidos.ControleDeFluxos.DoWhile;

import java.util.Scanner;

public class CalculaMediaQtdNotas {

    public static void main(String[] args) {
        float media, soma = 0, valor;
        int i=0, quant;

        System.out.println("Informe a quantidade de valores que deseja tirar a média aritmética");
        quant = new Scanner(System.in).nextInt();


        do{
            System.out.println("Informe o valor: ");
            valor = new Scanner(System.in).nextFloat();
            soma = soma + valor;

            i++;
        }while (i <= quant);

        media = soma / quant;

        System.out.println("A média desse números é: " + media);

    }

}
