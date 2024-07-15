package br.com.revisao;

import java.util.HashSet;
import java.util.Set;

public class exemploSet {
	public static void main(String[] args) {
		
		// Quando Usar: Use quando precisar garantir que todos os elementos sejam únicos.
		
		Set<String> emailSet = new HashSet<>();
		
		emailSet.add("alice@mail.com");
		emailSet.add("bob@mail.com");
		emailSet.add("alice@mail.com"); // Duplicata não será adicionada
		
		System.out.println(emailSet);
		
		
	}
}
