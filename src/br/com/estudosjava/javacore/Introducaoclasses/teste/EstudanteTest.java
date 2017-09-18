package br.com.estudosjava.javacore.Introducaoclasses.teste;

import br.com.estudosjava.javacore.Introducaoclasses.classes.Estudante;

public class EstudanteTest {

    public static void main(String[] args) {
        Estudante kaio = new Estudante();

        kaio.nome = "kaio";
        kaio.matricula = "1212";
        kaio.idade = 24;

        System.out.println(kaio.idade);
        System.out.println(kaio.matricula);
        System.out.println(kaio.nome);

    }
}
