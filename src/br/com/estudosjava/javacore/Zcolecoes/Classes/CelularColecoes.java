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
      para x diferente de null x.equals(null) tem que retornar false
    * Reflexivo:  x.quals(x), tem que ser true para tudo diferente de null.
    * Simetrico: Para x diferente de null, x.quals(y) == true, logo y.equal(x) tem que ser true
    * Transitividade: para x,y,z diferente de null, se.equals(y) == true, logo y.equals(x) == true e x.equals(z) == true logo y.equals(z)também é true
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
//           if(IMEI.equals(outroCelular.getIMEI())) {
//               return true;
//           }else {
//               return false;
//           }
    }

//    PARAMETROS PARA TESTE HASHCODE
//    Se x.equals(y) == true y.hashCode() == x.hashCode();
//    Se x.equals(y) == false;
//    se  y.hashCode() != x.hashCode() x.equals(y) devera ser false
//    @Override
//    public int hashCode() {
//        return IMEI.hashCode();
//    }

    //Metodo HashCode - SOBESCRITO - para o hash quando nulo
        @Override
         public int hashCode() {
            return IMEI != null ? IMEI.hashCode() : 1;
        }
    @Override
    public String toString() {
        return "Celular: " + nome + " IMEI: " + IMEI;
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
