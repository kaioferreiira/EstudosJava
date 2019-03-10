package br.com.estudosjava.javacore.ZZIoptional.Classes2;


public class Carro {

    private Seguradora2 seguradora2;
    private String nome;


    public Carro(Seguradora2 seguradora2, String nome) {

        this.seguradora2 = seguradora2;
        this.nome = nome;
    }

    public String getNomeSeguradora(Pessoa p){
        if (p != null){
            Carro carro = p.getCarro();
            if (carro != null){
                Seguradora2 s = carro.seguradora2;
                if (s != null){
                    return s.getNome();
                }
            }
        }
        return "";
    }



    public Seguradora2 getSeguradora2() {
        return seguradora2;
    }

    public void setSeguradora2(Seguradora2 seguradora2) {
        this.seguradora2 = seguradora2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
