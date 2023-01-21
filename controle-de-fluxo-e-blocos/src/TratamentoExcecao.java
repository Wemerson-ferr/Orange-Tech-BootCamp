public class TratamentoExcecao {
    /* Ao executar o código Java, diferentes erros podem acontecer: erros de codificação feitos pelo programador, erros devido a entrada errada ou outros imprevistos.
    Quando ocorre um erro, o Java normalmente para e gera uma mensagem de erro. O termo técnico para isso é: Java lançará uma exceção (jogará um erro).

    De forma interpretativa em Java, um erro é algo irreparável, a aplicação trava ou é encerrada drásticamente. Já exceções é um fluxo inesperado da nossa aplicação, exemplo: Querer dividir um valor por zero, querer abrir um arquivo que não existe, abrir uma conexão de banco, com usuário ou senha inválida. Todos estes cenários e os demais, não são erros mas sim fluxos, não previstos pela aplicação.

    É ai que entra mais uma responsabilidade do desenvolvedor, prever situações iguais a estas e realizar o que denominamos de Tratamento de Exceções. */

    /*A instrução try, permite que você defina um bloco de código, para ser testado quanto a erros enquanto está sendo executado.

    A instrução catch, permite definir um bloco de código a ser executado, caso ocorra um erro no bloco try.

    A instrução finally, permite definir um bloco de código a ser executado, independente de ocorrer um erro ou não. As palavras-chave try e catch vem em pares: */
    try {
        //  bloco de código conforme esperado
      }
      catch(Exception e) {// precisamos saber qual exceção
        // bloco de código que captura as exceções que podem acontecer
        // em caso de um fluxo não previsto
      }
}
