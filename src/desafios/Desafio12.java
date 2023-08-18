package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio12 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //Encontrar o produto de todos os números da lista e exibir no console usando Stream
        int resultado = numeros.stream()
                .reduce(1, (multiplicacao, numero) -> multiplicacao * numero);
                System.out.println(resultado);
    }
}
