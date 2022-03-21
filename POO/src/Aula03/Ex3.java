package Aula03;

public class Ex3 {
	public static void main(String[] args) {
		int n = Helpers.readInRange("number: ", 1, Integer.MAX_VALUE);
		
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if( n%i == 0 ) {
				System.out.println("Not a Prime Number!");
				return;
			}
		}
		System.out.println("Prime Number!");
	}
}
