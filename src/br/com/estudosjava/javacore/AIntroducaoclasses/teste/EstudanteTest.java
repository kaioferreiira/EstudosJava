package br.com.estudosjava.javacore.AIntroducaoclasses.teste;

import br.com.estudosjava.javacore.AIntroducaoclasses.classes.Estudante;

public class EstudanteTest {

    public static void main(String[] args) {
        Estudante kaio = new Estudante();

        kaio.nome = "kaio";
        kaio.matricula = "123456789";
        kaio.idade = 25;

        System.out.println(kaio.idade);
        System.out.println(kaio.matricula);
        System.out.println(kaio.nome);

    }
}
