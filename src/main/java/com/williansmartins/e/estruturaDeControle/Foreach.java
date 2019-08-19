package com.williansmartins.e.estruturaDeControle;

import java.util.ArrayList;
import java.util.List;

public class Foreach{
	public static void main(String[] args){
		
		List<String> lista = new ArrayList(0);
		lista.add("123");
		lista.add("texto");
		
		
		for( String variavel : lista){
			System.out.print("Valor de X: " + variavel + "\n");
		}
	}
}