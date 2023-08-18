package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Desafio20 {
      public static void main(String[] args) {
            List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
           //Usando Stream encontrar a soma dos números da lista que são divisíveis tanto por 3 quanto por 5 e exibir o resultado no console
            int soma = numeros.stream()
                  .filter(numero -> numero % 3 == 0 || numero % 5 == 0)
                  .mapToInt(numero -> numero)
                  .sum();
                  System.out.println("A soma dos némeros divisíveis por 3 e 5 é: "+soma);
      }
}
