package streamsexemplos;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamCollect {

    public static void main(String[] args) {

        // Cria uma lista de strings com elementos "Amaça", "banana", "morango", "melancia"
        List<String> list = Arrays.asList("Amaça", "banana", "morango", "melancia");

        // Usa a API de Streams para transformar a lista em um conjunto (Set)
        Set<String> set = list.stream()              // Converte a lista em um stream
                              .collect(Collectors.toSet());  // Coleta os elementos do stream em um conjunto

        // Imprime o conjunto resultante
        System.out.println(set); 

    }

}
