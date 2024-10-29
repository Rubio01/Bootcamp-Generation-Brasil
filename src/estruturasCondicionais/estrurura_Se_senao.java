package estruturasCondicionais;

import java.util.Scanner;

public class estrurura_Se_senao {

	public static void main(String[] args) {
		
		Scanner leia =new Scanner(System.in);
		
		float nota1, nota2, media;
		
		System.out.println("Digite a primeira nota:");
		nota1= leia.nextFloat();
		
		System.out.println("Digite a segunda nota:");
		nota2= leia.nextFloat();
		
		media = (nota1+nota2)/2;
		
		if(media>=5) {
			System.out.println("Sua média é: "+media+" - APROVADO");
		}
		else {
			System.out.println("Sua média é: "+media+" - REPROVADO");
		}
		
		leia.close();
		
	}

}
