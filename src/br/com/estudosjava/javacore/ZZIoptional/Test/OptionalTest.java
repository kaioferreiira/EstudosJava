package br.com.estudosjava.javacore.ZZIoptional.Test;

import java.util.Optional;

public class OptionalTest {

    String nome;

    public static void main(String[] args) {

        OptionalTest optionalTest = new OptionalTest();
        if (optionalTest.nome !=  null) {
            System.out.println(optionalTest.nome.toLowerCase());
        }

        Optional<String> optional1 = Optional.of(optionalTest.nome);


    }
}
