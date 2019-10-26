package br.com.estudosjava.JavaExerciciosResolvidos.Codenation.Classes;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.estudosjava.JavaExerciciosResolvidos.Codenation.Interfaces.MeuTimeInterface;
import br.com.estudosjava.javacore.ZZKstreams.classes.Jogador;

public class GerenciadorDeTimes implements MeuTimeInterface {

    static Map<Long,Time> bancoDeTimes = new HashMap<>();

    static Map< Long,List<Jogador>> bancoDeJogadores = new HashMap<>();

    @Override
    public void incluirTime(Long id, String nome, LocalDate dataCriacao, String corUniformePrincipal, String corUniformeSecundario) {
        System.out.println("Incluindo time de futebol");
        Time  time = new Time(id, nome, dataCriacao, corUniformePrincipal, corUniformeSecundario);

        if (!bancoDeTimes.containsKey(id)){
            bancoDeTimes.put(id, time);
        }else throw new IllegalArgumentException();

//        for (Map.Entry<Long, Time> entry : bancoDeTimes.entrySet()){
//            System.out.println("Id time:" + entry.getKey() + " -- Nome time: " + entry.getValue().getNome());
//        }
    }

    @Override
    public void incluirJogador(Long id, Long idTime, String nome, LocalDate dataNascimento, Integer nivelHabilidade, BigDecimal salario) {

        Jogador jogador = new Jogador(id,idTime,nome,dataNascimento,nivelHabilidade,salario);


//
//        List<Jogador> listaDeJogadores;
//        listaDeJogadores.add(jogador);
//
//        if (!bancoDeJogadores.containsKey(id)){
//            bancoDeJogadores.put(id, listaDeJogadores);
//        }
//
//        for (Map.Entry<Long, List<Jogador>> entry: bancoDeJogadores.entrySet()){
//            System.out.println("Id chave do jogador: " + entry.getKey());
//            for (Jogador j: entry.getValue()){
//                System.out.println("Id jogado: " + entry.getValue());
//            }
//        }

    }

    @Override
    public void definirCapitao(Long idJogador) {

    }

    @Override
    public Long buscarCapitaoDoTime(Long idTime) {
        return null;
    }

    @Override
    public String buscarNomeJogador(Long idJogador) {
        return null;
    }

    @Override
    public String buscarNomeTime(Long idTime) {
        return null;
    }

    @Override
    public Long buscarJogadorMaiorSalario(Long idTime) {
        return null;
    }

    @Override
    public BigDecimal buscarSalarioDoJogaodor(Long idJogador) {
        return null;
    }

    @Override
    public List<Long> buscarJogadoresDoTime(Long idTime) {
        return null;
    }

    @Override
    public Long buscarMelhorJogadorDoTime(Long idTime) {
        return null;
    }

    @Override
    public Long buscarJogadorMaisVelho(Long idTime) {
        return null;
    }

    @Override
    public List<Long> buscarTimes() {
        return null;
    }

    @Override
    public List<Long> buscarTopJogadores(Integer top) {
        return null;
    }
}
