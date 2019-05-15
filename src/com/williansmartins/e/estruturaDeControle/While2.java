package com.williansmartins.e.estruturaDeControle;

public class While2 {
	static int i;

	public static void acao(int x) {
		while (i < x) {
			System.out.print("Valor de X: " + i + "\n");
			i++;
		}
	}

	public static void main(String[] args) {
		acao(100000);
	}
}