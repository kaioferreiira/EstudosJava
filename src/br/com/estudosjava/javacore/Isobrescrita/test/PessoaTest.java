package br.com.estudosjava.javacore.Isobrescrita.test;

import br.com.estudosjava.javacore.Isobrescrita.classes.Pessoa;

public class PessoaTest {

    public static void main(String[] args) {

        Pessoa p = new Pessoa();
        p.setNome("Kaio Ferreira");
        p.setIdade(18);
        System.out.println(p);
    }
}
