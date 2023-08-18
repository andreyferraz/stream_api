package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio6 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Verificar se existe algum número na lista maior que 10 usando Stream e exibir
        // o resultado, caso não exista, exibir "Nenhum némero maior que 10 encontrado".
        numeros.stream()
                .filter(numero -> numero > 10)
                .forEach(System.out::println);

        if (!numeros.stream().anyMatch(numero -> numero > 10)) {
            System.out.println("Não existe número maior que 10");
        }

    }
}
