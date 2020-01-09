package com.williansmartins.h.orientacao.heranca.b;

public class UsaPessoaStatic {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.nome = "JOAO";

		Pessoa p2 = new Pessoa();
		p2.nome = "MARIA";
		
		p1.nome = "WILLIANS";
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
	}
}
