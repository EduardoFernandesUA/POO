package Aula05;

public class Livro {
	private static int nextID = 100;

	private int id;
	private String titulo;
	private String tipoEmprestimo;
	private boolean disponivel;

	Livro(String titulo) {
		this.id = nextID++;
		setTitulo(titulo);
		setTipoEmprestimo("NORMAL");
		setDisponivel(true);
	}

	Livro(String titulo, String tipoEmprestimo) {
		this.id = nextID++;
		setTitulo(titulo);
		setTipoEmprestimo(tipoEmprestimo);
		setDisponivel(true);
	}

	public void setTitulo(String titulo) {
		assert titulo.length()>0;
		this.titulo = titulo;
	}
	public void setTipoEmprestimo(String tipoEmprestimo) {
		assert tipoEmprestimo.equals("NORMAL") || tipoEmprestimo.equals("CONDICIONAL");
		this.tipoEmprestimo = tipoEmprestimo;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public int getId() {
		return this.id;
	}
	public String getTitulo() {
		return this.titulo;
	}
	public String getTipoEmprestimo() {
		return this.tipoEmprestimo;
	}
	public boolean getDisponivel() {
		return this.disponivel;
	}

	public String toString() {
		return String.format("Livro %d; %s; %s", this.id, this.titulo, this.tipoEmprestimo);
	}
	
}
