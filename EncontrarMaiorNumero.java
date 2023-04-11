package FPB;

import java.util.Scanner;

public class EncontrarMaiorNumero {
	
    private static Scanner scanner;

	public static void main(String[] args) {
    	
        scanner = new Scanner(System.in);
        
        double[] numeros = new double[5]; // Array para armazenar os n�meros
        
        double maiorNumero; // Vari�vel para armazenar o maior n�mero

        // Ler 5 n�meros reais
        System.out.println("Digite 5 n�meros reais:");
        for (int i = 0; i < 5; i++) {
            System.out.print("N�mero " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        // Encontrar o maior n�mero
        maiorNumero = numeros[0]; // Assume que o primeiro n�mero � o maior
        for (int i = 1; i < 5; i++) {
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
        }

        // Exibir o maior n�mero
        System.out.println("O maior n�mero �: " + maiorNumero);
    }}