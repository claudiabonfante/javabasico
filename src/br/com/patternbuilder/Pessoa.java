package br.com.patternbuilder;

public class Pessoa {
    private String nome;
    private String ultimoNome;
    private String apelido;

//    Construtor privado pra ser usado no Builder
    private Pessoa(String nome, String ultimoNome, String apelido){
        this.nome = nome;
        this.ultimoNome = ultimoNome;
        this.apelido = apelido;
    }

    public static class Builder{
        private String nome;
        private String ultimoNome;
        private String apelido;

//      Construtor sem parâmetro
        public Builder(){

        }

//      criar metodo com tipo de retorno pra ele mesmo, para poder fazer chamadas concatenadas
        public Builder nome(String nome){
            this.nome = nome;
            return this;
        }

        public Builder ultimoNome(String ultimoNome){
            this.ultimoNome = ultimoNome;
            return this;
        }

        public Builder apelido(String apelido){
            this.apelido = apelido;
            return this;
        }

//      metodo criar pessoa
        public Pessoa criarPessoa(){
//            chamada do construtor privado pessoa
            return new Pessoa(nome, ultimoNome, apelido);
        }
    }
}
