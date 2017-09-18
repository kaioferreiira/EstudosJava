package br.com.estudosjava.introducao.controlefluxo;

public class ControleDeFluxo3 {

    public static void main(String[] args) {

        byte dia = 5;

         /* if (dia == 1) {
                System.out.println("Domingo");
            } else if (dia == 2) {
                System.out.println("Segunda");
            } else if (dia == 3) {
                System.out.println("Terça");
            } else if (dia == 4) {
                System.out.println("Quarta");
            } else if (dia == 5) {
                System.out.println("Quinta");
            } else if (dia == 6) {
                System.out.println("Sexta");
            } else (dia == 7) {
                System.out.println("Sabado");
            }*/
        // so pode colocar char, byte, int short, enum , string
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
        }

        char sexo = 'F';

        switch (sexo) {
            case 'F':
                System.out.println("Feminino");
                break;
            case 'M':
                System.out.println("Masculino");
                break;
            default:
                System.out.println("Opção inválida! ");
        }
    }
}
