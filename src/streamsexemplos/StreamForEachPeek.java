package streamsexemplos;

import java.util.Arrays;
import java.util.List;

public class StreamForEachPeek {
    public static void main(String[] args) {
        // Cria uma lista de strings com elementos "morango", "Banana", "uva"
        List<String> list = Arrays.asList("morango", "Banana", "uva");
        
        // Usa a API de Streams para iterar sobre os elementos da lista
        list.stream()                                      // Converte a lista em um stream
            .peek(fruta -> System.out.println("Peeking: " + fruta)) // Usa peek para executar uma operação em cada elemento sem consumir o stream
            .forEach(fruta -> System.out.println("ForEach: " + fruta)); // Usa forEach para consumir o stream e executar uma operação em cada elemento
    }
}
