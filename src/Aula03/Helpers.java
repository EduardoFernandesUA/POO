package Aula03;

import java.util.Scanner;

public class Helpers {
	private static final Scanner sc = new Scanner(System.in);

	public static Double readDouble(String text) {
		while(true) {
			System.out.print(text);
			if(!sc.hasNextDouble()) {
				System.out.println("Not a Number!");
				sc.next();
				continue;
			}
			return sc.nextDouble();
		}
	}

	public static int readInteger(String text) {
		while(true) {
			System.out.print(text);
			if(!sc.hasNextInt()) {
				System.out.println("Not a Number!");
				sc.next();
				continue;
			}
			return sc.nextInt();
		}
	}

	// read a double in a interval [min,max]
	public static Double readInRange(String text, double min, double max) {
		double n;
		while( true ) {
			System.out.print(text);
			if(!sc.hasNextDouble()) {
				sc.next();
				continue;
			}
			n = sc.nextDouble();
			if( n>=min && n<=max ) // if number in range
				break;
			else
				System.out.println("Number not in range!");
		}
		return n;
	}

	// read a integer in a interval [min,max]
	public static int readInRange(String text, int min, int max) {
		int n;
		while( true ) {
			System.out.print(text);
			if(!sc.hasNextInt()) {
				sc.next();
				continue;
			}
			n = sc.nextInt();
			if( n>=min && n<=max ) // if number in range
				break;
			else
				System.out.println("Number not in range!");
		}
		return n;
	}
}
