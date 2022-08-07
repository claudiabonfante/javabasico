package collections.listadeobjetos;

public class Aluno {
    private String nome;
    private int numeroMatricula;

    public Aluno(String nome, int numeroMatricula) {
        if(nome == null){
            throw new NullPointerException("Nome não pode ser nulo");
        }
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }
//      para verificar se o nome do aluno é igual, precisa reescrever o metodo equals para ele entender o que deve ser comparado
    @Override
    public boolean equals(Object obj) {
        Aluno outroAluno = (Aluno) obj;
        return this.nome.equals(outroAluno.nome);
    }
//     sempre que reescrever o equals, deve reescrever o hashcode
    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }

    @Override
    public String toString() {
        return "[Aluno: " + this.nome + ". Matricula : " + this.numeroMatricula + ".]";
    }
}
