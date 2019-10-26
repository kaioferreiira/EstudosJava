package br.com.estudosjava.JavaExerciciosResolvidos.ControleDeFluxos.For;

import java.util.Scanner;

public class CalculoMediaQtdNotas {

    public static void main(String[] args) {
        float media, soma = 0, valor;
        int i, quant;

        System.out.println("Informe a quantidade de valores que deseja tirar a média aritmética");
        quant = new Scanner(System.in).nextInt();
        for (i = 1; i <= quant; i++) {
            System.out.println("Informe o " + i + "º valor");
            valor = new Scanner(System.in).nextFloat();
            soma = soma + valor;
        }
        media = soma / quant;
        System.out.println("A média desse números é: " + media);

    }

}
