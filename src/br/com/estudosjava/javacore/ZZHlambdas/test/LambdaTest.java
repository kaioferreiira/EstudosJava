package br.com.estudosjava.javacore.ZZHlambdas.test;


import br.com.estudosjava.javacore.ZZHlambdas.classes.Carro;
import br.com.estudosjava.javacore.ZZHlambdas.interfaces.CarroPredicate;

public class LambdaTest {
    public static void main(String[] args) {

        //anonima
        //é uma function
        //ela pode ser passado  por ai
        //ela é concisa: resolve em uma linha
        CarroPredicate carroPredicate = new CarroPredicate() {
            @Override
            public boolean test(Carro carro) {
                return carro.getCor().equals("preto");
            }
        };
        System.out.println(carroPredicate.test(new Carro("preto", 2015)));

        CarroPredicate carroPredicate2 =  (Carro carro) -> carro.getCor().equals("preto");

        System.out.println(carroPredicate2.test(new Carro("preto", 2015)));

        //Exemplo Interface Funcional
        Runnable runnable =  new Runnable() {
            @Override
            public void run() {
                System.out.println("Executando Runnable");
            }
        };
        Runnable runnable2 =  () -> System.out.println("dentro do run 2");

        runnable.run();
        runnable2.run();
    }
}
