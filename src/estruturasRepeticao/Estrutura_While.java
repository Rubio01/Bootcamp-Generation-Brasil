package estruturasRepeticao;

import java.util.Scanner;

public class Estrutura_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		boolean continua;
		
		System.out.println("\n++++++++++++++++MENU++++++++++++++++++");
		System.out.print("\nDeseja usar nossa calculadora de soma? (s/n): ");
		continua = scanner.next().equalsIgnoreCase("s");
		System.out.println("++++++++++++++++++++++++++++++++++");
		
		while(continua) {
			
			System.out.print("Digite o primeiro valor: ");
            int numero1 = scanner.nextInt();
 
            System.out.print("Digite o segundo valor: ");
            int numero2 = scanner.nextInt();
            
            int resul = numero1 + numero2;
            
            System.out.print("O resultado da soma é: "+ resul);
            
            System.out.print("\nDeseja continuar ? (s/n): ");
    		continua = scanner.next().equalsIgnoreCase("s");
            
            
		}

	}

}
