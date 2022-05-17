package Aula08.Ex1;

public class Taxi extends AutomovelLigeiro {
    private int numLicenca;

    public int getNumLicenca() {
        return numLicenca;
    }

    public void setNumLicenca(int numLicenca) {
        this.numLicenca = numLicenca;
    }

    public String toString() {
        return "Taxi: " + this.numLicenca + " ," + super.toString();
    }
    public boolean equals(Object obj) {
        return super.equals(obj) && getClass() == obj.getClass() && this.numLicenca == ((Taxi) obj).getNumLicenca();
    }
    public int hashCode() {
        return super.hashCode() + this.numLicenca;
    }
}
