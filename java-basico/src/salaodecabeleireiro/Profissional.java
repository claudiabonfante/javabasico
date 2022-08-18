package salaodecabeleireiro;

import java.util.ArrayList;
import java.util.List;

public class Profissional {
    private String nome;
    List<Servico> servicos = new ArrayList<>();

    public Profissional(String nome, List<Servico> servicos) {
        this.nome = nome;
        this.servicos = servicos;
    }
}
