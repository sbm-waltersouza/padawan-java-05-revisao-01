package br.com.revisao;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		// criando arraylist
		ArrayList<String> carros = new ArrayList<>();

		carros.add("Honda Civic Si");
		carros.add("Lancer Evo X");
		carros.add("Nissan 350Z");	
		carros.add("Dodge Journey");
		
		for (String carros1 : carros) {
			System.out.println(carros1);
		}

	}

}
