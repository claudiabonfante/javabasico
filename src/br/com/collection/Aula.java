package br.com.collection;

public class Aula implements Comparable<Aula>{
    private String titulo;
    private int tempo;


    public Aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }


    public String getTitulo() {
        return titulo;
    }

    public int getTempo() {
        return tempo;
    }


    //alterando a impressão toString para não exibir a referencia
    @Override
    public String toString() {
        return "[Aula: " + this.titulo + ", " + this.tempo + "minutos]";
    }

    @Override
    public int compareTo(Aula outraAula) {
//        mesma coisa que o bloco abaixo
//        if(this.titulo.compareTo(outraAula.titulo) < 0){
//            return -1;
//        }
//        return 0;

        return this.titulo.compareTo(outraAula.titulo);

    }
}
