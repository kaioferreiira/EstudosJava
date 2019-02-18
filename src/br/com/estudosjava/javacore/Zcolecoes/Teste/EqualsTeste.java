package br.com.estudosjava.javacore.Zcolecoes.Teste;

import br.com.estudosjava.javacore.Zcolecoes.Classes.CelularColecoes;

public class EqualsTeste {


    public static void main(String[] args) {

        String nome1 = "Kaio";
        String nome2 = new String("Kaio");
        System.out.println(nome1 == nome2);
        System.out.println(nome1.equals(nome2));

        Integer n1 =  5;
        Integer n2 =  new Integer(5);
        System.out.println(n1 == n2);
        System.out.println(n1.equals(n2));

        CelularColecoes c1 = new CelularColecoes("motorola", "123456");
        CelularColecoes c2 = new CelularColecoes("motorola", "123456");
        System.out.println(c1 == c2);
        System.out.println(c2.equals(c1));



    }
}
