package com.williansmartins.x.io;
import java.io.*;

public class LerTeclado {

    public static void main(String[] args) throws IOException {
       String linha = "";
                        int valor;
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			// Le entao a palagra SAIR nao seja digitada

			while (!linha.equals("SAIR")) {
                            System.out.println("Por favor, digite um n�mero...");
                            linha = reader.readLine();
                            valor = Integer.parseInt(linha);
                            valor = (int)Math.pow(valor, 3);
                            System.out.println(linha+"^"+linha+"="+valor);
			}
		}
		catch (NumberFormatException e) {
			System.out.println("Erro: Isto n�o � um n�mero: "+ e);
		}
    }
}