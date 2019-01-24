package br.com.estudosjava.JavaExerciciosResolvidos.Codenation.Exceptions.br.com.codenation.desafio.exceptions.IdentificadorUtilizadoException;

public class ResourceNotFoundException extends Exception {
    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(Object resourId) {
        super(resourId != null ? resourId.toString() : null);
    }
}