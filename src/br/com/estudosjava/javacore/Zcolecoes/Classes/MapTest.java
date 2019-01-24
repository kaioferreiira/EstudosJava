package br.com.estudosjava.javacore.Zcolecoes.Classes;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {


        Map<Long, String> map =  new HashMap<>();

        map.put(1L,"Teclado");
        map.put(2L,"Mouse");
        map.put(3L,"Monitor");

        for (Long key: map.keySet()){
            System.out.println(key);
        }


        for (Map.Entry<Long, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }






    }
}
