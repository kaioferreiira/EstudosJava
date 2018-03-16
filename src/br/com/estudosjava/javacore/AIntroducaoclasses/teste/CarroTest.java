package br.com.estudosjava.javacore.AIntroducaoclasses.teste;

import br.com.estudosjava.javacore.AIntroducaoclasses.classes.Carro;

public class CarroTest {

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Fusca";
        carro.placa = "HTT 4556";
        carro.velocidadeMaxima = 90;

        System.out.println("Placa: " + carro.placa);
        System.out.println("Modelo: " +carro.modelo);
        System.out.println("Velocidade maxima: " + carro.velocidadeMaxima);

        System.out.println("--------------");

        Carro carro2 = new Carro();
        carro2.modelo = "BMW";
        carro2.placa = "FFA 1323";
        carro2.velocidadeMaxima = 220;

        System.out.println("Placa: " + carro2.placa);
        System.out.println("Modelo: " +carro2.modelo);
        System.out.println("Velocidade maxima: " +carro2.velocidadeMaxima);

    }

}
