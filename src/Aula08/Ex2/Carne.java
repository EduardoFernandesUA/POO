package Aula08.Ex2;

public class Carne extends Alimento {
    private VariedadeCarne variedadeCarne;

    Carne(VariedadeCarne variedadeCarne, double proteinas, double calorias, double peso) {
        super(proteinas, calorias, peso);
        this.variedadeCarne = variedadeCarne;
    }

    public String toString() {
        return String.format("Carne %s, %s", variedadeCarne, super.toString());
    }
}
