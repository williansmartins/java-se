package com.williansmartins.enums;

public enum EstadoCivilEnum {
	CASADO, SOLTEIRO("Solteiro");
	
	String textoHumanizado;
	
	EstadoCivilEnum(String s){
		this.textoHumanizado = s;
	}
	
	EstadoCivilEnum(){
		
	}
}
