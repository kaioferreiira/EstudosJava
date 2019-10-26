package br.com.estudosjava.javacore.ZZHlambdas.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoLista {

    public static void main(String[] args) {


//        List<String> ls = Arrays.asList("João", "José", "Maria", "Adam", "Kaio", "Lucas");
//
//        Comparator<String> comparator = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//            }
//        };
//
//        Collections.sort(ls, comparator);
//
//        for( String nome : ls ) {
//            System.out.println( nome );
//        }


        List<String> ls2 = Arrays.asList("João", "José", "Maria", "Adam", "Kaio", "Lucas");
        Comparator<String> comparator = (s, t1) -> s.compareTo(t1);
        Collections.sort(ls2,comparator);
        ls2.sort(comparator);

        for( String nome : ls2 ) {
            System.out.println( nome );
        }


    }

}
