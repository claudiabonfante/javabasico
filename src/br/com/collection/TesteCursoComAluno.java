package br.com.collection;

public class TesteCursoComAluno {
    public static void main(String[] args) {

        Curso javaCollections = new Curso("Curso 01", "Maria");
        javaCollections.adiciona(new Aula("Aula 01", 5 ));
        javaCollections.adiciona(new Aula("Aula 02", 15 ));
        javaCollections.adiciona(new Aula("Aula 03", 25 ));

        Aluno a1 = new Aluno("Primeiro Aluno", 1234);
        Aluno a2 = new Aluno("Segundo Aluno", 5678);
        Aluno a3 = new Aluno("Terceiro Aluno", 8901);

        javaCollections.matricula(a1);
        javaCollections.matricula(a2);
        javaCollections.matricula(a3);

        System.out.println("Todos alunos matriculados: ");
        javaCollections.getAlunos().forEach(a->{
            System.out.println(a);
        });

        System.out.println("O aluno " + a1 + " está matriculado? ");
        System.out.println(javaCollections.estaMatriculado(a1));
    }
}
