package operacoes;

import java.util.ArrayList;
import java.util.List;

public class CheckExistence {

	public static void main(String[] args) {
		List<String> frutas = new ArrayList<>();
		frutas.add("uva");
		frutas.add("morango");
		frutas.add("maça");
		frutas.add("melao");
		
		// verificando se contem o elemento especificado no contains
		boolean temFruta = frutas.contains("maça");
		System.out.println("A lista contem 'maça'? " + temFruta);
		
		// encontrar o indice de um elemento
		int indexOfMelao = frutas.indexOf("melao");
		System.out.println("indice do 'melao' " + indexOfMelao);
		
	}

}
