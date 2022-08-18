package salaodecabeleireiro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private LocalDate nascimento;
    private String telefone;
    private String email;
    List<String> alergias = new ArrayList<>();

    public Cliente(String nome, LocalDate nascimento, String telefone, String email, List<String> alergias) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.telefone = telefone;
        this.email = email;
        this.alergias = alergias;
    }
}
