package collection;

import java.util.List;

public class TesteCurso {
    public static void main(String[] args) {
        Curso javaCollections = new Curso("Curso 01", "Maria");
        List<Aula> aulas = javaCollections.getAulas();
        System.out.println(aulas);


//        Após informar o unmodifiable no get List<Aulas>, não é permitido adicionar aula diretamente aqui:
//        javaCollections.getAulas().add(new Aula("Primeira", 5));
//        adicionando aula através do metodo vazio criado na clase Curso

        javaCollections.adiciona(new Aula("Aula 01", 5 ));
        javaCollections.adiciona(new Aula("Aula 02", 15 ));
        javaCollections.adiciona(new Aula("Aula 03", 25 ));


//        para demonstrar que o aulas e o javaCollections.getAulas são a mesma referencia

        System.out.println(aulas);
        System.out.println(javaCollections.getAulas());

        System.out.println(aulas == javaCollections.getAulas());
    }
}
