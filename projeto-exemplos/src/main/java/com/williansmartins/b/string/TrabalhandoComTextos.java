package com.williansmartins.b.string;

public class TrabalhandoComTextos {

	public String removeSujeira(String entrada, boolean flag) {
		String saida = entrada
				.replace(".", "")
				.replace("/", "")
				.replaceAll("[^a-zA-Z0-9]", "");
		return saida;
	}
}
