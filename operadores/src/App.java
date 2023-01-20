public class App {
    public static void main(String[] args) throws Exception {
        //Operadores em java: Simbolos com finalidades especicas dentro do código.
        
        //Atribuição (=)
            int valor = 10; //-> Usado para atrinuir um valor para variáveis

        //Operadores aritméticos (+, -, *, /, %)
            valor += 20; //-> Usado para somas, quando antes do = significa valor = valor + 20;
            valor -= 10; //-> Usado para subtrações, quando antes de = significa valor = valor - 10;
            valor *= 2; //-> Usado para multiplicação, quando antes de =, significa valor = valor * 2;
            valor /=4; //-> Usado para divião, quando ante de =, significa valor = valor/4
            valor %= 6; //-> Também para divisão, porem retorna o resto da divisão. Não o valor da divisão
        
        //Operador de concatenação (+)
            String nomeCompleto = "Wemerson" + "Ferreira";//-> Usado para "juntar" as Strings
            String concatenacao ="?"; 

            concatenacao = 1+1+1+"1";//-> Output "31", soma os tres primeiros e concatena o ultimo

            concatenacao = 1+"1"+1+1; //-> Output "1111", ele tenta somar e percebe uma String

            concatenacao = 1+"1"+1+"1";//-> Output "1111", novamente temos uma String no segundo item

            concatenacao = "1"+1+1+1;//-> Output "1111", agora como começou com String e concatenou novamente

            concatenacao = "1"+(1+1+1);//-> Output "13" por ordem de precendia o () deve ser executado primeiro
        
        //Operadores unarios(+, -, ++, --, !)
        int numero = 5;
		
        //Imprimindo o numero negativo
        System.out.println(- numero);//-> Output -5, porém não altera o valor 5 original, só o inverte
        numero = -numero;//-> Agora inverte o valor da variavel, tornado-a -5
        System.out.println(-(numero));//-> Aqui novamente invertemos, tornado-se 5 novamente(podemos mult po -1 tbm)
        //incrementando numero em mais 1 numero, imprime 4 (-5 +1)
        numero++;
        System.out.println(numero);//-> Output -4, este operador adiciona +1 a variável 
        
        //incrementando numero em mais 1 numero, deveria imprimir -3
        System.out.println(numero ++);//-> Output 4, como o operador foi usado depois, ele imprime o número depois incrementa
        
        System.out.println(numero);// agora sim, numero virou -3
        
        //ordem de precedencia conta aqui
        System.out.println(++ numero);//-> Output -2, pois o operador está antes
        
        boolean verdadeiro = true;
        
        System.out.println("Inverteu " + !verdadeiro);// Este operador (!) nega o valor booleano a sua frente
        
        //Operadores relacionais(>, <, &&, ||, ==, !=)
            boolean logico = 10>2; //-> Retorna true caso o primeiro seja maior que o segundo, false caso contrario
            logico = 10>=2; //-> Retorna true caso o primeiro seja maior ou igual o segundo, false cado contrário
            logico =10<2;//-> Retorna true caso o primeiro seja menor que o segundo, false caso contrario
            logico =10<=10; //-> Retorna true caso o primeiro seja  menor ou igual ao segundo, false caso contrário
            logico =true && true;//-> Só retorna true caso ambos sejam true
            logico =false || true;//-> Retorna true quando ao menos um seja true 
            logico = (true==logico);// -> Compara dois valores e retorna true caso forem iguais. Não use para objetos
            //Comparação de objetos
            Integer numero1 = 130;
            Integer numero2 = 130;
            System.out.println(numero1 == numero2); //false, pois ele compara objetos (endereço de memoria iqual)
            System.out.println(numero1.equals(numero2));// true, pois agora compara iqualdade em objetos(conteudos)
            int num1 = 5, num2 = 10;
            boolean teste = (num1!=num2);//-> Retorna true somente quando valores forem diferentes.

            //Operador ternario (xxxxx ? true : false)
            int val1 = 10, val2 = 10;
            boolean testeIgualdade = (val1 == val2)? true : false; //-> Testa se val1 é iqual a val2
            int conta = (val1 != val2)? val1 - val2 : val1 + val2; //-> Caso true, subtrai. Se false, soma
    }
}
