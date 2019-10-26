package br.com.estudosjava.introducao.operadores;

public class OperadoresDeComparacao {
    public static void main(String[] args) {

        boolean dezMaiorQueVinte = 10 > 20;
        System.out.println("Dez é maior que 20? " + dezMaiorQueVinte);

        boolean dezMaiorOuIgualAVinte = 10 >= 20;
        System.out.println("Dez é maior ou igual a 20? " + dezMaiorOuIgualAVinte);

        boolean dezMenorQueVinte = 10 < 20;
        System.out.println("Dez é menor que 20? " + dezMenorQueVinte);

        boolean dezMenorOuIgualAVinte = 10 <= 20;
        System.out.println("Dez é menor ou igual a 20? " + dezMenorOuIgualAVinte);

        boolean dezIgualAVinte = 10 == 20;
        System.out.println("Dez é igual  a 20? " + dezIgualAVinte);

        boolean dezDiferenteDeVinte = 10 != 20;
        System.out.println("Dez é diferente de 20? " + dezDiferenteDeVinte);

    }
}
