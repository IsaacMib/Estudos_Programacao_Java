package FPB;

import java.util.Scanner;

public class Atividade2_1 {
	
    private static Scanner scanner;
    
	public static void main(String[] args) {
		
        scanner = new Scanner(System.in);
        
        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();
        
        if (idade >= 18) {
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é menor de idade");
        }}}