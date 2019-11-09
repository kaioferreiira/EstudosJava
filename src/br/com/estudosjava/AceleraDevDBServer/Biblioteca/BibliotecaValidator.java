package br.com.estudosjava.AceleraDevDBServer.Biblioteca;

import br.com.estudosjava.javacore.Gassociacao.classes.Local;

import java.time.LocalDate;

public class BibliotecaValidator {

    public void validarCadastroLivro(Livro livro){

        if (livro.getQuantidadePaginas() <= 50){
            throw new RuntimeException("Livro contem menos que 50 paginas ");
        }

        LocalDate dataNaoPermitida = LocalDate.of(1990,1,1);

        if (livro.getAnoPublicacao().isBefore(dataNaoPermitida)){
            throw new RuntimeException("nao permitido publicações de antes de 1990 ");
        }


    }

    public void validatCadastroAutor(Livro livro){

        if (livro.getAutor() == null){
            throw new RuntimeException("Nao foi cadastrado o Autor");
        }

        if (livro.getAutor().getNome() == null){
            throw new RuntimeException("Nome do autor nao foi cadastrado");
        }

        if (livro.getAutor().getCpf() == null){
            throw new RuntimeException("CPF do autor nao foi cadastrado");
        }


        if (livro.getAutor().getData() == null){
            LocalDate data = LocalDate.of(2000,1,1);
            livro.getAutor().setData(data);
        }

        if (livro.getAutor().getIdade() > 100){
            throw new RuntimeException("O autor não pode ser cadastrado com mais de 100 anos");
        }


        if (livro.getAutor().getCpf().length() > 11 ){
            throw new RuntimeException("CPF INVALIDO ");
        }

    }

}
