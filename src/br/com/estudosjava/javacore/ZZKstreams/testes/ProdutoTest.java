package br.com.estudosjava.javacore.ZZKstreams.testes;

import br.com.estudosjava.javacore.ZZKstreams.classes.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ProdutoTest {

    private static List<Produto> listaDeProdutos = new ArrayList<>();

    public static void main(String[] args) {

        //ADICIONANDO PRODUTOS NA LISTA
        listaDeProdutos.add(new Produto(1, "HP Laptop", 25000f,"HP"));
        listaDeProdutos.add(new Produto(2, "Dell Laptop", 30000f, "DELL"));
        listaDeProdutos.add(new Produto(3, "Lenovo Laptop", 28000f, "Lenovo"));
        listaDeProdutos.add(new Produto(4, "Sony Laptop", 28000f, "Sony"));
        listaDeProdutos.add(new Produto(5, "Apple Laptop", 90000f, "Apple"));

        pegaProdutosMaioresQueVinteCincoMill();
        somaPrecoTodosElementos();
        encontraMaioPreco();
        encontraMenorPreco();
        convertListParaMap(listaDeProdutos);
        convertListParaSet(listaDeProdutos);

    }

    public static List<Produto> pegaProdutosMaioresQueVinteCincoMill(){

        List<Produto> maiores = listaDeProdutos.stream()
                                                .filter(produto -> produto.getPreco() > 25000)
                                                .map(produto -> new Produto(produto.getId(),produto.getNome(), produto.getPreco(), produto.getFabricante()))
                                                .collect(Collectors.toList());
        maiores.forEach(System.out::println);
        return maiores;
    }

    public static Double somaPrecoTodosElementos(){
        Double valorTotal = listaDeProdutos.stream().collect(Collectors.summingDouble(produto -> produto.getPreco()));
        System.out.println("Valor Total: " + valorTotal);
        return valorTotal ;
    }


    public static Produto encontraMaioPreco(){
        Produto maiorPreco  =  listaDeProdutos.stream()
                                                .max((produto1, produto2) -> produto1.getPreco() > produto2.getPreco() ? 1 : -1).get();
        return maiorPreco ;
    }

    public static Produto encontraMenorPreco(){
        Produto maiorPreco  =  listaDeProdutos.stream()
                .min((produto1, produto2) -> produto1.getPreco() > produto2.getPreco() ? 1 : -1).get();
        return maiorPreco ;
    }

    public static Set<Produto> convertListParaSet(List<Produto> produtoList) {

        Set<Produto> produtoListSet = listaDeProdutos.stream().collect(Collectors.toSet());

        return produtoListSet;
    }
    public static Map<Integer, Produto> convertListParaMap(List<Produto> produtoList){

        Map<Integer, Produto> mapListProdutos = produtoList.stream()
                                                            .collect(Collectors.toMap(p -> p.getId(), p ->  new Produto(p.getId(),p.getNome(),p.getPreco(),p.getFabricante())));
        return mapListProdutos;
    }


}
