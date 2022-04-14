package Aula02;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double M = Helpers.getDouble(sc, "M: ");
		double initialTemperature = Helpers.getDouble(sc, "iT: ");
		double finalTemperature = Helpers.getDouble(sc, "fT: ");

		System.out.println(M * (finalTemperature - initialTemperature) * 4184);

		sc.close();
	}
}
