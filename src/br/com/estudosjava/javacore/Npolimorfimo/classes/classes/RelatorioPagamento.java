package br.com.estudosjava.javacore.Npolimorfimo.classes.classes;

public class RelatorioPagamento {

    public void relatorioPagamentoGerente(Gerente gerente){
        System.out.println("Gerando relatório de pagamento para gerencia ");
        gerente.calcularPagamento();
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Salario: " + gerente.getSalario());
    }

    public void relatorioPagamentoVendendor(Vendedor vendedor){
        System.out.println("Gerando relatório de pagamento para os vendedores ");
        vendedor.calcularPagamento();
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Salario: " + vendedor.getSalario());
    }
}
