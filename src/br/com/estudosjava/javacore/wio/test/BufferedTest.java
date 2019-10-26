package br.com.estudosjava.javacore.wio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTest {
    public static void main(String[] args) {


        File file  = new File("arquivo.txt");

        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter br =  new BufferedWriter(fw);

            br.write("escrevendo mensagem no arquivo.");
            br.newLine();
            br.write("pulando uma linha");
            fw.flush();
            fw.close();

            FileReader fr = new FileReader(file);
            char [] in = new char[500];
            int size = fr.read(in);

            System.out.println("tamanho " + size);

            for (char c: in){
                System.out.print(c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
