package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Desafio18 {
      public static void main(String[] args) {
            List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
            // Filtrar os números primos da lista e exibir no console usando Stream
            List<Integer> numerosPrimos = numeros.stream()
                  .filter(numero -> IntStream.rangeClosed(2, numero / 2).noneMatch(divisor -> numero % divisor == 0))
                  .collect(Collectors.toList());
                  numerosPrimos.forEach(System.out::println);
      }
}
