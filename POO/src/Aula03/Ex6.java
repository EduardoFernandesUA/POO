package Aula03;

public class Ex6 {
	public static void main(String[] args) {
		int[] dias = {31,28,31,30,31,30,31,31,30,31,30,31};

		int mes = Helpers.readInRange("Mês: ", 0, 12);
		int ano = Helpers.readInteger("Ano: ");

		int bissexto = 0;
		if( mes==2 && ((ano % 400 == 0) || ( (ano % 4 == 0) && (ano % 100 != 0) )) )
			bissexto = 1;
		
		System.out.println("Dias: " + (dias[mes-1]+bissexto));
	}
}
