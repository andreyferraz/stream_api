import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
 * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
 * É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar, ou
 * retornar um valor.
 */

public class ConsumerExample {
    public static void main(String[] args) {
        // criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar o Consumer com expressão lambda para imprimir os números pares
        System.out.println("Numeros pares: ");
        numeros.forEach(n -> {
            if (n % 2 == 0)
                System.out.print(n +" ");
        });

        // Usar o Consumer com expressão lambda para imprimir os números impares
        System.out.println();
        System.out.println("Números impares: ");
        numeros.forEach(n -> {
            if (n % 2 != 0)
                System.out.print( n +" ");
        });

        //Usar o Consumer com expressão lambda para imprimir a soma de todos números
        System.out.println();
        Consumer<List<Integer>> imprimirSoma = lista -> {
            int soma = lista.stream()
                            .mapToInt(Integer::intValue)
                            .sum();
            System.out.println("A soma dos números é: " + soma);
        };

        imprimirSoma.accept(numeros);
    }
}
