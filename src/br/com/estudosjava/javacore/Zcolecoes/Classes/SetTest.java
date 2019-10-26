package br.com.estudosjava.javacore.Zcolecoes.Classes;

import java.util.HashSet;
import java.util.Set;

import br.com.estudosjava.javacore.Zcolecoes.Classes.Produto;

public class SetTest {

    public static void main(String[] args) {

        Produto p1 = new Produto(13215l, "BLaptop 10", 2000.20);
        Produto p2 = new Produto(551l, "cmonitor 23", 3000.20);
        Produto p3 = new Produto(2151l, "Atv 13", 4000.20);
        Produto p4 = new Produto(2l, "dmouse", 5000.20);
        Produto p5 = new Produto(1l, "teste", 5000.20);
        Produto p6 = new Produto(1l, "teste", 5000.20);


        Set<Produto> produtoSet = new HashSet<>();
        produtoSet.add(p1);
        produtoSet.add(p2);
        produtoSet.add(p3);
        produtoSet.add(p4);
        produtoSet.add(p5);
        produtoSet.add(p6);



        for(Produto p : produtoSet){
            System.out.println(p);
        }





    }
}
