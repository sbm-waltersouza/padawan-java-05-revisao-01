package operacoes;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		List<String> frutas = new ArrayList<>();
		frutas.add("uva");
		frutas.add("morango");
		frutas.add("maça");
		frutas.add("melao");

		
		// convertendo lista para array
		String[] frutasArray = frutas.toArray(new String[0]);
		
		// exibindo o array
		System.out.println("Array de frutas:");
		for (String fruta : frutasArray) {
			System.out.println(fruta);
		}
		
		
		
	}

}
