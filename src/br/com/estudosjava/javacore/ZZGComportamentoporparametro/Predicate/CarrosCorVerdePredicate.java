package br.com.estudosjava.javacore.ZZGComportamentoporparametro.Predicate;

import br.com.estudosjava.javacore.ZZGComportamentoporparametro.Classes.Carro;
import br.com.estudosjava.javacore.ZZGComportamentoporparametro.interfaces.CarroPredicate;

public class CarrosCorVerdePredicate implements CarroPredicate {

    @Override
    public boolean test(Carro carro) {
        return carro.getCor().equals("Verde");
    }
}
