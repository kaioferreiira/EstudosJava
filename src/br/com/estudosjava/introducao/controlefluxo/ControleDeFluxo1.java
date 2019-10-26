package br.com.estudosjava.introducao.controlefluxo;

public class ControleDeFluxo1 {

    public static void main(String[] args) {
        int idade = 10;

        if (idade <= 15) {
            System.out.println("Essa pessoa é uma crinça");
        } else if (idade >= 15 && idade < 18) {
            System.out.println("Essa pessoa é um adolecente");
        } else {
            System.out.println("Essa pessoa é um adulto");
        }
    }
}
