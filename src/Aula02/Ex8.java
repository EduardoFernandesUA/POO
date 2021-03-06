package Aula02;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double A = Helpers.getDouble(sc, "A: ");
		double B = Helpers.getDouble(sc, "B: ");

		if( A<=0 || B<=0 ) {
			System.out.println("Invalid Values, must be >=0!");
			return;
		}

		double C = Math.sqrt( A*A + B*B );

		System.out.println( C );
		System.out.println( Math.toDegrees(Math.asin( A / C )) );

		sc.close();
	}
}
