package estruturasCondicionais.atividades;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String p1, p2, p3;

		System.out.println("Digite 3 características de um ser vivo:\n");

		System.out.println("Primeira característica: Vertebrado ou Invertebrado?");
		p1 = leia.nextLine();

		if (p1.equalsIgnoreCase("Vertebrado")) {
			System.out.println("Segunda característica: Ave ou Mamífero?");
			p2 = leia.nextLine();

			if (p2.equalsIgnoreCase("Ave")) {
				System.out.println("Terceira característica: Carnívoro ou Onívoro?");
				p3 = leia.nextLine();

				if (p3.equalsIgnoreCase("Carnívoro")) {
					System.out.println("O ser vivo é uma Águia");
				} else {
					System.out.println("O ser vivo é uma Pomba");
				}
			} else {
				System.out.println("Terceira característica: Onívoro ou Herbívoro?");
				p3 = leia.nextLine();

				if (p3.equalsIgnoreCase("Onívoro")) {
					System.out.println("O ser vivo é um Humano");
				} else {
					System.out.println("O ser vivo é uma Vaca");

				}
			}

		}else {
			System.out.println("Segunda característica: Inseto ou Anelideo?");
			p2 = leia.nextLine();

			if (p2.equalsIgnoreCase("Inseto")) {
				System.out.println("Terceira característica: Hematófago ou Herbívoro?");
				p3 = leia.nextLine();

				if (p3.equalsIgnoreCase("Hematófago")) {
					System.out.println("O ser vivo é uma Pulga");
				} else {
					System.out.println("O ser vivo é uma lagarta");
				}
			} else {
				System.out.println("Terceira característica: Hematófago ou Onívoro?");
				p3 = leia.nextLine();

				if (p3.equalsIgnoreCase("Hematófago")) {
					System.out.println("O ser vivo é uma Sanguessuga");
				} else {
					System.out.println("O ser vivo é uma Minhoca");

				}
			}
			
		}
		
		leia.close();
		
	}

}
