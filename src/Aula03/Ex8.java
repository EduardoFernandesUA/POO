package Aula03;

class AlunoPauta {
	double notaT;
	double notaP;
	int notaF;
}

public class Ex8 {
	public static void main(String[] args) {
		AlunoPauta pauta[] = new AlunoPauta[16];

		for (int i = 0; i < pauta.length; i++) {
			pauta[i] = new AlunoPauta();
			
			pauta[i].notaT = Math.random()*20.0;
			pauta[i].notaP = Math.random()*20.0;

			if( pauta[i].notaT<7.0 || pauta[i].notaP<7.0 ) pauta[i].notaF = 66;
			else pauta[i].notaF = (int) Math.round(pauta[i].notaT*0.4 + pauta[i].notaP*0.6);
		}

		System.out.println("NotaT  NotaP  Pauta");
		for(AlunoPauta aluno : pauta) {
			System.out.printf(" %4.1f   %4.1f     %2d\n", 
				aluno.notaT, aluno.notaP, aluno.notaF);
		}
	}

	
}
