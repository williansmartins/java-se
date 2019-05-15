package com.williansmartins.x.moedas;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class Money {

	public static String converterEmReais(Double valor) {
		NumberFormat nf = new DecimalFormat("#,##0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));
		return nf.format(valor);
	}

	public static String converterEmReaisComCifrao(Double valor) {
		NumberFormat nf = new DecimalFormat("#,##0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));
		return "R$ " + nf.format(valor);
	}
}