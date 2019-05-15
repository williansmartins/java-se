package com.williansmartins.x.colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class ColecoesFila {

	public static void main(String[] args) {
		acaoFila();
	}

	private static void acaoFila() {
		Queue fila = new LinkedList();

		fila.offer("primeiro");
		fila.offer("segundo");
		fila.offer("terceiro");
	    
		//pega o PRIMEIRO, mas nao remove
		System.out.println(fila.peek());
		System.out.println(fila);

		//pega o PRIMEIRO, e remove
		System.out.println(fila.poll());
		System.out.println(fila);
	}
}