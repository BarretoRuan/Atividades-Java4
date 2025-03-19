package LacoCondicionalIf;

import java.util.Scanner;

public class Lista1_atividade2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número:");
		int numero = scanner.nextInt();

		if (numero % 2 == 0 && numero > 0) {
			System.out.printf("O numero %d é Par e Positivo", numero);
		} else if (numero % 2 == 0 && numero < 0) {
			System.out.printf("O Numero %d é par e Negativo", numero);
		} else if (!(numero % 2 == 0) && numero > 0) {
			System.out.printf("O numero é %d Impar e positvo", numero);
		} else if (!(numero % 2 == 0) && numero < 0) {
			System.out.printf("O numero é %d Impar e Negativo", numero);
		}

	}
}
