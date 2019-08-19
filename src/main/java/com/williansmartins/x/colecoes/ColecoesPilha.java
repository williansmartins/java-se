package com.williansmartins.x.colecoes;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ColecoesPilha {

	public static void main(String[] args) {
		acaoPilha();
	}

	private static void acaoPilha() {
		Stack<String> pilha = new Stack<String>();
		pilha.add("primeiro");
		pilha.add("segundo");
		pilha.add("terceiro");
		
		//pega o ULTIMO, mas nao remove
		System.out.println(pilha.peek());
		System.out.println(pilha);

		//pega o ULTIMO, e remove
		System.out.println(pilha.pop());
		System.out.println(pilha);
	}
}