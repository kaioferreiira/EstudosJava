package br.com.estudosjava.javacore.ZZHlambdas.interfaces;

import br.com.estudosjava.javacore.ZZHlambdas.classes.Carro;

@FunctionalInterface
public interface CarroPredicate {
    boolean test(Carro carro);
}
