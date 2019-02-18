package br.com.estudosjava.Java8PraticoLambdaExpressions.Chapter2.Testes;

import br.com.estudosjava.Java8PraticoLambdaExpressions.Chapter2.Classes.Mostrador;
import br.com.estudosjava.Java8PraticoLambdaExpressions.Chapter2.Classes.Usuario;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Capitulo2Test {
    public static void main(String[] args) {

        Usuario user1 = new Usuario("Paulo Silveira", 150);
        Usuario user2 = new Usuario("Rodrigo Turini", 120);
        Usuario user3 = new Usuario("Guilherme Silveira", 190);

        List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

        for(Usuario u : usuarios) {
            System.out.println(u.getNome());
        }

        System.out.println(" ---  ");
        Mostrador mostrador = new Mostrador();
        usuarios.forEach(mostrador);

        System.out.println(" ---  ");
        Consumer<Usuario> mostrador2 = new Consumer<Usuario>() {
            @Override
            public void accept(Usuario usuario) {
                System.out.println(usuario.getNome());
            }
        };
        usuarios.forEach(mostrador2);

        System.out.println(" ---  ");
        Consumer<Usuario> mostrador3 = u -> {System.out.println(u.getNome());};
        usuarios.forEach(mostrador3);


    }

}
