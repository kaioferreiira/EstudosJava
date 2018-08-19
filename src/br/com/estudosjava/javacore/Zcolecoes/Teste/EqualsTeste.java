package br.com.estudosjava.javacore.Zcolecoes.Teste;

import br.com.estudosjava.javacore.Zcolecoes.Classes.CelularColecoes;

public class EqualsTeste {


    public static void main(String[] args) {

        CelularColecoes c1 = new CelularColecoes("motorola", "123456");
        CelularColecoes c2 = new CelularColecoes("motorola", "123456");

        System.out.println(c1 == (c2));
        System.out.println(c1.equals(c2));

    }
}
