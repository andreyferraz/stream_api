package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Imprimir a soma dos números pares da lista numeros usando Stream
        int somaPares = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .reduce(0, (acumulador, numero) -> acumulador + numero);
                
        System.out.println("Soma dos números pares: " + somaPares);
    }
}
