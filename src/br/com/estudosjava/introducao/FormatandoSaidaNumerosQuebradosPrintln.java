package br.com.estudosjava.introducao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class FormatandoSaidaNumerosQuebradosPrintln {

    public static void main(String[] args) {

        float numeroFlutuante1 =  106.326665f;
        double numeroFlutuante2 = 20.56556;

        DecimalFormat numeroFormatado = new DecimalFormat("##.##");

        System.out.println("Meu primeiro número formatado com Println: " + numeroFormatado.format(numeroFlutuante1));
        System.out.println("Meu primeiro número formatado com Println: " + numeroFormatado.format(numeroFlutuante2));

    }
}
