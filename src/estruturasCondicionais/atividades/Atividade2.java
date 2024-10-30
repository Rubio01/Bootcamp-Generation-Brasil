package estruturasCondicionais.atividades;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite um número:");
		n = leia.nextInt();
		
		if( n%2==0 && n>0 ){
			System.out.printf("O Número %d é par e positivo!",n);
		}else if(n%2==0 && n<0) {
			System.out.printf("O Número %d é par e negativo!",n);
		}else if(n%2==1 && n>0) {
			System.out.printf("O Número %d é ímpar e positivo!",n);
		}else{
			System.out.printf("O Número %d é ímpar e negativo!",n);
		}

		leia.close();
	}

}
