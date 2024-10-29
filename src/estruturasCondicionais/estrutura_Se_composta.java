package estruturasCondicionais;

import java.util.Scanner;

public class estrutura_Se_composta {

	public static void main(String[] args) {
	
		Scanner leia =new Scanner(System.in);
		
		float nota1, nota2, media;
		
		System.out.println("Digite a primeira nota:");
		nota1= leia.nextFloat();
		
		System.out.println("Digite a segunda nota:");
		nota2= leia.nextFloat();
		
		media = (nota1+nota2)/2;
		
		if(media>=6) {
			System.out.printf("Sua média é: %.2f - APROVADO" ,media );
		}
		else if(media>=5){
			System.out.printf("Sua média é: %.2f - RECUPERAÇÃO", media);
			
		}else{
			System.out.printf("Sua média é: %.2f - REPROVADO", media);
		}
		
		leia.close();
		
	}
}
	


