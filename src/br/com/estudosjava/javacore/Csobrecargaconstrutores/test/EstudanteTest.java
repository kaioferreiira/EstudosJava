package br.com.estudosjava.javacore.Csobrecargaconstrutores.test;

import br.com.estudosjava.javacore.Csobrecargaconstrutores.classes.Estudante;

public class EstudanteTest {

    public static void main(String[] args) {
        Estudante estudante = new Estudante("1231321" , "kaio ferreira" ,new  double[]{5,7,8});

        estudante.imprime();
    }
}
