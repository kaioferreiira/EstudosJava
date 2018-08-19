package br.com.estudosjava.javacore.AIntroducaoclasses.teste;

import br.com.estudosjava.javacore.AIntroducaoclasses.classes.Calculadora;

import java.util.Scanner;

public class CalculadoraTeste {

    public static void main(String[] args) {

        Calculadora p1 = new Calculadora();

        Scanner  leitor =  new Scanner(System.in);
        System.out.println("Digite o valor de a: ");
        p1.a = leitor.nextInt();

        System.out.println("Digite o valor de b: ");
        p1.b = leitor.nextInt();

        int soma;

        p1.soma = p1.a + p1.b;

        System.out.println("o resultado da soma e de : " + p1.soma);

        Calculadora p2 = new Calculadora();
        System.out.println("Digite o valor de a: ");
        p2.a = leitor.nextInt();

        System.out.println("Digite o valor de b: ");
        p2.b = leitor.nextInt();

        p2.soma = p2.a + p2.b;

        System.out.println("o resultado da soma e de : " + p2.soma);


        Calculadora p3 =  new Calculadora();


    }
}
