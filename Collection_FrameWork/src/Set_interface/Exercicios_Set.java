package Set_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

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
        Set<String> arcoIris = new HashSet<>(){{
            add("violeta");
            add("anil");
            add("azul");
            add("verde");
            add("amarelo");
            add("laranja");
            add("vermelho");
        }};
        for (String string : arcoIris) {// a)
            System.out.println(string);
        }
        System.out.printf("O arco-irís tem %d cores\n", arcoIris.size()); // b)

        TreeSet<String> arvoreArcoIris= new TreeSet<String>(arcoIris);// c) 
        for (String cor : arvoreArcoIris) {
            System.out.println(cor);
        }
        LinkedHashSet<String> arcoIrisLinkado = new LinkedHashSet<String>(){{
            add("violeta");
            add("anil");
            add("azul");
            add("verde");
            add("amarelo");
            add("laranja");
            add("vermelho");
        }};
        System.out.println(arcoIrisLinkado);
        List<String> listaArcoIris = new ArrayList<>(arcoIrisLinkado);
        System.out.println(listaArcoIris);// d)

        for (String cor : arcoIrisLinkado) {// e)
            if(cor.charAt(0)=='v'){
                System.out.println(cor);
            }
        }

        
    }
}
