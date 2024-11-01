package collection.Atividades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Collections.addAll(numeros, 2, 5, 1, 3, 4, 9, 7, 8, 10, 6);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número que você deseja encontrar:");
		int num = scanner.nextInt();
		int posicao = numeros.indexOf(num);
		
		if (posicao != -1) {
			System.out.println("O número " + num + " está localizado na posição: " + posicao);
		} else {
			System.out.println("O número " + num + " não foi encontrado!");
		}
		scanner.close();
	}

}
