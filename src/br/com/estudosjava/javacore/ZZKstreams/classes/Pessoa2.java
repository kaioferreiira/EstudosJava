package br.com.estudosjava.javacore.ZZKstreams.classes;

import java.util.Arrays;
import java.util.List;

public class Pessoa2 {

    private String nome;
    private Integer idade;
    private String sexo; //M ou F


    public Pessoa2() {
    }

    public Pessoa2(String nome, Integer idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }


    public static  List<Pessoa2> bancoDeDadosPessoa2(){
     return Arrays.asList(
         new Pessoa2("Kaio",26,"M"),
         new Pessoa2("Lucas",76,"M"),
         new Pessoa2("José",16,"M"),
         new Pessoa2("Maria",4,"F"),
         new Pessoa2("Joana",24,"F")
     );
    }

    @Override
    public String toString() {
        return "Pessoa2{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
