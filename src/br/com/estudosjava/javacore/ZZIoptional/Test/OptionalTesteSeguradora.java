package br.com.estudosjava.javacore.ZZIoptional.Test;

import br.com.estudosjava.javacore.ZZIoptional.Classes.Pessoa;
import br.com.estudosjava.javacore.ZZIoptional.Classes.Seguradora;
import br.com.estudosjava.javacore.ZZIoptional.Classes2.Carro;
import br.com.estudosjava.javacore.ZZIoptional.Classes2.Seguradora2;

import java.util.Optional;

public class OptionalTesteSeguradora {
//
//    public static void main(String[] args) {
//
//    Seguradora seguradora = new Seguradora("Kaio seguradora");
//    Carro carro = new Carro(null, "audi");
//
//    Pessoa p = new Pessoa(carro, "Kaio");
//    }
//
//    //COM OPTIONAL
//    public static String  getNomeSeguradora(Optional<Pessoa> p ){
//        return p.flatMap(Pessoa::getCarro)
//                .flatMap(Carro::getNomeSeguradora)
//                .map(Seguradora::getNome)
//                .orElse("não existe seguradora");
//    }



    //SEM OPTIONAL
    private  static  String obterNomeSeguradora(Seguradora seguradora){
        String  nome = null;
        if(seguradora.getNome() != null){
//            nome = seguradora.getNome();
        }
        return nome;
    }
}
