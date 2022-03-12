package Aula02;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double M = sc.nextDouble();
		double initialTemperature = sc.nextDouble();
		double finalTemperature = sc.nextDouble();

		System.out.println(M * (finalTemperature - initialTemperature) * 4184);

		sc.close();
	}
}
