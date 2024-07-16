package operacoes;

import java.util.ArrayList;
import java.util.List;

public class ClearList {

	public static void main(String[] args) {
		List<String> frutas = new ArrayList<>();
		frutas.add("uva");
		frutas.add("morango");
		frutas.add("maça");
		frutas.add("melao");
		
		// limpar lista
		frutas.clear();
		
		// vendo lista apos fazer a limpeza
		System.out.println("lista depois da limpeza " + frutas);
		
		
	}

}
