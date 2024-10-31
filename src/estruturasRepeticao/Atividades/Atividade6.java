package estruturasRepeticao.Atividades;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		float numero, contador = 0, soma = 0, media;

		do {

			System.out.println("Digite um número:");
			numero = scanner.nextInt();
			if (numero % 3 == 0 && numero != 0) {
				soma += numero;
				contador++;
			}

		} while (numero != 0);

		media = soma / contador;

		System.out.println("A média de todos os números múltiplos de 3 é: " + media);

		scanner.close();

	}

}
