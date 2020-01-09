package com.williansmartins.b.string;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class TrabalhandoComTextosTest {
	
	Map<String, String> dados;

	@Before
	public void prepararDados() {
		dados = new HashMap();
		dados.put(" 123.456", "123456");
		dados.put("12$3.456", "123456");
		dados.put(" 12%3.456", "123456");
		dados.put("12$3.456", "123456");
		dados.put("12/3.456", "123456");
		dados.put("1.23.456", "123456");
		dados.put("123.45-6", "123456");
		dados.put("1.2.3.4.5.6.....", "123456");
	}
	
	@Test
	public void limparDados() {
		TrabalhandoComTextos t = new TrabalhandoComTextos();
		
		for (Map.Entry<String, String> entry : dados.entrySet()) {
		    String key = entry.getKey();
		    String value = entry.getValue();

		    String resultado = t.removeSujeira(key, true);
		    assertEquals(value, resultado);
		}
		
	}
	
}
