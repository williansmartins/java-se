package com.williansmartins.capgemini.cap5lab1;

public class Garagem {
	Carro carroPasseio = new Carro();
	Carro carroUtilitario = new Carro();
	
	public static void main(String[] args) {
		Garagem g = new Garagem();
		g.carroPasseio.cor = "Vermelho";
		g.carroPasseio.modelo = "Ferrari";
		
		g.carroUtilitario.cor = "Preto";
		g.carroUtilitario.modelo = "Lamborghini";
		
		System.out.println(g.carroPasseio);
		System.out.println(g.carroUtilitario);
		
		
	}
}
