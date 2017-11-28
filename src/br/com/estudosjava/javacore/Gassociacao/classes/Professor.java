package br.com.estudosjava.javacore.Gassociacao.classes;

public class Professor {

    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor() {
    }

    public void print() {
        System.out.println("Nome professor: " + this.nome);
        System.out.println("Especialidade do professor: " + this.especialidade);


        System.out.println("Seminarios Participantes");
        for (Seminario sem : seminarios) {
            System.out.print(sem.getTitulo() + "  ");
        }
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
