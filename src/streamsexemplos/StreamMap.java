package streamsexemplos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {

	public static void main(String[] args) {

		// Cria uma lista de strings com elementos "Amaça", "banana", "morango", "melancia"
		List<String> list = Arrays.asList("Amaça", "banana", "morango", "melancia");

		// Usa a API de Streams para transformar cada string em maiúsculas e coletar os resultados em uma nova lista
		List<String> upperCaseList = list.stream()              // Converte a lista em um stream
			.map(String::toUpperCase)                           // Aplica a função toUpperCase em cada elemento do stream
			.collect(Collectors.toList());                      // Coleta os elementos transformados em uma nova lista

		// Imprime a lista resultante com todas as strings em maiúsculas
		System.out.println(upperCaseList); // [AMAÇA, BANANA, MORANGO, MELANCIA]

	}

}
