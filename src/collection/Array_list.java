package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer numero ;		
		
		ArrayList<Double> notas = new ArrayList<Double>();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite a primeira nota");
		
		notas.add(scanner.nextDouble());
		
		notas.add(5.0);
		notas.add(7.0);
        notas.add(4.0);
        notas.add(10.0);
        notas.add(4.0);
        
        System.out.println("Notas cadastradas:");
        
        for(Double nota : notas) {
        	System.out.println(nota);   	
        }
        
        notas.add(1,9.5); //9.5 entra na posicao 1 e o que estava na 1 vai pra 2 e assim sucessivamente "empurra"
        
        System.out.println(notas);
        
        System.out.println("\nDigite uma nota? " + notas.contains(scanner.nextDouble()));
		
		System.out.println("\nA posição da nota 5 é: " + notas.indexOf(5.0));

	}

}
