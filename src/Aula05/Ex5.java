package Aula05;

import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class Ex5 {
	public static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		Vector<Livro> livros = new Vector<>(100);
		Vector<Utilizador> utilizadores = new Vector<>(100);

		while(true) {
			System.out.println("\nBiblioteca:");
			System.out.println("1 - inscrever utilizador");
			System.out.println("2 - remover utilizador");
			System.out.println("3 - imprimir lista de utilizadores");
			System.out.println("4 - registar um novo livro");
			System.out.println("5 - imprimir lista de livros");
			System.out.println("6 - emprestar");
			System.out.println("4 - devolver");
			System.out.println("8 - sair");
			System.out.print("\nOption: ");

			int option = sc.nextInt();

			if(option == 1) { 
				System.out.println("(inscrever utilizador)");
				int nMec = 0;
				while(true) {
					System.out.print("nMec: ");
					nMec = sc.nextInt();
					for (Utilizador utilizador : utilizadores) {
						if(utilizador.getnMec() == nMec) {
							System.out.println("nMec já introduzido!");
							continue;
						}
					}
					break;
				}
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("curso: ");
				String curso = sc.nextLine();
				utilizadores.add(new Utilizador(nome, nMec, curso));
			} 
			else if(option == 2) {
				System.out.println("(remover utilizador)");
				int nMec = 0;
				Boolean removed = false;
				System.out.print("nMec: ");
				nMec = sc.nextInt();
				for (int i = 0; i < utilizadores.size(); i++) {
					if(utilizadores.get(i).getnMec() == nMec) {
						utilizadores.remove(i);
						System.out.println("utilizador removido");
						removed = true;
						System.in.read();
					}
				}
				if( !removed ) {
					System.out.println("Utilizador não encontrado!");
					System.in.read();
				}
			}
			else if(option == 3) {
				System.out.println("(imprimir lista de utilizadores)");
				for (Utilizador utilizador : utilizadores) {
					System.out.println(utilizador);
				}
				System.in.read();
			}
			else if(option == 4) {
				System.out.println("(registar um novo livro)");
				System.out.print("Titulo: ");
				String titulo = sc.nextLine();
				System.out.print("Tipo de Emprestimo (NORMAL ou CONDICIONAL): ");
				String tipoEmprestimo = sc.nextLine();
				livros.add(new Livro(titulo, tipoEmprestimo));
			}
			else if(option == 5) {
				System.out.println("(imprimir lista de livros)");
				for (Livro livro : livros) {
					System.out.println(livro);
				}
				System.in.read();
			}
			else if(option == 6) {
				System.out.println("(emprestar)");
				System.out.print("nMec do Aluno: ");
				int nMec = sc.nextInt();
				System.out.print("ID do Livro: ");
				int id = sc.nextInt();
				for (Utilizador utilizador : utilizadores) {
					if( utilizador.getnMec()==nMec ) {
						for (Livro livro : livros) {
							if( livro.getId() == id ) {
								if(livro.getDisponivel() && livro.getTipoEmprestimo().equals("NORMAL")) {
									if(utilizador.addToLivrosRequesitados(id))
										livro.setDisponivel(false);
								}
							}
						}
					}
				}
				
			}
			else if(option == 7) {
				System.out.println("(emprestar)");
				System.out.print("nMec do Aluno: ");
				int nMec = sc.nextInt();
				System.out.print("ID do Livro: ");
				int id = sc.nextInt();
				for (Utilizador utilizador : utilizadores) {
					if( utilizador.getnMec()==nMec ) {
						for (Livro livro : livros) {
							if( livro.getId() == id ) {
								if(!livro.getDisponivel()) {
									if(utilizador.removeFromLivrosRequesitados(id))
										livro.setDisponivel(true);
								}
							}
						}
					}
				}
			}
			else if(option == 8) {
				break;
			}
			else
			{
				System.out.println("Opção inválida!");
				System.in.read();
			}
		}

		sc.close();
	}
}
