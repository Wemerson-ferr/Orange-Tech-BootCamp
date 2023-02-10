package Stream_API;

import java.util.*;
import java.util.stream.Collectors;

public class Metodos_Stream {
    public static void main(String[] args) {
        //Crie uma List de Strings com números aleátorios: 
        List<String> StringNumeros = Arrays.asList("1", "2", "5", "6", "9", "8", "15", "10", "18");

        //Imprima os elementos dessa List:
        StringNumeros.forEach(System.out::println);//Como é uma List os elementos duplicados não foram inseridos.
    System.out.println("------------------------------------------------------------------------------------");
        //Pegue os cinco primeiros números e coloque em uma Set, depos imprima a Set.
        Set<String> collectedNumeros = StringNumeros.stream()
            .limit(5)
            .collect(Collectors.toSet());
        collectedNumeros.forEach(System.out::println);
    System.out.println("------------------------------------------------------------------------------------");
        //Crie uma List de Integers através da List de strings, depos imprima.
        List<Integer> numeros = StringNumeros.stream()
            .map(Integer::parseInt)/*Retorna uma Stream extraida de outra, alterando ou não o tipo */
            .collect(Collectors.toList());/*Transforma a Stream em um resultado final, de tipo determinado */
        numeros.forEach(n -> System.out.println(n));
    System.out.println("------------------------------------------------------------------------------------");
        //Pegue os numeros pares maiores que 2 e coloque em uma List:
        List<Integer> numerosPares = StringNumeros.stream()
            .map(Integer::parseInt)/*Retorna uma Stream extraida de outra, alterando ou não o tipo Stream<Integer>  */
            .filter(n -> n%2==0 && n>2)/*Retorna uma Stream de acordo com o filtro aplicado */
            .collect(Collectors.toList());/*Transforma a Stream em um resultado final, de tipo List<Integer> */
        numerosPares.forEach(n-> System.out.println(n));/*Para cada elemento n, imprima n */
    System.out.println("------------------------------------------------------------------------------------");
        //Moste a media dos números contidos na List original.
        StringNumeros.stream()/*Optei por não criar uma variável a parte, pois o Stream não altera a List original*/
            .mapToInt(Integer::parseInt)/*Retorna uma Stream extraida de outra, alterando o tipo IntStream  */
            .average()/*Retorna uma OptionalDouble, que representa a média dos elementos do stream */
            .ifPresent(v->System.out.printf("%.2f\n",v));/*permite executar uma ação se o valor está presente na instância */
    System.out.println("------------------------------------------------------------------------------------");
        //Remova os números impares da List original.
        List<Integer> numerosInteger = StringNumeros.stream()
            .map(Integer::parseInt)
            .collect(Collectors.toList());/*Usamos o Stream só para converter os valores para Integer */
        
        numerosInteger.removeIf(v -> v%2 != 0);
        numerosInteger.forEach(System.out::println);
    System.out.println("------------------------------------------------------------------------------------");
        //Ignore os 3 primeiros elementos e imprima a partir disso
        StringNumeros.stream()
            .skip(3)/*Pula uma determinada qtd de elementos */
            .forEach(System.out::println);
    System.out.println("------------------------------------------------------------------------------------");
        //Quantos números há na List? Sem contar os repetidos que não são inseridos
        long count = StringNumeros.stream()
            .distinct()/*Retorna uma Stream com valores não repetidos(distintos) */
            .count();/*retorna a qtd de elementos da Stream */
        System.out.println(count);
    System.out.println("------------------------------------------------------------------------------------");
        //Mostre o maior valor da List:
        StringNumeros.stream()
            .mapToInt(Integer::parseInt)
            .max()
            .ifPresent(System.out::println);
    System.out.println("------------------------------------------------------------------------------------");
        //Mostre o menor valor da List:
        StringNumeros.stream()
            .mapToInt(Integer::parseInt)
            .min()
            .ifPresent(System.out::println);
    System.out.println("------------------------------------------------------------------------------------");
        //Exiba a soma dos números pares:
        int sum = StringNumeros.stream()
            .mapToInt(Integer::parseInt)
            .filter(num -> num%2 ==0)
            .sum();
        System.out.println(sum);
    System.out.println("------------------------------------------------------------------------------------");
        //Exiba os valores da List original em ordem:
        StringNumeros.stream()
            .mapToInt(Integer::parseInt)
            .sorted()/*Ordena os elementos */
            .forEachOrdered(System.out::println);
    System.out.println("------------------------------------------------------------------------------------");
        //Agrupe os números impáres multiplos de 3 ou 5:
        Set<Integer> numerosImpares = StringNumeros.stream()
            .map(Integer::parseInt)
            .filter(n ->n!=0 && n%2!=0 && (n%3 == 0 || n%5 == 0))
            .collect(Collectors.toSet());
        numerosImpares.forEach(System.out::println);
    }        
}
