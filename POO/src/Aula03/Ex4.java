package Aula03;

public class Ex4 {
	public static void main(String[] args) {
		Double first, min, max, sum, n;
		int counter = 0;

		first = Helpers.readDouble("Number ["+(++counter)+"]: ");
		min = first;
		max = first;
		sum = first;
		
		while( true ) {
			n = Helpers.readDouble("Number ["+(++counter)+"]: ");
			if( n-first == 0 ) break;
			if( n > max ) max = n;
			if( n < max ) min = n;
			sum += n;
		}

		System.out.printf("Máximo: %.2f\n", max);
		System.out.printf("Mínimo: %.2f\n", min);
		System.out.printf("Média: %.2f\n", sum/(counter-1));
		System.out.printf("Foram lidos %d números\n", (counter-1));
	}
}
