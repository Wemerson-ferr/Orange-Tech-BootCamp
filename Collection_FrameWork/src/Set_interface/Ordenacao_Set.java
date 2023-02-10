package Set_interface;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ordenacao_Set {
    /*Dadas as seguintes informações sobre minhas séries favoritas,
    crie um conjunto e ordene este conjunto exibindo:
    (nome - genero - tempo de episódio);
    Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
    Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
    Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25
    */
    public static void main(String[] args) {
        //Exiba as series em ordem aleatoria:
            Set<Serie> minhasSeries = new HashSet<>(){{
                add(new Serie("got", "fantasia", 60));
                add(new Serie("dark", "drama", 60));
                add(new Serie("that '70s show", "comédia", 25));
            }};
            for (Serie serie: minhasSeries){
                 System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
            }
        System.out.println("------------------------------------------------------------------------------------------------------");
        //Exiba em ordem de inserção:
            //Como o HashSet não ordena, usaremos o linkedHashSet
            Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
                add(new Serie("got", "fantasia", 60));
                add(new Serie("dark", "drama", 60));
                add(new Serie("that '70s show", "comédia", 25));
            }};
            for (Serie serie : minhasSeries1) {
                System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
            }
        System.out.println("------------------------------------------------------------------------------------------------------");
        //Exiba pela ordem natural (TempoEpisodio), em caso de repetição de valor o desempate é por (nome)
        //Verifique método compare na Classe Serie. <-----------------------------------------------------
            Set<Serie> minhasSeriesTree = new TreeSet<>(){{
                add(new Serie("got", "fantasia", 60));
                add(new Serie("dark", "drama", 60));
                add(new Serie("that '70s show", "comédia", 25));
            }};
            System.out.println(minhasSeriesTree.toString());

        //Exiba por ordem de nome - genero - tempo de episodio
        
            /* //Criaremos uma TreeSet nova e enviaremos um camparetor de parâmetro
            Set<Serie> minhaSerieTree2 = new TreeSet<>(new ComparetorNomeGeneroTempoEpisodeo());
            minhaSerieTree2.addAll(minhaSerieTree2);//Neste método passamos uma Collection já preenchido.
            System.out.println(minhaSerieTree2); */
    }
}  
class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    Serie(){
        this.nome = null;
        this.genero = null;
        this.tempoEpisodio = null;
    }
    Serie(String nome, String genero, int tempoEpisodio){
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }
    
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getGenero() {
        return this.genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public Integer getTempoEpisodio() {
        return this.tempoEpisodio;
    }
    public void setTempoEpisodio(Integer tempoEpisodio) {
        this.tempoEpisodio = tempoEpisodio;
    }

    @Override
    public String toString() {
        return "\n{nome: " + this.nome + ", genero: " + this.genero + ", tempoEpisodio: " + this.tempoEpisodio + "}";
    }
    @Override
    public int compareTo(Serie aux) {

        int tempoDeEpisodio = Integer.compare(this.getTempoEpisodio(), aux.getTempoEpisodio());
        if(tempoDeEpisodio != 0 ){
            return tempoDeEpisodio;
        }
        
        return this.getNome().compareToIgnoreCase(aux.getNome());
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + ((tempoEpisodio == null) ? 0 : tempoEpisodio.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Serie other = (Serie) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (genero == null) {
            if (other.genero != null)
                return false;
        } else if (!genero.equals(other.genero))
            return false;
        if (tempoEpisodio == null) {
            if (other.tempoEpisodio != null)
                return false;
        } else if (!tempoEpisodio.equals(other.tempoEpisodio))
            return false;
        return true;
    }
    
    
}

class ComparetorNomeGeneroTempoEpisodeo implements Comparator<Serie>{

    @Override
    public int compare(Serie aux1, Serie aux2) {
        int nomeComparado = aux1.getNome().compareTo(aux2.getNome());
        if(nomeComparado!=0)
            return nomeComparado;

        int generoComparado = aux1.getGenero().compareTo(aux2.getNome());
        if(generoComparado!=0)
            return generoComparado;

        return aux1.getTempoEpisodio().compareTo(aux2.getTempoEpisodio());
    }
    
}
