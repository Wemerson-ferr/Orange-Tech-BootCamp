package Set_interface;

import java.util.Objects;

public class Ordenacao_Set {
    /*Dadas as seguintes informações sobre minhas séries favoritas,
    crie um conjunto e ordene este conjunto exibindo:
    (nome - genero - tempo de episódio);
    Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
    Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
    Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25
    */
    public static void main(String[] args) {
        
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
    
    @Override
    public String toString() {
        return "Serie [nome: " + nome + ", genero: " + genero + ", tempoEpisodio: " + tempoEpisodio + "]";
    }
    @Override
    public int compareTo(Serie o) {
        return 0;
    }
    
}


