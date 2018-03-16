package br.com.estudosjava;

import java.util.Scanner;

public class LendoVariaveisScanner {
    public static void main(String[] args) {

        System.out.println("Vamos lá!!! ");

        Scanner teclado =  new Scanner(System.in);


        int valor = teclado.nextInt();
        double valor2 = teclado.nextDouble();
        float valor3 = teclado.nextFloat();
        byte idadeByte = teclado.nextByte();
        short idadeShort = teclado.nextShort();
        long numeroGrande = teclado.nextLong();
        boolean certo = teclado.hasNextBoolean();
        char caractere = teclado.nextLine().charAt(0);


        System.out.println(valor);
        System.out.println(valor2);
        System.out.println(valor3);
        System.out.println(idadeByte);
        System.out.println(idadeShort);
        System.out.println(numeroGrande);
        System.out.println(certo);
        System.out.println(caractere);
    }
}
