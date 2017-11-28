package br.com.estudosjava.javacore.Dsobrecargametodos.classes;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private String rg;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public Funcionario() {
    }

    public void inicializa(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public void inicializa(String nome, String cpf, double salario, String rg) {
        inicializa(nome, cpf, salario);
        this.rg = rg;
    }

    public void imprime() {
        System.out.println(this.getNome());
        System.out.println(this.getCpf());
        System.out.println(this.getSalario());
        System.out.println(this.getRg());
    }

    public String getRg() {
        return this.rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
