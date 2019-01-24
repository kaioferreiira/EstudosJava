package br.com.estudosjava.javacore.ZZKstreams.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.estudosjava.javacore.ZZKstreams.classes.Pessoa;

public class StreamTest {

    //pegar os tres primeiros nomes com < de 25 anos ordenados pelo nome

    public static void main(String[] args) {

        //INICIO COM JAVA 7
        List<Pessoa> pessoas = Pessoa.bancoDeDados();
        //ORGANIZANDO AS PESSOAS
        //expression anonima
        /*
        Collections.sort(pessoas, new Comparator<Pessoa>() {
            @Override
            public int compare(Pessoa o1, Pessoa o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });
        */
        //expression anonima lambda
        Collections.sort(pessoas, (o1, o2) -> o1.getNome().compareTo(o2.getNome()));
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }
        System.out.println();
        //pessoas < 25 anos  e as 3 primeiras
        List<String> nomes = new ArrayList<>();
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getIdade() < 25) {
                nomes.add(pessoa.getNome());
                if (nomes.size() >= 3)
                    break;
            }
        }
        System.out.println(nomes);
        //FIM COM JAVA 7
        //INICIO JAVA 8 STREM

//        List<String> nomes2 = pessoas.stream()
//                .filter(p -> p.getIdade() < 25 ) //filtrando dados pelo nome
//                .sorted(Comparator.comparing(Pessoa::getNome)) //ordenando dados pelo nome
//                .limit(3) //limitando ao maximo 3 pessoas
//                .map(Pessoa::getNome)//retornando a coleção, o map pega um valor e retorna outro.
//                .collect(Collectors.toList());  //depois que pegar o nome das pessoas cria uma lista com essa coleção, coleta e joga em uma lista
//
//        System.out.println(nomes2);

        long nomes3 = pessoas
                .stream()
                .filter(p -> p.getIdade() < 25 ) //filtrando dados pelo nome
                .map(Pessoa::getNome)//retornando a coleção, o map pega um valor e retorna outro.
                .count();

        System.out.println(nomes3);

    }


}
