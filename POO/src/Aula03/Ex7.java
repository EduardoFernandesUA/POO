package Aula03;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int secret = (int) (Math.random()*99 + 1);
		int n = Integer.MIN_VALUE;

		int currMin = 0, currMax = 100;

		int i = 0;
		while( i<10 ) {
			n = Helpers.readInRange(
					"\nTentativa "+(++i)+"\nPick a number ("+currMin+","+currMax+"): ",
					currMin,
					currMax
				); 
			if( n<secret ) {
				System.out.println("Higher!");
				currMin = n+1;
			} else if( n>secret ) {
				System.out.println("Lower!");
				currMax = n-1;
			} else {
				System.out.println("Parabéns, Ganhou em "+i+" tentativas!");
				return;
			}
			System.out.printf("Pretende continuar? Prima (S)im: ");
			String ans = sc.next();
			if( ans.compareTo("S")!=0 && ans.compareTo("Sim")!=0 && ans.compareTo("s")!=0 ) break;
		}
		System.out.println("You run out of tries :(");

		sc.close();
	}
}
