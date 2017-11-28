package br.com.estudosjava.javacore.Bintroducaometodos.test;

import br.com.estudosjava.javacore.Bintroducaometodos.classes.Calculadora;

public class ParametrosTest {

    public static void main(String[] args) {
        System.out.println("Teste de parametros! ");

        Calculadora calc = new Calculadora();
       int num1 =5 ;
       int num2 = 10;

        calc.alteraDoisNumeros(num1,num2);

        System.out.println("Dentro do teste ");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

    }
}
