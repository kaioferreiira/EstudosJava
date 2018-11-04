package br.com.estudosjava.javacore.ZZHlambdas.test;

import br.com.estudosjava.introducao.arrays.Arrays1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaTest2 {

    public static void main(String[] args) {
        //USANDO A INTERFACE CONSUMER
        forEach(Arrays.asList("Kaio", "Estudos interface consumer"), (String s) -> System.out.println(s));

        //usando o interface Function, ela recebe dois tipo passa um e retornaa outro, podemos pegar o tamnho de cada elemento.
        List<Integer> list = map(Arrays.asList("Kaio", "Estudos interface consumer"),(String s) -> s.length()) ;
        System.out.println(list);
    }


    public static <T> void forEach(List<T> lista, Consumer<T> c) {
        for (T e : lista) {
            c.accept(e);
        }
    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> f) {
        List<R> result = new ArrayList<>();
        for (T e : list) {
            result.add(f.apply(e));
        }
        return result;
    }
}
