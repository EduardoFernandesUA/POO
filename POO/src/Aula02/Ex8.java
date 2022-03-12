package Aula02;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double A = sc.nextDouble();
		double B = sc.nextDouble();

		double C = Math.sqrt( A*A + B*B );

		System.out.println( C );
		System.out.println( Math.toDegrees(Math.asin( A / C )) );

		sc.close();
	}
}
