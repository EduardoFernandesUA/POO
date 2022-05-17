package Aula08.Ex1;

public class AutomovelLigeiro extends Viatura {
    private int numQuadro;
    private int capacBagageira;

    public int getCapacBagageira() {
        return capacBagageira;
    }
    public void setCapacBagageira(int capacBagageira) {
        this.capacBagageira = capacBagageira;
    }
    public int getNumQuadro() {
        return numQuadro;
    }
    public void setNumQuadro(int numQuadro) {
        this.numQuadro = numQuadro;
    }

    public String toString() {
        return "Automovel Ligeiro: " + this.numQuadro + " " + this.capacBagageira + " ," + super.toString();
    }
    public boolean equals(Object obj) {
        return super.equals(obj) && getClass() == obj.getClass() && this.numQuadro == ((AutomovelLigeiro) obj).getNumQuadro() && this.capacBagageira == ((AutomovelLigeiro) obj).getCapacBagageira();
    }
    public int hashCode() {
        return super.hashCode() + this.numQuadro + this.capacBagageira;
    }
}
