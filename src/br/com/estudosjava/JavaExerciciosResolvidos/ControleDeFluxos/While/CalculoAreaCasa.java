package br.com.estudosjava.JavaExerciciosResolvidos.ControleDeFluxos.While;

import java.util.Scanner;

public class CalculoAreaCasa {
    public static void main(String[] args) {


        double total = 0, area, largura, comprimento;
        String nome;
        String continua =  "s";
        Scanner teclado = new Scanner(System.in);

        while (continua == "s") {
           /* System.out.println("Nome do comodo: ");
            nome = teclado.nextLine();
            System.out.println("Largura: ");
            largura = teclado.nextFloat();
            System.out.println("Comprimento: ");
            comprimento = teclado.nextFloat();
            area = largura * comprimento;
            System.out.println("Area do(a) " + nome + " = " + area);
            total = total + area;*/

            System.out.println("Entrou no laço");

            System.out.println("Outro cômodo? (sim/nao): ");
            continua = teclado.nextLine();

            System.out.println(continua);
        }
        System.out.println("Area total da casa = " + total);


    }
}

