package collections.listadeobjetos;


import java.util.HashSet;
import java.util.Set;

public class TesteAluno {
    public static void main(String[] args) {
//        usar o set quando é necessário fazer buscas em grande conjunto de elementos
        Set<String> alunos = new HashSet<>();
//        usando o set não há ordem para impressao
        alunos.add("Aluno 01");
        alunos.add("Aluno 02");
        alunos.add("Aluno 03");
        alunos.add("Aluno 04");
        alunos.add("Aluno 05");
        alunos.add("Aluno 06");
        alunos.add("Aluno 04");

        System.out.println(alunos);

//        ao imprimir, o set garante que não há objetos repetidos
        System.out.println(alunos.size());

//        para acessar os elementos usar foreach, pois não há index. É como uma sacola cheia de coisas, não existe ordem.
        for (String aluno : alunos
             ) System.out.println(aluno); {
            
        }
    }
}
