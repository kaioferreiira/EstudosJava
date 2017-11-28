package br.com.estudosjava.javacore.Bintroducaometodos.test;

import br.com.estudosjava.javacore.Bintroducaometodos.classes .Professor;

public class ProfessorTest {

    public static void main(String[] args) {

        Professor prof = new Professor();
        prof.cpf = "123123132";
        prof.matricula = "12331";
        prof.nome = "kaio";
        prof.rg = "mg4 56";

        prof.imprimi();

    }
}
