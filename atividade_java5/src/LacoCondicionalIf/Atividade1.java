package LacoCondicionalIf;

import java.util.Scanner;

public class Atividade1 {
    
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Digite o número A: ");
        int A = scanner.nextInt();
        
        System.out.print("Digite o número B: ");
        int B = scanner.nextInt();
        
        System.out.print("Digite o número C: ");
        int C = scanner.nextInt();
        
        if((A + B)> C){
        	System.out.printf("A soma de %d + %d é maior que %d" , A, B, C);
        }else if(A + B < C){
        	System.out.printf("A soma de %d + %d é menor que %d" , A, B, C);
        }else {
        	System.out.printf("A soma de %d + %d é igual a %d" , A, B, C);
        }
    
    }
}
