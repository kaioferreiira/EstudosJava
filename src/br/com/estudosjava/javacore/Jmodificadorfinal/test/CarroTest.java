package br.com.estudosjava.javacore.Jmodificadorfinal.test;

import br.com.estudosjava.javacore.Jmodificadorfinal.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();


        System.out.println(carro1.getVelocidadelimite());
        carro1.getComprador().setNome("kaio  1");
        System.out.println(carro1.getComprador().getNome());

    }
}
