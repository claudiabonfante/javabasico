package br.com.pratica.salaodecabeleireiro;

import java.math.BigDecimal;

public class Servico {
    private String nome;
    private BigDecimal valor;
    private int tempo;

    public Servico(String nome, BigDecimal valor, int tempo) {
        this.nome = nome;
        this.valor = valor;
        this.tempo = tempo;
    }
}
