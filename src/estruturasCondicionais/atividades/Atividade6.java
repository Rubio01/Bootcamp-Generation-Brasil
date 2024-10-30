package estruturasCondicionais.atividades;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int codigo;
		double salario, reajuste = 0, novoSalario;
		String nome, cargo = null;

		System.out.println("Nome do colaborador:");
		nome = leia.nextLine();

		System.out.println("Cargo do colaborador:[código 1 a 6]");
		codigo = leia.nextInt();
		
		switch (codigo) {

		case 1:
			cargo = "Gerente";
			reajuste = 0.1;
			break;
		case 2:
			cargo = "Vendedor";
			reajuste = 0.07;
			break;
		case 3:
			cargo = "Supervisor";
			reajuste = 0.9;
			break;
		case 4:
			cargo = "Motorista";
			reajuste = 0.06;
			break;
		case 5:
			cargo = "Estoquista";
			reajuste = 0.05;
			break;
		case 6:
			cargo = "Técnico de TI";
			reajuste = 0.08;
			break;

		default:
			System.out.println("Cargo NÃO EXISTE ");
			System.exit(0);
		}


		System.out.println("Digite o Salário:");// Separe as casas decimais por vírgula
		salario = leia.nextDouble();

		
		novoSalario = salario + (reajuste * salario);

		System.out.printf("\nNome do colaborador: %s", nome);
		System.out.printf("\n\nCargo: %s", cargo);
		System.out.printf("\n\nSalário: R$ %.2f", novoSalario);

		leia.close();
	}

}
