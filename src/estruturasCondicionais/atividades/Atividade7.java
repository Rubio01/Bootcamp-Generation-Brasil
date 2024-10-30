package estruturasCondicionais.atividades;

import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o 1º número: ");
		float numero1 = leia.nextFloat();

		System.out.println("Digite o 2º número: ");
		float numero2 = leia.nextFloat();

		System.out.println("[1] SOMA");
		System.out.println("[2] SUBTRAÇÃO");
		System.out.println("[3] MULTIPLICAÇÃO");
		System.out.println("[4] DIVISÃO");

		System.out.println("Digite a Operação: ");
		int codigo = leia.nextInt();

		switch (codigo) {
		case 1:
			System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
			break;
		case 2:
			System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
			break;
		case 3:
			System.out.println(numero1 + " x " + numero2 + " = " + (numero1 * numero2));
			break;
		case 4:
			System.out.println(numero1 + " ÷ " + numero2 + " = " + (numero1 / numero2));
			break;

		default:
			System.out.println("Opção Inválida!");
			break;
		}
		leia.close();
	}

}
