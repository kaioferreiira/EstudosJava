package br.com.estudosjava.Java8PraticoLambdaExpressions.Chapter2.Classes;

import java.util.function.Consumer;

public class Mostrador implements Consumer<Usuario> {
    @Override
    public void accept(Usuario usuario) {
        System.out.println(usuario.getNome());
    }
}
