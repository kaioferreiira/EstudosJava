package br.com.estudosjava.JavaExerciciosResolvidos.Provas.P2.Classes;

public class Recuperacao {

    public String nome;
    public String escola;
    public String curso;
    public String cidade;
    public double  pontualidade;
    public double  disciplina;
    public double  esforco;

    public void imprimeDados(String nome, String escola, String curso, String cidade, double pontualidade,double  disciplina, double  esforco){
        System.out.println("Nome do aluno é: " + nome);
        System.out.println("Nome da sua escola é: " + escola);
        System.out.println("O seu curso é: " + curso);
        System.out.println("A sua cidade é : " + cidade);
        System.out.println("Sua nota de pontualidade é : " + pontualidade);
        System.out.println("Sua nota de disciplina é : " + disciplina);
        System.out.println("Sua nota de esforço é : " + esforco);
    }


    public double calculaMedia(double a , double b, double c){
        double media;
        media = (a+b+c)/3;
        return  media;
    }

    public double calculaVencedor(double a , double b, double c){
        double vencedor;

        if(a > b){
            vencedor = a;
        }else if (b > c){
            vencedor = b;
        }else {
            vencedor = c;
        }

        return vencedor;
    }

}
