package operacoes;

import java.util.ArrayList;
import java.util.List;

public class IterateList {

	public static void main(String[] args) {
		List<String> frutas = new ArrayList<>();
		frutas.add("uva");
		frutas.add("morango");
		frutas.add("maça");
		frutas.add("melao");
		
		// for-each
		System.out.println("Iterando com for-each:");
		for (String fruta : frutas) {
			System.out.println(fruta);
		}
		
		// for tradicional
		System.out.println("\nInterando com for loop:");
		for (int i = 0; i < frutas.size(); i++) {
			System.out.println(frutas);
		}
		
		// for-each e lambda
       // System.out.println("\nIterando com forEach e lambda:");
      //  frutas.forEach(frutas -> System.out.println(frutas));
        
	}

}
