package Collection2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class FILA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> fila = new LinkedList<String>();

		Collections.addAll(fila, "Gabriel", "Priscila", "Kaue");

		System.out.println(fila);

		System.out.println("\nAdicionar novo Elemento: " + fila.add("Geandro"));

		System.out.println(fila);

		System.out.println("\nExibir o Primeiro Elemento da fila: " + fila.peek());

		System.out.println("\nRemove Elemento: " + fila.remove());

		System.out.println(fila);

	}

}
