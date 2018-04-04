package br.com.estudosjava.introducao.testesAulas;

import java.util.Scanner;

public class FormatandoSaidaNumerosQuebradosPrintf {


    public static void main(String[] args) {

        String nome = "Kaio Ferreira";
        int numeroInteiro = 10;
        float numeroFlutuante1 = 10.5f;
        double numeroFlutuante2 = 20.5;

        System.out.printf("O meu nome é: %s, numero inteiro é: %d, numero float e: %.2f e o numemero double é %.2f", nome, numeroInteiro, numeroFlutuante1, numeroFlutuante2);
    }

}
