package br.com.estudosjava.JavaExerciciosResolvidos.VariaveisTiposPrimitivos.Lista1;

import java.text.DecimalFormat;

public class LitrosGasolina {
    public static void main(String[] args) {

        int litros = 50;
        float preco = (float) 3.50;
        float result =0;

        result = litros/preco;

        System.out.println("Formantando com o Decimal format");
        DecimalFormat dc = new DecimalFormat("0.000");
        System.out.println("O resultado é: " + dc.format(result));

        System.out.println(" ------------");

        System.out.println("Formatando com o printf");
        System.out.printf("o resultado é %.2f: \n",result);

    }
}
