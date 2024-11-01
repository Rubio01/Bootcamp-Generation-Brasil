package collection.Atividades;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Atividade3set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> numeros = new HashSet<Integer>();
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {

			System.out.println("Digite um número:");
			numeros.add(scanner.nextInt());
		}

		TreeSet<Integer> numerosOrdenados = new TreeSet<>(numeros);

		System.out.println("\nNumeros ordenados sem repetir:\n");
		Iterator<Integer> num = numerosOrdenados.iterator();

		while (num.hasNext()) {
			System.out.println(num.next());
		}

		scanner.close();

	}

}
