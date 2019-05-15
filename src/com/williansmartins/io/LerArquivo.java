package com.williansmartins.io;

import java.io.*;

public class LerArquivo {

    public static void main(String[] args) throws IOException {
        try {
            FileReader fr = new FileReader("C:\\dev\\arquivo.txt");
            BufferedReader br = new BufferedReader(fr);
            String temp;

            while ((temp = br.readLine()) != null) {
                System.out.println(temp + "\n");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Erro:>>" + e.getMessage());
        }
    }
}