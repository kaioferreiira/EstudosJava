package br.com.estudosjava.javacore.Zcolecoes.Classes;

public class CelularColecoes {

    private String nome;
    private String IMEI;


    public CelularColecoes(String nome, String IMEI) {
        this.nome = nome;
        this.IMEI = IMEI;
    }

    //Metodo equals
    /*
    * Reflexivo:  x.quals(x), tem que ser true para tudo diferente de null.
    * Simetrico: Para x diferente de null, x.quals(y) == true, logo y.equal(x) tem que ser true
    * Transitividade: para x,y,z diferente de null, se.equals(y) == true, logo y.equals(x) == true e x.equals(z) == true logo y.equals(z)também é true
    * para x diferente de null x.equals(null) tem que retornar false
    *
    * */

    //sobescrita. memos modificador de acesso mesmo nome.
    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false; //verifica se é nulo
        if(this == obj) return true; // se o obj na memoria for igual ao que esta sendo passado.
        if(this.getClass() != obj.getClass()) return false; //verifica se o objeto é do tipo que quero testar.
        CelularColecoes outroCelular =  (CelularColecoes) obj;

        //return  IMEI != null  ? IMEI.equals(outroCelular.getIMEI()) : false;
        return  IMEI != null  && IMEI.equals(outroCelular.getIMEI());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }
}
