package br.com.estudosjava.javacore.Zcolecoes.ArrayList;

import br.com.estudosjava.javacore.Zcolecoes.Classes.CelularColecoes;

import java.util.ArrayList;
import java.util.List;

public class ListCelularTest {

    public static void main(String[] args) {

        CelularColecoes c1 = new CelularColecoes("Iphone 6", "123456");
        CelularColecoes c2 = new CelularColecoes("Iphone 7", "456789");
        CelularColecoes c3 = new CelularColecoes("Iphone 8", "987654");

        List<CelularColecoes> celularList =  new ArrayList<>();
        celularList.add(c1);
        celularList.add(c2);
        celularList.add(c3);

        for(CelularColecoes celular: celularList){
            System.out.println(celular);
        }
        CelularColecoes c4 = new CelularColecoes("Iphone 8", "987654");
        //contains verifica se existe
        System.out.println(celularList.contains(c4));











    }





}
