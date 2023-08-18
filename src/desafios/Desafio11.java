package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio11 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Utilizando a Stream API, encontre a soma dos quadrados de todos os números da
        // lista e exiba o resultado no console
        int resultado = numeros.stream()
                .map(numero -> numero * numero)
                .reduce(0, (soma, numero) -> soma + numero);
        System.out.println(resultado);
    }
}
