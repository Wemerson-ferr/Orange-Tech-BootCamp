import java.util.Scanner;

public class ExercicioWhile {
    public static void main(String[] args) {
        /*
        Exercicio 1)
        Nome e Idade: Faça um programa que leia conjuntos de dois valores, o primeiro representando o nome do aluno e o segundo representando a sua idade. (Pare o programa inserindo o valor 0 no campo nome) 
        */
        Scanner sc = new Scanner(System.in);
        String name = " ";
        int age;
        while(!(name.equals("0"))){
            System.out.print("Digite o seu nome: ");
            name = sc.nextLine();
            if(name.equalsIgnoreCase("0")){break;}
            System.out.print("Digite a sua idade: ");
            age = sc.nextInt();
            System.out.printf("Olá %s! sua idade é %d anos\n", name, age);
            sc.nextLine();
        }

        /* 
        Exercicio 2)
        Nota: Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido. */
        int nota;
        System.out.println("Digite uma nota (entre 0-10)");
        nota = sc.nextInt();
        while(nota>=10 || nota<=0){
            System.out.println("Nota inválida! (entre 0-10)");
            nota = sc.nextInt();
            sc.nextLine();
        }
    }
}
