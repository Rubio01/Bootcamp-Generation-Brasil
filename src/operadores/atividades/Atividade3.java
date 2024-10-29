package operadores.atividades;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salarioBruto, addNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.println("Digite o Salário Bruto:");
		salarioBruto= leia.nextFloat();
		
		System.out.println("Digite o adicional Noturno:");
		addNoturno= leia.nextFloat();
		
		System.out.println("Digite o valor da hora extra:");
		horasExtras= leia.nextFloat();
		
		System.out.println("Digite os descontos:");
		descontos= leia.nextFloat();
		
		salarioLiquido =salarioBruto + addNoturno + (horasExtras * 5) - descontos;

		
		System.out.printf("SALÁRIO LIQUÍDO: %.2f", salarioLiquido);
		
		leia.close();
	
	}

}
