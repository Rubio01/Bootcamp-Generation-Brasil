package collection.Atividades;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Atividade4set {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<Integer>();
		Collections.addAll(numeros, 2, 5, 1, 3, 4, 9, 7, 8, 10, 6);

		boolean encontrado;
		int num;

		System.out.println("Digite o número que você deseja encontrar:");
		num = scanner.nextInt();

		encontrado = numeros.contains(num);

		if (encontrado)
			System.out.println("O número " + num + " foi encontrado!");
		else
			System.out.println("O número " + num + " não foi encontrado!");

		scanner.close();
	}

}
