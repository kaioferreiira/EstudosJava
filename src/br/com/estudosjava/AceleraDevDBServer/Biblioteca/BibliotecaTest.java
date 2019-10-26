package br.com.estudosjava.AceleraDevDBServer.Biblioteca;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class BibliotecaTest {

    private static Biblioteca biblioteca = new Biblioteca();


    public static void main(String[] args) {


        Livro livro1 = new Livro();
        livro1.setAnoPublicacao(LocalDate.of(2019,1,1));
        livro1.setNome("Livro do Joao");
        livro1.setDescricao("fhdhsdfjdsffsd");
        livro1.setDisponivel(Boolean.TRUE);
        livro1.setQuantidadePaginas(55);

        Autor autor = new Autor();
        livro1.setAutor(autor);

        autor.setNome("Autor livro 1");
        autor.setCpf("12345678912");
        autor.setIdade(25);

        biblioteca.cadastrarLivro(livro1);
        biblioteca.cadastrarAutor(livro1);


        //CHAMAR DAO E SALVAR LIVRO NO BANCO
        LivroDAO livroDAO = new LivroDAO();
        List<Livro> listaLivrosBanco = livroDAO.saveLivro(livro1);


        System.out.println(listaLivrosBanco);

    }
}
