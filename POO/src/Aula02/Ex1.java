package Aula02;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Double km = sc.nextDouble();;
		System.out.println( km/1.609 + " milhas" );

		sc.close();
	}
}
