package br.com.estudosjava.Java8;

import java.util.Arrays;
import java.util.List;

public class BaseMinimum {

    public static void main(String[] args) {

        List<String> palavras = Arrays.asList("rodrigo", "paulo", "kaio", "lucas", "caelum");
        List<Integer> letras = Arrays.asList(9,8,7,5,3,2,1);

////        Ordenando as coleções strings
//        palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
//        palavras.forEach(s -> System.out.println(s));
//
////        Ordenando numeros
//        letras.sort((n,n2)-> Integer.compare(n, n2));
//        letras.forEach(System.out::println);
//
//        //Adicionando streams
//        //Filtrando coleções Java8
//        palavras.stream().filter(s -> s.length() < 6).forEach(System.out::println);

        //Utilizando o map
        //mapeando tamanho de cada nome
//        Stream<Integer> stream = palavras.stream().map(String::length);
//        stream.forEach(System.out::println);

        //Mapeando para Int
//        IntStream intStream = palavras.stream().mapToInt(String::length);
//        intStream.forEach(System.out::println);


    }
}
