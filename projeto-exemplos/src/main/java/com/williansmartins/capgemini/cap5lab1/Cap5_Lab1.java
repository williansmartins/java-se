package com.williansmartins.capgemini.cap5lab1;

public class Cap5_Lab1 {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.cargo = "Instrutor";
		f1.nome = "Willians";
		f1.sobrenome = "Martins";
		f1.salario = 1_000_000;
		
		System.out.println(f1.nome);
		System.out.println(f1.cargo);
		System.out.println(f1.sobrenome);
		System.out.println(String.format("%.2f", f1.salario));
	}
	
}
