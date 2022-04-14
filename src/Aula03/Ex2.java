package Aula03;

public class Ex2 {
	public static void main(String[] args) {
		int n = Helpers.readInRange("Positive n: ", 0, Integer.MAX_VALUE);
		for (int i = n; i >= 0; i--) {
			System.out.println(i);
		}
	}
}
