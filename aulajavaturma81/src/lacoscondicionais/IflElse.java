package lacoscondicionais;

import java.util.Scanner;

public class IflElse {

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
			System.out.println("Parabéns você foi aprovado" + media);
		}else {
			System.out.println("\nReprovado, Estude mais" + media);
		}
	lerScanner.close();
		

	}

}
