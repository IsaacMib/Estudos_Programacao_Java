package FPB;

public class MultiploDe3 {
	
    public static void main(String[] args) {
    	
        int soma = 0; // vari�vel para armazenar a soma dos n�meros �mpares m�ltiplos de tr�s

        for (int i = 1; i <= 100; i++) {
        	
            if (i % 3 == 0 && i % 2 != 0) { // verifica se o n�mero � m�ltiplo de tr�s e �mpar
                System.out.println("N�mero �mpar m�ltiplo de tr�s encontrado: " + i);
                soma += i; // adiciona o n�mero � soma
            }
        }

        System.out.println("A soma dos n�meros �mpares m�ltiplos de tr�s �: " + soma);
    }
}
