package br.com.estudosjava.javacore.ZZGComportamentoporparametro.Predicate;

import br.com.estudosjava.javacore.ZZGComportamentoporparametro.Classes.Carro;
import br.com.estudosjava.javacore.ZZGComportamentoporparametro.interfaces.CarroPredicate;

import java.util.Calendar;

public class CarrosDezAnosRecentePredicate implements CarroPredicate {
    @Override
    public boolean test(Carro carro) {
        return carro.getAno() > (Calendar.getInstance().get(Calendar.YEAR) -10);
     }
}
