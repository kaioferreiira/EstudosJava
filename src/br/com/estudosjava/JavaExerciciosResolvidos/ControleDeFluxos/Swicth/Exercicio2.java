package br.com.estudosjava.JavaExerciciosResolvidos.ControleDeFluxos.Swicth;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        float peso;
        double pesoNoPlanta = 0;
        int op;

        Scanner s = new Scanner(System.in);
        DecimalFormat formato  = new DecimalFormat("##.##");

        System.out.println("Digite qual é o seu peso: ");
        peso = s.nextFloat();

        System.out.println("Ecolha qual planeta deseja calcular o seu peso:?");
        System.out.println("1 - Mercurio");
        System.out.println("2 - Venus");
        System.out.println("3 - Marte");
        System.out.println("4 - Jupter");
        System.out.println("5 - Saturno");
        System.out.println("6 - Urano");
        op = s.nextInt();

        switch (op){
            case 1:
                pesoNoPlanta =  (peso/10)*0.37;
                System.out.println("O seu peso no plante Mercurio é: " + formato.format(pesoNoPlanta));
                break;
            case 2:
                pesoNoPlanta =  (peso/10)*0.37;
                System.out.println("O seu peso no plante Mercurio é: " + pesoNoPlanta);
                break;
            case 3:
                pesoNoPlanta =  (peso/10)*0.37;
                System.out.println("O seu peso no plante Mercurio é: " + pesoNoPlanta);
                break;
            case 4:
                pesoNoPlanta =  (peso/10)*0.37;
                System.out.println("O seu peso no plante Mercurio é: " + pesoNoPlanta);
                break;
            case 5:
                pesoNoPlanta =  (peso/10)*0.37;
                System.out.println("O seu peso no plante Mercurio é: " + pesoNoPlanta);
                break;
            case 6:
                pesoNoPlanta =  (peso/10)*0.37;
                System.out.println("O seu peso no plante Mercurio é: " + pesoNoPlanta);
                break;
            default:
                System.out.println("Opção digitada é invalido !!!");
        }

    }

}
