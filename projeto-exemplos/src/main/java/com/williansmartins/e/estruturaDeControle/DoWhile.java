package com.williansmartins.e.estruturaDeControle;

public class DoWhile {
	public static void main(String[] args) {

		int idade = 20;
		do {
			System.out.println("Voc� tem: " + idade);
			System.out.println("nao pode entrar na balada!");
			idade++;
		} while (idade < 18);

	}
}