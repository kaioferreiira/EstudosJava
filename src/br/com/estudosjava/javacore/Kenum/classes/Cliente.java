package br.com.estudosjava.javacore.Kenum.classes;

public class Cliente {

    private String nome;
    private TipoPagamento tipoPagamento;
    //ao inves de declarar um tipo como int, vamos declarar um TipoCliente que é o nosso enum.
    private TipoCliente tipo;

    public Cliente(String nome, TipoCliente tipo, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipo = tipo;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoPagamento=" + tipoPagamento +
                ", tipo=" + tipo +
                '}';
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipo() {
        return tipo;
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }

    public enum TipoPagamento{
        AVISTA,APRAZO;
    }
}
