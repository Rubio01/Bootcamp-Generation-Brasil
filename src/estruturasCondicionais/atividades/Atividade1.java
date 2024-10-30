package estruturasCondicionais.atividades;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int A, B, C,s;

		System.out.println("Digite o número A:");
		A = leia.nextInt();

		System.out.println("Digite o número B:");
		B = leia.nextInt();

		System.out.println("Digite o número C:");
		C = leia.nextInt();
		
		s = A+B;

		if (s > C) {
			System.out.printf("%d + %d = %d > %d  \nA Soma de A + B é Maior do que C", A, B, s, C);
		} 
		if (s < C) {
			System.out.printf("%d + %d = %d < %d \nA Soma de A + B é Menor do que C", A, B, s, C);
		}
		if (s == C) {
			System.out.printf("%d + %d = %d = %d \nA Soma de A + B é Igual a C", A, B, s, C);
		}
		
		leia.close();

	}
}