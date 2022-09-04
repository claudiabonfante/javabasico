package br.com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestandoLista {
    public TestandoLista(String s, int i) {
    }

    public static void main(String[] args) {
        String teste1 = "Teste 01";
        String teste2 = "Modelando testes";
        String teste3 = "Trabalhando com testes";
        String teste4 = "A - teste ordenacao ";

        List<String> testes = new ArrayList<>();
        testes.add(teste1);
        testes.add(teste2);
        testes.add(teste3);
        testes.add(teste4);

        System.out.println(testes);

        testes.remove(0);

        System.out.println(testes);

        //para cada teste dentro de testes, faça:
        for (String teste: testes) {
            System.out.println("Teste: " + teste);
        }

        String primeiroTeste = testes.get(0);
        System.out.println("Primeiro teste: " +primeiroTeste);

        for (int i = 0; i < testes.size(); i++){
            System.out.println("Teste: " + testes.get(i));
        }

        testes.forEach(teste -> {System.out.println("Percorrendo: "+teste);});

        Collections.sort(testes);
        System.out.println(testes);
    }
}
