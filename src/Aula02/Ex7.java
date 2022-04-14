package Aula02;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double x1 = Helpers.getDouble(sc, "x1");
		double y1 = Helpers.getDouble(sc, "y1");
		double x2 = Helpers.getDouble(sc, "x2");
		double y2 = Helpers.getDouble(sc, "y2");

		double dx = x2 - x1;
		double dy = y2 - y1;

		System.out.println( Math.sqrt(dx*dx + dy*dy) );

		sc.close();
	}
}
