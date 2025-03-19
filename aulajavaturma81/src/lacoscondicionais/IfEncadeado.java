package lacoscondicionais;

import java.util.Scanner;

public class IfEncadeado {

	public static void main(String[] args) {
		Scanner lerScanner = new Scanner(System.in);
		float nota1, nota2, media;
		
		System.out.println("Digite nota P1: ");
		nota1 = lerScanner.nextFloat();
		
		System.out.println("Digite nota P2: ");
		nota2 = lerScanner.nextFloat();
		
		//calculo da média
		
		media = (nota1 + nota2)/2;
		
		if(media >= 6) {
			System.out.printf("Parabéns você foi aprovado! %.1f" , media);
		}else if(media >= 5) {	
			System.out.printf("Você ficou de recuperação! %.1f" , media);
		}else {
			System.out.printf("\nReprovado, Estude mais! %.1f" , media);
		}
		
	lerScanner.close();

	}

}
