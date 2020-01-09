package com.williansmartins.f.metodos;

import javax.swing.JOptionPane;

public class UsaCalculadora {
	
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		int resultado1 = calc.calcular(1, 2);
		int resultado2 = calc.calcular(1, 2, 3);
		int resultado3 = calc.calcular(1, 2, 3, 4);
		int resultado4 = calc.calcular(1, 2, 3, 4, 5);

		int[] valores1 = {1};
		int[] valores2 = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] valores3 = {};
		
		int resultado5 = calc.calcular(valores1);
		int resultado6 = calc.calcular(valores2);
		int resultado7 = calc.calcular(valores3);
		
		
		JOptionPane.showMessageDialog(null, resultado1);
		JOptionPane.showMessageDialog(null, resultado2);
		JOptionPane.showMessageDialog(null, resultado3);
	}
}