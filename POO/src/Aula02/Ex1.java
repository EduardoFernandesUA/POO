package Aula02;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double km;

		if(sc.hasNextDouble()) {
			km = Helpers.getDouble(sc, "Distancia [km]: ");
			System.out.println( km/1.609 + " milhas" );
		} else {
			System.out.println("Not a number");
		}

		sc.close();
	}
}
