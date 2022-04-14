package Aula02;

import java.util.Scanner;

public class Helpers {
	public static Double getDouble(Scanner sc, String text) {
		while(true) {
			System.out.print(text);
			if(!sc.hasNextDouble()) {
				sc.next();
				continue;
			}
			return sc.nextDouble();
		}
	}

	public static int getInt(Scanner sc, String text) {
		while(true) {
			System.out.print(text);
			if(!sc.hasNextInt()) {
				sc.next();
				continue;
			}
			return sc.nextInt();
		}
	}
}
