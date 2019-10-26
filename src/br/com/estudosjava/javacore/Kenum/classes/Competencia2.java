package br.com.estudosjava.javacore.Kenum.classes;

public enum Competencia2 {

    ZERO("0"),
    UM("20"),
    DOIS("40"),
    TRES("60"),
    QUATRO("80"),
    CINCO("100");

    private String nota;


    Competencia2(String nota) {
        this.nota = nota;
    }

    public String getNota() {
        return nota;
    }
}
