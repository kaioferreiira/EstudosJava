package br.com.estudosjava.JavaExerciciosResolvidos.Provas.P2.Classes;

public class VendaDeCarros {

    public double porta = 450.00;
    public double vidro = 510.00;
    public double lanterna = 300.00;
    public double macaneta = 100.00;
    public double farol = 650.00;
    public double retrovisor = 90.50;
    public String nome;
    public String placa;

    public double somaVenda(double a, double b, double c){
        double resultado;
        resultado = a + b + c;
        return resultado;
    }



    public double descontoClinte(double a){
        double resultado = 0;

        if(a <1000){
            System.out.println("nao tem desconto");
        }else if (a >= 1000 && a < 2000){
            resultado = (a - (a * 0.05));
        }else {
            resultado = (a - (a * 0.08));
        }
        return  resultado;
    }


}
