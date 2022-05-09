package Aula07.Ex3;

public class AgenciaDeViagens {
    private String nome;
    private String endereco;
    private Alojamento[] alojamentos;
    private viatura[] viaturas;

    AgenciaDeViagens(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.alojamentos = new Alojamento[10];
        this.viaturas = new Viatura[10];
    }

    public String getNome() { return this.nome; }
    public String getEndereco() { return this.endereco; }
}
