package br.com.estudosjava.javacore.ZZIoptional.Test;

import java.util.Optional;

public class OptionalTest {

    String nome = "kaio";
    String sobrenome;


    public static void main(String[] args) {

        OptionalTest optionalTest = new OptionalTest();
        if (optionalTest.nome !=  null) {
            System.out.println(optionalTest.nome.toUpperCase());
        }

        Optional<String> optional1 = Optional.of(optionalTest.nome);
        Optional<String> optional2 = Optional.empty();
        Optional<String> optional3 = Optional.ofNullable(optionalTest.sobrenome);

        //Imprimindo
        System.out.println(optional1);
        System.out.println(optional2);
        System.out.println(optional3);

        //Busca valores optiona
        if (optional2.isPresent()){
            System.out.println(optional2.get());
        }

        System.out.println(optional2.orElse("não existe"));

    }
}
