package Variaveis;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int idade;
		String nome; 
		
		System.out.println("Digite sua idade:");
		idade = leia.nextInt();
		
		leia.nextLine(); // consome a quebra de linha deixada para trás depois de inserir a idade 
		
		System.out.println("Digite seu nome:");
		
		nome = leia.nextLine();
		
		System.out.println(nome+" você tem "+idade+" anos de idade.");
		

	}

}
