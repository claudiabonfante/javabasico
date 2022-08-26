package salaodecabeleireiro;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class AgendaDiaria {
    private LocalDate dia;
    private int horarioInicio;
    private int horarioFim;

    Map<Integer, Agendamento> horarios = new HashMap<>();

    public AgendaDiaria(LocalDate dia, int horarioInicio, int horarioFim, Map<Integer, Agendamento> horarios) {
        this.dia = dia;
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
        this.horarios = horarios;
    }
}
