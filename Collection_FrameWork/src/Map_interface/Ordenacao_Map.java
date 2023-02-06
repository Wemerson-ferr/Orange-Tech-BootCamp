package Map_interface;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Ordenacao_Map {
/*Dadas as seguintes informações sobre meus livros favoritos e seus autores,
crie um dicionário e ordene este dicionário exibindo (Nome Autor - Nome Livro);

Autor = Hawking, Stephen  - Livro = nome: Uma Breve História do Tempo. páginas: 256
Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, paginas: 408
Autor = Harari, Yuval Noah  - Livro = 21 Lições Para o Século 21, páginas: 432
*/
    public static void main(String[] args) {
            System.out.println("Exiba os livros em ordem aleátoria:");
            Map<String, Livro> livros = new HashMap<>(){{
                put("Stephen Hawking", new Livro("Uma Breve História do Tempo", 256));
                put("Charles Duhigg", new Livro("O poder do hábito", 408));
                put("Yuval Noah Harari", new Livro("21 lições para o século 21", 432));
            }};
            for (Entry<String, Livro> livro : livros.entrySet()) {
                System.out.printf("Autor: %s - Livro: %s\n", livro.getKey(), livro.getValue());
            }
        System.out.println("------------------------------------------------------------------------------------------------------");
            System.out.println("Exiba os livros por ordem de inserção:");
            Map<String, Livro> livrosLinked = new LinkedHashMap<>(){{
                put("Stephen Hawking", new Livro("Uma Breve História do Tempo", 256));
                put("Charles Duhigg", new Livro("O poder do hábito", 408));
                put("Yuval Noah Harari", new Livro("21 lições para o século 21", 432));
            }};
            for (Entry<String, Livro> livro : livrosLinked.entrySet()) {
                System.out.printf("Autor: %s - Livro: %s\n", livro.getKey(), livro.getValue());
            }
        System.out.println("------------------------------------------------------------------------------------------------------");
            System.out.println("Exiba por ordem alfabetica dos autores:");
            Map<String, Livro> livrosTree = new TreeMap<>(livrosLinked);
            for (Entry<String, Livro> livro : livrosTree.entrySet()) {
                System.out.printf("Autor: %s - Livro: %s\n", livro.getKey(), livro.getValue());
            }
        System.out.println("------------------------------------------------------------------------------------------------------");
            System.out.println("Exiba por ordem de nomes de livros: ");
            Set<Map.Entry<String, Livro>> livrosSet = new TreeSet<>(new ComparetorNome());
            livrosSet.addAll(livros.entrySet());
            for (Entry<String, Livro> livro : livrosSet) {
                System.out.printf("Autor: %s - Livro: %s\n", livro.getKey(), livro.getValue());
            }
        System.out.println("------------------------------------------------------------------------------------------------------");
            System.out.println("Exiba por ordem de número de páginas: ");
            Set<Map.Entry<String, Livro>> livrosSetPag = new TreeSet<>(new ComparetorPaginas());
            livrosSetPag.addAll(livros.entrySet());
            for (Entry<String, Livro> livro : livrosSet) {
                System.out.printf("Autor: %s - Livro: %s\n", livro.getKey(), livro.getValue());
            }
    }
}

class Livro{
    private String titulo;
    private Integer paginas;

    public Livro(String titulo, Integer paginas) {
        this.titulo = titulo;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
        result = prime * result + ((paginas == null) ? 0 : paginas.hashCode());
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
        Livro other = (Livro) obj;
        if (titulo == null) {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equals(other.titulo))
            return false;
        if (paginas == null) {
            if (other.paginas != null)
                return false;
        } else if (!paginas.equals(other.paginas))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "[titulo: " + titulo + ", paginas: " + paginas + "]";
    }
}

class ComparetorNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Entry<String, Livro> livroAux1, Entry<String, Livro> livroAux2) {

        return livroAux1.getValue().getTitulo().compareToIgnoreCase(livroAux2.getValue().getTitulo());
    }
        
}
class ComparetorPaginas implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Entry<String, Livro> livroAux1, Entry<String, Livro> livroAux2) {
        return livroAux1.getValue().getPaginas().compareTo(livroAux2.getValue().getPaginas());
    }
        
}