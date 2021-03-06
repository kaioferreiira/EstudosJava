package br.com.estudosjava.javacore.Bintroducaometodos.classes;

public class Calculadora {

    public double somaDoisNumeros(int num1, int num2) {
        double soma =  num1 + num2;
        return soma;
    }

    public double subtraiDoisNumeros(int num1, int num2) {
        double subtrai =  num1 - num2;
        return subtrai;
    }

    public double multiplicaDoisNumeros(int num1, int num2) {
        double multiplica =  num1 + num2;
        return multiplica;
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            return 0;
        }
    }

    public void imprimeDoisNumerosDivididos(double num1, double num2) {
        if (num2 != 0) {
            System.out.println(num1 / num2);
            return;
        }
        System.out.println("impossivel dividir por 0");
    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 30;
        num2 = 40;

        System.out.println("Dentro do altera dois numeros ");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println("soma é : " + soma);
    }

    public  void somaVarArgs(int ... numeros){
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println("soma é : " + soma);
    }
}

