package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio7 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //Encontrar o segundo maior número da lista usando Stream e exibir o resultado.
        numeros.stream()
                .sorted((n1, n2) -> n2 - n1)
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
