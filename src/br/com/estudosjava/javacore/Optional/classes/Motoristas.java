package br.com.estudosjava.javacore.Optional.classes;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Motoristas {

    private Map <String, Motorista>  motoristas  = new HashMap<>();

   public Motoristas() {

        Seguro seguro = new Seguro("Parcial - n�o cobre roubo", new BigDecimal("5000"));

        Caminhao caminhao = new Caminhao("Mercedes Atron", seguro);

        Motorista motoristaJoao = new Motorista("Jo�o", 40, caminhao);

        Motorista motoristaJose = new Motorista("Jos�", 25, null); // N�o tem caminh�o

        motoristas.put("Jo�o", motoristaJoao);
        motoristas.put("Jos�", motoristaJose);
    }

    public Motorista porNome(String nome) {
        return motoristas.get(nome);
    }




}
