import java.util.Arrays;
import java.util.List;
public class BinaryOperatorExample {
    public static void main(String[] args) {
        //Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //Usar o BinaryOperator para somar todos os números da lista
        int soma = numeros.stream()
                .reduce(0, (x, y) -> x + y);

        //Imprimir o resultado da soma
        System.out.println("Soma: " + soma);        
    }
}
