package br.com.revisao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class diferencia {
	
	public static void main(String[] args) {
		List<String> tasks = new ArrayList<>();
		tasks.add("Buy milk");
		tasks.add("Clean the house");
		tasks.add("Buy milk"); // Duplicatas permitidas

		
		Set<String> phoneNumbers = new HashSet<>();
		phoneNumbers.add("123-456-7890");
		phoneNumbers.add("098-765-4321");
		phoneNumbers.add("123-456-7890"); // Duplicata não será adicionada

		
		Set<String> ingredients = new HashSet<>();
		ingredients.add("Flour");
		ingredients.add("Sugar");
		ingredients.add("Flour"); // Duplicata não será adicionada

		
		Map<String, String> contacts = new HashMap<>();
		contacts.put("Alice", "123-456-7890");
		contacts.put("Bob", "098-765-4321");

	}
}
