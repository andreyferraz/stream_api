package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Desafio17 {
   public static void main(String[] args) {
      List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
      //Utilizando Stream API deve agrupar os números em duas listas separadas, uma contendo os números pares e outra contendo os números ímpares da lista original, e exiba os resultados no console.
System.out.println("Números Pares:");
      List<Integer> numerosPares = numeros.stream()
            .filter(numero -> numero % 2 == 0)
            .collect(Collectors.toList());
            numerosPares.forEach(System.out::println);
System.out.println("Números impares:");
      List<Integer> numerosImpares = numeros.stream()
            .filter(numero -> numero % 2 != 0)
            .collect(Collectors.toList());
            numerosImpares.forEach(System.out::println);      
   }
}

