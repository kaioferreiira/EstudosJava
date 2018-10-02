package br.com.estudosjava.javacore.Zcolecoes.Teste;

import br.com.estudosjava.javacore.Hheranca.classes.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    public static void main(String[] args) {

        List <String> nomes =  new ArrayList<String>();
        nomes.add("Lucas Ferreira 1");
        nomes.add("Lucas Ferreira 2");
        nomes.add("Lucas Ferreira 3");

        for(int i = 0; i<nomes.size() ;i++){
            System.out.println(nomes.get(i));
        }
        System.out.println();

        List <String> nomes2 =  new ArrayList<String>();
        nomes.add("Lucas Ferreira 4");
        nomes.add("Lucas Ferreira 5");
        nomes.add("Lucas Ferreira 6");

        nomes.addAll(nomes2);


        for(int i = 0; i<nomes.size() ;i++){
            System.out.println(nomes.get(i));
        }


//        for(String nome: nomes){
//            System.out.println(nome);
//        }
//
//        nomes.add("Rafaeell");
//
//        for(String nome: nomes){
//            System.out.println(nome);
//        }
    }

}
