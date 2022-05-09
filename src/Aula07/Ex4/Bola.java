package Aula07.Ex4;

public class Bola extends ObjetoMovel {
    private String cor;

    Bola(int x, int y, String cor) {
        super.move(x, y);
        this.setCor(cor);
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCor() { return this.cor; }
}
