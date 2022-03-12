package Aula02;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();

		double dx = x2 - x1;
		double dy = y2 - y1;

		System.out.println( Math.sqrt(dx*dx + dy*dy) );

		sc.close();
	}
}
