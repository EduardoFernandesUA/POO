import java.util.HashSet;
import java.util.Set;

public class PasseioBicicleta extends Atividade {
    private Set<String> locais;

    public PasseioBicicleta(int numero, String nome) {
        super(numero, nome);
        this.locais = new HashSet<>();
    }
    public PasseioBicicleta(int numero, String nome, String[] locais) {
        super(numero, nome);
        this.locais = new HashSet<>();
        for (String local : locais) {
            this.locais.add(local);
        }
    }

    public void addLocal(String local) {
        this.locais.add(local);
    }

    public String locais() {
        return this.locais.toString();
    }

    public int getNumLocais() {
        return this.locais.size();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
