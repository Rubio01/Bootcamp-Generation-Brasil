package collection;

import java.util.HashSet;
import java.util.Scanner;

public class Array_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		//Cria a Collection Set, do tipo String chamada setFrutas//
        HashSet<String> setFrutas = new HashSet<String>(); 
        String fruta = "";
                // Adiciona algumas frutas na Colection Set sem repetir
                setFrutas.add("Abacate");
                setFrutas.add("Banana");
                setFrutas.add("Jaboticaba");
                setFrutas.add("Kiwi");
                setFrutas.add("Maçã");
                setFrutas.add("Morango");
                setFrutas.add("Pêra");
                setFrutas.add("Jaboticaba");
                setFrutas.add("Kiwi");
                
                System.out.println(setFrutas);
                
                System.out.println("Existe a fruta:(Digite uma fruta)");
                fruta = scanner.nextLine();
                
                System.out.println();
                
	}

}
