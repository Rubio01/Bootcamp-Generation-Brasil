package vetores.Atividades;

import java.util.Locale;
import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);;// Locale Us para permitir inserir valor do tipo float com ponto 

		float notas[][] = new float[10][4], medias[] = new float[10];

		System.out.println("Entre com as notas de cada aluno:");

		for (int aluno = 0; aluno < 10; aluno++) {
			System.out.println("\nAluno: " + (aluno + 1));
			for (int bimestre = 0; bimestre < 4; bimestre++) {
				System.out.print((bimestre+1)+"° Bimestre" + " Nota: ");
				notas[aluno][bimestre] = scanner.nextFloat();
			}
		}
		
		scanner.close();

		for (int i = 0; i < 10; i++) {
			medias[i] = (notas[i][0] + notas[i][1] + notas[i][2] + notas[i][3]) / 4;
		}
		
		System.out.println("\nMédias:");
		for (int i = 0; i <10;i++ ) {
			 System.out.printf(Locale.US,"Aluno %d: %.1f%n",i+1,medias[i]);
		}
		
	}

}
