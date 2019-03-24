package br.com.estudosjava.javacore.ZZMcompletablefuture.Teste;

import br.com.estudosjava.javacore.ZZMcompletablefuture.Classes.Loja;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class LojaTeste {
    public static void main(String[] args) {
        Loja americanas = new Loja();
        Loja casasBahia = new Loja();
        Loja bestBuy = new Loja();
        Loja wallmart = new Loja();
//        long start = System.currentTimeMillis();
//        System.out.println(americanas.getPreco());
//        System.out.println(casasBahia.getPreco());
//        System.out.println(bestBuy.getPreco());
//        System.out.println(wallmart.getPreco());
//        System.out.println(System.currentTimeMillis() - start +" ms");

        long start = System.currentTimeMillis();
        Future<Double> precoAsync = americanas.getPrecoAsync();
        Future<Double> precoAsync1 = casasBahia.getPrecoAsync();
        Future<Double> precoAsync2 = bestBuy.getPrecoAsync();
        Future<Double> precoAsync3 = wallmart.getPrecoAsync();
        long end = System.currentTimeMillis();
        System.out.println("Tempo de invocação: " + (end - start) + " ms");
        enrolando();
        try {
            System.out.println("Americanas "+precoAsync.get());
            System.out.println("casasBahia "+precoAsync1.get());
            System.out.println("bestBuy "+precoAsync2.get());
            System.out.println("wallmart "+precoAsync3.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("Tempo que levou para pegar o resultado: "+ (System.currentTimeMillis()-start) +" ms");
    }

    private static void enrolando() {
        long soma = 0;
        for (int i = 0; i < 1_000_000; i++) {
            soma += i;
        }
        System.out.println(soma);
    }
}
