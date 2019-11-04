package com.williansmartins.h.orientacao.a.declaracoes;

import java.text.DecimalFormat;

public class UsaPessoa {
	
	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		c1.ano = 1982;
		c1.chassi = "ABC123";
		c1.placa = "DKJ1267";
		
		Pessoa p1 = new Pessoa();
		p1.nome = "JOAO";
		p1.idade = 37;
		p1.carro = c1;
		
		System.out.println(p1);
		
		double numero= 12.34;
		String resultado = String.format("%.2f", numero);
		System.out.println(resultado);
	}
}
