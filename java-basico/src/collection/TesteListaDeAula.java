package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TesteListaDeAula {
    public static void main(String[] args) {
        Aula a1 = new Aula("Aula 01", 5);
        Aula a2 = new Aula("Aula 02", 10);
        Aula a3 = new Aula("Aula 03", 15);

        List<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        //aqui usa o toString para não mostrar a referencia na impressao
        System.out.println(aulas);


        //para usar o sort, a classe Aula precisa assinar o contrato de comparação.
        Collections.sort(aulas);
        System.out.println(aulas);

//        para ordenar por tempo e não por titulo, como está na classe Aula,mas também não atrapalhar a ordenação por título
        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);
    }

}
