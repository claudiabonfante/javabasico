package collection;

import java.util.*;

public class Curso {
    private String nome;
    private String instrutor;
//    Usar arrayList quando for buscar posições de listas grandes e usar o LinkedList quando for sempre alterar a primeira posição
    private List<Aula> aulas = new LinkedList<Aula>();
    private Set<Aluno> alunos = new HashSet<>();

//    usar o map quando é preciso percorrer muitos elementos por uma chave
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
//        unmodifiable não deixa que a lista seja modificada fora da classe.
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona(Aula aula){
        this.aulas.add(aula);
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public Aluno buscaMatriculado(int numero) {
        if(!matriculaParaAluno.containsKey(numero)){
            throw new NoSuchElementException("Matrícula não encontrada: " + numero );

        }


        return null;
    }
}
