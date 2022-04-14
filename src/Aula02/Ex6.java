package Aula02;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int total = Helpers.getInt(sc, "total seconds: ");

		int segundos = total%60;
		int minutos = (total-segundos)/60%60;
		int horas = (total-minutos*60-segundos)/(60*60)%60;

		System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);

		sc.close();
	}
}