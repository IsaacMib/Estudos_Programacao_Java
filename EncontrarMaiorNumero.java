package FPB;

import java.util.Scanner;

public class EncontrarMaiorNumero {
	
    private static Scanner scanner;

	public static void main(String[] args) {
    	
        scanner = new Scanner(System.in);
        
        double[] numeros = new double[5]; // Array para armazenar os números
        
        double maiorNumero; // Variável para armazenar o maior número

        // Ler 5 números reais
        System.out.println("Digite 5 números reais:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        // Encontrar o maior número
        maiorNumero = numeros[0]; // Assume que o primeiro número é o maior
        for (int i = 1; i < 5; i++) {
            if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
            }
        }

        // Exibir o maior número
        System.out.println("O maior número é: " + maiorNumero);
    }}