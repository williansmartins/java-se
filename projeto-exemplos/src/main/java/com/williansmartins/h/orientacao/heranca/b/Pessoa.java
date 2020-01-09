package com.williansmartins.h.orientacao.heranca.b;

public class Pessoa extends Deus{
	protected int idade;
	String nome;
	Carro carro;
	
	public Pessoa() {
		super(123);
		System.out.println("Nasceu uma pessoa");
	}
	
	int Pessoa() {
		return 0;
	}

	public Pessoa(int idade, String nome, Carro carro) {
		super();
		this.idade = idade;
		this.nome = nome;
		this.carro = carro;
	}

	void metodo(){
		System.out.println(idade);
		Math.sqrt(2);
	}
}