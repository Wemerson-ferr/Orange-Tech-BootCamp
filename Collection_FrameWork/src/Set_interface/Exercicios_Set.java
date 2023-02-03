package Set_interface;

import java.util.LinkedHashSet;
import java.util.Set;

public class Exercicios_Set {
/*
    Crie uma conjunto contendo as cores do arco-íris e:
    -> "violeta", "anil", "azul", "verde", "amarelo", "laranja", "vermelho"
    a) Exiba todas as cores o arco-íris uma abaixo da outra;
    b) A quantidade de cores que o arco-íris tem;
    c) Exiba as cores em ordem alfabética;
    d) Exiba as cores na ordem inversa da que foi informada;
    e) Exiba todas as cores que começam com a letra ”v”;
    f) Remova todas as cores que não começam com a letra “v”;
    g) Limpe o conjunto;
    h) Confira se o conjunto está vazio;
*/
    public static void main(String[] args) {
        Set<String> arcoIris = new LinkedHashSet<>(){{
            add("violeta");
            add("anil");
            add("azul");
            add("verde");
            add("amarelo");
            add("laranja");
            add("vermelho");
        }};
        System.out.println(arcoIris.toString());
    }
}
