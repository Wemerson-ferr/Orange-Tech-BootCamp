import javax.swing.*;
/* Exceções unchecked significa que o compilador ou IDE não consegue prever 
 * o erro que irá ocorrer, geralmente ligado ao "mal uso" pelo usuário igual
 * mostrado no exemplo abaixo, onde se o usuário digitar algo diferente de um número inteiro
 * ou digitar zero no denominador irá lançar um erro não previsto que iremos tratar. */
public class ExercicioUnchekedException {
    public static void main(String[] args) {
        boolean repete = true;
        do{// Repete o bloco caso haja exceção, ou seja enquanto repete for true.
            String numerador =  JOptionPane.showInputDialog("Digite o numerador:");//Cria caixa de input
            String denominador = JOptionPane.showInputDialog("Digite o denominador:");//Cria caixa de input
            try{
                int resultado = divide(Integer.parseInt(numerador), Integer.parseInt(denominador));
                System.out.println("Resultado: "+ resultado);
                repete = false;//Caso consiga executar irá mudar a variável e parar o loop.
            }
            catch(NumberFormatException e){// Trata exceção de entrada de String não numérica
                JOptionPane.showMessageDialog(null, "Entrada inválida, insira um número inteiro. "+ e.toString());//Cria uma caixa com a mensagem em parâmetro
            }
            catch(ArithmeticException e){// Trata a exceção de divisão por zero.
                JOptionPane.showMessageDialog(null, "Entrada inválida, impossível dividir por zero. "+ e.toString());//Cria uma caixa com a mensagem em parâmetro
            }
            finally{
                System.out.println("Esse bloco irá rodar independente do resultado try-catch");
            }
            System.out.println("Continuação do programa..."); 
        }while(repete);
    }

    public static int divide(int num1, int num2){
        return num1/num2;
    }
}
