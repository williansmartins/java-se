package com.williansmartins.b.modificadores;

public class Modificadores {

	//Modificadores de acesso
	private String privado;
	public String publico;
	protected String protegido;
	String modificaror_default;

	final String modificador_final = "valor";
	transient String transiente;
	volatile String volatil;

	public static void main(String[] args) {
		// modificador static
	}

	strictfp void metodo() {
		// metodo que trabalha com ponto de função padronizado
	}

	synchronized void metodo2() {
		// metodo thread safe
	}

	// classe abstrata
	abstract class ClasseInternaAbstrata {
		// metodo abstrato
		abstract void metodo();

		// metodo nativo
		native void metodo3();
	}

}