package br.com.estudosjava.javacore.Gassociacao.test;

import br.com.estudosjava.javacore.Gassociacao.classes.Aluno;
import br.com.estudosjava.javacore.Gassociacao.classes.Local;
import br.com.estudosjava.javacore.Gassociacao.classes.Professor;
import br.com.estudosjava.javacore.Gassociacao.classes.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Kaio Ferreira", 24);
        Aluno aluno2 = new Aluno("Lucas Gabriel", 18);

        Seminario sem = new Seminario("Como ser um programador TOP");
        Professor prof = new Professor("Junior", "Força Bruta");
        Local local = new Local("Rua das Araras", "CENTRO");

        aluno.setSeminario(sem);
        aluno2.setSeminario(sem);

        sem.setProfessor(prof);
        sem.setLocal(local);
        sem.setAlunos(new Aluno[]{aluno, aluno2});

        Seminario [] semArray = new Seminario[1];
        semArray [0] = sem;
        prof.setSeminarios(semArray);

        sem.print();



    }
}
