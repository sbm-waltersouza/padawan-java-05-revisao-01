package streamsexemplos;

import java.util.Arrays;
import java.util.List;

public class StreamReduce {

	public static void main(String[] args) {
		// Cria uma lista de inteiros com elementos 1, 2, 3, 4, 5
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		// Usa a API de Streams para calcular a soma dos elementos da lista
		int sum = numbers.stream()              // Converte a lista em um stream
			.reduce(0, Integer::sum);           // Usa reduce para somar os elementos, começando com o valor inicial 0

		// Imprime a soma resultante
		System.out.println(sum); // 15

	}

}
