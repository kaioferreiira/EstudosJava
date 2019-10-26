package br.com.estudosjava.javacore.Minterfaces.test;

import br.com.estudosjava.javacore.Minterfaces.classes.Produto;

public class TestProduto {
    public static void main(String[] args) {
        Produto p = new Produto("Monitor", 3, 700);

        p.calculaImposto();

        p.calculaFrete();

        System.out.println(p);
    }
}
