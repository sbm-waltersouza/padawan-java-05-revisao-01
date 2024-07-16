package operacoes;

import java.util.ArrayList;
import java.util.List;

public class CreateAndAdd {
	
	public static void main(String[] args) {
		List<String> frutas = new ArrayList<>();
		
		//adicionando elementos
		frutas.add("banana");
		frutas.add("banana");
		frutas.add("goiaba");
		frutas.add("morango");
		frutas.add("melancia");
		frutas.add("melão");
		
		// sendo list pode ter elemento duplicado
		
		System.out.println(frutas);
	}
}
