package br.com.estudosjava.JavaExerciciosResolvidos.Provas.P1;

import java.util.Scanner;

public class SupermercadoP1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float nescau = 4.5f;
        float suco = 5;
        float presunto = 3f;
        float mussarela = 4.5f;
        float coca = 7.5f;
        float leite = 3.5f;
        int operacao;
        float compra = 0;

        do {
            System.out.println(" Bem vindo ao SUPERMERCADO PAGUE MENOS ");
            System.out.println();
            System.out.println(" [1] Nescau ");
            System.out.println(" [2] Suco ADES ");
            System.out.println(" [3] Presunto ");
            System.out.println(" [4] Muçarela ");
            System.out.println(" [5] Refrigerante Coca-Cola ");
            System.out.println(" [6] Litro de Leite ITAMBÉ ");
            System.out.println(" [7] Finalizar Compra! ");

            System.out.println(" Qual produto deseja comprar ? ");
            operacao = sc.nextInt();

            switch (operacao) {
                case 1:
                    compra = compra + nescau;
                    break;
                case 2:
                    compra = compra + suco;
                    break;
                case 3:
                    compra = compra + presunto;
                    break;
                case 4:
                    compra = compra + mussarela;
                    break;
                case 5:
                    compra = compra + coca;
                    break;
                case 6:
                    compra = compra + leite;
                    break;
                case 7:
                    System.out.println("Finalizando Compra");
                    break;
                default:
                    System.out.println("Operação digitada é invalida! ");
            }
        } while (operacao != 7);

        int tipoPagamento;
        float avista;
        float aprazo;


        System.out.println(" *------*-----*-----*------*");
        System.out.println(" Compra FINALIZADA ");
        System.out.println(" Qual a forma de pagamento que voce deseja ? ");
        System.out.println(" [1] a vista  10% de desconto ");
        System.out.println(" [2] Venda a Prazo 30 dias - acrescimo de 5% ");
        System.out.println(" [3] Venda a Prazo 60 dias - acrescimo de 10% ");
        System.out.println(" [4] Venda a Prazo 60 dias - acrescimo de 15% ");
        System.out.println(" [5] cancelar toda compra ");
        tipoPagamento = sc.nextInt();

        switch (tipoPagamento) {
            case 1:
                avista = compra - (compra * 10 / 100);
                System.out.println(" O valor total da compra a vista é: " + avista);
                break;
            case 2:
                aprazo = compra + (compra * 5 / 100);
                System.out.println(" O valor total da compra com o prazo de 30 dias e: " + aprazo);
                break;
            case 3:
                aprazo = compra + (compra * 10 / 100);
                System.out.println(" O valor total da compra com o prazo de 60 dias e: " + aprazo);
                break;
            case 4:
                aprazo = compra + (compra * 15 / 100);
                System.out.println(" O valor total da compra com o prazo de 90 dias e: " + aprazo);
                break;
            case 5:
                System.out.println(" Compra cancelada ");
        }
    }
}
