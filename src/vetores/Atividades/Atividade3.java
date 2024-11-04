package vetores.Atividades;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeros[][] = new int[3][3];
		Scanner scanner = new Scanner(System.in);

		System.out.println("Preencha uma matriz 3x3");

		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.println("Digite um valor para a posição [" + linha + "][" + coluna + "]: ");
				numeros[linha][coluna] = scanner.nextInt();
			}
		}
		scanner.close();

		System.out.println("\nElementos da Diagonal Principal:");
		System.out.println(numeros[0][0] + " " + numeros[1][1] + " " + numeros[2][2]);
		System.out.println("\nElementos da Diagonal Secundária:");
		System.out.println(numeros[0][2] + " " + numeros[1][1] + " " + numeros[2][0]);
		System.out.println("\nSoma dos Elementos da Diagonal Principal:");
		System.out.println(numeros[0][0] + numeros[1][1] + numeros[2][2]);
		System.out.println("\nSoma dos Elementos da Diagonal Secundária:");
		System.out.println(numeros[0][2] + numeros[1][1] + numeros[2][0]);

	}

}
