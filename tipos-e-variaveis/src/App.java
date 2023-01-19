public class App {
    public static void main(String[] args) throws Exception {
        //Tipos e variáveis em java

        //Númericos inteiros, ou seja, não contém decimais
        byte idade = 21; //-> Usado para valores de -128 até 127, sem casa decimal
        short ano = 2023; //-> Usado para valores de -32.768 até 32.767, também sem decimal
        int rg = 12345678; //-> Tipo mais usado, evite iniciar com 0, pois é ignorado(-2.147.483.648 até 2.147.483.647)
        long cpf = 12345678911L; //-> Evite também iniciar com 0. (-9.223.372.036.854.775.808 até 9.223.372.036.854.775.807). Deve conter o L no final do número

        //Númericos decimais
        float altura = 1.80F; //-> Precisão de 6 a 7 decimais. Deve conter F no final do número para não converter Double
        Double distancia = 300.96785; //-> Precisão de 15 decimais. Tipo mais usado com decimal.
        
        //Caracter e String
        char letra = 'a'; //-> Char é a variável que armazena somente um caracter da tabela ASCII.
        String nome = "Wemerson Ferreira de Brito"; //-> String é uma cadeia de caracteres, limite de 2bilhões
        
        //Booleano (Lógico)
        boolean escolha = true; //-> Assume valor de true ou false somente.
    }
}
