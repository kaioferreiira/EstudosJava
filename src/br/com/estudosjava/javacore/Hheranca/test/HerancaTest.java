package br.com.estudosjava.javacore.Hheranca.test;

import br.com.estudosjava.javacore.Hheranca.classes.Endereco;
import br.com.estudosjava.javacore.Hheranca.classes.Funcionario;
import br.com.estudosjava.javacore.Hheranca.classes.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {

        Pessoa p = new Pessoa();

        Funcionario f = new Funcionario();

        p.setNome("0Kaio");
        p.setCpf("13545453");

        Endereco end = new Endereco();
        end.setBairro("Centro");
        end.setRua("Nelson Hungri");

        p.setEndereco(end);

        p.imprime();
    }
}
