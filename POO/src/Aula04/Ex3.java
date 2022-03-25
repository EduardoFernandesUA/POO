package Aula04;

import java.util.Scanner;

public class Ex3 {
	public final static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Frase: ");
		String str = sc.nextLine();

		System.out.println("Acronimo: " + acronimo(str));
	}

	public static String acronimo(String str) {
		String r = "";
		String[] words = str.split(" ");
		
		for(String word : words) {
			if(word.length() > 3) 
				r += word.charAt(0);
		}
		
		return r;
	}
}
