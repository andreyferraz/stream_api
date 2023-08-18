package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio15 {
   public static void main(String[] args) {
      List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
      // Verificar se a lista contém pelo menos um número negativo e exibir no console
      // usando Stream
      
      if (!numeros.stream().anyMatch(numero -> numero < 0)) {
         System.out.println("Não existe números negativos");
      }else{
         numeros.stream()
            .filter(numero -> numero < 0)
            .forEach(System.out::println);
      }

   }
}
