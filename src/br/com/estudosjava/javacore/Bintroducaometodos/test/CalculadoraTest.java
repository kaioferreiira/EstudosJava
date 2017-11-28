package br.com.estudosjava.javacore.Bintroducaometodos.test;

import br.com.estudosjava.javacore.Bintroducaometodos.classes.Calculadora;

public class CalculadoraTest {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

       // calc.somaDoisNumeros();
       // calc.subtraiDoisNumeros();
        //calc.multiplicaDoisNumeros(5,5);

        double result = calc.divideDoisNumeros(22,22 );
        System.out.println(result);

        System.out.println("    -----     " );

        calc.imprimeDoisNumerosDivididos(20,0);

        int[]numeros = {1,2,3,4,5};

        //soma numeros criando um metodo passando um array casual
        calc.somaArray(numeros);

        // somando numeros usando o metodo varArgs do java
        calc.somaVarArgs(1,2,3,4,5);




    }
}
