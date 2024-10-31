package estruturasRepeticao.Atividades;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		int numero = 0,par = 0,impar = 0;
		
		for(int i = 1 ; i<11 ; i++) {
			
			System.out.println("Digite o "+i+"° numero:");
			numero = scanner.nextInt();
;			
			if (numero%2==0) par++;
			else impar++;	
		}
		
		System.out.println("\nTotal de números pares: "+par);
		System.out.println("Total de números ímpares: "+impar);
		
		scanner.close();
			
	}

}
