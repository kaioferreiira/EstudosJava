package br.com.estudosjava.JavaExerciciosResolvidos.ControleDeFluxos.While;

import java.util.Scanner;

public class AchaMes {

    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);

        int mes = 0;
        int entrar = 1;


        while (entrar == 1){

            System.out.println("Digite o  mes que deseja encontrar: ");
            mes = teclado.nextInt();

            switch (mes) {
                case 1:
                    System.out.println("Janeiro");
                    break;
                case 2:
                    System.out.println("Fevereiro");
                    break;
                case 3:
                    System.out.println("Março");
                    break;
                case 4:
                    System.out.println("Abril");
                    break;
                case 5:
                    System.out.println("Maio");
                    break;
                case 6:
                    System.out.println("Junho");
                    break;
                case 7:
                    System.out.println("Julho");
                    break;
                case 8:
                    System.out.println("Agosto");
                    break;
                case 9:
                    System.out.println("Setembro");
                    break;
                case 10:
                    System.out.println("Outubro");
                    break;
                case 11:
                    System.out.println("Novembro");
                    break;
                case 12:
                    System.out.println("Dezembro");
                    break;
                default:
                    System.out.println("Numero inválido!!!");
            }

            System.out.println("Deseja continuar digite 1");
            System.out.println("Deseja sair digite 0");
            entrar = teclado.nextInt();

        }
        System.out.println("Saiu do sistema!!!x");
    }
}
