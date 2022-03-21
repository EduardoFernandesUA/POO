package Aula03;

public class Ex1 {
	public static void main(String[] args) {
		Double notaP = Helpers.readInRange("notaP [0.0,20.0]: ", 0.0, 20.0);
		Double notaT = Helpers.readInRange("notaT [0.0,20.0]: ", 0.0, 20.0);
		
		notaP = Math.round(notaP*10) / 0.1;
		notaT = Math.round(notaP*10) / 0.1;

		if( notaP<7.0 || notaT<7.0 ) {
				System.out.println("Nota: 66");
		} else {
			int notaF = (int) Math.round(notaP*0.6 + notaT*0.4);
			System.out.println("Nota: " + notaF);
		}
		
	}
}
