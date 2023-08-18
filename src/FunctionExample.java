import java.util.List;
import java.util.function.Function;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
 * É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar, ou
 * retornar um valor.
 */
public class FunctionExample {
    public static void main(String[] args) {
        //Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //Usar o Function com expressão lambda para dobrar todos os números
        Function<Integer, Integer> dobrar = n -> n * 2;

        //Usar a função para dobrar todos os números no Stream e armazena-los em outra lista
        List<Integer> numerosDobrados = numeros.stream()
                .map(dobrar)
                .collect(Collectors.toList());
        //Imprimir a lista dos números dobrados
        numerosDobrados.forEach(System.out::println);
    }

}
