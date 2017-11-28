package br.com.estudosjava.javacore.AIntroducaoclasses.teste;

import br.com.estudosjava.javacore.AIntroducaoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        //crie os seguintes atributos: nome, matricula, rg, cpf
        // crie uma classe de teste para preencher e imprimir os dados

        Professor professor1 = new Professor();

        professor1.cfp = "102.982.646-33";
        professor1.matricula = "2361852";
        professor1.nome = "Kaio ferreira";
        professor1.rg = "mg 16.877.845";

        System.out.println(professor1.nome);
        System.out.println(professor1.cfp);
        System.out.println(professor1.matricula);
        System.out.println(professor1.rg);
    }
}
