package LacoCondicionalSwitch;

import java.util.Scanner;

public class Lista2_atividade1 {

	public static void main(String[] args) {
		float valor = 0.0f;
		String produto = null;
		int quantidade;
		
		Scanner Scanner = new Scanner(System.in);

		System.out.print("Digite um número:");
		int numero = Scanner.nextInt();

		switch (numero) {

		case 1:
			System.out.println("Digite o tanto de itens desejados:  ");
			quantidade = Scanner.nextInt();
			valor = quantidade * 10.00f;
			produto = "Cachorro Quente";
			break;
		case 2:
			System.out.println("Digite o tanto de itens desejados:  ");
			 quantidade = Scanner.nextInt();
			valor = quantidade * 15.00f;
			produto = "X-Salada";
			break;

		case 3:
			System.out.println("Digite o tanto de itens desejados:  ");
			 quantidade = Scanner.nextInt();
			valor = quantidade * 18.00f;
			produto = "X-Bacon";
			break;
		case 4:
			System.out.println("Digite o tanto de itens desejados:  ");
			 quantidade = Scanner.nextInt();
			valor = quantidade * 12.00f;
			produto = "Bauru";
			break;
		case 5:
			System.out.println("Digite o tanto de itens desejados:  ");
			 quantidade = Scanner.nextInt();
			valor = quantidade * 8.00f;
			produto = "Refrigerante";
			break;
		case 6:
			System.out.println("Digite o tanto de itens desejados:  ");
			 quantidade = Scanner.nextInt();
			valor = quantidade * 13.00f;
			produto = "Suco de Laranja";
			break;
			
			default:
				System.out.println("O produto não Indentificado");
		}
 System.out.printf("Produto %s \nValor total: %.2f", produto, valor);
	}

}
