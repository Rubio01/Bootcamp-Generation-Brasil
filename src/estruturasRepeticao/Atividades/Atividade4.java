package estruturasRepeticao.Atividades;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		int idade,backend =0,mulherCis_ouTransFront=0,homemCis_ouTransMobile40=0, naoBinarioFullStackMenor30=0;
		float totalPessoas = 0,totalIdade = 0,mediaIdade = 0;
		
		boolean continuar = true;
		
		while(continuar) {
			
			int opcao1=0,opcao2=0;
			
			System.out.println("Digite sua idade:");
			idade = scanner.nextInt();
			totalIdade = idade+totalIdade;
			
			System.out.printf("\nIdentidade Gênero:\n\n"
					+ "[1]  Mulher Cis \n"
					+ "[2]  Homem Cis \n"
					+ "[3]  Não Binário \n"
					+ "[4]  Mulher Trans \n"
					+ "[5]  Homem Trans \n"
					+ "[6]  Outros \n"
					);
			opcao1 = scanner.nextInt();
			
			System.out.printf("\nPessoa Desenvolvedora:\n\n"
					+ "[1]  Backend \n"
					+ "[2]  Frontend \n"
					+ "[3]  Mobile \n"
					+ "[4]  FullStack \n"				
					);
			opcao2 = scanner.nextInt();
		
			if(opcao2==1) backend++;
			if(opcao1==1 && opcao2==2 || opcao1==4 && opcao2==2 ) mulherCis_ouTransFront++; 
			if(opcao1==2 && opcao2==3 && idade>40 || opcao1==5 && opcao2==3 && idade>40 ) homemCis_ouTransMobile40++;
			if(opcao1==3 && opcao2==4 && idade<30) naoBinarioFullStackMenor30++;
		
			totalPessoas++;
		
			mediaIdade = totalIdade/totalPessoas;
		
			System.out.println("\nDeseja continuar a leitura dos dados de um novo colaborador ou não (S/N)");
			continuar = scanner.next().equalsIgnoreCase("s");
		
		}
		
		System.out.println("\nTotal de pessoas desenvolvedoras Backend: "+backend);
		System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: "+mulherCis_ouTransFront);
		System.out.println("O número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: "+homemCis_ouTransMobile40);
		System.out.println("O número de Não Binários desenvolvedores FullStack menores de 30 anos: "+naoBinarioFullStackMenor30);
		System.out.println("O número total de pessoas que responderam à pesquisa: "+totalPessoas++);
		System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.2f",mediaIdade);
		
		scanner.close();
	}

}
