package operadores.atividades;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4, media ;
		
		System.out.println("Digite a primeira nota:");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a segunda nota:");
		nota2 = leia.nextFloat();
		
		System.out.println("Digite a terceira nota:");
		nota3 = leia.nextFloat();
		
		System.out.println("Digite a quarta nota:");
		nota4 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.printf("Média final: %.1f ",media); // %.1f formatar o resultado da media para 1 casa decimal separado por virgula
		
		leia.close();
		
	}

}
