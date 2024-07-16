package operacoes;

import java.util.ArrayList;
import java.util.List;

public class SubListExample {

	public static void main(String[] args) {
		List<String> frutas = new ArrayList<>();
		frutas.add("uva");
		frutas.add("morango");
		frutas.add("maça");
		frutas.add("melao");
		
		// criando uma sublista
		List<String> sublista = frutas.subList(1, 3); // de morango ate maça
		
		System.out.println("sublista " + sublista);
		
	}

}
