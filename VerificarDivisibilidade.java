package FPB;

public class VerificarDivisibilidade {

	public static void main(String[] args) {
		
		for (int i = 1000; i <= 1999; i++) {
			
            if (i % 11 == 5) {
                System.out.println(i + " � divis�vel por 11 e tem um resto de 5 na divis�o por 11");
            } else {
                System.out.println(i + " n�o � divis�vel por 11 e n�o tem um resto de 5 na divis�o por 11");
            }
        }
    }
}
