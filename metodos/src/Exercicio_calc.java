import java.util.Scanner;

public class Exercicio_calc {
    public static void main(String[] args){//Usado para fazer as chamadas
        //Nada será feito no main, tudo será metodo. Pra exercitar
        iniciaCalculadora();
    }
    public static void iniciaCalculadora(){
        System.out.println("Olá, seja bem vindo!");
        System.out.println("Iniciando calculadora...");
        opcoes();
    }
    
    public static void opcoes(){
        int[] valores = pedeValor();
        Scanner ler= new Scanner(System.in);
        System.out.println("Qual operação deseja?");
        System.out.println("(+) - adição");
        System.out.println("(-) - subtração");
        System.out.println("(*) - multiplicação");
        System.out.println("(/) - divisão");
        char operacao = ler.nextLine().charAt(0);

        switch(operacao){
            case '+':
                imprime(soma(valores[0],valores[1]));
                break;
            case '-':
                imprime(subtrai(valores[0],valores[1]));
                break;
            case '*':
                imprime(multiplica(valores[0],valores[1]));
                break;
            case '/':
                if(valores[0]!=0 && valores[1]!=0)
                    imprime(divide(valores[0],valores[1]));
                else    
                    System.out.println("Valor inválido! ∄(X/0)");
                break;        
        }
    }

    
    private static void imprime(int resultado) {
        System.out.println("O resultado é "+ resultado);
    }

    public static int[] pedeValor(){
        int num[] = new int[2]; 
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um número");
        num[0] = entrada.nextInt();
        System.out.println("Digite um número");
        num[1] = entrada.nextInt();
        entrada.nextLine(); //limpa scanner
        return num;
    }

    private static int soma(int i, int j) {
        return (i + j);
    }
    private static int subtrai(int i, int j) {
        return i - j;
    }
    private static int multiplica(int i, int j) {
        return i * j;
    }
    private static int divide(int i, int j) {
        return i / j;
    }
}
