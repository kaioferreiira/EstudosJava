package br.com.estudosjava.javacore.Kenum.test;

import br.com.estudosjava.javacore.Kenum.classes.Cliente;
import br.com.estudosjava.javacore.Kenum.classes.TipoCliente;

public class ClienteTest {

    public static void main(String[] args) {

        //Vamos chamar o nosso enum, é da mesma forma que como se chama um atributo statico
        // Dessa maneira o nosso codigo fica seguro, por que não tem como a pessoa passar algum parametro que não foi pre definido,
        // pois neste caso ele so ira aceitar um parametro TipoCliente.
        Cliente cliente = new Cliente("Kaio", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.APRAZO );

        System.out.println(cliente);

    }
}
