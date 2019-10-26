package br.com.estudosjava.javacore.Fmodificadorestatico.classes;

public class Cliente {
    // 0 - Bloco de inicializa estatico quando é executado quando a JVM carregar a classe(é executado apenas uma vez)
    // 1 -  Alocação de espaco na memoria para o objeto sera criado
    // 2 - Cada atributo da classe  é criado  com seus valores inicializados ou valores explicitos
    // 3 - Bloco inicializado e executado
    // 4 - Construtor executado
    private static int[] parcelas;

    static{
        parcelas = new int[100];
        System.out.println("dentro do bloco de inicialização!!! ");
        for (int i = 1; i < 100; i++) {
            parcelas[i - 1] = i;
        }
    }

    public Cliente() {
    }

    public static int[] getParcelas() {

        return parcelas;
    }
}
