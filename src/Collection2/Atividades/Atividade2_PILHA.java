package Collection2.Atividades;


import java.util.Scanner;
import java.util.Stack;

public class Atividade2_PILHA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();


		int opcao;

		do {
			System.out.println("\n*********Livraria Generation******");
			System.out.println("[1] Adicionar um novo livro na pilha");
			System.out.println("[2] Listar todos os livros na pilha");
			System.out.println("[3] Retirar um livro da pilha");
			System.out.println("[0] Sair");
			System.out.println("    Entre com a opção desejada:");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("\nNome do livro:");
				pilha.push(scanner.nextLine());

				System.out.println("\nPilha de livros:");
			
				pilha.forEach(elemento -> System.out.println(elemento));
				System.out.println("\nlivro Adicioando!");

				break;
			case 2:

				System.out.println("\nPilha de livros:");

				pilha.forEach(elemento -> System.out.println(elemento));

				break;
			case 3:

				if (pilha.isEmpty()) {
					System.out.println("A Pilha está vazia!");
				} else {
					String primeiro = pilha.peek();
					pilha.pop();
					System.out.println("\nPilha de livros:");
					pilha.forEach(elemento -> System.out.println(elemento));
					System.out.println("\nO livro " + primeiro + " foi retirado da pilha!");
				}
				break;
			case 0:
				System.out.println("Progama finalizado!");

				break;
			}
		} while (opcao != 0);

		scanner.close();
	}

}
