import java.util.Scanner;

public class RepeticaoFor_While {
    //Agora temos as estruturas de repetição, que executam o bloco de codigo em seu interior uma determinda quantidade de vezes.
    public static void main(String[] args) {
        //for
        //Usado quando for uma repetição de valor controlado, ou seja, um limite estatico, geralmente númerico.

        //Exemplo: Um sistema simples que vai de 0 a 100
        for(int i=0; i<=100; i++){
            System.out.println("Valor atual: "+i);
        }

        //while
        //Usado para repetições indeterminadas, ou valor booleano. Pode ser usada com valor controlado também, porém o for mais visibilidade de ação

        //Exemplo: O programa irá pedir um nome ate que este seja igual a STOP.
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Digite seu nome: ");
        name = sc.next();
        while(!name.toLowerCase().equals("stop")){//Para quando nome == "stop"
            System.out.println("Digite seu nome: ");
            name = sc.next();//Atualização para evitar loop infinito.
        }

        //Do-while 
        //Parecido com while, porem o do garante 1 repetição no minimo do codigo.
        //Exemplo, loop enquanto a pessoa não digitar exit
        String input;
        do {
            System.out.println("Escreva algo ('exit' para sair): ");
            input = sc.nextLine();
            System.out.println("Você digitou: " + input);
        } while (!input.equals("exit"));
    }
    
}
