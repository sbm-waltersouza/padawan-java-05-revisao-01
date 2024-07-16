package streamsexemplos;

import java.util.Arrays;
import java.util.List;

public class StreamAggregation {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        
        // Contar elementos na lista
        long count = numbers.stream().count();
        
        // Encontrar o menor elemento na lista
        int min = numbers.stream().min(Integer::compare).orElseThrow();
        
        // Encontrar o maior elemento na lista
        int max = numbers.stream().max(Integer::compare).orElseThrow();
        
        System.out.println("Count: " + count); // 6
        System.out.println("Min: " + min); // 1
        System.out.println("Max: " + max); // 6
    }
}
