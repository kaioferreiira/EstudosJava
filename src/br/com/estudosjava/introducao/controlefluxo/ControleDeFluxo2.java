package br.com.estudosjava.introducao.controlefluxo;

import java.util.Scanner;

public class ControleDeFluxo2 {
    public static void main(String[] args) {

        /*
        * */
        double salario;
        String nome;

        Scanner s = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = s.nextLine();

        System.out.println("Digite o seu salario");
        salario =  s.nextDouble();

        if (salario < 1000) {
            salario = (salario + (salario * 0.05));
        } else if (salario >= 1000 && salario < 2000) {
            salario = (salario + (salario * 0.10));
        } else if (salario >= 2000 & salario < 4000) {
            salario = (salario + (salario * 0.15));
        } else {
            salario = (salario + (salario * 0.20));
        }

        System.out.printf("O " + nome + " ira pagar um imposto de: " + salario );
    }
}
