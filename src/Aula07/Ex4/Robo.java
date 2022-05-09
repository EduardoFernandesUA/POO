package Aula07.Ex4;

public class Robo extends ObjetoMovel {
    private String id;
    private String tipo;
    private int numeroGolos;

    Robo(String id, String tipo, int x, int y) {
        this.id = id;
        this.tipo = tipo;
        super.move(x, y);
        this.numeroGolos = 0;
    }

    public void marcarGolo() {
        this.numeroGolos++; 
    }
}
