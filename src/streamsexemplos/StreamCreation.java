package streamsexemplos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class StreamCreation {
	
	public static void main(String[] args) {
		
		// Criação a partir de uma lista
		List<String> list = Arrays.asList("banana", "morango", "melancia");
		Stream<String> streamFromList = list.stream();
		
		// criando a partir de um array
		String[] array = {"banana", "morango", "melancia"};
		Stream<String> streamFromArray = Arrays.stream(array);
		
		// criação usando Stream.of
		Stream<String> streamOf = Stream.of("banana", "morango", "melancia");
		
	}
}
