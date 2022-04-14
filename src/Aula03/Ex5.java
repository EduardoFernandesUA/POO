package Aula03;

public class Ex5 {
	public static void main(String[] args) {
		Double amount = 1.0;
		while( amount%1000 != 0 ) {
			amount = Helpers.readInRange("Amount Invested (Positive and 1000 multiple): ", 0.0, Double.MAX_VALUE);
		}
		Double juro = Helpers.readInRange("Juro [0,5]%: ", 0.0, 5.0);

		for (int i = 0; i <= 12; i++) {
			amount += amount*(juro/100);
			System.out.printf("Mês %d: %.2f\n", i, amount);
		}
	}
}
