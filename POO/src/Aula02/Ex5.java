package Aula02;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double v1 = sc.nextDouble();
		double d1 = sc.nextDouble();
		double v2 = sc.nextDouble();
		double d2 = sc.nextDouble();

		double r = v1*( d1/(d1+d2) ) + v2*( d2/(d1+d2) );
		System.out.println(r);

		sc.close();
	}
}
