package desafios;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Desafio16 {
   public static void main(String[] args) {
      int entrada = 5; // Vamos calcular o fatorial de 5 como exemplo
      // Calcular o fatorial de entrada e exibir no console usando Stream
      
      int resultado = IntStream.rangeClosed(1, entrada)
                  .reduce(1, (multiplicacao, numero) -> multiplicacao * numero);
      
      System.out.println("Fatorial de " + entrada + " é: " + resultado);
   }
}

