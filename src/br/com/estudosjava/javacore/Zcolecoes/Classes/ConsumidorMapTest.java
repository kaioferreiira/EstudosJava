package br.com.estudosjava.javacore.Zcolecoes.Classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsumidorMapTest {


    public static void main(String[] args) {

    Consumidor consumidor1 = new Consumidor(1l,"kaio", "123");
    Consumidor consumidor2 = new Consumidor(2l,"lucas", "432");
    Consumidor consumidor3 = new Consumidor(3l,"joao", "098");

    Produto produto1 = new Produto(1l,"picanha", 32.23);
    Produto produto2 = new Produto(2l,"coca lata", 2.23);
    Produto produto3 = new Produto(3l,"chocolate", 10.23);

        List<Produto> produtoListUm = new ArrayList<>();
        produtoListUm.add(produto1);
        produtoListUm.add(produto2);
        produtoListUm.add(produto3);

        List<Produto> produtoListDois = new ArrayList<>();
        produtoListDois.add(produto1);
        produtoListDois.add(produto2);
        produtoListDois.add(produto3);


        Map<Consumidor,List<Produto>> compras = new HashMap<>();

        compras.put(consumidor1, produtoListUm);
        compras.put(consumidor2, produtoListDois);

        for (Map.Entry<Consumidor, List<Produto>> entry : compras.entrySet()){
            System.out.println(" Cliente " +entry.getKey().getNome());

            for (Produto produto:  entry.getValue()){
                System.out.println("Produtos comprados: " + produto.getNome());
            }
        }


    }
}
