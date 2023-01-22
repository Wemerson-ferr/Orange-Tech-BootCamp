import java.util.Scanner;

public class ExercicioFor {
    public static void main(String[] args) {
    //Exercicios For:
        /*Exercicio 1)
        Tabuada: Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para ver a tabuada: ");
        int num = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(num +"x"+ i +" = "+ num*i);
        }

        //Exercicio 2)
        /* Fatorial: Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
        Ex.: 5!=5.4.3.2.1=120 */
        System.out.print("Digite um valor para calculo do fatorial: ");
        int num2 = sc.nextInt();
        int fat =1;
        for(int i=num2; i>0; i--){
            fat = fat*i;
        }
        System.out.println("O fatorial de "+num2+"! é "+fat);
    }
}
