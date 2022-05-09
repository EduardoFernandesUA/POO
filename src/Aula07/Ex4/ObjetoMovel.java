package Aula07.Ex4;

public class ObjetoMovel {
    private int x;
    private int y;
    private Double distanciaPercorrida = 0.0;

    public void move(int newX, int newY) {
        this.distanciaPercorrida(this.x, this.y, newX, newY);
        this.x = newX;
        this.y = newY;
    }

    private void distanciaPercorrida(int x1, int y1, int x2, int y2) {
        this.distanciaPercorrida += Math.sqrt( Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) );
    }
}
