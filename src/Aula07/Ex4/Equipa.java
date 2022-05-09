package Aula07.Ex4;

public class Equipa {
    private String nome;
    private String nomeResponsavel;
    private int totalGolosMarcados;
    private int totalGolosSofridos;
    private Robo[] robos;

    Equipa(String nome, String nomeResponsavel, int numeroRobos) {
        this.nome = nome;
        this.nomeResponsavel = nomeResponsavel;
        this.totalGolosMarcados = 0;
        this.totalGolosSofridos = 0;
        robos = new Robo[numeroRobos];
    }

    public void addRobo(String id, String tipo, int x, int y) {
        int i = 0;
        while( robos[i++]!=null );
        robos[i] = new Robo(id, tipo, x, y);
    }
}
