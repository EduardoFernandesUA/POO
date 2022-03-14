package Aula02;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double v1 = Helpers.getDouble(sc, "Get v1: ");
		double d1 = Helpers.getDouble(sc, "Get d1: ");
		double v2 = Helpers.getDouble(sc, "Get v2: ");
		double d2 = Helpers.getDouble(sc, "Get d2: ");

		double r;

		if( d1+d2 == 0) {
			r = 0;
		} else if( v1 == 0 || v2 == 0 ) {
			System.out.println("Uma velocidade é zero");
			return;
		} else {
			r = v1*( d1/(d1+d2) ) + v2*( d2/(d1+d2) );
		}
		
		System.out.println(r);

		sc.close();
		return;
	}
}
