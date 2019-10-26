package br.com.estudosjava.javacore.AIntroducaoclasses.teste;

import br.com.estudosjava.javacore.AIntroducaoclasses.classes.MeuBd;

public class MeuBdTeste {

    public static void main(String[] args) {

        MeuBd nomes1 = new MeuBd();
        nomes1.idade = 25;
        nomes1.nome = "Kaio Ferreira";


        MeuBd nomes2 = new MeuBd();
        nomes2.idade = 30;
        nomes2.nome = "João";

        MeuBd nomes3 = new MeuBd();
        nomes3.idade = 15;
        nomes3.nome = "Maria";

        System.out.println(nomes1.nome);
        System.out.println(nomes1.idade);

        System.out.println(nomes2.nome);
        System.out.println(nomes2.idade);

        System.out.println(nomes3.nome);
        System.out.println(nomes3.idade);




    }
}
