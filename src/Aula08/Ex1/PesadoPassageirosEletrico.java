package Aula08.Ex1;

public class PesadoPassageirosEletrico implements VeiculoEletrico {
    private int autonomia;
    private int charge;

    public int autonomia() {
        return this.autonomia;
    }

    public void carregar(int percentagem) {
        this.charge += percentagem;
    }
    public int getCharge() {
        return this.charge;
    }
}
