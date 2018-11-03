package br.com.estudosjava.javacore.Zcolecoes.ArrayList;

import br.com.estudosjava.javacore.Zcolecoes.Classes.Produto;

import java.util.*;

class ProdutoNomeCompator implements Comparator<Produto> {
    @Override
    public int compare(Produto o1, Produto o2) {
        return o1.getId().compareTo(o2.getId());
    }
}

public class SortProdutoTest {

    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();
        Produto p1 = new Produto(13215l, "BLaptop 10", 2000.20);
        Produto p2 = new Produto(551l, "cmonitor 23", 3000.20);
        Produto p3 = new Produto(2151l, "Atv 13", 4000.20);
        Produto p4 = new Produto(1l, "dmouse", 5000.20);
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);

        Collections.sort(produtos, new ProdutoNomeCompator());
//        for(Produto produto: produtos){
//            System.out.println(produto);
//        }

        //Podemos utilizar a implementação coleciontions para Arrays também
        Produto[] produtosArrays = new Produto[4];
        produtosArrays[0] = p1;
        produtosArrays[1] = p2;
        produtosArrays[2] = p3;
        produtosArrays[3] = p4;

        System.out.println(Arrays.toString(produtosArrays));
        Arrays.sort(produtosArrays, new ProdutoNomeCompator());

        for(Produto produto: produtosArrays){
            System.out.println(produto);
        }



    }
}
