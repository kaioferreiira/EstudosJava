package br.com.estudosjava.javacore.Zcolecoes.ArrayList;

import br.com.estudosjava.javacore.Zcolecoes.Classes.Produto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortProdutoTest {

    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();
        Produto p1 = new Produto(13215l, "Laptop 10", 2000.20);
        Produto p2 = new Produto(551l, "Laptop 23", 3000.20);
        Produto p3 = new Produto(2151l, "Laptop 13", 4000.20);
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);

        Collections.sort(produtos);
        for(Produto produto: produtos){
            System.out.println(produto);
        }
    }
}
