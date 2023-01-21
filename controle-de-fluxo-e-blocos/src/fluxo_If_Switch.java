public class fluxo_If_Switch {
    public static void main(String[] args) throws Exception {
        //Controle de fluxo:
        //Quando queremos que determinado bloco de codigos seja executado somente em determinada circunstancia.

        //1°) if / if else / else
        /* É usado quando se tem um teste logico envolvido, com pelo menos 2
         * variáveis. 
         */
        //Exemplo: Aprovado ou Reprovado -> Media 70% de 10, <50% reprovado, >60% recuperação
        Double media = 7.75;
        String status = "";
        if(media > 10*0.7){//Inicio do fluxo logico
            status = "Aprovado";
        }
        //É recomendado o uso do else if pois evita um teste a mais durante
        //a execução do programa.
        else if(media < 10*0.6){//Caso o 1° dê false, este será testado
            if(media < 10*0.5){//Caso o pai dê true este sera testado
                status = "reprovado";
            }
            else{//Este só será executado quando o if  for false
                status = "Recuperação";
            }
        }
        else{//Novamete, so será executado caso if e else if forem false
            System.out.println("Media inválida!");
        }

              //2°) switch
        /*É geralmente usado quando temos apenas uma variável para controle*/

        //Exemplo, uma calculadora simples, multiplica, divide, subtrai e soma
        char escolha = 'x';
        int num1 = 10;
        int num2 = 5;
        int resultado;
        
        switch (escolha) {
            case 'x'://Caso o char digitado seja X
                resultado = 10*5;
                break;
            case '/'://Caso o char digitado seja /
                resultado = 10/5;
                break;
            case '-'://Caso o char digitado seja -
                resultado = 10-5;
                break;
            case '+'://Caso o char digitado seja +
                resultado = 10+5;
            default://Caso o char seja outro, ou seja, invlido pro algoritmo
                System.out.println("Opção invalida!");
                break;
        }  
    }
}
