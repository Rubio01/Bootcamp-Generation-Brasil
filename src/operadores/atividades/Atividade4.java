package operadores.atividades;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		 float n1, n2, n3, n4, diferenca;
		 
		 System.out.println("Digite o primeiro valor:");
		 n1 = leia.nextFloat();
		 
		 System.out.println("Digite o segundo valor:");
		 n2 = leia.nextFloat();
		 
		 System.out.println("Digite o terceiro valor:");
		 n3 = leia.nextFloat();
		 
		 System.out.println("Digite o quarto valor:");
		 n4 = leia.nextFloat();
		 
		 diferenca = (n1 * n2)-(n3 * n4);
		 
		 System.out.printf("Diferença: %f ",diferenca); // %f - todas as casas decimais separadas por vírgula
		 
		 leia.close();

	}

}
