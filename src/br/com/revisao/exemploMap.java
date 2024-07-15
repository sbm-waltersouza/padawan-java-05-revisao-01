package br.com.revisao;

import java.util.HashMap;
import java.util.Map;

public class exemploMap {
	
	public static void main(String[] args) {
		//Quando Usar: Use quando precisar associar chaves a valores.
		
		Map<String, String> dicionario = new HashMap<>();
		
		dicionario.put("apple", "a melhor marca.");
		dicionario.put("banana", "a melhor fruta.");

		System.out.println(dicionario);
	}
}
