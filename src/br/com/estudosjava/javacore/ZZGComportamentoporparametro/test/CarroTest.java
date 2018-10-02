package br.com.estudosjava.javacore.ZZGComportamentoporparametro.test;

import br.com.estudosjava.javacore.ZZGComportamentoporparametro.Classes.Carro;
import br.com.estudosjava.javacore.ZZGComportamentoporparametro.interfaces.CarroPredicate;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.function.Predicate;

import static java.util.Arrays.asList;

public class CarroTest {
    private static List<Carro> filtrarCarroPrata(List<Carro> carros) {
        List<Carro> result = new ArrayList<>();
        for (Carro carro : carros) {
            if (carro.getCor().equals("prata"))
                result.add(carro);
        }
        return result;
    }

    private static List<Carro> filtrarCarroPreto(List<Carro> carros) {
        List<Carro> result = new ArrayList<>();
        for (Carro carro : carros) {
            if (carro.getCor().equals("preto"))
                result.add(carro);
        }
        return result;
    }

    private static List<Carro> filtrarCarroVermelho(List<Carro> carros) {
        List<Carro> result = new ArrayList<>();
        for (Carro carro : carros) {
            if (carro.getCor().equals("preto"))
                result.add(carro);
        }
        return result;
    }

    private static List<Carro> filtrarCarroPorCor(List<Carro> carros, String cor) {
        List<Carro> result = new ArrayList<>();
        for (Carro carro : carros) {
            if (carro.getCor().equals(cor))
                result.add(carro);
        }
        return result;
    }

    private static List<Carro> filtrarCarrosUmAnoDeUso(List<Carro> carros) {
        List<Carro> result = new ArrayList<>();
        for (Carro carro : carros) {
            if (carro.getAno() > (Calendar.getInstance().get(Calendar.YEAR) - 1))
                result.add(carro);
        }
        return result;
    }

    public static List<Carro> filtrarCarros(List<Carro> carros, CarroPredicate carroPredicate) {
        List<Carro> result = new ArrayList<>();
        for (Carro carro : carros) {
            if (carroPredicate.test(carro))
                result.add(carro);
        }
        return result;
    }

    public static <T> List<T> filtrar(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                result.add(e);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Carro> carros = asList(new Carro("prata", 2006), new Carro("preto", 2010), new Carro("vermelho", 2018));
        List<Integer> numeros = asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        System.out.println(filtrarCarroPrata(carros));
//        System.out.println(filtrarCarroPreto(carros));
//        System.out.println(filtrarCarroVermelho(carros));
//        System.out.println(filtrarCarroPorCor(carros, "preto"));
//        System.out.println(filtrarCarroPorCor(carros, "prata"));
        System.out.println(filtrarCarrosUmAnoDeUso(carros));

    }
}