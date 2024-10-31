package estruturasRepeticao.Atividades;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);

		int idade, totalMenor21 = 0, totalMaior50 = 0;
		boolean condicao = true;

		while (condicao) {

			System.out.println("Digite uma idade:");
			idade = scanner.nextInt();

			if (idade>0&&idade<21) totalMenor21++;
			if (idade>0&&idade>50) totalMaior50++;
			
			condicao = idade > 0;
		}

		System.out.println("\nTotal de pessoas menores de 21 anos: " + totalMenor21);
		System.out.println("\nTotal de pessoas maiores de 50 anos: " + totalMaior50);

		scanner.close();

	}

}
