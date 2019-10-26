package br.com.estudosjava.javacore.Zcolecoes.Classes;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {

        Produto p1 = new Produto(13215l, "BLaptop 10", 2000.20);
        Produto p2 = new Produto(551l, "cmonitor 23", 3000.20);
        Produto p3 = new Produto(2151l, "Atv 13", 4000.20);
        Produto p4 = new Produto(2l, "dmouse", 5000.20);
        Produto p5 = new Produto(1l, "teste", 5000.20);
        Produto p6 = new Produto(1l, "teste", 5000.20);


        NavigableSet<Produto> produtoNavigableSet = new TreeSet<>();

        produtoNavigableSet.add(p1);
        produtoNavigableSet.add(p2);
        produtoNavigableSet.add(p3);
        produtoNavigableSet.add(p4);
        produtoNavigableSet.add(p5);
        produtoNavigableSet.add(p6);



        for(Produto p : produtoNavigableSet){
            System.out.println(p);
        }





    }
}
