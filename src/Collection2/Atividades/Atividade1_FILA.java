package Collection2.Atividades;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade1_FILA {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		int opcao;

		do {
			System.out.println("\n***********Generation Bank************");
			System.out.println("[1] Adicionar um novo Cliente na fila");
			System.out.println("[2] Listar todos os Clientes na fila");
			System.out.println("[3] Chamar (retirar) uma pessoa da fila");
			System.out.println("[0] Sair");
			System.out.println("    Entre com a opção desejada:");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("\nNome do cliente:");
				fila.add(scanner.next());

				System.out.println("\nFila de atendimento:");

				fila.forEach(elemento -> System.out.println(elemento));
				System.out.println("\nCliente Adicioando!");

				break;
			case 2:

				System.out.println("\nFila de atendimento:");

				fila.forEach(elemento -> System.out.println(elemento));

				break;
			case 3:

				if (fila.isEmpty()) {
					System.out.println("A Fila está vazia!");
				} else {
					String primeiro = fila.peek();
					fila.remove();
					System.out.println("\nFila de atendimento:");
					fila.forEach(elemento -> System.out.println(elemento));
					System.out.println("O cliente " + primeiro + " foi chamado!");
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
