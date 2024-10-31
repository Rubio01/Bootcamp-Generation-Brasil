package estruturasCondicionais.atividades;

import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		float novoSaldo, valor, saldo = 1000;

		System.out.println("********Generation Bank********");
		System.out.println("_______O que deseja hoje?______\n");

		System.out.println("[1] Saldo");
		System.out.println("[2] Saque");
		System.out.println("[3] Depósito");

		int codigo = leia.nextInt();

		switch (codigo) {

		case 1:
			System.out.printf("Saldo = R$ %.2f", saldo);
			break;

		case 2:
			System.out.println("Valor:");
			valor = leia.nextFloat();
			System.out.println("Operação - Saque:");
			if (valor > saldo) {
				System.out.println("Saldo Insuficiente!");
			} else {
				novoSaldo = saldo - valor;
				System.out.printf("Novo saldo = R$ %.2f", novoSaldo);
			}
			break;

		case 3:
			System.out.println("Operação - Depósito");
			System.out.println("Valor:");
			valor = leia.nextFloat();
			novoSaldo = saldo + valor;
			System.out.printf("Novo saldo = R$ %.2f", novoSaldo);
			break;
  
		default:
			System.out.println("Opção Inválida!");
			break;
		}

		leia.close();
	}

}
