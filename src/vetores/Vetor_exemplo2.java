package vetores;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor_exemplo2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int vetorInteiros[] = new int[5];

		for (int i = 0; i < vetorInteiros.length; i++) {

			System.out.println("Digite o " + (i + 1) + "° número:");
			vetorInteiros[i] = scanner.nextInt();
		}
		for (int i = 0; i < vetorInteiros.length; i++) {

			System.out.println((i + 1) + "° número: " + vetorInteiros[i]);

		}
		Arrays.sort(vetorInteiros);
		
		System.out.println("\nVetor organizado por ordem crescente:\n");
		
		for (int i = 0; i < vetorInteiros.length; i++) {

			System.out.println((i + 1) + "° número: " + vetorInteiros[i]);

		}
	}

}
