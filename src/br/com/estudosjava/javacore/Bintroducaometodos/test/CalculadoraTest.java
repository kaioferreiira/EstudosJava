package br.com.estudosjava.javacore.Bintroducaometodos.test;

import br.com.estudosjava.javacore.Bintroducaometodos.classes.Calculadora;

    public class CalculadoraTest {

        public static void main(String[] args) {
            Calculadora calc = new Calculadora();


            double recebeRetornoSoma;
            double recebeRetornoSubtrai;
            double recebeRetornoMultiplica;
            double recebeRetornoDivide;

            recebeRetornoSoma = calc.somaDoisNumeros(5, 5);
            recebeRetornoSubtrai = calc.subtraiDoisNumeros(5, 3);
            recebeRetornoMultiplica = calc.multiplicaDoisNumeros(5, 5);
            recebeRetornoDivide = calc.divideDoisNumeros(5, 6);

            System.out.println("Imprimindo soma: " + recebeRetornoSoma);
            System.out.println("Imprimindo subtração: " + recebeRetornoSubtrai);
            System.out.println("Imprimindo multiplicação: " + recebeRetornoMultiplica);
            System.out.println("Imprimindo divisão: " + recebeRetornoDivide);


//        double result = calc.divideDoisNumeros(22,22 );
//        System.out.println(result);
//
//        System.out.println("    -----     " );
//
//        calc.imprimeDoisNumerosDivididos(20,0);
//
//        int[]numeros = {1,2,3,4,5};
//
//        //soma numeros criando um metodo passando um array casual
//        calc.somaArray(numeros);
//
//        // somando numeros usando o metodo varArgs do java
//        calc.somaVarArgs(1,2,3,4,5);


    }
}
