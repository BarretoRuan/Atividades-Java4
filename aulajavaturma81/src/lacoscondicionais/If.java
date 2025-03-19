package lacoscondicionais;

public class If {

	public static void main(String[] args) {
		int n1 = 4, n2 = 3, n3 = 4;
		
		if(n1 < n2) {
			n3 = n3;
			System.out.println("O n1 é menor que a soma de n2 mais n3!");
		}
        
		if(n1 < n3) {
		    System.out.println("O n1 é maior que o n3!");
        }
	}

}
