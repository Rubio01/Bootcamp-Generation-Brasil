package operadores.atividades;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salario,abono,novoSalario;
		
		System.out.println("Digite o Salário:");
		salario = leia.nextFloat();
				
		System.out.println("Digite o Abono:");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("Novo Salário: %.2f", novoSalario);
		
		leia.close();
		
	}

}
