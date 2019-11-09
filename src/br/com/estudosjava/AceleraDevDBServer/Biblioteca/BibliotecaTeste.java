package br.com.estudosjava.AceleraDevDBServer.Biblioteca;

import java.time.LocalDate;

import org.junit.Test;

public class BibliotecaTeste {





    @Test
    public void validaInsercaoDeUmNovoLivroNoBanco(){

        //insumos
        Livro livro1 = new Livro();
        livro1.setAnoPublicacao(LocalDate.of(2019,1,1));
        livro1.setNome("Livro do Joao");
        livro1.setDescricao(" livro");
        livro1.setDisponivel(Boolean.TRUE);
        livro1.setQuantidadePaginas(55);

        Autor autor = new Autor();
        livro1.setAutor(autor);

        autor.setNome("Autor livro 1");
        autor.setCpf("12345678912");
        autor.setIdade(25);

        //acoes para salvar
//        bibliotecaValidator.validarCadastroLivro(livro1);
//        bibliotecaValidator.validatCadastroAutor(livro1);




        //validacao de retorno =  experado

    }



}
