package br.com.estudosjava.javacore.Fmodificadorestatico.test;


import br.com.estudosjava.javacore.Fmodificadorestatico.classes.Cliente;

public class ClienteTest {

    public static void main(String[] args) {

        Cliente c = new Cliente();

        System.out.println("Valores do array");

//        for(int parcela: c.getParcelas()){
//            System.out.print(parcela + " " );
//        }

        System.out.println("Tamanho : " + Cliente.getParcelas().length);
        System.out.println("Tamanho : " + Cliente.getParcelas().length);
        System.out.println("Tamanho : " + Cliente.getParcelas().length);
    }
}
