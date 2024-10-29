package operadores;

public class Unarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 8;
		
		System.out.println("\nPré Incrementar: x = ++ y");
		
		x = ++y;
		
		System.out.println("Valor de x:"+ x );
		System.out.println("Valor de y:"+ y );
		
		x = 10;
	    y = 8;
		
        System.out.println("\nPós Incrementar: x = y ++");
		
		x = y++;
		
		System.out.println("Valor de x:"+ x );
		System.out.println("Valor de y:"+ y );
	}

}
