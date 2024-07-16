package operacoes;

import java.util.ArrayList;
import java.util.List;

public class RemoveElements {

	public static void main(String[] args) {
		List<String> frutas = new ArrayList<>();
		frutas.add("uva");
		frutas.add("Banana");
		frutas.add("maça");
		frutas.add("melao");
		
		// Remover por índice
		frutas.remove(0);
		System.out.println("lista depois de remover o indice 2: " + frutas);
		
		// removendo pelo valor
		frutas.remove("Banana");
		System.out.println("lista depois de remover 'banana' " + frutas);
	}

}
