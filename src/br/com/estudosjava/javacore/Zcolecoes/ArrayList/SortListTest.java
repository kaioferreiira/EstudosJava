package br.com.estudosjava.javacore.Zcolecoes.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListTest {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("kaio 1");
        nomes.add("kaio 2");
        nomes.add("kaio 3");
        nomes.add("kaio 4");
        nomes.add("kaio 5");
        nomes.add("kaio 6");
        nomes.add(0,"kaio 7");

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
