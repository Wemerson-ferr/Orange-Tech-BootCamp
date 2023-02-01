package Set_interface;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class Metodos_Set {
    public static void main(String[] args) {
        //Dada uma lista com 7 notas de um aluno {7, 8.5, 9.3, 5, 7, 0, 3.6} faça:

        //Defina uma Set notas:
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

        /* Outras formas de declarar:
        Set notas = new HashSet(); //antes do java 5
        HashSet<Double> notas = new HashSet<>();
        Set<Double> notas = new HashSet<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
        Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); */

        //Exiba a lista:
            System.out.println(notas.toString());//Note que não tem ordem definida e itens repetidos

        //Exiba a posição da nota 5:
            //-> Como não há ordem, não podemos fazer busca por posição 
        
        //Adicione a nota 8.0 na posição 4:
            //-> Novamente, não temos controle de posição para esta tarefa ainda.
        
        //Substitua a nota 5.0 por 6.0:
            //-> Não temos um método capaz de fazer substituição.
        
        //Confira se a nota 5.0 está no conjunto:
            System.out.println("Contem nota 5.0? "+ notas.contains(5d)); // Retorna um boolean true.
        
        //Exiba a terceira nota adicionada:
            //-> Novamente não temos controle de posição ou ordem de inserção
        
        //Exiba a menor nota do conjunto:"
            System.out.println("A menor nota é: "+ Collections.min(notas)); //Uso de metodo da interface Collections

        //Exiba a maior nota do conjunto:
            System.out.println("A maior nota é: "+ Collections.max(notas)); //Uso de metodo da interface Collections
        
        //Exiba a soma de todas as notas do conjunto:
            Iterator<Double> iterador = notas.iterator();
            Double somaNotas = 0.0d;
            while(iterador.hasNext()){
                somaNotas+= iterador.next();
            }
            System.out.println("A soma de todas as notas são: "+ somaNotas);
        
        //Exiba a média de notas desse aluno:
            System.out.println("A média deste aluno é: "+ somaNotas/notas.size());
        
        //Remova a nota 0.0 do conjunto:
            notas.remove(0d);//Como não há duplicados irá remover a unica nota zero
        
        //Remova todas as notas menores de 7.0 :
            Iterator<Double> iterador2 = notas.iterator();
            while(iterador2.hasNext()){
                if(iterador2.next()<7.0d){
                    iterador2.remove();
                }
            }
            System.out.println(notas.toString());// Removeu todas as notas menores que 7.
        
        //Exiba as notas em ordem crescente:
            //-> como não há ordem iremos criar uma linkedList com as notas
                Set<Double> notas2 = new LinkedHashSet<>();//[7d, 8.5, 9.3, 5d, 7d, 0d, 3.6]
                notas2.add(7d);
                notas2.add(8.5);
                notas2.add(9.3);
                notas2.add(5d);
                notas2.add(7d);
                notas2.add(0d);
                notas2.add(3.6);
            //Agora iremos exibi-la
                System.out.println(notas2.toString());
        
        //Exiba as notas em ordem crescente:
            //-> Agora para podermos colocar em ordem crescente usaremos a TreeSet
            Set<Double> notas3 = new TreeSet<>(notas2); //Criamos uma arvore e passamos a linkedHash 
            System.out.println(notas3);
        
        //Esvazie os conjuntos:
            notas.clear();
            notas2.clear();
            notas3.clear();
            System.out.println();
            //-> Verifique se realmente foram esvaziadas:
            System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
            System.out.println("Confira se o conjunto 2 está vazio: " + notas2.isEmpty());
            System.out.println("Confira se o conjunto 3 está vazio: " + notas3.isEmpty());
    }
}
