package Map_interface;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Metodos_Map {
/*
 Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
 modelo = gol - consumo = 14,4km/l
 modelo = uno - consumo = 15,6 km/l
 modelo = mobi - consumo = 16,1 km/l
 modelo = hb20 - consumo = 14,5 km/l
 modelo = kwid - consumo = 15,6 km/l
 */
//Formas de declaração:
    //Map carrosPopulares2020 = new HashMap(); //antes do java 5
    //Map<String, Double> carrosPopulares = new HashMap<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)
    //HashMap<String, Double> carrosPopulares = new HashMap<>();
    //Map<String, Double> carrosPopulares2020 = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6);

    public static void main(String[] args) {
            System.out.println("Exiba o dicionário de carros: ");
            Map<String, Double> carrosPopulares = new HashMap<>(){{
                put("Gol", 14.4);
                put("Uno", 15.6);
                put("Mobi", 16.1);
                put("Hb20", 14.5);
                put("Kwid", 15.6);
            }};
            System.out.println(carrosPopulares.toString());

        System.out.println("------------------------------------------------------------------------------------------------------");

            System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
            carrosPopulares.put("Gol", 15.2);//Não temos como alterar, porém podemos substiruir o valor.
            System.out.printf("Consumo alterado: [%s: %.2f]\n", "Gol",carrosPopulares.get("Gol"));
        System.out.println("------------------------------------------------------------------------------------------------------");

            System.out.println("Verifique se o modelo 'Tucson' está no dicionário.");
            System.out.println("Contem modelo Tucson? -> "+ carrosPopulares.containsKey("Tucson"));// retorna boolean
        System.out.println("------------------------------------------------------------------------------------------------------");

            System.out.println("Exiba o consumo do uno:");
            System.out.printf("[Uno: %.2f]\n", carrosPopulares.get("Uno"));
        System.out.println("------------------------------------------------------------------------------------------------------");

            System.out.println("exiba o terceiro modelo adicionado:");
            System.out.println("Não é possivel, pois não há uma ordem de inserção");
        System.out.println("------------------------------------------------------------------------------------------------------");

            System.out.println("Exiba os modelos:");
            Set<String> modelos = carrosPopulares.keySet();// .KeySet retorna uma Set do tipo das key's inseridas 
            System.out.println(modelos.toString());
        System.out.println("------------------------------------------------------------------------------------------------------");

            System.out.println("Exiba os consumos:");
            Collection<Double> consumos = carrosPopulares.values();// Retorna uma Collection com tipo e os valores.
            System.out.println(consumos.toString());
        System.out.println("------------------------------------------------------------------------------------------------------");

            System.out.print("Exiba o modelo de carro mais eficiente (maior km/l): ");
            Double consumoEficiente = Collections.max(carrosPopulares.values());// Usamos o Collections.max e enviamos a coleção gerada pelo .value
            Set<Entry<String, Double>> entrySetMax = carrosPopulares.entrySet();
            String modeloEficiente = null;
            for (Entry<String,Double> entry : entrySetMax) {
                if(entry.getValue().equals(consumoEficiente)){
                    modeloEficiente = entry.getKey();
                    System.out.printf("[%s: %.2f]\n", modeloEficiente, consumoEficiente);
                }
            }
        System.out.println("------------------------------------------------------------------------------------------------------");

            System.out.print("Exiba o modelo de carro menos eficiente (maior km/l): ");
            Double consumoNaoEficiente = Collections.min(carrosPopulares.values());// Usamos o Collections.min e enviamos a coleção gerada pelo .value
            Set<Entry<String, Double>> entrySetMin = carrosPopulares.entrySet();
            String modeloNaoEficiente = null;
            for (Entry<String,Double> entry : entrySetMin) {
                if(entry.getValue().equals(consumoNaoEficiente)){
                    modeloNaoEficiente = entry.getKey();
                    System.out.printf("[%s: %.2f]\n", modeloNaoEficiente, consumoNaoEficiente);
                }
            }
        System.out.println("------------------------------------------------------------------------------------------------------");

            System.out.print("Exiba a soma dos consumos: ");
            Iterator<Double> iterador = carrosPopulares.values().iterator();
            Double somaConsumos = 0d;
            while(iterador.hasNext()){
                somaConsumos+=iterador.next();
            }
            System.out.println(somaConsumos);
        System.out.println("------------------------------------------------------------------------------------------------------");

            System.out.println("Exiba a media de consumo: "+ somaConsumos/carrosPopulares.size());
        System.out.println("------------------------------------------------------------------------------------------------------");

            System.out.println("Remova os modelos com consumo igual a 15.6 km/h: ");
            Iterator<Entry<String, Double>> iterator = carrosPopulares.entrySet().iterator();
            while (iterator.hasNext()) {
                Entry<String, Double> entry = iterator.next();
                if (entry.getValue().equals(15.6)) {
                    System.out.printf("Modelo removido: [%s: %.2f]\n",entry.getKey(), entry.getValue());
                    iterator.remove();
                }
            }
            System.out.println(carrosPopulares.toString());
        System.out.println("------------------------------------------------------------------------------------------------------");
            System.out.println("Exiba todos os carros em ordem em que foram informados: ");
            Map<String, Double> carrosPopularesLinkados = new LinkedHashMap<>(){{//Garante ordem de inserção
                put("Gol", 14.4);
                put("Uno", 15.6);
                put("Mobi", 16.1);
                put("Hb20", 14.5);
                put("Kwid", 15.6);
            }};
            System.out.println(carrosPopularesLinkados.toString());
        
        System.out.println("------------------------------------------------------------------------------------------------------");
            System.out.println("Exiba todos os carros por ordem de modelo: ");
            Map<String, Double> carrosPopularesTree = new TreeMap<>(carrosPopularesLinkados);//Ordenado por Árvore
            System.out.println(carrosPopularesTree.toString());

        System.out.println("------------------------------------------------------------------------------------------------------");
            System.out.println("Esvazie os dicionários e verifique se estão vazios: ");
            carrosPopulares.clear();
            carrosPopularesLinkados.clear();
            carrosPopularesTree.clear();
            System.out.printf("carrosPopulares está vazio? -> %b\n",carrosPopulares.isEmpty());
            System.out.printf("carrosPopularesLinkados está vazio? -> %b\n",carrosPopularesLinkados.isEmpty());
            System.out.printf("carrosPopularesTree está vazio? -> %b\n",carrosPopularesTree.isEmpty());

    }
}
