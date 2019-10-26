package br.com.estudosjava.JavaExerciciosResolvidos.Provas.P2.Testes;

import br.com.estudosjava.JavaExerciciosResolvidos.Provas.P2.Classes.Recuperacao;

public class RecuperacaoTeste {

    public static void main(String[] args) {


        /*O instituto federal do mato grosso do sul  ira premiar 3 estudantes de escolas diferentes do seu estado.
        Esses estudantes estao correndo o premio de melhor aluno com aproveitamento de 3 notas, pontualidade, disciplina e
                esforco;
        Para realizar a premiação o IFMS necessita de um sistema que contenha as seguintes informações dos alunos: nome, cidade onde mora, curso que faz
        qual escola estuda, nota para  sua disciplina, nota para sua pontualidade e nota para seu esforço.

        Crie um metodo com passagem de parametros e sem retorno para imprimir as informações dos 3 candidatos finais.
        Exemplo:


        Crie um metodo com  passagem de parametros e com retorno que envie a as 3 notas de cada aluno( disciplina, pontualidade, esforço) e calcule a sua media;

       Crie um metodo com passagem de parametros e com retorno que envie as 3 medias calculadas e retorne o candidato vencedor.
        */

        double mediaAluno1;

        Recuperacao aluno1 = new Recuperacao();
        aluno1.nome = "Kaio Ferreira";
        aluno1.cidade = "Ponta Porã";
        aluno1.curso = "Informatica";
        aluno1.escola = "IFMS";
        aluno1.disciplina = 9;
        aluno1.pontualidade = 5.6;
        aluno1.esforco = 8.7;
        aluno1.imprimeDados(aluno1.nome, aluno1.escola, aluno1.curso, aluno1.cidade, aluno1.pontualidade, aluno1.disciplina, aluno1.esforco);
        mediaAluno1 = aluno1.calculaMedia(aluno1.disciplina, aluno1.esforco, aluno1.pontualidade);

        System.out.println();
        double mediaAluno2;
        Recuperacao aluno2 = new Recuperacao();
        aluno2.nome = "kaio";
        aluno2.cidade = "Ponta pora";
        aluno2.curso = "informatica";
        aluno2.escola = "ifms";
        aluno2.disciplina = 5;
        aluno2.pontualidade = 5;
        aluno2.esforco = 5;
        aluno2.imprimeDados(aluno2.nome, aluno2.escola, aluno2.curso, aluno2.cidade, aluno2.pontualidade, aluno2.disciplina, aluno2.esforco);
        mediaAluno2 = aluno2.calculaMedia(aluno2.disciplina, aluno2.esforco, aluno2.pontualidade);


        System.out.println();
        double mediaAluno3;
        Recuperacao aluno3 = new Recuperacao();
        aluno3.nome = "kaio";
        aluno3.cidade = "Ponta pora";
        aluno3.curso = "informatica";
        aluno3.escola = "ifms";
        aluno3.disciplina = 5;
        aluno3.pontualidade = 5;
        aluno3.esforco = 5;
        aluno3.imprimeDados(aluno3.nome, aluno3.escola, aluno3.curso, aluno3.cidade, aluno3.pontualidade, aluno3.disciplina, aluno3.esforco);
        mediaAluno3 = aluno3.calculaMedia(aluno3.disciplina, aluno3.esforco, aluno3.pontualidade);

        double vencedor;
        vencedor = aluno1.calculaVencedor(mediaAluno1, mediaAluno2, mediaAluno3);

        System.out.println();

        if (vencedor == mediaAluno1) {
            System.out.println("Parabéns: " + aluno1.nome);
            System.out.println("Você é o vencedor do premio Mato Grosso do Sul 2018");
            System.out.println("Com uma média de: " + mediaAluno1);
            System.out.println("Da escola " + aluno1.escola);
            System.out.println("Do curso " + aluno1.curso);
            System.out.println("Da cidade " + aluno1.cidade);
        } else if (vencedor == mediaAluno2) {
            System.out.println("Parabén: " + aluno2.nome);
            System.out.println("Você é o vencedor do premio Mato Grosso do Sul 2018");
            System.out.println("Com uma média de: " + mediaAluno2);
            System.out.println("Da escola " + aluno2.escola);
            System.out.println("Do curso " + aluno2.curso);
            System.out.println("Da cidade " + aluno2.cidade);
        } else {
            System.out.println("Parabén: " + aluno2.nome);
            System.out.println("Você é o vencedor do premio Mato Grosso do Sul 2018");
            System.out.println("Com uma média de: " + mediaAluno2);
            System.out.println("Da escola " + aluno2.escola);
            System.out.println("Do curso " + aluno2.curso);
            System.out.println("Da cidade " + aluno2.cidade);
        }

    }
}
