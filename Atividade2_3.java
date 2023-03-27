package FPB;

import java.util.Scanner;

public class Atividade2_3 {
    private static Scanner scanner;

	public static void main(String[] args) {
		
        scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        
        int soma = num1 + num2;
        
        if (soma > 20) {
            soma += 8;
        } else {
            soma -= 5;
        }
        
        System.out.println("O resultado da soma é " + soma);
    }}
