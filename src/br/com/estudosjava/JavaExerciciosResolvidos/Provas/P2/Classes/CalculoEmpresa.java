package br.com.estudosjava.JavaExerciciosResolvidos.Provas.P2.Classes;

public class CalculoEmpresa {

    public double imposto = 0.25;
    public double salario;
    public String nome;

    public double calculaImposto(double a){
        double resultado = 0;

        resultado = a - (a * imposto);

        return resultado;
    }
}
