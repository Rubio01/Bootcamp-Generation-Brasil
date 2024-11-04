package Collection2;

import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

public class PILHA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> pilha = new Stack<String>();
		 
        pilha.push("Prato Verde");
        pilha.push("Prato Azul");
        pilha.push("Prato Branco");
        pilha.push("Prato Amarelo");
        pilha.push("Prato Vermelho");
        
        System.out.println("\nElementos da Pilha: "+pilha);
        System.out.println("\nRemover Elemento: "+ pilha.pop());
        System.out.println("\nElementos da Pilha: "+pilha);
        pilha.push("Prato Roxo");
        System.out.println("\nElementos da Pilha: "+pilha);
        
        Collections.reverse(pilha); // apenas para apresentaçãoinverte para uma ordem de pilha 
        Iterator<String> iterator = pilha.iterator();
        
        while(iterator.hasNext()) {
        	System.out.println(iterator.next());
        }
	}

}
