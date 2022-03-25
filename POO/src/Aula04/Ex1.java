package Aula04;

import java.util.Scanner;

public class Ex1 {
	public final static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("String: ");
		String str = sc.nextLine();

		System.out.println("Minusculas: "+str.toLowerCase());
		System.out.println("Ultimo Caracter: "+str.charAt(str.length()-1));
		System.out.println("Primeiros 3 caracteres: "+str.substring(0, 3));

		// ...

	}
}
