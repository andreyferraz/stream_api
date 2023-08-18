package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio10 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //Agrupar os valores multiplos de 3 e 5 usando Stream e exibir no console
        numeros.stream()
                .filter(numero -> numero % 3 == 0 || numero % 5 == 0)
                .forEach(System.out::println);
    }
}
