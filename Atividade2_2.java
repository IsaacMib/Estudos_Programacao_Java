package FPB;

import java.util.Scanner;

public class Atividade2_2 {
	
    private static Scanner scanner;
    
	public static void main(String[] args) {
		
        scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();
        
        if (num1 > num2) {
            System.out.println("O maior número é " + num1 + " e o menor número é " + num2);
        } else if (num2 > num1) {
            System.out.println("O maior número é " + num2 + " e o menor número é " + num1);
        } else {
            System.out.println("Os dois números são iguais");
        }}}
