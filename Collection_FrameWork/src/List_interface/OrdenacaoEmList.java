package List_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoEmList {
    
    public static void main(String[] args) {
        List<Gato> meusGatos= new ArrayList<>(){{
            add(new Gato("Bolinha", 3, "Branca"));
            add(new Gato("Raven", 8, "Preta"));
            add(new Gato("Pelucio", 1, "Laranja"));
        }};//Modo de insersão altenativo.
        System.out.println("Impressão em ordem que foi inserido:");
        System.out.println(meusGatos);// Para impressão de objetos devemos sobrescrever o ToString() 

        System.out.println();

        System.out.println("Impressão em ordem aleatória:");
        Collections.shuffle(meusGatos);//-> método importado da interface Collections .shuffle(objectList)
        System.out.println(meusGatos);

        System.out.println();

        System.out.println("Impressão por ordem natural:");// Ordem de nome. Modificada no CompareTo() de Gato
        Collections.sort(meusGatos);// Para usar este método os elementos da list devem conter o Comparable implementado ↰
        System.out.println(meusGatos);
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("--\tOrdem Idade\t---");
//        Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorIdade());//Ultilizando a classe criada a baixo
        System.out.println(meusGatos);

        System.out.println("--\tOrdem cor\t---");
//        Collections.sort(meusGatos, new ComparatorCor());
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("--\tOrdem Nome/Cor/Idade\t---");
//        Collections.sort(meusGatos, new ComparatorNomeCorIdade());
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    Gato(String nome, int idade, String cor){
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getNome() {
        return nome;
    }
    public Integer getIdade() {
        return idade;
    }
    public String getCor() {
        return cor;
    }
    @Override
    public String toString() {//Método para imprimir objetos
        return "{"+"nome: '" + this.nome + "'" + 
        ", idade: "+ this.idade + ", cor: '" + this.cor+"'}"          
        ;
    }
    @Override
    public int compareTo(Gato gatoX) {//Método abstrato da interface Comparable
        return this.getNome().compareToIgnoreCase(gatoX.getNome());
    }
}

//Comparator é uma das interfaces do Collections Framework que funcionam em List
//Ele permite ordenar um List de acordo com o a implementação nescessaria. Desde que gere um valor int na comparação
class ComparatorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor !=0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());

    }
}