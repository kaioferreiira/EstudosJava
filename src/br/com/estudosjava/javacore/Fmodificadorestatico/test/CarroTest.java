package br.com.estudosjava.javacore.Fmodificadorestatico.test;

import br.com.estudosjava.javacore.Fmodificadorestatico.classes.Carro;

public class CarroTest {

    public static void main(String[] args) {

        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("AUDI", 275);
        Carro c3 = new Carro("FIAT", 200);


        c1.imprime();
        c2.imprime();

        System.out.println(" ########### ");

        Carro.setVelocidadeLimite(123);

        c1.imprime();
        c2.imprime();


    }
}
