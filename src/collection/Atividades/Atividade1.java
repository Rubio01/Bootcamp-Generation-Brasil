package collection.Atividades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		

		ArrayList<String> cores = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite 5 cores:");
		for (int i = 0; i < 5; i++) {

			cores.add(scanner.nextLine());
		}

		System.out.println("\nLista todas as cores:\n");
		for (String cor : cores) {
			System.out.println(cor);
		}

		System.out.println("\nCores em ordem crescente:\n");
		Collections.sort(cores);
		for (String cor : cores) {
			System.out.println(cor);
		}
		scanner.close();
	}

}
