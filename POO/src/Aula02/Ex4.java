package Aula02;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double amount = sc.nextDouble();
		double tax = sc.nextDouble() / 100;

		for(int i=0; i<3; i++) {
			amount += amount * tax;
		}

		System.out.println(amount);

		sc.close();
	}
}
