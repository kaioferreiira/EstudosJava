package br.com.estudosjava.AceleraDevDBServer;

import java.util.Scanner;

public class CaixaATM {

    public static void main(String[] args) {

        Scanner  sc = new Scanner(System.in);
        Cliente cliente = new Cliente();
        cliente.setNome(sc.nextLine());
        cliente.setValorASacar(sc.nextInt());
        Saque saque =  new Saque(cliente);

        System.out.println(saque);



    }
}
