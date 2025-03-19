package lacoscondicionais;

import java.util.Scanner;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner lerScanner = new Scanner(System.in);
		
		int opcao;
		String nome;
		
		System.out.println("# ## ###### # # ## # # # #");
		System.out.println("\n-- Digite 1 Para indicar um livro--");
		System.out.println("--Digite 2 para ler uma Frase motivacional--");
		System.out.println("Digite 3 para receber uma indicação de musica-- \n");
		System.out.println("###########################################");
		opcao = lerScanner.nextInt();
		
		switch (opcao) {
		
	
		case 1:
			
			System.out.println("Digite o nome do seu livro favorito: ");
			lerScanner.nextLine();
			nome = lerScanner.nextLine().toUpperCase();
			
			if(nome.equals("O ALQUIMISTA")) {
				System.out.println("Bom Livro!");
			}else { 
				System.out.println("Não curti");
			}
			break;
		case 2:
			
			System.out.println("A jornada de mil milhas começa com um unico passo.");
			break;
		case 3:
			
			System.out.println("Indicação de musica: só preciso de dinheiro pra comprar o mé");
			break;
			
			default:
		}

	}

}
