package br.com.estudosjava.JavaExerciciosResolvidos.polimorfismo.test;

import br.com.estudosjava.JavaExerciciosResolvidos.polimorfismo.classes.Carneiro;
import br.com.estudosjava.JavaExerciciosResolvidos.polimorfismo.classes.Gato;
import br.com.estudosjava.JavaExerciciosResolvidos.polimorfismo.classes.Vaca;

public class Bichos {

    public static void main(String[] args) {

        Vaca mimosa = new Vaca();
        Gato bichano = new Gato();
        Carneiro barnabe = new Carneiro();

        mimosa.som();
        bichano.som();
        barnabe.som();

    }
}
