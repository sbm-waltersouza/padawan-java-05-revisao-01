package operacoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		List<String> frutas = new ArrayList<>();
		frutas.add("uva");
		frutas.add("morango");
		frutas.add("maça");
		frutas.add("melao");
		
        // Ordenar em ordem alfabética
		Collections.sort(frutas);
		System.out.println("Lista ordenada: " + frutas);
		
		
        // Ordenar em ordem inversa
		frutas.sort(Comparator.reverseOrder());
		System.out.println("Lista ordenada em ordem inversa: " + frutas);
		
		
	}

}
