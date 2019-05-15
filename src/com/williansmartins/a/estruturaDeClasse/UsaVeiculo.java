package com.williansmartins.a.estruturaDeClasse;

public class UsaVeiculo {
	
	public static void main(String[] args) {
		Veiculo veiculo1 = new Veiculo();
		veiculo1.cor = "cinza";
		veiculo1.ano = 2010;
		veiculo1.fabricante = "honda";
		veiculo1.marca = "fit";
		veiculo1.airbag = true;
		
		System.out.println(veiculo1);
	}
}

