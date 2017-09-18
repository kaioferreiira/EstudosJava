package br.com.estudosjava.introducao.controlefluxo;

public class ControleDeFluxo2 {
    public static void main(String[] args) {

        double salario = 100;

        if (salario < 1000) {
            salario = (salario + (salario * 0.05));
        } else if (salario >= 1000 && salario < 2000) {
            salario = (salario + (salario * 0.10));
        } else if (salario >= 2000 & salario < 4000) {
            salario = (salario + (salario * 0.15));
        } else {
            salario = (salario + (salario * 0.20));
        }

        System.out.printf("o total e " + salario);
    }
}
