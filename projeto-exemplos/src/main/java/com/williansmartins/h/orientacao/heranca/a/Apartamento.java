package com.williansmartins.h.orientacao.heranca.a;

public class Apartamento extends Imovel {
	private boolean sacada;
	private int andar;
	private int bloco;

	public boolean isSacada() {
		return sacada;
	}

	public void setSacada(boolean sacada) {
		this.sacada = sacada;
	}

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}

	public int getBloco() {
		return bloco;
	}

	public void setBloco(int bloco) {
		this.bloco = bloco;
	}

}