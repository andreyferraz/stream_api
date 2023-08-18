package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio14 {
   public static void main(String[] args) {
     List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
     //Encontrar o maior número primo da lista usando Stream e exibir no console
     int resultado = numeros.stream()
                 .filter(numero -> numero % 2 != 0)
                 .reduce(0, (maiorNumero, numero) -> numero > maiorNumero ? numero : maiorNumero);
                 System.out.println("Maior número primo: " + resultado);
   }
}
