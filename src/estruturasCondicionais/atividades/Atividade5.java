package estruturasCondicionais.atividades;

import java.util.Scanner;

public class Atividade5 {// Escolha um produto pelo código e sua quantidade que retornará o valor total e
							// o produto escolhido

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int codigo, quantidade, valorProduto = 0, valorTotal;

		String nome = null;

		System.out.println("Código do produto: [1 a 6]");
		codigo = leia.nextInt();
		

		switch (codigo) {

		case 1:
			nome = "Cachorro Quente";
			valorProduto = 10;
			break;
		case 2:
			nome = "X-Salada";
			valorProduto = 15;
			break;
		case 3:
			nome = "X-Bacon";
			valorProduto = 18;
			break;
		case 4:
			nome = "Bauru";
			valorProduto = 12;
			break;
		case 5:
			nome = "Refrigerante";
			valorProduto = 8;
			break;
		case 6:
			nome = "Suco de laranja";
			valorProduto = 13;
			break;
			
			default :
				System.out.println("CÓDIGO INVÁLIDO");
				System.exit(0);
		}


		
			System.out.println("Quantidade do produto:");
			quantidade = leia.nextInt();

			valorTotal = valorProduto * quantidade;

			System.out.printf("\nProduto: %s", nome);
			System.out.printf("\n\nValor total: R$ %.2f ", (double) valorTotal);
	
			
		

		leia.close();
	}

}
