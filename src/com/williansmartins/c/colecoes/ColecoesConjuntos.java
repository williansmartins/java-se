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
//		A ordenação é por elementos únicos;
//		Não suporta objetos nulos, se caso um elemento ser nulo é lançado a exceção NullPointerException;

		int count[] = { 34, 22, 10, 60, 30, 22 };
		TreeSet sortedSet = new TreeSet<Integer>();
		for (int i = 0; i < 5; i++) {
			sortedSet.add(count[i]);
		}
		System.out.println(sortedSet);

	}

	private static void acaoHashSet() {
//		Não tem ordenação na varredura ou impressão. A ordem de saída não é a mesma de entrada;
//		Aceitam valores do tipo null;
//		Não é sincronizada (thread-safe);
//		Velocidade no acesso, leitura e modificação de dados;

		int count[] = { 34, 22, 10, 60, 30, 22 };
		Set<Integer> hashset = new HashSet<Integer>();
		for (int i = 0; i < 5; i++) {
			hashset.add(count[i]);
		}
		System.out.println(hashset);
	}

}