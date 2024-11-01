package collection;

import java.util.HashMap;

public class Array_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Long,String> pessoa = new HashMap<>();
		
		
		pessoa.put(43709930845L,"Felipe");
		pessoa.put(4379930896L,"Sansão");
		pessoa.put(4379930811L,"Sansão");
		pessoa.put(43709930803L,"Lucas");
		
		System.out.println(pessoa);
		
		System.out.println(pessoa.get(4379930896L));
	
		
	}

}
