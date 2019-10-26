package br.com.estudosjava.javacore.ZZGComportamentoporparametro.interfaces;

import br.com.estudosjava.javacore.ZZGComportamentoporparametro.Classes.Carro;

@FunctionalInterface
public interface CarroPredicate {
    boolean test(Carro carro);

    //lambda (parametros) -> <expressao>
    //      (Carro carro) -> <carro.getCor().equals("Verde");>

}
