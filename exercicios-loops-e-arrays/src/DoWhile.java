import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        //Exercicios do-while

        /*Exercicio 1) 
        Maior e Média: Faça um programa que leia 5 números e informe o maior número e a média desses números. */
        int num, media = 0, cont = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Digite um valor: ");
            num = sc.nextInt();
            media+=num;
            cont++;
        }
        while(cont<5);
        System.out.println("O resultado é "+ media/cont);

        /*Exercicio 2)
        Par e Ímpar: Faça um programa que peça N números inteiros. Calcule e mostre a quantidade de números pares e a quantidade de números impares. */

        int num1 = 0, impar = 0, par = 0;
        System.out.print("Insira a quantidade de repetição: ");
        int controle = sc.nextInt();
        int limitador = 0;
        do{
            System.out.println("Digite um valor: ");
            num1 = sc.nextInt();
            if(num1%2 == 0){
                par++;
            }
            else{impar++;}
            limitador++;
        }
        while(limitador<controle);
        System.out.println("Você inseriu "+ par +" números pares");
        System.out.println("Você inseriu "+ impar+" números impares");
    }
}
