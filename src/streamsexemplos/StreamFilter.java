package streamsexemplos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {
    	
        // Cria uma lista de strings com elementos "Amaça", "banana", "morango", "melancia"
        List<String> list = Arrays.asList("Amaça", "banana", "morango", "melancia");
        
        // Usa a API de Streams para filtrar a lista, mantendo apenas os elementos que começam com "A"
        List<String> filteredList = list.stream()             // Converte a lista em um stream
            .filter(fruit -> fruit.startsWith("A"))           // Aplica um filtro que mantém apenas elementos que começam com "A"
            .collect(Collectors.toList());                    // Coleta os elementos filtrados em uma nova lista
        
        // Imprime a lista filtrada resultante
        System.out.println(filteredList); // [Amaça]
    }
}
