/**
 * <h1>Testando Argumentos</h1>
 */
public class Argumentos {
    public static void main(String[] args) {
        String nome = args [0];
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]); //vamos falar sobre Wrappers
        double altura = Double.valueOf(args[3]);
        /*
         * Ao iniciar o programa, digite:
         * ...\bin>java Programa nome sobrenome idade altura
         *                        ↕      ↕        ↕      ↕
         *                    args[0] args[1] args[2] args[3]
         * Perceba que não pedimos ao usuário para digitar, recebemos os valores 
         * no start do programa
         */

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        //Leia o README sobre args no terminal!!!!
    }
}
