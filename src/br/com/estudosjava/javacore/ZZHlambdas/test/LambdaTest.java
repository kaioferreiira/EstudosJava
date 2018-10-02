package br.com.estudosjava.javacore.ZZHlambdas.test;


import br.com.estudosjava.javacore.ZZHlambdas.classes.Carro;
import br.com.estudosjava.javacore.ZZHlambdas.interfaces.CarroPredicate;

public class LambdaTest {
    public static void main(String[] args) {

        CarroPredicate carroPredicate = new CarroPredicate() {
            @Override
            public boolean test(Carro carro) {
                return carro.getCor().equals("preto");
            }
        };

        CarroPredicate carroPredicate2 =  (Carro carro) -> carro.getCor().equals("preto");

        System.out.println(carroPredicate.test(new Carro("preto", 2015)));
        System.out.println(carroPredicate2.test(new Carro("preto", 2015)));
    }
}
