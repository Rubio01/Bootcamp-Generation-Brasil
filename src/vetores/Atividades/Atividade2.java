package vetores.Atividades;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int numeros[] = new int[10], soma = 0;
		float media;

		System.out.println("Digite 10 números inteiros:");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = scanner.nextInt();
			soma = soma + numeros[i];
		}
		System.out.println("\nElementos nos índices ímpares:");
		for (int i = 0; i < numeros.length; i++) {
			if (i % 2 != 0)
				System.out.print(numeros[i] + " ");
		}
		System.out.println("\nElementos pares:");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0)
				System.out.print(numeros[i] + " ");
		}
		media = (float) soma / 10;

		System.out.println("\nSoma: " + soma);
		System.out.println("Média: " + media);

		scanner.close();

	}

}
