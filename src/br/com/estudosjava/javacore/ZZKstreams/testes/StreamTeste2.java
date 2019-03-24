package br.com.estudosjava.javacore.ZZKstreams.testes;

import java.util.Arrays;
import java.util.List;

public class StreamTeste2 {

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList.stream()
                .filter(s -> s.contains("c"))
                .map(s -> s.toUpperCase())
                .sorted()
                .forEach(System.out::println);

    }
}
