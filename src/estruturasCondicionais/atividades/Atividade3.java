package estruturasCondicionais.atividades;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String nome;
		int idade;
		boolean primeiraDoacao;

		System.out.println("Digite o Nome do doador:");
		nome = leia.nextLine();

		System.out.println("Digite a Idade do doador:");
		idade = leia.nextInt();

		System.out.println("Primeira doação de sangue?:");
		primeiraDoacao = leia.nextBoolean();

		if (idade > 17 && idade < 70) {

			if ((idade > 59 && idade < 70) && primeiraDoacao) {
				System.out.printf("%s não está apto para doar sangue!", nome);
			} else {
				System.out.printf("%s está apto para doar sangue!", nome);
			}

		} else {
			System.out.printf("%s não está apto para doar sangue!", nome);
		}

		leia.close();
	}
}