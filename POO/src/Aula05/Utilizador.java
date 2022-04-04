package Aula05;

import java.util.Vector;

public class Utilizador {
	private String nome;
	private int nMec;
	private String curso;

	private Vector<Integer> livrosRequesitados = new Vector<>(3);

	Utilizador(String nome, int nMec, String curso) {
		this.nome = nome;
		this.nMec = nMec;
		this.curso = curso;
	}

	public Boolean addToLivrosRequesitados(int id) {
		if( livrosRequesitados.lastElement()==null ) {
			livrosRequesitados.add(id);
			return true;
		}
		return false;
	}

	public Boolean removeFromLivrosRequesitados(int id) {
		for (int i = 0; i < livrosRequesitados.size(); i++) {
			if( livrosRequesitados.get(i) == id ) {
				livrosRequesitados.remove(i);
				return true;
			}
		}
		return false;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setnMec(int nMec) {
		this.nMec = nMec;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getNome() {
		return this.nome;
	}
	public int getnMec() {
		return this.nMec;
	}
	public String getCurso() {
		return this.curso;
	}

	public String toString() {
		return String.format("Aluno: %d; %s; %s", this.nMec, this.nome, this.curso);
	}
}
