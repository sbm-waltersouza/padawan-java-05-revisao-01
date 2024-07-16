package operacoes;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		List<String> frutas = new ArrayList<>();
		frutas.add("uva");
		frutas.add("morango");
		frutas.add("maça");
		frutas.add("melao");
		
		//  usando listIterator
		ListIterator<String> iterator = frutas.listIterator();
		
		System.out.println("Interando para sempre:");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\nInterando para trás:");
		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
	}

}
