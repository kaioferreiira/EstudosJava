package br.com.estudosjava.javacore.wio.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderTest {

    public static void main(String[] args) {


        File file  = new File("arquivo.txt");

        try {
            FileWriter fw = new FileWriter(file);
            fw.write("teste mensagem no arquivo, vamos la!!!");
            fw.flush();
            fw.close();

            FileReader fr = new FileReader(file);
            char [] in = new char[50];
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
