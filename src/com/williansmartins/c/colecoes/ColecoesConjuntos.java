package com.williansmartins.c.colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ColecoesConjuntos {

	public static void main(String[] args) {
		acaoHashSet();
		acaoTreeSet();
	}

	private static void acaoTreeSet() {
//		Os elementos inseridos dentro desse tipo de conjunto devem implementar a interface Comparable;
//		A ordena��o � por elementos �nicos;
//		N�o suporta objetos nulos, se caso um elemento ser nulo � lan�ado a exce��o NullPointerException;

		int count[] = { 34, 22, 10, 60, 30, 22 };
		TreeSet sortedSet = new TreeSet<Integer>();
		for (int i = 0; i < 5; i++) {
			sortedSet.add(count[i]);
		}
		System.out.println(sortedSet);

	}

	private static void acaoHashSet() {
//		N�o tem ordena��o na varredura ou impress�o. A ordem de sa�da n�o � a mesma de entrada;
//		Aceitam valores do tipo null;
//		N�o � sincronizada (thread-safe);
//		Velocidade no acesso, leitura e modifica��o de dados;

		int count[] = { 34, 22, 10, 60, 30, 22 };
		Set<Integer> hashset = new HashSet<Integer>();
		for (int i = 0; i < 5; i++) {
			hashset.add(count[i]);
		}
		System.out.println(hashset);
	}

}