import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MetodosList {
    public static void main(String[] args) {
        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
        
        //      List notas = new ArrayList(); //antes do java 5
        //      ArrayList<Double> notas = new ArrayList<>();
        //      List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
                /*List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
                notas.add(10d);
                System.out.println(notas);*/
                /*List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
                notas.add(1d);
                notas.remove(5d);
                System.out.println(notas);*/
        
                System.out.println("Crie uma lista e adicione as sete notas: ");
        
                List<Double> notas = new ArrayList<Double>(); //Generics(jdk 5) - Diamond Operator(jdk 7)
                notas.add(7.0);//.add -> adiciona um elemento a lista
                notas.add(8.5);
                notas.add(9.3);
                notas.add(5.0);
                notas.add(7.0);
                notas.add(0.0);
                notas.add(3.6);
                System.out.println(notas.toString());
        
                System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));//Mostra a primeira ocorrencia do valor/elemento enviado como parâmetro
        
                System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
                notas.add(4, 8d);// .add(int posição, double elemento) adiciona em posição especifica
                System.out.println(notas);
        
                System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
                notas.set(notas.indexOf(5d), 6.0);//-> .set(int posição, double elemento) substitui o valor que está naquela posição
                System.out.println(notas);
        
                System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));// Retorna um boolean caso encontre uma ocorrencia do valor.
        
                System.out.println("Exiba todas as notas na ordem em que foram informados: ");
                for (Double nota : notas) System.out.println(nota);//Itera sobre todos os elementos imprimindo-os
        
                System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));//.get(int pos)-> mostra o elemento em determinada posição
                System.out.println(notas.toString());
        
                System.out.println("Exiba a menor nota: " + Collections.min(notas));//-> faz uso de um método da interface collections, que por sua vez compara elemento por elemento
        
                System.out.println("Exiba a maior nota: " + Collections.max(notas));//-> faz uso de um método da interface collections, que por sua vez compara elemento por elemento
        
                Iterator<Double> iterator = notas.iterator();//Cria um iterador que irá percorrer toda a lista
                Double soma = 0d;
                while(iterator.hasNext()){//Enquanto houver elemento irá executar o while
                    Double next = iterator.next();
                    soma += next;
                }
                System.out.println("Exiba a soma dos valores: " + soma);
        
                System.out.println("Exiba a média das notas: " + (soma/notas.size()));// .size() retorna o tamanho
        
                System.out.println("Remova a nota 0: ");
                notas.remove(0d);
                System.out.println(notas);
        
                System.out.println("Remova a nota da posição 0");
                notas.remove(0);
                System.out.println(notas);
        
                System.out.println("Remova as notas menores que 7 e exiba a lista: ");
                Iterator<Double> iterator1 = notas.iterator();
                while(iterator1.hasNext()) {
                    Double next = iterator1.next();
                    if(next < 7) iterator1.remove();
                }
                System.out.println(notas);
        
                /*System.out.println("Apague toda a lista");
                notas.clear();// .clear esvazia a lista
                System.out.println(notas);
                */
                System.out.println("Confira se a lista está vazia: " + notas.isEmpty());// .isEmpty() retorna true caso vazia
        
        System.out.println("----------------------------------------------------------------------------------------------------------");
        //Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:
                System.out.println("Crie uma lista chamada notas2 " +
                    "e coloque todos os elementos da list Arraylist nessa nova lista: ");
                List<Double> notas2 = new LinkedList<>();
                for (Double double1 : notas) {
                    notas2.add(double1);
                }
                System.out.println(notas2);
                System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");
                System.out.println(notas2.get(0)); // .get -> retorna valor da posição sem remove-lo

                System.out.println("Mostre a primeira nota da nova lista removendo-o: ");
                System.out.println(notas2.remove(0));// .remove -> retorna o valor da posição e remove da lista.

                System.out.println(notas2);
        
            }
}
