package Map_interface;

import java.util.*;
import java.util.Map.Entry;

public class Exercicios_Map {
/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */
    public static void main(String[] args) {
            System.out.println("Crie um dicionário que relacione os estados e suas respectivas populações: ");
            Map<String, Long> dadosPopulacao = new HashMap<>(){{
                put("PE", 9616621L);
                put("AL", 3351543L);
                put("CE", 9187103L);
                put("RN", 3534265L);
            }};
            System.out.println(dadosPopulacao.toString());
        System.out.println("______________________________________________________________________________________________________");
            System.out.println("Substitua a população do estado RN por : 3.534.165");
            dadosPopulacao.put("RN", 3534165L);
        System.out.println("______________________________________________________________________________________________________");
            System.out.println("Confira se o estado da Paraíba (PB) está no dicionário, caso não, adicione " +
                                "PB - 4.039.277: ");
            if(dadosPopulacao.containsKey("PB")){
                System.out.printf("Estado encontrado: [PB: %d]\n"+dadosPopulacao.get("PB"));
            }
            else{
                System.out.println("Estado ainda não adicionado.");
                System.out.println("Adicionando [PB: 4039277]");
                dadosPopulacao.put("PB", 4039277L);
            }

        System.out.println("______________________________________________________________________________________________________");
            System.out.println("Exiba a população do estado PE: ");
            System.out.printf("[PE: %d]", dadosPopulacao.get("PE"));

        System.out.println("______________________________________________________________________________________________________");
            System.out.println("Exiba todos os estados e suas populaçãos na ordem em que foram informados: ");
            Map<String, Long> dadosPopulacaoLinkado = new LinkedHashMap<>(){{
                put("PE", 9616621L);
                put("AL", 3351543L);
                put("CE", 9187103L);
                put("RN", 3534265L);
                put("PB", 4039277L);
            }};
            System.out.println(dadosPopulacaoLinkado.toString());

        System.out.println("______________________________________________________________________________________________________");
            System.out.println("Exiba todos os estados e suas populações na ordem alfabética: ");
            Map<String, Long> dadosPopulacaoTree = new TreeMap<>(dadosPopulacaoLinkado);
            System.out.println(dadosPopulacaoTree.toString());

        System.out.println("______________________________________________________________________________________________________");
            System.out.print("Exiba o estado com o maior população e seu respectivo valor: ");
            Set<Entry<String, Long>> entrySet = dadosPopulacao.entrySet();
            for (Entry<String,Long> entry : entrySet) {
                if(entry.getValue().equals(Collections.max(dadosPopulacao.values()))){
                    System.out.printf("[%s: %d]\n", entry.getKey(), entry.getValue());
                }
            }
            
        System.out.println("______________________________________________________________________________________________________");
            System.out.print("Exiba o estado com o menor população e seu respectivo valor: ");
            for (Entry<String,Long> entry : entrySet) {
                if(entry.getValue().equals(Collections.min(dadosPopulacao.values()))){
                    System.out.printf("[%s: %d]\n", entry.getKey(), entry.getValue());
                }
            }
        System.out.println("______________________________________________________________________________________________________");
            System.out.print("Exiba a soma da população desses estados: ");
            Long soma = 0L;
            for (Entry<String,Long> entry : entrySet) {
                soma+= entry.getValue();    
            }
            System.out.println(soma);

        System.out.println("______________________________________________________________________________________________________");
            System.out.println("Exiba a média da população deste dicionário de estados: "+(soma/dadosPopulacao.size()));

        System.out.println("______________________________________________________________________________________________________");
            System.out.println("Remova os estados com a população menor que 4.000.000:");
            Iterator<Entry<String, Long>> iterator = dadosPopulacao.entrySet().iterator();
            while(iterator.hasNext()){
                Entry<String, Long> entry = iterator.next();
                 if(entry.getValue()<4000000L){
                    System.out.printf("Estado removido [%s: %d]\n", entry.getKey(), entry.getValue());
                    iterator.remove();
                 }
            }
        System.out.println("______________________________________________________________________________________________________");
            System.out.println("Exiba o dicinário pós remoções: ");
            System.out.println(dadosPopulacao.toString());

        System.out.println("______________________________________________________________________________________________________");
            System.out.println("Apague o dicionario de estados com suas respectivas populações estimadas: ");
            dadosPopulacao.clear();
            dadosPopulacaoLinkado.clear();
            dadosPopulacaoTree.clear();
            boolean isEmpty = false;
            if(dadosPopulacao.isEmpty()){
                if(dadosPopulacaoLinkado.isEmpty()){
                    if(dadosPopulacaoTree.isEmpty()){
                        isEmpty = true;
                    }
                }
            }
            System.out.printf("Dados apagados? -> %b", isEmpty);

    }
}
    
