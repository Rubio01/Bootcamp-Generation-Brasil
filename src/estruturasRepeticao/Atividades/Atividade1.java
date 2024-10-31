package estruturasRepeticao.Atividades;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numero1, numero2, i;
		boolean condicao;

		System.out.println("Digite o primeiro número do intervalo:");
		numero1 = scanner.nextInt();

		System.out.println("Digite o primeiro número do intervalo:");
		numero2 = scanner.nextInt();

		if (numero1 < numero2) {

			System.out.printf("\nNo Intervalo entre %d e %d: \n\n", numero1, numero2);

			for (i = numero1; i <= numero2; i++) {
				condicao = i % 3 == 0 && i % 5 == 0;
				if (condicao) {
					System.out.println(i + " é múltiplo de 3 e 5");
				}

			}

		} else {
			System.out.println("Intervalo Inválido");
		}
		scanner.close();
	}

}
