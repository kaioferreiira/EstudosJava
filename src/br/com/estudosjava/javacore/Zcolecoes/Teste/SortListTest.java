package br.com.estudosjava.javacore.Zcolecoes.Teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListTest {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("akaio 1");
        nomes.add("kaio 22");
        nomes.add("bkaio 3");
        nomes.add("kaio 67");
        nomes.add("ckaio 5");
        nomes.add("kaio 69");
        nomes.add("kaio 7");

        //para odenar usar a classe utilitario Colleciontion
        // e o method sort para listas alfabeticas
        Collections.sort(nomes);
        for (String nome: nomes){
            System.out.println(nome);
        }

        List<Double> numeros = new ArrayList<>();
        numeros.add(53.9);
        numeros.add(53.8);
        numeros.add(53.7);
        numeros.add(53.1);

        Collections.sort(numeros);
        for (Double numero: numeros) {
            System.out.println(numero);
        }

    }
}
