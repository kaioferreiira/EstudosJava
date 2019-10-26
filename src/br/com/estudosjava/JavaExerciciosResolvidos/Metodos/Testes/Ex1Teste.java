package br.com.estudosjava.JavaExerciciosResolvidos.Metodos.Testes;

import br.com.estudosjava.JavaExerciciosResolvidos.Metodos.Classes.Ex1;

import java.util.Scanner;

public class Ex1Teste {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        double n;
        boolean qualORetorno;
        System.out.println("digite o valor: ");
        n = sc.nextDouble();
        Ex1 ex1 = new Ex1();
        qualORetorno= ex1.descobrePositivo(n);

        System.out.println(qualORetorno);



    }
}
