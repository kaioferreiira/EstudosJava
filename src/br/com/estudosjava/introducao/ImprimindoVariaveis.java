package br.com.estudosjava.introducao;

public class ImprimindoVariaveis {
    /***
     *Esse é o main do projeto
     * @param args parametro de entrada do metodo main
     */
    public static void main(String[] args) {
        System.out.println("Vamos lá!!! ");
        int valor = 10;
        double valor2 = 20;
        float valor3 = 30;
        boolean certo = true;
        char charactere = 'A';
        byte idadeByte = 12;
        short idadeShort = 5656;
        long numeroGrande = 1000L;

        String nome;
        String endereco;
        String telefone;

        nome = "kaio ferreira";
        endereco = "centro";
        telefone = "(67) 9 9971-7250";

        System.out.println("nome e  " + nome + "endeco: " + endereco + "telefone   " + telefone);
    }
}
