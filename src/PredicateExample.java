import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro oufalso).
 * É comumente usada para filtrar os elementos do Stream com base em alguma condição.
 */
public class PredicateExample {
    public static void main(String[] args) {
        //Criar uma lista de palavras
        List<String> palavras = Arrays.asList("Java", "Python", "C#", "JavaScript", "PHP");
        //Criar um predicado que verifica se a palavra tem mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;
        //Criar um predicado que verifica se a palavra começa com J
        Predicate<String> comecaComJ = palavra -> palavra.startsWith("J");
        //Usar o Stream para filtrar as palavras com mais de 5 caracteres e, em seguida
        //imprimir cada palavra que passou no filtro, e depois imprimir as que começa com J
        palavras.stream()
                .filter(maisDeCincoCaracteres)
                .forEach(System.out::println);
        palavras.stream()
                .filter(comecaComJ)
                .forEach(System.out::println);        
    }
}
