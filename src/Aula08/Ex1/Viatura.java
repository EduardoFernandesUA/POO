package Aula08.Ex1;

import java.util.Vector;

abstract public class Viatura implements KmPercorridosInterface {
    private Vector<Integer> trajetos = new Vector<>();

    private String matricula;
    private String marca;
    private String modelo;
    private int potencia; // cv

    @Override
    public void trajeto(int quilometros) {
        this.trajetos.add(quilometros);
    }
    @Override
    public int ultimoTrajeto() {
        return this.trajetos.lastElement();
    }
    @Override
    public int distanciaTotal() {
        int sum = 0;
        for(int trajeto : this.trajetos) {
            sum += trajeto;
        }
        return sum;
    }
    
    public String getMatricula() {
        return matricula;
    }
    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String toString() {
        return String.format("Viatura: %s %s %s %dcv", this.matricula, this.marca, this.modelo, this.potencia);
    }
}
