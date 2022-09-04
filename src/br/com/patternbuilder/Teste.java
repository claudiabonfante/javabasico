package br.com.patternbuilder;

public class Teste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa.Builder()
                .nome("Claudia")
                .ultimoNome("Brazao")
                .apelido("Clau")
                .criarPessoa();
    }
}
