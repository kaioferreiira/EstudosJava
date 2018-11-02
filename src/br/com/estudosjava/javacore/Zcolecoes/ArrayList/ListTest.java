package br.com.estudosjava.javacore.Zcolecoes.ArrayList;

import br.com.estudosjava.javacore.Hheranca.classes.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    static int RESULT = 0;
    public static void main(String[] args) {

        List <String> nomes =  new ArrayList<String>();
        nomes.add("Lucas Ferreira 1");
        nomes.add("Lucas Ferreira 2");
        nomes.add("Lucas Ferreira 3");
        nomes.remove("Lucas Ferreira 1");
        nomes.size();

        List <String> nomes2=  new ArrayList<String>();
        nomes2.add("Lucas Ferreira 4");
        nomes2.add("Lucas Ferreira 5");
        nomes.addAll(nomes2);
        for(int i = 0; i<nomes.size() ;i++){
            System.out.println(nomes.get(i));
        }

        System.out.println();
        List <Integer> numeros =  new ArrayList<>();
        numeros.add(1);
        numeros.add(1);
        numeros.add(1);
        for(int i = 0; i<numeros.size() ;i++){
             RESULT += numeros.get(i);
        }
        System.out.println(RESULT);

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
