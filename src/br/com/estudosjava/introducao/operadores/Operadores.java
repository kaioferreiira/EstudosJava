package br.com.estudosjava.introducao.operadores;

public class Operadores {

    public static void main(String[] args) {

        int salario = 2000;

        // = -= += *= /= %=
        //salario = salario + 500;
        salario += 500;
        System.out.println(" O salario soma : " + salario);

        //salario = salario - 100;
        salario -= 100;
        System.out.println(" O salario subtrair: " + salario);

        //salario = salario / 10;
        salario /= 10;
        System.out.println(" O salario dividir: " + salario);

        //salario = salario * 1000;
        salario *= 1000;
        System.out.println(" O salario multiplicar : " + salario);

        //salario = salario % 2;
        salario %= 2;
        System.out.println(" O resto é: " + salario);
    }
}
