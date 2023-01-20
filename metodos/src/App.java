public class App {
    public static void main(String[] args) throws Exception {
        /*Aula de metodos
        //Critério de nomeação de Métodos
         Para métodos, os critérios são:
        Deve ser nomeado como verbo;
        Seguir o padrão camelCase (Todas as letras minúsculas com a exceção da primeira letra da segunda palavra). */

        //exemplo de chamada de metodos
        int val1 =4, val2 = 4;
        somar(val1, val2);//-> Chamada com duas variáveis de parametro
        pegarNome();//-> metodo sem parametro
    }
    //alguns exemplos:
    static void somar(int valor1, int valor2){}//-> irá somar dois valores (correto)
    static void pegarNome(){}//-> Deverá encontrar algo no programa (correto)
    void nome(){}//-> Nomeclatura ambigua, o que faz? busca? define? (errado)
    void soma_E_imprime(){}//-> Um metódo deve ter uma unica função (errado)

    //Metodos podem conter parametros(dados enviados ao chama-lo)
    void somar(int valor1, int valor2, int resultado){}
  //tipo  nome (parametros...){ corpo/ bloco de codigos}

    //Tipos de retorno
    void x(){}//-> não retorna nada, apenas executa seu procedimento
    int y(){ return 0;}//-> retorna um valor int, deve finalizar com return
    String k(String nome){return "Meu mome";}// -> retorna uma string
    SmartTv z(){return null;}//-> retorna algum objeto,  neste caso null (vazio)

}

