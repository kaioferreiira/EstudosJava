package br.com.estudosjava.javacore.Hheranca.classes;

import java.util.Objects;

public class Endereco {

    private String rua;
    private String bairro;

    public Endereco() {
    }

    public Endereco(String rua, String bairro) {
        this.rua = rua;
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Endereco endereco = (Endereco) o;
        return Objects.equals(rua, endereco.rua) &&
                Objects.equals(bairro, endereco.bairro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rua, bairro);
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", bairro='" + bairro + '\'' +
                '}';
    }
}


