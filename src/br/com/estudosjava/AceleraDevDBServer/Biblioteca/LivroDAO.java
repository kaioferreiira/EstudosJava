package br.com.estudosjava.AceleraDevDBServer.Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class LivroDAO {

    private List<Livro> livrosBanco = new ArrayList<>();

    public List<Livro> saveLivro(Livro livro){

        livrosBanco.add(livro);

        return livrosBanco;
    }

    @Override
    public String toString() {
        return "LivroDAO{" +
                "livrosBanco=" + livrosBanco +
                '}';
    }
}
