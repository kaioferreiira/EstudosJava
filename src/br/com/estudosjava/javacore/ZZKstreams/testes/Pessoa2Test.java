package br.com.estudosjava.javacore.ZZKstreams.testes;

import br.com.estudosjava.javacore.ZZKstreams.classes.Pessoa2;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pessoa2Test  extends  Pessoa2{

    public static void main(String[] args) {


        List<Pessoa2> pessoas = bancoDeDadosPessoa2();

        Stream<Pessoa2> strem = pessoas.stream();
        //pegar a quantidade de pessoas do sexo feminino
        long  countPessoaF =  strem.filter(p -> p.getSexo().equals("F")).count();
        //System.out.println(countPessoaF);


        List<Pessoa2> pessoa2List = pessoas.stream()
                                            .filter( p -> p.getSexo().equals("M"))
                                            .collect(Collectors.toList());
        pessoa2List.forEach(System.out::println);


        List<String> nomes = pessoas.stream()
                                    .filter(p -> p.getSexo().equals("F"))
                                    .map(p -> p.getNome().toUpperCase())
                                    .collect(Collectors.toList());

        nomes.forEach(System.out::println);



//        List<Pessoa2> pessoa2List2 = pessoas.stream()
//                .filter( p -> p.getSexo().equals("M"))
//                .map(p ->  new Pessoa2(p.getNome(), p.getIdade(),p.getSexo()))
//                .collect(Collectors.toList());
//
//        pessoa2List2.forEach(System.out::println);


        List<Pessoa2> pessoas2 = bancoDeDadosPessoa2();

//pessoa mais nova com min()
        Optional<Pessoa2> nova = pessoas.parallelStream().min((pessoa2, t1) -> pessoa2.getIdade().compareTo(t1.getIdade()));
//        Optional<Pessoa2> nova2 = pessoas.stream().min(Comparator.comparing(p -> p.getIdade()));

//mais velha com max()
        Optional<Pessoa2> velha = pessoas.parallelStream().max((p1, p2) -> p1.getIdade().compareTo(p2.getIdade()));
//imprimir as idades no console
        System.out.println(nova.get().getIdade());
        System.out.println(velha.get().getIdade());










    }

}
