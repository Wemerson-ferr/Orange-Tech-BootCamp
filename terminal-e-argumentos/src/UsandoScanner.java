import java.util.Scanner;//Importando o Scanner

public class UsandoScanner {
    //Usando o Scanner 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Ele deve ser importado para funcionar, olhe na primeira linha
        System.out.println("Digite um valor qualquer:");
        Double valor = sc.nextDouble();//Pega o primeiro valor que o usuário digitar e apertar Enter
        System.out.println("O valor digitado foi:"+ valor);

        //O Scanner permite um melhor controle dos fluxos de entradas pelo usuário, pois controlamos a ordem de quando será introduzido. Ele deve ser finalizado com o comando nomeDoScanner.close();
        sc.close();
    }
}
