package br.com.estudosjava.Java8PraticoLambdaExpressions.Chapter2.Classes;

public class Usuario {

    private String nome;
    private Integer id;
    private int pontos;
    private boolean moderador;

    public Usuario() {
    }

    public Usuario(Integer id, String nome, int pontos) {
        this.id = id;
        this.nome = nome;
        this.pontos = pontos;
        this.moderador = false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public boolean isModerador() {
        return moderador;
    }

    public void setModerador(boolean moderador) {
        this.moderador = moderador;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
