package br.com.estudosjava.javacore.Eblocodeinicializao.test;

import br.com.estudosjava.javacore.Eblocodeinicializao.classes.Cliente;

public class ClienteTest {

    public static void main(String[] args) {

        Cliente c = new Cliente();

        System.out.println("Valores do array");

        for(int parcela: c.getParcelas()){
            System.out.print(parcela + " " );
        }

    }
}
