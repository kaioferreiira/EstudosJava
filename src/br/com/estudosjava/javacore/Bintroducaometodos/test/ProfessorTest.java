package br.com.estudosjava.javacore.Bintroducaometodos.test;

import br.com.estudosjava.javacore.Bintroducaometodos.classes .Professor;

public class ProfessorTest {

    public static void main(String[] args) {

        Professor prof = new Professor();
        prof.cpf = "123123132";
        prof.matricula = "12331";
        prof.nome = "kaio";
        prof.rg = "mg4 56";

        Professor prof2 = new Professor();
        prof2.cpf = "123123132";
        prof2.matricula = "12331";
        prof2.nome = "Lucas";
        prof2.rg = "sss 56";

        prof.imprimi();
        System.out.println(" ----  -----   -------   ");
        prof2.imprimi();

    }
}
