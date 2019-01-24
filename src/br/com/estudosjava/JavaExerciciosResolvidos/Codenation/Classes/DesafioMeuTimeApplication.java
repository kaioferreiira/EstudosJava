package br.com.estudosjava.JavaExerciciosResolvidos.Codenation.Classes;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import br.com.estudosjava.JavaExerciciosResolvidos.Codenation.Interfaces.MeuTimeInterface;

public class DesafioMeuTimeApplication  implements MeuTimeInterface  {


    Map<Long, Time> times = new HashMap<>();
    Map<Long, Jogador> jogadores = new HashMap<>();


    @Override
    public void incluirTime(Long id, String nome, LocalDate dataCriacao, String corUniformePrincipal, String corUniformeSecundario){

        if (times.containsKey(id)) {
            throw  new IllegalArgumentException("br.com.codenation.desafio.exceptions.IdentificadorUtilizadoException");
        }
        Time time = new Time(id, nome, dataCriacao, corUniformePrincipal, corUniformeSecundario);
        times.put(id, time);
    }

    @Override
    public void incluirJogador(Long id, Long idTime, String nome, LocalDate dataNascimento, Integer nivelHabilidade, BigDecimal salario) {

        if (jogadores.containsKey(id)) {
            System.out.println("Jogador ja cadastrado");
            throw new RuntimeException();
        }

        verificaSeTimeExiste(idTime);

        Jogador jogador = new Jogador(id, idTime, nome, dataNascimento, nivelHabilidade, salario);
        jogadores.put(id, jogador);
    }

    public  Time verificaSeTimeExiste(Long idTime){
        if(!times.containsKey(idTime)){
            System.out.println("Time enexistente!");
            throw new RuntimeException();
        }
        return times.get(idTime);
    }


    public Jogador verificaSeJogadorExiste(Long idJogador) {
        if (!(jogadores.containsKey(idJogador))){
//            throw new RuntimeException();
            throw new IllegalArgumentException("");
        }
        return jogadores.get(idJogador);
    }

    @Override
    public void definirCapitao(Long idJogador) {
        System.out.println("Definindo capitão ");
        Jogador jogador =  verificaSeJogadorExiste(idJogador);

        times.get(jogador.getIdTime()).setIdCapitao(idJogador);

    }

    @Override
    public Long buscarCapitaoDoTime(Long idTime) {

        Time time = verificaSeTimeExiste(idTime);
        if(time.getIdCapitao().equals(null)){
            System.out.println("Capitão não encontrado");
            throw new RuntimeException();
        }

        return time.getIdCapitao();
    }

    @Override
    public String buscarNomeJogador(Long idJogador) {

        Jogador  jogador =  verificaSeJogadorExiste(idJogador);

        return jogador.getNome();
    }

    @Override
    public String buscarNomeTime(Long idTime) {
        Time time = verificaSeTimeExiste(idTime);
        return time.getNome();
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

        verificaSeTimeExiste(idTime);

       return jogadores.values().stream()
                .filter(jogador -> jogador.getIdTime().equals(idTime))
                .collect(Collectors.toList())
                .stream()
                .map(Jogador::getId)
                .collect(Collectors.toList());
    }

    @Override
    public Long buscarMelhorJogadorDoTime(Long idTime) {

        verificaSeJogadorExiste(idTime);

        Long id = null;
        Integer nivelHabilidade = 0;

        for (Map.Entry<Long, Jogador> jogador : jogadores.entrySet()) {
            if (jogador.getValue().getNivelHabilidade() >= 0 ) {
                id = jogador.getValue().getId();
                nivelHabilidade = jogador.getValue().getNivelHabilidade();
            }
        }

        Jogador jogadorMaiorHabilidade = jogadores.values().stream()
                .filter(jogador ->  jogador.getNivelHabilidade() > 0)
                .max(Comparator.comparing(Jogador::getNivelHabilidade)).get();
        return  jogadorMaiorHabilidade.getId();
    }

    @Override
    public Long buscarJogadorMaisVelho(Long idTime) {
        verificaSeJogadorExiste(idTime);

        LocalDate dataAtualDia = LocalDate.now();
        Long idMaisVelho = null;
        for (Map.Entry<Long, Jogador> entry : jogadores.entrySet()){
            if (entry.getValue().getDataNascimento().isBefore(dataAtualDia)){
                idMaisVelho =  entry.getValue().getId();
            }
        }

        Jogador jogadorMaisVelho = jogadores.values()
                .stream()
                .filter(j -> j.getIdTime().equals(idTime))
                .max(Comparator.comparing(Jogador::getDataNascimento)).get();


        return jogadorMaisVelho.getId();
    }

    @Override
    public List<Long> buscarTimes() {
        return null;
    }

    @Override
    public List<Long> buscarTopJogadores(Integer top) {
        return null;
    }

    public void imprimeTimes() {
        for (Map.Entry<Long, Time> entry : times.entrySet()) {
            Long  key =  entry.getKey();
            String nomeTIme = entry.getValue().getNome();
            System.out.println("Id chave: " + key + " - Nome Time: " +nomeTIme );
        }
    }

    public void imprimeJogadores() {
        for (Map.Entry<Long, Jogador> entry : jogadores.entrySet()) {
            Long  key =  entry.getKey();
            String nomeJogador = entry.getValue().getNome();
            System.out.println("Id chave: " + key + " - Nome Jogador: " + nomeJogador);
        }
    }

    public void imprimeCapitaoTime() {
        for (Map.Entry<Long, Time> entry : times.entrySet()) {
                Long key = entry.getKey();
                String nomeTIme = entry.getValue().getNome();
                Long capitao = entry.getValue().getIdCapitao();
                System.out.println("Id chave: " + key + " - Nome Time: " + nomeTIme + "  - Capitao: " + capitao);
        }

    }
}

