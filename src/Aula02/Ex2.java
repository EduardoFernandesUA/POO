package Aula02;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(Helpers.getDouble(sc, "Graus [C]: ") * 1.8 + 32);

		sc.close();
	}
}
