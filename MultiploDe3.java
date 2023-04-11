package FPB;

public class MultiploDe3 {
	
    public static void main(String[] args) {
    	
        int soma = 0; // variável para armazenar a soma dos números ímpares múltiplos de três

        for (int i = 1; i <= 100; i++) {
        	
            if (i % 3 == 0 && i % 2 != 0) { // verifica se o número é múltiplo de três e ímpar
                System.out.println("Número ímpar múltiplo de três encontrado: " + i);
                soma += i; // adiciona o número à soma
            }
        }

        System.out.println("A soma dos números ímpares múltiplos de três é: " + soma);
    }
}
