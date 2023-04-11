package FPB;

public class VerificarDivisibilidade {

	public static void main(String[] args) {
		
		for (int i = 1000; i <= 1999; i++) {
			
            if (i % 11 == 5) {
                System.out.println(i + " é divisível por 11 e tem um resto de 5 na divisão por 11");
            } else {
                System.out.println(i + " não é divisível por 11 e não tem um resto de 5 na divisão por 11");
            }
        }
    }
}
