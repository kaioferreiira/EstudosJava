package br.com.estudosjava.JavaExerciciosResolvidos.Provas.P1;

import java.util.Scanner;

public class VendaDePecasCarros {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float porta = 450.5f;
        float vidro = 510;
        float lanterna = 300f;
        float macaneta = 100;
        float farol = 650;
        float retrovisor = 90.5f;
        int operacao;
        float compra = 0;


        do {
            System.out.println(" Bem vindo a Concessionaria Fiat Ponta Porã ");
            System.out.println();
            System.out.println(" [1] Porta");
            System.out.println(" [2] Vidro ");
            System.out.println(" [3] Lanterna ");
            System.out.println(" [4] Maçaneta ");
            System.out.println(" [5] Farol ");
            System.out.println(" [6] Retrovisor ");
            System.out.println(" [7] Finalizar Compra! ");

            System.out.println(" Qual produto deseja comprar ? ");
            operacao = sc.nextInt();

            switch (operacao) {
                case 1:
                    compra = compra + porta;
                    break;
                case 2:
                    compra = compra + vidro;
                    break;
                case 3:
                    compra = compra + lanterna;
                    break;
                case 4:
                    compra = compra + macaneta;
                    break;
                case 5:
                    compra = compra + farol;
                    break;
                case 6:
                    compra = compra + retrovisor;
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
