package br.com.estudosjava.javacore.Gassociacao.classes;

public class Seminario {

    private String titulo;
    private Aluno[] alunos;
    private Professor professor;
    private Local local;

    public Seminario() {
    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public void print(){
        System.out.println("Relatório de Semináios");
        System.out.println("Título: " +  this.titulo);
        System.out.println("Professor Palestrante: " +  this.professor.getNome());
        System.out.println("Local: " + this.local.getRua() + " Rua: " + this.local.getRua() + "Bairro: " + this.local.getBairro() );
        System.out.println("Alunos Participantes");
        for(Aluno aluno: alunos){
            System.out.println(aluno.getNome());
        }
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {

    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
