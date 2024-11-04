package vetores.Atividades;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num, posicao = -1, vetor[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		System.out.println("Digite o número que você deseja encontrar:");
		num = scanner.nextInt();

		for (int i = 0; i < 10; i++) {

			if (num == vetor[i])
				posicao = i;
		}

		if (posicao != -1)
			System.out.println("O número " + num + " está localizado na posição: " + posicao);
		else
			System.out.println("O número " + num + " não foi encontrado!");

		scanner.close();
	}
}
