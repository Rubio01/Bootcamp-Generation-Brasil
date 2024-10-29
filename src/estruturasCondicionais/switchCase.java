package estruturasCondicionais;

import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {

		int opcao;

		Scanner leia = new Scanner(System.in);

		System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");
		System.out.println("\n--Digite 1 para ver Indicação de um Livro--");
		System.out.println("--Digite 2 para ler uma Frase Motivacional--");
		System.out.println("--Digite 3 para receber uma Indicação de música--");

		opcao = leia.nextInt();

		switch (opcao) {

		case 1:
			System.out.println("Senhor dos aneis");
			break;

		case 2:
			System.out.println("Bata ou corra.");
			break;

		case 3:
			System.out.println("só preciso de dinheiro pra comprar o mé - Charlie brown Jr");
			break;

		default:
			System.out.println("Opção Inválida");
			break;

		}

		leia.close();
	}

}
