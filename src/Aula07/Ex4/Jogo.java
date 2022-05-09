package Aula07.Ex4;

import java.time.LocalTime;

public class Jogo {
    private Equipa[] equipas;
    private Bola bola;
    private int duracaoJogo; // minutos
    private LocalTime tempoInicio;

    Jogo(int duracaoJogo) {
        this.tempoInicio = LocalTime.now();
        bola = new Bola(0, 0, "WHITE");
        this.duracaoJogo = duracaoJogo;
        equipas = new Equipa[2];

        equipas[0] = new Equipa("Equipa 1", "John", 2);
        equipas[0].addRobo("a", "GuardaRedes", -2, -2);
        equipas[0].addRobo("b", "Avancado", -2, 2);

        equipas[1] = new Equipa("Equipa 2", "Maria", 2);
        equipas[0].addRobo("c", "GuardaRedes", 2, -2);
        equipas[0].addRobo("d", "Avancado", 2, 2);
    }

    /**
     * 
     * @return (int) tempo decorrido em segundos
     */
    public int getCurrentTime() {
        LocalTime currTime = LocalTime.now();
        return (currTime.getMinute()-this.tempoInicio.getMinute())*60+(currTime.getSecond()-this.tempoInicio.getSecond());
    }
}
