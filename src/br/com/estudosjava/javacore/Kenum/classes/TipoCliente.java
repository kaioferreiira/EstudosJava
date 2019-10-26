package br.com.estudosjava.javacore.Kenum.classes;

public enum TipoCliente {
    //Tipo especial de classe
    // tudo é considerado uma constante

    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);

    //deve-se criar sempre antes das constantes!
    private int tipo;

    TipoCliente(int tipo) {
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }
}
