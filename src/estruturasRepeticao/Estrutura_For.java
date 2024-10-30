package estruturasRepeticao;

import java.util.Scanner;

public class Estrutura_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);
		
		int n,i;
		
		System.out.println("Digite um número:");
		n = leia.nextInt();
		
		for(i=0;i<=10;i++){
			System.out.println(n+"x"+i+"="+n*i );
			
		}
		


	}

}
