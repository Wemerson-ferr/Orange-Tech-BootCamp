import java.io.*;
import java.util.Scanner;
/* Nas checked exceptions o compilador ou IDE conseguem "prever" certas 
 * exceções que possam ocorrer, como por exemplo abaixo onde estamos tentando
 * ler um arquivo, se o arquivo não for encontrado é obrigatório o lançamento
 * uma exceção FileNotFoundException, que poderá ser tratada ou no método que 
 * faz a leitura ou no método que fez a chamada para a leitura. Ficando a cargo
 * do desenvolvedor a melhor forma. */
 
public class ExercicioCheckedException {
    public static void main(String[] args){
       leArquivo();

    }

    public static void leArquivo(){
        File arquivo;
        Scanner ler;
        try{
            arquivo = new File("C:\\Users\\wemer\\AppData\\Local\\Temp\\tmpf.txt");
            ler = new Scanner(arquivo);
            while(ler.hasNextLine()){
                System.out.println(ler.nextLine());
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Erro, revise o nome do arquivo ou diretório!");
            System.out.println(e.toString());
        }
        /*catch(IOException e){// Neste caso não foi necessário, porém deve-se fazer os catch na ordem mais especifica
            System.out.println("Ocorreu algum erro inesperado!");
        }*/
    }
}
