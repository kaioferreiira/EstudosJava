package br.com.estudosjava.javacore.Bintroducaometodos.test;

import br.com.estudosjava.javacore.Bintroducaometodos.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
          /*
        * Cria uma classe estudante com os seguintes atributos:
        * nome, idade, notas: tres notas.
        * metodo imprimir os dados e tirar a média
        * caso a media seja > 6 aprovado senao reprovado.
        *
        * */

        Estudante estudante =  new Estudante();
        estudante.setNome("kaio");

        estudante.setIdade(24);
        double notas[]= {1,2,3.15};
        estudante.setNotas(notas);

        estudante.imprimeDados();
        estudante.tirarMedia();

        System.out.println("nome do cara: " + estudante.getNome());

    }

}
