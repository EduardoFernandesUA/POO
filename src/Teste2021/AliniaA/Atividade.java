public abstract class Atividade {
    protected int numero;
    protected String nome;

    public Atividade(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public abstract String locais();

    public int getNumero() { return this.numero; }
    public String getNome() { return this.nome; }
    public abstract int getNumLocais();

    @Override
    public String toString() {
        return String.format("Atividade [num=%d, nome=%s]", this.numero, this.nome);
    }
}
