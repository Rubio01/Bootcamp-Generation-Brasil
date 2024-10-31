package vetores;

import java.util.Arrays;

public class Vetor_exemplo3 {

	public static void main(String[] args) {
		
		String grupoA[] = { "Samantha", "Letícia", "Alan" };
        String grupoB[] = { "Samantha", "Letícia", "Alan" };
        
        
        System.out.println("Os arrays são iguais?");
        
        if(Arrays.equals(grupoA,grupoB)) {
        	System.out.println("Sim,são iguais");
        }else {     	
        	System.out.println("Não são iguais");
        }

	}

}
